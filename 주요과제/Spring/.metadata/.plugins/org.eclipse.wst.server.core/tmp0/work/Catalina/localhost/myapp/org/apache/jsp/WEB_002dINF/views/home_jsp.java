/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.58
 * Generated at: 2022-03-20 16:19:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/D:/study/Multi%20Campus/Full_stack%20code/주요과제/Spring/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/miniProject/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/inc/top.jspf", Long.valueOf(1647765077792L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1646617032390L));
    _jspx_dependants.put("/inc/main.jspf", Long.valueOf(1647778683447L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      boolean _jspx_th_c_005fset_005f0_reused = false;
      try {
        _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
        _jspx_th_c_005fset_005f0.setParent(null);
        // /inc/top.jspf(3,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fset_005f0.setVar("url");
        // /inc/top.jspf(3,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
        _jspx_th_c_005fset_005f0.setValue(request.getContextPath() );
        int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
        if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
        _jspx_th_c_005fset_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f0_reused);
      }
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("	<!-- 부트스트랩4, 부트스트랩 icon CSS -->\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css\" integrity=\"sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("    <!-- jquery, 플러그인 CDN -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/jquery-ui/jquery-ui.min.css\">\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/jquery-ui/jquery-ui.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <!-- 부트스트랩4 JS -->\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- 풀캘린더 API -->\r\n");
      out.write("	<link href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/fullcalendar/main.css' rel='stylesheet' />\r\n");
      out.write("    <script src='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/fullcalendar/main.js'></script>\r\n");
      out.write("    \r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/base.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/header.css\" type=\"text/css\">\r\n");
      out.write("    \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("	<div id=\"icons\">\r\n");
      out.write("	    <a href=\"index.html\" class=\"disableLink\"><i class=\"bi bi-house-fill\" title=\"Home\"></i></a>\r\n");
      out.write("	    <a href=\"friends.html\"><i class=\"bi bi-person-lines-fill\" title=\"Friends\"></i></a>\r\n");
      out.write("	    <a href=\"#\"><i class=\"bi bi-people-fill\" title=\"Group\"></i></a>\r\n");
      out.write("	    <a href=\"#\"><i class=\"bi bi-megaphone-fill\" title=\"Announcement\"></i></a>\r\n");
      out.write("	</div>\r\n");
      out.write("    <div id=\"info\">\r\n");
      out.write("        <a id=\"login-btn\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/login\" type=\"button\" class=\"btn btn-info\">로그인</a>\r\n");
      out.write("        <div>\r\n");
      out.write("            <div id=\"userinfo\">\r\n");
      out.write("                <i class=\"bi bi-person-circle\"></i>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"info_menu\">\r\n");
      out.write("            <ul>\r\n");
      out.write("                <a href=\"#\"><li>내 정보</li></a>\r\n");
      out.write("                <a href=\"#\"><li>로그아웃</li></a>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"main\">");
      out.write("\r\n");
      out.write("<style>\n");
      out.write("#sidebar{\r\n");
      out.write("	height: 100%;\r\n");
      out.write("	width: 210px;\r\n");
      out.write("	border-right: 2px solid #ccc;\r\n");
      out.write("	overflow: hidden;\r\n");
      out.write("}\r\n");
      out.write("#sideTitle{\r\n");
      out.write("	padding: 0 15px;\r\n");
      out.write("	border-bottom: 2px solid #aaa;\r\n");
      out.write("	height: 50px;\r\n");
      out.write("	line-height: 50px;\r\n");
      out.write("}\r\n");
      out.write("#sideTitle > span:first-child {\r\n");
      out.write("	font-size: 22px;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("#sideTitle > span:last-child {\r\n");
      out.write("	cursor: pointer;\r\n");
      out.write("	font-size: 20px;\r\n");
      out.write("	position: relative;\r\n");
      out.write("	float: right;\r\n");
      out.write("	top: 12px;\r\n");
      out.write("}\r\n");
      out.write("#sideMonth{\r\n");
      out.write("	border-bottom: 2px solid #aaa;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("}\r\n");
      out.write("#sideMonth > i {\r\n");
      out.write("	margin: 0 10px;\r\n");
      out.write("	cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("#sideMain {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	overflow-x: hidden;\r\n");
      out.write("}\r\n");
      out.write("#sideMain::-webkit-scrollbar {\r\n");
      out.write("  width: 10px;\r\n");
      out.write("}\r\n");
      out.write("#sideMain::-webkit-scrollbar-thumb {\r\n");
      out.write("  background-color: #aaa;\r\n");
      out.write("  border-radius: 100px;\r\n");
      out.write("}\r\n");
      out.write("#sideMain::-webkit-scrollbar-track {\r\n");
      out.write("  background-color: rgba(0, 0, 0, 0);\r\n");
      out.write("}\r\n");
      out.write("#listbox{\r\n");
      out.write("	width: 200px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dayList {\r\n");
      out.write("  width: 180px;\r\n");
      out.write("  margin: 10px auto;\r\n");
      out.write("  border-radius: 5px;\r\n");
      out.write("  border: 1px solid #bbb;\r\n");
      out.write("  box-shadow: 0px 0px 6px rgba(0, 0, 0, 0.5);\r\n");
      out.write("  background-color: white;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write(".dayList > .card-header {\r\n");
      out.write("  padding: 0 15px;\r\n");
      out.write("}\r\n");
      out.write(".eventList {\r\n");
      out.write("  margin: 0;\r\n");
      out.write("  padding: 0;\r\n");
      out.write("  border-radius: 0 0 5px 5px;\r\n");
      out.write("}\r\n");
      out.write(".eventList > li {\r\n");
      out.write("  padding: 0 15px;\r\n");
      out.write("  border-bottom: 1px solid #888;\r\n");
      out.write("  background-color: #3788d8;\r\n");
      out.write("  color: white;\r\n");
      out.write("}\r\n");
      out.write(".eventList > li:last-child {\r\n");
      out.write("  border-radius: 0 0 5px 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* mainContents.css */\r\n");
      out.write("#usercode {\r\n");
      out.write("  position: relative;\r\n");
      out.write("  line-height: 35px;\r\n");
      out.write("  height: 35px;\r\n");
      out.write("  font-size: 14px;\r\n");
      out.write("  font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("#contents {\r\n");
      out.write("  margin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write("#calendar {\r\n");
      out.write("  height: inherit;\r\n");
      out.write("  padding: 20px;\r\n");
      out.write("  background-color: white;\r\n");
      out.write("  border-radius: 10px;\r\n");
      out.write("  box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.8);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* dialog */\r\n");
      out.write(".ui-dialog {\r\n");
      out.write("  width: 400px !important;\r\n");
      out.write("  border-radius: 10px;\r\n");
      out.write("  background-color: #eee;\r\n");
      out.write("  box-shadow: 0 0 10px rgba(0, 0, 0, 0.5);\r\n");
      out.write("}\r\n");
      out.write(".ui-dialog-titlebar {\r\n");
      out.write("  background-color: #fff;\r\n");
      out.write("  border-radius: 5px;\r\n");
      out.write("}\r\n");
      out.write(".ui-dialog ul {\r\n");
      out.write("  width: 220px;\r\n");
      out.write("  margin: 0 auto;\r\n");
      out.write("  background-color: #eee;\r\n");
      out.write("}\r\n");
      out.write(".ui-dialog ul > li {\r\n");
      out.write("  font-size: 14px;\r\n");
      out.write("  margin-top: 10px;\r\n");
      out.write("}\r\n");
      out.write(".ui-dialog ul > li > input:nth-child(1) {\r\n");
      out.write("  width: 220px;\r\n");
      out.write("  border-radius: 5px;\r\n");
      out.write("  border: 1px solid #bbb;\r\n");
      out.write("}\r\n");
      out.write(".ui-dialog ul > li > select {\r\n");
      out.write("  border: 1px solid #bbb;\r\n");
      out.write("  border-radius: 5px;\r\n");
      out.write("}\r\n");
      out.write(".ui-dialog ul > li > input:nth-child(2)[type=\"checkbox\"] {\r\n");
      out.write("  position: relative;\r\n");
      out.write("  top: 2px;\r\n");
      out.write("  margin: 0 3px;\r\n");
      out.write("}\r\n");
      out.write(".ui-dialog ul > li > input:nth-child(2)[type=\"color\"] {\r\n");
      out.write("  margin: 0 3px;\r\n");
      out.write("  height: 26px;\r\n");
      out.write("  width: 25px;\r\n");
      out.write("}\r\n");
      out.write("#dialog {\r\n");
      out.write("  padding: 5px 30px;\r\n");
      out.write("}\r\n");
      out.write(".ui-dialog-titlebar-close {\r\n");
      out.write("  display: none;\r\n");
      out.write("}\r\n");
      out.write(".ui-dialog-buttonset > button {\r\n");
      out.write("  font-size: 14px;\r\n");
      out.write("  border: 1px solid #bbb;\r\n");
      out.write("  border-radius: 5px;\r\n");
      out.write("}\r\n");
      out.write(".ui-dialog-buttonset > button:hover {\r\n");
      out.write("  background-color: #ddd;\r\n");
      out.write("}\r\n");
      out.write(".ui-dialog-buttonpane {\r\n");
      out.write("  border-radius: 5px;\r\n");
      out.write("}\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("const resizeMain = () => {\r\n");
      out.write("	let headerHeight = Number($('#header').css('height').substring(0, $('#header').css('height').length-2));\r\n");
      out.write("    let sideTitleHeight = Number($('#sideTitle').css('height').substring(0, $('#sideTitle').css('height').length-2));\r\n");
      out.write("    let sideMonthHeight = Number($('#sideMonth').css('height').substring(0, $('#sideMonth').css('height').length-2));\r\n");
      out.write("    $('#sidebar').css('height', window.innerHeight-Number($('#header').css('height').substring(0, $('#header').css('height').length-2)));\r\n");
      out.write("    $('#sideMain').css('height', window.innerHeight-headerHeight-sideTitleHeight-sideMonthHeight);\r\n");
      out.write("    \r\n");
      out.write("    let sidebarWidth = Number($('#sidebar').css('width').substring(0, $('#sidebar').css('width').length-2));\r\n");
      out.write("    $('#contentsBack').css('height', window.innerHeight-headerHeight);\r\n");
      out.write("    $('#contentsBack').css('width', window.innerWidth-sidebarWidth-17);\r\n");
      out.write("\r\n");
      out.write("    // let calwidth = screen.availWidth-sidebarWidth-380;\r\n");
      out.write("    let calwidth = window.innerWidth-sidebarWidth-250;\r\n");
      out.write("    $('#contents').css('height', window.innerHeight-headerHeight-60);\r\n");
      out.write("    $('#contents').css('width', calwidth);\r\n");
      out.write("\r\n");
      out.write("    calendar.render();\r\n");
      out.write("}\r\n");
      out.write("//sidebar main 리스트 등록 함수\r\n");
      out.write("const setSideMain = () => {\r\n");
      out.write("    setEvent();\r\n");
      out.write("    let eventOfday = [];\r\n");
      out.write("    for(let i = 1; i<=31; i++){\r\n");
      out.write("        eventOfday[i] = [];\r\n");
      out.write("        for(let j = 0; j < event.length; j++){\r\n");
      out.write("            let start = Number(event[j].start.substring(8));\r\n");
      out.write("            let end = Number(event[j].end.substring(8)-1)\r\n");
      out.write("            if(i>=start && i<=end){\r\n");
      out.write("                eventOfday[i].push(event[j]);\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    let eventListHTML = \"\";\r\n");
      out.write("    for(let i = 1; i<=31; i++){\r\n");
      out.write("        if(eventOfday[i].length!=0){\r\n");
      out.write("            eventListHTML +=\r\n");
      out.write("            \"<div class='dayList'>\" +\r\n");
      out.write("            \"<div class=\\\"card-header\\\" data-target=\\\"#list\"+i+\"\\\" data-toggle=\\\"collapse\\\">\"+i+\"일</div>\"+\r\n");
      out.write("            \"<div id=\\\"list\"+i+\"\\\" class=\\\"collapse\\\">\" +\r\n");
      out.write("            \"<ul class=\\\"eventList\\\">\";\r\n");
      out.write("            \r\n");
      out.write("            for(let j = 0; j < eventOfday[i].length; j++){\r\n");
      out.write("                eventListHTML +=\r\n");
      out.write("                \"<li style=\\\"background-color: \"+eventOfday[i][j].color+\"; color: \"+eventOfday[i][j].textColor+\"\\\">\"+eventOfday[i][j].title+\"</li>\";\r\n");
      out.write("            }\r\n");
      out.write("            eventListHTML +=\"</ul></div></div>\";\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    document.querySelector('#listbox').innerHTML = eventListHTML;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("const changeMonth = () => {\r\n");
      out.write("    $(\"#sideMonth>span\").text(calendar.getDate().getFullYear()+\"년 \" + (calendar.getDate().getMonth() + 1) + \"월\");\r\n");
      out.write("    setSideMain();\r\n");
      out.write("};\r\n");
      out.write("const nextMonth = () => {\r\n");
      out.write("    calendar.next();\r\n");
      out.write("    changeMonth();\r\n");
      out.write("};\r\n");
      out.write("const prevMonth = () => {\r\n");
      out.write("    calendar.prev();\r\n");
      out.write("    changeMonth();\r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("// set myCalendar\r\n");
      out.write("\n");
      out.write("$(function(){\r\n");
      out.write("	// pageload\r\n");
      out.write("	changeMonth();\r\n");
      out.write("	resizeMain();\r\n");
      out.write("	\r\n");
      out.write("	// event\r\n");
      out.write("    // sidebar main change\r\n");
      out.write("    $(\".fc-toolbar-chunk button\").click(changeMonth);\r\n");
      out.write("    // reactive page\r\n");
      out.write("	$(window).resize(resizeMain);\r\n");
      out.write("	\r\n");
      out.write("	// 다이얼로그 오픈\r\n");
      out.write("    $('#dialogOpen').click(function() {\r\n");
      out.write("        $('#dialog').dialog('open');\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    // 다이얼로그값 전체 리셋 함수\r\n");
      out.write("    const dialogReset = () => {\r\n");
      out.write("        $(\"#event-title\").val('');\r\n");
      out.write("        $(\"#start-date\").val('');\r\n");
      out.write("        $(\"#end-date\").val('');\r\n");
      out.write("        $('#repet').each(function() {\r\n");
      out.write("            $(this).find('option:first').attr('selected',true);\r\n");
      out.write("        });\r\n");
      out.write("        $('#public').prop('checked', false);\r\n");
      out.write("        $('#event-color').val('#3788D8');\r\n");
      out.write("        $(\"#place\").val('');\r\n");
      out.write("        $(\"#memo\").val('');\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    // 다이얼로그 세팅\r\n");
      out.write("    $('#dialog').dialog({\r\n");
      out.write("        autoOpen: false, // 실행시 자동열림\r\n");
      out.write("        modal: true,\r\n");
      out.write("        buttons: {\r\n");
      out.write("            등록: function(){\r\n");
      out.write("                // ajax 처리\r\n");
      out.write("                dialogReset();\r\n");
      out.write("                $(\"#dialog\").dialog('close');\r\n");
      out.write("            },\r\n");
      out.write("            초기화: dialogReset,\r\n");
      out.write("            취소: function(){\r\n");
      out.write("                dialogReset();\r\n");
      out.write("                $(\"#dialog\").dialog('close');\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    // DatePicker 세팅\r\n");
      out.write("    $('#start-date, #end-date').datepicker({\r\n");
      out.write("        dateFormat: 'yy-mm-dd',\r\n");
      out.write("        monthNames: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월', '12월'],\r\n");
      out.write("        monthNamesShort: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월', '12월'],\r\n");
      out.write("        dayNames: ['일', '월', '화', '수', '목', '금', '토'],\r\n");
      out.write("        dayNamesMin: ['일', '월', '화', '수', '목', '금', '토'],\r\n");
      out.write("        showMonthAfterYear: true,\r\n");
      out.write("        yearSuffix: '년'\r\n");
      out.write("    });\r\n");
      out.write("});\n");
      out.write("</script>\r\n");
      out.write("<div id=\"sidebar\">\r\n");
      out.write("    <div id=\"sideTitle\">\r\n");
      out.write("        <span>일정 목록</span>\r\n");
      out.write("        <span id=\"dialogOpen\"><i class=\"bi bi-calendar-plus\"></i></span>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"sideMonth\">\r\n");
      out.write("        <i class=\"bi bi-caret-left\" onclick=\"prevMonth()\"></i>\r\n");
      out.write("        <span>3</span> \r\n");
      out.write("        <i class=\"bi bi-caret-right\" onclick=\"nextMonth()\"></i>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"sideMain\">\r\n");
      out.write("        <div id=\"listbox\">\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- 다이얼로그 창 -->\r\n");
      out.write("<div id=\"dialog\" title=\"일정 등록\">\r\n");
      out.write("    <ul>\r\n");
      out.write("        <li><input type=\"text\" id=\"event-title\" name=\"event-title\"  placeholder=\"제목\"></li>\r\n");
      out.write("        <li><input type=\"text\" id=\"start-date\" name=\"start-date\" placeholder=\"시작날짜(년-월-일)\"></li>\r\n");
      out.write("        <li><input type=\"text\" id=\"end-date\" name=\"end-date\" placeholder=\"종료날짜(년-월-일)\"></li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <select name=\"repet\" id=\"repet\">\r\n");
      out.write("                <option value=\"N\">반복안함</option>\r\n");
      out.write("                <option value=\"D\">매일반복</option>\r\n");
      out.write("                <option value=\"W\">매주반복</option>\r\n");
      out.write("                <option value=\"M\">매달반복</option>\r\n");
      out.write("                <option value=\"Y\">매년반복</option>\r\n");
      out.write("            </select>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li><label for=\"public\">Public</label><input type=\"checkbox\" id=\"public\" name=\"public\"></li>\r\n");
      out.write("        <li><label for=\"event-color\">이벤트 색상</label><input type=\"color\" id=\"event-color\" name=\"event-color\" value=\"#3788D8\"></li>\r\n");
      out.write("        <li><input type=\"text\" id=\"place\" name=\"place\" placeholder=\"장소\"></li>\r\n");
      out.write("        <li><input type=\"text\" id=\"memo\" name=\"memo\" placeholder=\"메모\"></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"contentsBack\">\r\n");
      out.write("	<div id=contents>\r\n");
      out.write("		<div id='usercode'>Usercode: 이현수#0000</div>\r\n");
      out.write("		<div id='calendar'></div>\r\n");
      out.write("		<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/myCalendar.js\"></script>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
