<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<style>
	#subject{
		width: 100%;
	}
	#boardFrm li{
		padding: 10px 5px;
	}
</style>
<script src="https://cdn.ckeditor.com/4.17.2/standard/ckeditor.js"></script>
<script>
	$(function(){
		CKEDITOR.replace("content");
		
		$("#boardFrm").submit(function(){
			if($("#subject").val()==''){
				alert("글 제목을 입력하세요.");
				return false;
			}
			if(CKEDITOR.instances.content.getData()=='') {
				alert("글 내용을 입력하세요.");
				return false;
			}
		});
	});
</script>
<div class="container">
	<h1>글수정 폼</h1>
	<form method="post" action="/myapp/board/boardEditOk" id="boardFrm">
		<input type="hidden" name="no" value="${vo.no}">
		<ul>
			<li>제목</li>
			<li><input type="text" name="subject" id="subject" value="${vo.subject}"></li>
			<li>
				<textarea name="content" id="content">${vo.content}</textarea>
			</li>
			<li><input type="submit" value="수정"></li>
		</ul>
	</form>
</div>