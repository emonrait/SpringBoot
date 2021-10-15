package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.green.bank.model.AccountModel;
import javax.servlet.http.HttpSession;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

AccountModel ac = null;
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/header_css.css\">\n");
      out.write("</head>\n");
      out.write("<div class=\"container-fullwidth\">\n");
      out.write("\t<div class=\"row hidden-xs topper\">\n");
      out.write("\t\t<div class=\"col-xs-7 col-sm-7\">\n");
      out.write("\t\t\t<a href=\"index.jsp\"><img am-TopLogo alt=\"SECUREVIEW\"\n");
      out.write("\t\t\t\tsrc=\"image/greenbank.png\" class=\"img-responsive\"></a>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- End Topper -->\n");
      out.write("\t<!-- Navigation -->\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t<nav class=\"navbar navbar-inverse\" role=\"navigation\"\n");
      out.write("\t\t\tstyle=\"margin-bottom: 0px;\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\n");
      out.write("\t\t\t\t\tdata-target=\".navbar-ex1-collapse\">\n");
      out.write("\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span> <span\n");
      out.write("\t\t\t\t\t\tclass=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\n");
      out.write("\t\t\t\t\t\tclass=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\t\t\t\t<a class=\"navbar-brand visible-xs-inline-block nav-logo\" href=\"/\"><img\n");
      out.write("\t\t\t\t\tsrc=\"/images/logo-dark-inset.png\" class=\"img-responsive\" alt=\"\"></a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t");

				ac = (AccountModel) session.getAttribute("userDetails");
			
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t<!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse navbar-ex1-collapse\">\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav js-nav-add-active-class\">\n");
      out.write("\t\t\t\t\t<li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t\t");

						if (ac == null) {
					
      out.write("\n");
      out.write("\t\t\t\t\t<li><a href=\"create_account.jsp\">Create new account</a></li>\n");
      out.write("\t\t\t\t\t");

						}
					
      out.write("\n");
      out.write("\t\t\t\t\t<li><a href=\"deposit.jsp\">Deposit</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"withdraw.jsp\">Withdraw</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"transfer.jsp\">Transfer</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"close_account.jsp\">Close A/C</li>\n");
      out.write("\t\t\t\t\t<li class=\"visible-xs-block\"><a href=\"/about.html\">About\n");
      out.write("\t\t\t\t\t\t\tUs</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"visible-xs-block\"><a href=\"/careers.html\">Careers</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"visible-xs-block\"><a href=\"/press-release.html\">Press\n");
      out.write("\t\t\t\t\t\t\tRelease</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"visible-xs-block\"><a\n");
      out.write("\t\t\t\t\t\thref=\"https://susteen7.zendesk.com/hc/en-us\">Support</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle\"\n");
      out.write("\t\t\t\t\t\tdata-toggle=\"dropdown\">Company <b class=\"caret\"></b></a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"about.html\">About Us</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"admin_login.jsp\">Admin panel</a></li>\n");
      out.write("\t\t\t\t\t\t</ul></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- If user is logged in this menu will be shown -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t");

					if (ac != null) {
				
      out.write("\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle\"\n");
      out.write("\t\t\t\t\t\tdata-toggle=\"dropdown\"> <span class=\"glyphicon glyphicon-user\"></span>\n");
      out.write("\t\t\t\t\t\t\t<strong>");
      out.print(ac.getUsername());
      out.write("</strong> <span\n");
      out.write("\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-chevron-down\"></span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"navbar-login\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p class=\"text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-user icon-size\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-8\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p class=\"text-left\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<strong>");
      out.print(ac.getFirst_name() + " " + ac.getLast_name());
      out.write("</strong>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p class=\"text-left small\">");
      out.print(ac.getEmail());
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p class=\"text-left\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"profile.jsp\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"btn btn-primary btn-block btn-sm\">Profile</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"divider navbar-login-session-bg\"></li>\n");
      out.write("\t\t\t\t\t\t\t");

								if (ac.getUsername().equals("admin")) {
							
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"loan_request.jsp\">Loan request<span\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-list-alt pull-right\"></span></a></li>\n");
      out.write("\t\t\t\t\t\t\t");

								} else {
							
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"change_password.jsp\">Change Password<span\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-cog pull-right\"></span></a></li>\n");
      out.write("\t\t\t\t\t\t\t");

								}
							
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"logout.jsp\">Sign Out<span\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-log-out pull-right\"></span></a></li>\n");
      out.write("\t\t\t\t\t\t</ul></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t<!-- End User menu -->\n");
      out.write("\t\t\t\t");

					} else {
				
      out.write("\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav navbar-right hidden-xs\">\n");
      out.write("\t\t\t\t\t<a type=\"button\" class=\"navbar-btn btn btn-primary\"\n");
      out.write("\t\t\t\t\t\tam-latosans=\"bold\" href=\"login.jsp\">Login</a>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- /.navbar-collapse -->\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</nav>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
