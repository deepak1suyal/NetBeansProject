<%-- 
    Document   : index
    Created on : 25-Nov-2023, 2:06:57 pm
    Author     : dsuya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="style.css"/>
              

    </head>
    <body>
        <div>
        <h1 class="lk" id="po">Date:${date}</h1>
        <h1 class="lk">Temprature:${temp}</h1>
        <h1 class="lk">Humidity:${humi}</h1>
        <h1 class="lk">Wind Speed:${wind}</h1>
        <h1 class="lk">Wether:${wether}</h1></div>
        <script>
            
          setInterval(function(){
              
              document.getElementById("po").innerHTML="Date:"+new Date();
          },1);  
            
        </script>
    </body>
</html>
