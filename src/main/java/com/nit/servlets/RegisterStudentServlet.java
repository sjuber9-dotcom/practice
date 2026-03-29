package com.nit.servlets;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import com.nit.connection.DBConnection;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/registerStudent")
public class RegisterStudentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String name = req.getParameter("sname");

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<h2>Student Registered Successfully</h2>");
        out.println("<h3>Welcome " + name + "</h3>");
        out.println("<a href='login.html'>Back to Login</a>");
        
        Connection con = DBConnection.getConnection();
        out.println("<h3>Connection Created.. " + con + "</h3>");
        
    }
}
