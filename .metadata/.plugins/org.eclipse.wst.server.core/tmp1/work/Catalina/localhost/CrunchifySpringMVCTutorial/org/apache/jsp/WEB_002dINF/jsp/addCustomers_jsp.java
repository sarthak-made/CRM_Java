/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.80
 * Generated at: 2023-09-07 16:42:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addCustomers_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

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
  }

  public void _jspDestroy() {
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Consumer Relationship Database - Dashboard</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Poppins\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body,h1,h2,h3,h4,h5 {font-family: \"Poppins\", sans-serif}\r\n");
      out.write("body {font-size:16px;}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<nav class=\"w3-sidebar w3-red w3-collapse w3-top w3-large w3-padding\" style=\"z-index:3;width:300px;font-weight:bold;\" id=\"mySidebar\"><br>\r\n");
      out.write("  <a href=\"javascript:void(0)\" onclick=\"w3_close()\" class=\"w3-button w3-hide-large w3-display-topleft\" style=\"width:100%;font-size:22px\">Close Menu</a>\r\n");
      out.write("  <div class=\"w3-container\">\r\n");
      out.write("    <h3 class=\"w3-padding-64\"><b>CRM Database<br>Dashboard</b></h3>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"w3-bar-block\">\r\n");
      out.write("    <a href=\"index.html\" onclick=\"w3_close()\" class=\"w3-bar-item w3-button w3-hover-white\">Home</a> \r\n");
      out.write("    <a href=\"viewCustomers.html\" onclick=\"w3_close()\" class=\"w3-bar-item w3-button w3-hover-white\">View Customers</a> \r\n");
      out.write("    <a href=\"addCustomers.html\" onclick=\"w3_close()\" class=\"w3-bar-item w3-button w3-hover-white\">Add Customers</a> \r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("<div class=\"w3-main\" style=\"margin-left:340px;margin-right:40px\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Header -->\r\n");
      out.write("  <div class=\"w3-container\" style=\"margin-top:80px\" id=\"showcase\">\r\n");
      out.write("    <h1 class=\"w3-jumbo\"><b>Dashboard</b></h1>\r\n");
      out.write("    <h1 class=\"w3-xxxlarge w3-text-red\"><b>Add Customer Relationships</b></h1>\r\n");
      out.write("    <hr style=\"width:50px;border:5px solid red\" class=\"w3-round\">\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"w3-container\" id=\"contact\" style=\"margin-top:75px\">\r\n");
      out.write("    <p>Fill the below fields and submit to add a new customer into the database</p>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <form action=\"/action_page.php\" target=\"_blank\">\r\n");
      out.write("      <div class=\"w3-section\">\r\n");
      out.write("        <label>First Name</label>\r\n");
      out.write("        <input class=\"w3-input w3-border\" type=\"text\" name=\"Name\" required>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"w3-section\">\r\n");
      out.write("        <label>Last Name</label>\r\n");
      out.write("        <input class=\"w3-input w3-border\" type=\"text\" name=\"Name\" required>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"w3-section\">\r\n");
      out.write("        <label>Email ID </label>\r\n");
      out.write("        <input class=\"w3-input w3-border\" type=\"text\" name=\"Email\" required>\r\n");
      out.write("      </div>\r\n");
      out.write("      <button type=\"submit\" class=\"w3-button w3-block w3-padding-large w3-red w3-margin-bottom\">Add Customer</button>\r\n");
      out.write("    </form>\r\n");
      out.write("      \r\n");
      out.write("  </div>\r\n");
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
