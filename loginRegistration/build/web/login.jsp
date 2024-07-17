<%-- 
    Document   : login
    Created on : 01-Jan-2024, 2:58:32 pm
    Author     : dsuya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css"/>
        <link rel="stylesheet" href="style.css"/>
         <link rel="stylesheet" href="log.css"/>
    </head>
    <body>
        <nav>
            <div><div class="first">Jakarta</div></div>
            <div class="nav_item">
                <div class="second"><a href="index.html">Home</a></div>
                 <div class="second"><a href="about.html">About Us</a></div>
                 <div class="second"><a href="login.jsp">Login</a></div>
                 <div class="second"><a href="registration.jsp">Registration</a></div> 
                 <div class="second"><a href="contact.html">Contact Us</a></div>
            </div>
              <div class="last"><i class="fa-solid fa-magnifying-glass"></i></div>
            </nav>
        <div class ="formc">
            
        <form action="logins" method="post">
           
            <div class="log">Login</div>
            <div class="nam">Username</div>
            <div class="typ" ><input type="text" name="username"/></div>
            <div class="nam" >Password</div>
            <div class="typ" ><input type="password" name="password"/></div>
            <div class="but"><input type="submit" value="Login" class="sub"/></div>
             <% String error = request.getParameter("error");
            if (error != null && error.equals("1")) { %>
            <div class="m"><p  class="mse">Invalid username or password. Please try again.</p></div>
        <% } %>
             </form></div>
  
    </body>
</html>
