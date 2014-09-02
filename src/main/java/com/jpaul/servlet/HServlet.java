package com.jpaul.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HServlet extends HttpServlet {

    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)throws ServletException, IOException{

        httpServletResponse.setContentType("text/html");

        PrintWriter out = httpServletResponse.getWriter();
        out.println("Hello World <br />");


        String username = httpServletRequest.getParameter("username");
        String password = httpServletRequest.getParameter("password");


        out.println("<br />My username: " + username);
        out.println("<br />My password: " + password);


    }
}
