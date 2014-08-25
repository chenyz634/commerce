package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Basic TextBox - jQuery EasyUI Demo</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"easyui/themes/default/easyui.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"easyui/themes/icon.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/login.css\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"easyui/jquery.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <h2>Basic TextBox</h2>\r\n");
      out.write("    <div style=\"margin:20px 0;\"></div>\r\n");
      out.write("    <div class=\"easyui-panel\" title=\"Register\" style=\"width:400px;padding:30px 60px\">\r\n");
      out.write("        <div style=\"margin-bottom:20px\">\r\n");
      out.write("            <div>Email:</div>\r\n");
      out.write("            <input class=\"easyui-textbox\" data-options=\"prompt:'Enter a email address...',validType:'email'\" style=\"width:100%;height:32px\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div style=\"margin-bottom:20px\">\r\n");
      out.write("            <div>First Name:</div>\r\n");
      out.write("            <input class=\"easyui-textbox\" style=\"width:100%;height:32px\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div style=\"margin-bottom:20px\">\r\n");
      out.write("            <div>Last Name:</div>\r\n");
      out.write("            <input class=\"easyui-textbox\" style=\"width:100%;height:32px\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div style=\"margin-bottom:20px\">\r\n");
      out.write("            <div>Company:</div>\r\n");
      out.write("            <input class=\"easyui-textbox\" style=\"width:100%;height:32px\">\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div>\r\n");
      out.write("            <a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-ok\" style=\"width:100%;height:32px\">Register</a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
