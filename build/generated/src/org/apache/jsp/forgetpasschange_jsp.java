package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class forgetpasschange_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("        <title>Sign In</title>\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/png\" href=\"image/favicon.png\" />\n");
      out.write("        <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <script\n");
      out.write("        src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"https://www.google.com/recaptcha/api.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"container-fullwidth\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"jumbotron col-md-6 col-md-offset-3\"\n");
      out.write("                     style=\"margin-top: 50px\">\n");
      out.write("                    <h3 style=\"margin-bottom: 30px\" class=\"col-md-10 col-md-offset-1 alert-danger\">6 Digit Otp number Send Into Your Email</h3>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6 col-md-offset-2\">\n");
      out.write("                            <form method=\"post\" action=\"LoginServlet\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"otp\">ENTER OTP NUMBER</label> <input type=\"text\"\n");
      out.write("                                                                                  name=\"otp\" required class=\"form-control\" id=\"otp\"\n");
      out.write("                                                                                  placeholder=\"otp number\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"password\">New Password*</label> <input type=\"password\"\n");
      out.write("                                                                                  name=\"password\" required class=\"form-control\" id=\"password\"\n");
      out.write("                                                                                  placeholder=\"New Password\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"password\">Confirm Password*</label> <input type=\"password\"\n");
      out.write("                                                                             name=\"password\" required class=\"form-control\" id=\"password\"\n");
      out.write("                                                                             placeholder=\"ReEnter password\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"g-recaptcha\" data-sitekey=\"6LeW7ZEUAAAAADbWCNcWBjsWzkzQs6BEuIS4yOv0\"></div>\n");
      out.write("                                <br>\n");
      out.write("                                ");

                                    String isPassOK = (String) request.getAttribute("isPassOK");
                                    if (isPassOK != null && isPassOK.equals("No")) {
                                
      out.write("\n");
      out.write("                                <div class=\"alert alert-danger\" role=\"alert\">\n");
      out.write("                                    <strong>Account No/Password doesn't match.</strong>\n");
      out.write("                                </div>\n");
      out.write("                                ");

                                    }
                                
      out.write("\n");
      out.write("                                <input type=\"submit\" class=\"btn btn-primary btn-lg\"\n");
      out.write("                                       value=\"Submit Request\"></input>\n");
      out.write("                            </form>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Footer start here -->\n");
      out.write("            <div class=\"row\" style=\"margin-top: 50px;\">\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
