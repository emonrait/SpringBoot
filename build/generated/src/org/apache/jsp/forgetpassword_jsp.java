package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class forgetpassword_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>Sign In</title>\n");
      out.write("<link rel=\"shortcut icon\" type=\"image/png\" href=\"image/favicon.png\" />\n");
      out.write("<link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div class=\"container-fullwidth\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"jumbotron col-md-6 col-md-offset-3\"\n");
      out.write("\t\t\t\tstyle=\"margin-top: 50px\">\n");
      out.write("\t\t\t\t<h1 style=\"margin-bottom: 30px\" class=\"col-md-10 col-md-offset-1\">Account Information</h1>\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 col-md-offset-2\">\n");
      out.write("\t\t\t\t\t\t<form method=\"post\" action=\"LoginServlet\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"email\">UserName</label> <input type=\"text\"\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"UserName\" required class=\"form-control\" id=\"account_no\"\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"UserName\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"password\">Password*</label> <input type=\"password\"\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"password\" required class=\"form-control\" id=\"password\"\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Password\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"checkbox\">\n");
      out.write("\t\t\t\t\t\t\t\t<label> <input name=\"remember\" type=\"checkbox\"\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"Remember Me\">Remember Me\n");
      out.write("\t\t\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t");

							    String isPassOK = (String) request.getAttribute("isPassOK");
								if (isPassOK!=null && isPassOK.equals("No")) {
							
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"alert alert-danger\" role=\"alert\">\n");
      out.write("\t\t\t\t\t\t\t\t<strong>Account No/Password doesn't match.</strong>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t");

								}
							
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" class=\"btn btn-primary btn-lg\"\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"Sign\n");
      out.write("\t\t\t\t\t\t\t\tto your account\"></input>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("                                                        <a>forget password</a>||<a>change password</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<!-- Footer start here -->\n");
      out.write("\t\t<div class=\"row\" style=\"margin-top: 50px;\">\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
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
