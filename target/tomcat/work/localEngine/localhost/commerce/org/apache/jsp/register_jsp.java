package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>注册</title>\r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/icomoon-social.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/main.css\">\r\n");
      out.write("<script src=\"js/modernizr-2.6.2-respond-1.1.0.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write(" <div class=\"mainmenu-wrapper\">\r\n");
      out.write("\t        <div class=\"container\">\r\n");
      out.write("\t        \t<div class=\"menuextras\">\r\n");
      out.write("\t\t\t\t\t<div class=\"extras\">\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"shopping-cart-items\"><i class=\"glyphicon glyphicon-shopping-cart icon-white\"></i> <a href=\"page-shopping-cart.html\"><b>3 items</b></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"dropdown choose-country\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"#\" data-toggle=\"dropdown\" href=\"#\"><img src=\"img/flags/gb.png\" alt=\"Great Britain\"> UK</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\" role=\"menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li role=\"menuitem\"><a href=\"#\"><img src=\"img/flags/us.png\" alt=\"United States\"> US</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li role=\"menuitem\"><a href=\"#\"><img src=\"img/flags/de.png\" alt=\"Germany\"> DE</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li role=\"menuitem\"><a href=\"#\"><img src=\"img/flags/es.png\" alt=\"Spain\"> ES</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t        \t\t<li><a href=\"page-login.html\">Login</a></li>\r\n");
      out.write("\t\t\t        \t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t        </div>\r\n");
      out.write("\t\t        <nav id=\"mainmenu\" class=\"mainmenu\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"logo-wrapper\"><a href=\"index.html\"><img src=\"img/mPurpose-logo.png\" alt=\"Multipurpose Twitter Bootstrap Template\"></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"index.html\">Home</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"features.html\">Features</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"has-submenu active\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">Pages +</a>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"mainmenu-submenu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"mainmenu-submenu-inner\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4>Homepage</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"index.html\">Homepage (Sample 1)</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"page-homepage-sample.html\">Homepage (Sample 2)</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4>Services & Pricing</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"page-services-1-column.html\">Services/Features (Rows)</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"page-services-3-columns.html\">Services/Features (3 Columns)</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"page-services-4-columns.html\">Services/Features (4 Columns)</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"page-pricing.html\">Pricing Table</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4>Team & Open Vacancies</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"page-team.html\">Our Team</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"page-vacancies.html\">Open Vacancies (List)</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"page-job-details.html\">Open Vacancies (Job Details)</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4>Our Work (Portfolio)</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"page-portfolio-2-columns-1.html\">Portfolio (2 Columns, Option 1)</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"page-portfolio-2-columns-2.html\">Portfolio (2 Columns, Option 2)</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"page-portfolio-3-columns-1.html\">Portfolio (3 Columns, Option 1)</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"page-portfolio-3-columns-2.html\">Portfolio (3 Columns, Option 2)</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"page-portfolio-item.html\">Portfolio Item (Project) Description</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4>General Pages</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"page-about-us.html\">About Us</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"page-contact-us.html\">Contact Us</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"page-faq.html\">Frequently Asked Questions</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"page-testimonials-clients.html\">Testimonials & Clients</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"page-events.html\">Events</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"page-404.html\">404 Page</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"page-sitemap.html\">Sitemap</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"page-login.html\">Login</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"page-register.html\">Register</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"page-password-reset.html\">Password Reset</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"page-terms-privacy.html\">Terms & Privacy</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"page-coming-soon.html\">Coming Soon</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4>eShop</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"page-products-3-columns.html\">Products listing (3 Columns)</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"page-products-4-columns.html\">Products listing (4 Columns)</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"page-products-slider.html\">Products Slider</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"page-product-details.html\">Product Details</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"page-shopping-cart.html\">Shopping Cart</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4>Blog</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"page-blog-posts.html\">Blog Posts (List)</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"page-blog-post-right-sidebar.html\">Blog Single Post (Right Sidebar)</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"page-blog-post-left-sidebar.html\">Blog Single Post (Left Sidebar)</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"page-news.html\">Latest & Featured News</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div><!-- /mainmenu-submenu-inner -->\r\n");
      out.write("\t\t\t\t\t\t\t</div><!-- /mainmenu-submenu -->\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"credits.html\">Credits</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</nav>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Page Title -->\r\n");
      out.write("\t\t<div class=\"section section-breadcrumbs\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t<h1>Register</h1>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"section\">\r\n");
      out.write("\t    \t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-5\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"basic-login\">\r\n");
      out.write("\t\t\t\t\t\t\t<form role=\"form\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t        \t\t\t\t \t<label for=\"register-username\"><i class=\"icon-user\"></i> <b>Email</b></label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"form-control\" id=\"register-username\" type=\"text\" placeholder=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t        \t\t\t\t \t<label for=\"register-password\"><i class=\"icon-lock\"></i> <b>Password</b></label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"form-control\" id=\"register-password\" type=\"password\" placeholder=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t        \t\t\t\t \t<label for=\"register-password2\"><i class=\"icon-lock\"></i> <b>Re-enter Password</b></label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"form-control\" id=\"register-password2\" type=\"password\" placeholder=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn pull-right\">Register</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-6 col-sm-offset-1 social-login\">\r\n");
      out.write("\t\t\t\t\t\t<p>You can use your Facebook or Twitter for registration</p>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"social-login-buttons\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"btn-facebook-login\">Use Facebook</a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"btn-twitter-login\">Use Twitter</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t    <!-- Footer -->\r\n");
      out.write("\t    <div class=\"footer\">\r\n");
      out.write("\t    \t<div class=\"container\">\r\n");
      out.write("\t\t    \t<div class=\"row\">\r\n");
      out.write("\t\t    \t\t<div class=\"col-footer col-md-3 col-xs-6\">\r\n");
      out.write("\t\t    \t\t\t<h3>Our Latest Work</h3>\r\n");
      out.write("\t\t    \t\t\t<div class=\"portfolio-item\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"portfolio-image\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"page-portfolio-item.html\"><img src=\"img/portfolio6.jpg\" alt=\"Project Name\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t    \t\t</div>\r\n");
      out.write("\t\t    \t\t<div class=\"col-footer col-md-3 col-xs-6\">\r\n");
      out.write("\t\t    \t\t\t<h3>Navigate</h3>\r\n");
      out.write("\t\t    \t\t\t<ul class=\"no-list-style footer-navigate-section\">\r\n");
      out.write("\t\t    \t\t\t\t<li><a href=\"page-blog-posts.html\">Blog</a></li>\r\n");
      out.write("\t\t    \t\t\t\t<li><a href=\"page-portfolio-3-columns-2.html\">Portfolio</a></li>\r\n");
      out.write("\t\t    \t\t\t\t<li><a href=\"page-products-3-columns.html\">eShop</a></li>\r\n");
      out.write("\t\t    \t\t\t\t<li><a href=\"page-services-3-columns.html\">Services</a></li>\r\n");
      out.write("\t\t    \t\t\t\t<li><a href=\"page-pricing.html\">Pricing</a></li>\r\n");
      out.write("\t\t    \t\t\t\t<li><a href=\"page-faq.html\">FAQ</a></li>\r\n");
      out.write("\t\t    \t\t\t</ul>\r\n");
      out.write("\t\t    \t\t</div>\r\n");
      out.write("\t\t    \t\t\r\n");
      out.write("\t\t    \t\t<div class=\"col-footer col-md-4 col-xs-6\">\r\n");
      out.write("\t\t    \t\t\t<h3>Contacts</h3>\r\n");
      out.write("\t\t    \t\t\t<p class=\"contact-us-details\">\r\n");
      out.write("\t        \t\t\t\t<b>Address:</b> 123 Fake Street, LN1 2ST, London, United Kingdom<br/>\r\n");
      out.write("\t        \t\t\t\t<b>Phone:</b> +44 123 654321<br/>\r\n");
      out.write("\t        \t\t\t\t<b>Fax:</b> +44 123 654321<br/>\r\n");
      out.write("\t        \t\t\t\t<b>Email:</b> <a href=\"mailto:getintoutch@yourcompanydomain.com\">getintoutch@yourcompanydomain.com</a>\r\n");
      out.write("\t        \t\t\t</p>\r\n");
      out.write("\t\t    \t\t</div>\r\n");
      out.write("\t\t    \t\t<div class=\"col-footer col-md-2 col-xs-6\">\r\n");
      out.write("\t\t    \t\t\t<h3>Stay Connected</h3>\r\n");
      out.write("\t\t    \t\t\t<ul class=\"footer-stay-connected no-list-style\">\r\n");
      out.write("\t\t    \t\t\t\t<li><a href=\"#\" class=\"facebook\"></a></li>\r\n");
      out.write("\t\t    \t\t\t\t<li><a href=\"#\" class=\"twitter\"></a></li>\r\n");
      out.write("\t\t    \t\t\t\t<li><a href=\"#\" class=\"googleplus\"></a></li>\r\n");
      out.write("\t\t    \t\t\t</ul>\r\n");
      out.write("\t\t    \t\t</div>\r\n");
      out.write("\t\t    \t</div>\r\n");
      out.write("\t\t    \t<div class=\"row\">\r\n");
      out.write("\t\t    \t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t    \t\t\t<div class=\"footer-copyright\">&copy; 2013 mPurpose. All rights reserved.</div>\r\n");
      out.write("\t\t    \t\t</div>\r\n");
      out.write("\t\t    \t</div>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Javascripts \r\n");
      out.write("        <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js\"></script>-->\r\n");
      out.write("        <script>window.jQuery || document.write('<script src=\"js/jquery-1.9.1.min.js\"><\\/script>')</script>\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"http://cdn.leafletjs.com/leaflet-0.5.1/leaflet.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.fitvids.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.sequence-min.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.bxslider.js\"></script>\r\n");
      out.write("        <script src=\"js/main-menu.js\"></script>\r\n");
      out.write("        <script src=\"js/template.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
