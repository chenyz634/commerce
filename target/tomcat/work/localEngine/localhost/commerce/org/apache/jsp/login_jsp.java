package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


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

      out.write('\n');

	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath() + "/";

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"zh\">\n");
      out.write("<head>\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<title>电子商务</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<link href=\"css/login.css\" rel=\"stylesheet\">\n");
      out.write("<script src=\"js/jquery-1.10.2.min.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"js/jquery.placeholder.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(document).ready(function() {\n");
      out.write("\t\t$(\"input, textarea\").placeholder();\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-sm-6 col-md-4 col-md-offset-4\">\n");
      out.write("\t\t\t\t<h1 class=\"text-center login-title\">用户登录</h1>\n");
      out.write("\t\t\t\t<div class=\"account-wall\">\n");
      out.write("\t\t\t\t\t<img class=\"profile-img\" src=\"images/photo.jpg.png\" alt=\"\">\n");
      out.write("\t\t\t\t\t");
if(request.getAttribute("shiroLoginFailure") != null){ 
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"alert alert-error\">\n");
      out.write("\t\t\t\t\t\t<a class=\"close\" data-dismiss=\"alert\" href=\"#\">×</a>用户名或密码错误！\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t");
} 
      out.write("\n");
      out.write("\t\t\t\t\t<form class=\"form-signin\" method=\"post\" action=\"\">\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"username\" class=\"form-control\"\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"用户名\" required autofocus>\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" name=\"password\" class=\"form-control\"\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"密码\" required>\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">\n");
      out.write("\t\t\t\t\t\t\t登录</button>\n");
      out.write("\t\t\t\t\t\t<label class=\"checkbox pull-left\">\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" name=\"rememberMe\"\n");
      out.write("\t\t\t\t\t\t\tvalue=\"true\"> 记住用户名\n");
      out.write("\t\t\t\t\t\t</label> <!-- <a href=\"#\" class=\"pull-right need-help\">帮助? </a> --><span\n");
      out.write("\t\t\t\t\t\t\tclass=\"clearfix\"></span>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"text-center new-account\">注册新用户</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t\n");
      out.write("\t</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
