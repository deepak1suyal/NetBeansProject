/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author dsuya
 */
public class NewServlet3 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet3</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NewServlet3 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         String i=request.getParameter("po");
        System.out.println(i);
       String apikey="30bc476f30deada0489c6022d48ab03d";
        String apiurl="https://api.openweathermap.org/data/2.5/weather?q="+i+"&appid="+apikey;
        
        URL url=new URL(apiurl);
        HttpURLConnection connection =(HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        //read
        InputStream inputStream = connection.getInputStream();
        InputStreamReader reader = new  InputStreamReader(inputStream);
        //store
        StringBuilder responseContent = new StringBuilder();
        //input
        Scanner s=new Scanner(reader);
        while(s.hasNext()){
        responseContent.append(s.nextLine());
        
        }
       
        //type cast
        Gson gson=new Gson();
        JsonObject jso=gson.fromJson(responseContent.toString(),JsonObject.class);
        System.out.println(jso);
          long d=jso.get("dt").getAsLong()*1000;  
        String date=new Date(d).toString();
        double t=jso.getAsJsonObject("main").get("temp").getAsDouble();  
        int c=(int)(t-273.15);
          int humidity=jso.getAsJsonObject("main").get("humidity").getAsInt();
            double windspeed=jso.getAsJsonObject("wind").get("speed").getAsDouble();
            String wether=jso.getAsJsonArray("weather").get(0).getAsJsonObject().get("main").getAsString();
            request.setAttribute("dt", d);
        request.setAttribute("date", date);
        request.setAttribute("temp", c);
        request.setAttribute("humi", humidity);
        request.setAttribute("wind", windspeed);
       request.setAttribute("wether", wether);
        request.getRequestDispatcher("index.jsp").forward(request, response);
      // 
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
