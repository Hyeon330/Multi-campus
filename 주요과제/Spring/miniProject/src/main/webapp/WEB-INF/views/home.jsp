<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<style>
#sidebar{
	height: 100%;
	width: 210px;
	border-right: 2px solid #ccc;
	overflow: hidden;
}
#sideTitle{
	padding: 0 15px;
	border-bottom: 2px solid #aaa;
	height: 50px;
	line-height: 50px;
}
#sideTitle > span:first-child {
	font-size: 22px;
	font-weight: bold;
}
#sideTitle > span:last-child {
	cursor: pointer;
	font-size: 20px;
	position: relative;
	float: right;
	top: 12px;
}
#sideMonth{
	border-bottom: 2px solid #aaa;
	text-align: center;
}
#sideMonth > i {
	margin: 0 10px;
	cursor: pointer;
}
#sideMain {
	width: 100%;
	overflow-x: hidden;
}
#sideMain::-webkit-scrollbar {
  width: 10px;
}
#sideMain::-webkit-scrollbar-thumb {
  background-color: #aaa;
  border-radius: 100px;
}
#sideMain::-webkit-scrollbar-track {
  background-color: rgba(0, 0, 0, 0);
}
#listbox{
	width: 200px;
}

.dayList {
  width: 180px;
  margin: 10px auto;
  border-radius: 5px;
  border: 1px solid #bbb;
  box-shadow: 0px 0px 6px rgba(0, 0, 0, 0.5);
  background-color: white;
  cursor: pointer;
}
.dayList > .card-header {
  padding: 0 15px;
}
.eventList {
  margin: 0;
  padding: 0;
  border-radius: 0 0 5px 5px;
}
.eventList > li {
  padding: 0 15px;
  border-bottom: 1px solid #888;
  background-color: #3788d8;
  color: white;
}
.eventList > li:last-child {
  border-radius: 0 0 5px 5px;
}

/* mainContents.css */
#usercode {
  position: relative;
  line-height: 35px;
  height: 35px;
  font-size: 14px;
  font-weight: bold;
}
#contents {
  margin: 0 auto;
}
#calendar {
  height: inherit;
  padding: 20px;
  background-color: white;
  border-radius: 10px;
  box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.8);
}

/* dialog */
.ui-dialog {
  width: 400px !important;
  border-radius: 10px;
  background-color: #eee;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.5);
}
.ui-dialog-titlebar {
  background-color: #fff;
  border-radius: 5px;
}
.ui-dialog ul {
  width: 220px;
  margin: 0 auto;
  background-color: #eee;
}
.ui-dialog ul > li {
  font-size: 14px;
  margin-top: 10px;
}
.ui-dialog ul > li > input:nth-child(1) {
  width: 220px;
  border-radius: 5px;
  border: 1px solid #bbb;
}
.ui-dialog ul > li > select {
  border: 1px solid #bbb;
  border-radius: 5px;
}
.ui-dialog ul > li > input:nth-child(2)[type="checkbox"] {
  position: relative;
  top: 2px;
  margin: 0 3px;
}
.ui-dialog ul > li > input:nth-child(2)[type="color"] {
  margin: 0 3px;
  height: 26px;
  width: 25px;
}
#dialog {
  padding: 5px 30px;
}
.ui-dialog-titlebar-close {
  display: none;
}
.ui-dialog-buttonset > button {
  font-size: 14px;
  border: 1px solid #bbb;
  border-radius: 5px;
}
.ui-dialog-buttonset > button:hover {
  background-color: #ddd;
}
.ui-dialog-buttonpane {
  border-radius: 5px;
}
</style>
<script type="text/javascript">
const resizeMain = () => {
	let headerHeight = Number($('#header').css('height').substring(0, $('#header').css('height').length-2));
    let sideTitleHeight = Number($('#sideTitle').css('height').substring(0, $('#sideTitle').css('height').length-2));
    let sideMonthHeight = Number($('#sideMonth').css('height').substring(0, $('#sideMonth').css('height').length-2));
    $('#sidebar').css('height', window.innerHeight-Number($('#header').css('height').substring(0, $('#header').css('height').length-2)));
    $('#sideMain').css('height', window.innerHeight-headerHeight-sideTitleHeight-sideMonthHeight);
    
    let sidebarWidth = Number($('#sidebar').css('width').substring(0, $('#sidebar').css('width').length-2));
    $('#contentsBack').css('height', window.innerHeight-headerHeight);
    $('#contentsBack').css('width', window.innerWidth-sidebarWidth-17);

    // let calwidth = screen.availWidth-sidebarWidth-380;
    let calwidth = window.innerWidth-sidebarWidth-250;
    $('#contents').css('height', window.innerHeight-headerHeight-60);
    $('#contents').css('width', calwidth);

    calendar.render();
}
//sidebar main 리스트 등록 함수
const setSideMain = () => {
    setEvent();
    let eventOfday = [];
    for(let i = 1; i<=31; i++){
        eventOfday[i] = [];
        for(let j = 0; j < event.length; j++){
            let start = Number(event[j].start.substring(8));
            let end = Number(event[j].end.substring(8)-1)
            if(i>=start && i<=end){
                eventOfday[i].push(event[j]);
            }
        }
    }
    let eventListHTML = "";
    for(let i = 1; i<=31; i++){
        if(eventOfday[i].length!=0){
            eventListHTML +=
            "<div class='dayList'>" +
            "<div class=\"card-header\" data-target=\"#list"+i+"\" data-toggle=\"collapse\">"+i+"일</div>"+
            "<div id=\"list"+i+"\" class=\"collapse\">" +
            "<ul class=\"eventList\">";
            
            for(let j = 0; j < eventOfday[i].length; j++){
                eventListHTML +=
                "<li style=\"background-color: "+eventOfday[i][j].color+"; color: "+eventOfday[i][j].textColor+"\">"+eventOfday[i][j].title+"</li>";
            }
            eventListHTML +="</ul></div></div>";
        }
    }
    document.querySelector('#listbox').innerHTML = eventListHTML;
}

