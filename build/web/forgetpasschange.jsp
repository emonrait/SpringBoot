<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Sign In</title>
        <link rel="shortcut icon" type="image/png" href="image/favicon.png" />
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <script
        src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
        <script src="https://www.google.com/recaptcha/api.js"></script>
    </head>
    <body>
        <div class="row">
            <jsp:include page="header.jsp" />
        </div>

        <div class="container-fullwidth">
            <div class="row">
                <div class="jumbotron col-md-6 col-md-offset-3"
                     style="margin-top: 50px">
                    <h3 style="margin-bottom: 30px" class="col-md-10 col-md-offset-1 alert-danger">6 Digit Otp number Send Into Your Email</h3>
                    <div class="row">
                        <div class="col-md-6 col-md-offset-2">
                            <form method="post" action="LoginServlet">
                                <div class="form-group">
                                    <label for="otp">ENTER OTP NUMBER</label> <input type="text"
                                                                                  name="otp" required class="form-control" id="otp"
                                                                                  placeholder="otp number">
                                </div>
                                <div class="form-group">
                                    <label for="password">New Password*</label> <input type="password"
                                                                                  name="password" required class="form-control" id="password"
                                                                                  placeholder="New Password">
                                </div>
                                <div class="form-group">
                                    <label for="password">Confirm Password*</label> <input type="password"
                                                                             name="password" required class="form-control" id="password"
                                                                             placeholder="ReEnter password">
                                </div>
                                <div class="g-recaptcha" data-sitekey="6LeW7ZEUAAAAADbWCNcWBjsWzkzQs6BEuIS4yOv0"></div>
                                <br>
                                <%
                                    String isPassOK = (String) request.getAttribute("isPassOK");
                                    if (isPassOK != null && isPassOK.equals("No")) {
                                %>
                                <div class="alert alert-danger" role="alert">
                                    <strong>Account No/Password doesn't match.</strong>
                                </div>
                                <%
                                    }
                                %>
                                <input type="submit" class="btn btn-primary btn-lg"
                                       value="Submit Request"></input>
                            </form>

                        </div>
                    </div>
                </div>
            </div>

            <!-- Footer start here -->
            <div class="row" style="margin-top: 50px;">
                <jsp:include page="footer.jsp"></jsp:include>
            </div>
        </div>
    </body>
</html>