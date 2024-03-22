/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.19
 * Generated at: 2024-03-22 06:49:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.scope;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class scope_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
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

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Servlet/JSP 내장 객체와 범위</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<h1>Servlet/JSP 내장 객체와 범위</h1>\r\n");
      out.write("	\r\n");
      out.write("	<pre>\r\n");
      out.write("		Servlet/JSP에는 4종류의 범위를 갖는 내장 객체 존재\r\n");
      out.write("		-> 각 종류마다 영향을 끼치는 범위가 다름\r\n");
      out.write("		-> 개발자가 객체를 별도 생성하지 않아도 JSP에서 바로 사용할 수 있는 객체\r\n");
      out.write("		\r\n");
      out.write("		1. page : 현재 페이지(한 페이지)\r\n");
      out.write("		->	현재 JSP 에서만 사용가능\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		2. request : 요청 받은 페이지와\r\n");
      out.write("					이를 위임 받은 페이지에서 사용 가능\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		3. session : 현재 사이트에 접속한 브라우저 당 1개씩 생성\r\n");
      out.write("					브라우저가 종료되거나, session 만료될때까지 유효\r\n");
      out.write("					\r\n");
      out.write("		\r\n");
      out.write("		4. application : 하나의 웹 어플리케이션마다 1개씩 생서오디는 객체\r\n");
      out.write("				서버 켜질 때 생성되어, 종료될때 없어짐\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("	</pre>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	<ul>\r\n");
      out.write("		<li>\r\n");
      out.write("			page scope <br>\r\n");
      out.write("			\r\n");
      out.write("			");
 
				// pageContext : page scope 객체 
				pageContext.setAttribute("pageValue", 555);
			
				pageContext.setAttribute("str", "page 범위에 세팅된 문자열");
			
			
      out.write("\r\n");
      out.write("			\r\n");
      out.write("			pageValue : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageScope.pageValue}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("		</li>\r\n");
      out.write("		\r\n");
      out.write("		<br>\r\n");
      out.write("		\r\n");
      out.write("		<li>\r\n");
      out.write("			request scope<br>\r\n");
      out.write("			reqValue : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.reqValue}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("		</li>\r\n");
      out.write("		\r\n");
      out.write("		<br>\r\n");
      out.write("		\r\n");
      out.write("		<li>\r\n");
      out.write("			session scope<br>\r\n");
      out.write("			sessionValue : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.sessionValue}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("		</li>\r\n");
      out.write("		\r\n");
      out.write("		<br>\r\n");
      out.write("		\r\n");
      out.write("		<li>\r\n");
      out.write("			application scope<br>\r\n");
      out.write("			appValue : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${applicationScope.appValue}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("		</li>\r\n");
      out.write("	\r\n");
      out.write("	</ul>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	<hr>\r\n");
      out.write("	\r\n");
      out.write("	<h4>각각의 범위에 세팅된 str</h4>\r\n");
      out.write("	");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageScope.str}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("<br>\r\n");
      out.write("	");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.str}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("<br>\r\n");
      out.write("	");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.str}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("<br>\r\n");
      out.write("	");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${applicationScope.str}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("<br>\r\n");
      out.write("	\r\n");
      out.write("	<h3>우선 순위 확인</h3>\r\n");
      out.write("	<h4>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${str}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h4>\r\n");
      out.write("	\r\n");
      out.write("	<pre>\r\n");
      out.write("		내장 객체의 우선순위\r\n");
      out.write("		\r\n");
      out.write("		page > request > session > application\r\n");
      out.write("		\r\n");
      out.write("	</pre>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	<hr>\r\n");
      out.write("	\r\n");
      out.write("	<h3>\r\n");
      out.write("		<a href=\"scopeCheck\">내장 객체별 생명주기</a>\r\n");
      out.write("	</h3>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