const changeMonth = () => {
    $("#sideMonth>span").text(calendar.getDate().getFullYear()+"년 " + (calendar.getDate().getMonth() + 1) + "월");
    setSideMain();
};
const nextMonth = () => {
    calendar.next();
    changeMonth();
};
const prevMonth = () => {
    calendar.prev();
    changeMonth();
};

// set myCalendar

$(function(){
	// pageload
	changeMonth();
	resizeMain();
	
	// event
    // sidebar main change
    $(".fc-toolbar-chunk button").click(changeMonth);
    // reactive page
	$(window).resize(resizeMain);
	
	// 다이얼로그 오픈
    $('#dialogOpen').click(function() {
        $('#dialog').dialog('open');
    });

    // 다이얼로그값 전체 리셋 함수
    const dialogReset = () => {
        $("#event-title").val('');
        $("#start-date").val('');
        $("#end-date").val('');
        $('#repet').each(function() {
            $(this).find('option:first').attr('selected',true);
        });
        $('#public').prop('checked', false);
        $('#event-color').val('#3788D8');
        $("#place").val('');
        $("#memo").val('');
    };

    // 다이얼로그 세팅
    $('#dialog').dialog({
        autoOpen: false, // 실행시 자동열림
        modal: true,
        buttons: {
            등록: function(){
                // ajax 처리
                dialogReset();
                $("#dialog").dialog('close');
            },
            초기화: dialogReset,
            취소: function(){
                dialogReset();
                $("#dialog").dialog('close');
            }
        }
    });

    // DatePicker 세팅
    $('#start-date, #end-date').datepicker({
        dateFormat: 'yy-mm-dd',
        monthNames: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월', '12월'],
        monthNamesShort: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월', '12월'],
        dayNames: ['일', '월', '화', '수', '목', '금', '토'],
        dayNamesMin: ['일', '월', '화', '수', '목', '금', '토'],
        showMonthAfterYear: true,
        yearSuffix: '년'
    });
});
</script>
<div id="sidebar">
    <div id="sideTitle">
        <span>일정 목록</span>
        <span id="dialogOpen"><i class="bi bi-calendar-plus"></i></span>
    </div>
    <div id="sideMonth">
        <i class="bi bi-caret-left" onclick="prevMonth()"></i>
        <span>3</span> 
        <i class="bi bi-caret-right" onclick="nextMonth()"></i>
    </div>
    <div id="sideMain">
        <div id="listbox">
        </div>
    </div>
</div>
<!-- 다이얼로그 창 -->
<div id="dialog" title="일정 등록">
    <ul>
        <li><input type="text" id="event-title" name="event-title"  placeholder="제목"></li>
        <li><input type="text" id="start-date" name="start-date" placeholder="시작날짜(년-월-일)"></li>
        <li><input type="text" id="end-date" name="end-date" placeholder="종료날짜(년-월-일)"></li>
        <li>
            <select name="repet" id="repet">
                <option value="N">반복안함</option>
                <option value="D">매일반복</option>
                <option value="W">매주반복</option>
                <option value="M">매달반복</option>
                <option value="Y">매년반복</option>
            </select>
        </li>
        <li><label for="public">Public</label><input type="checkbox" id="public" name="public"></li>
        <li><label for="event-color">이벤트 색상</label><input type="color" id="event-color" name="event-color" value="#3788D8"></li>
        <li><input type="text" id="place" name="place" placeholder="장소"></li>
        <li><input type="text" id="memo" name="memo" placeholder="메모"></li>
    </ul>
</div>