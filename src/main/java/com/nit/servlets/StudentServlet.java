package com.nit.servlets;

import java.io.IOException;

import com.nit.beans.StudentRegistration;
import com.nit.dao.StudentRegistrationDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/registerStudent")
public class StudentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Get data
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String course = request.getParameter("course");
        long mobile = Long.parseLong(request.getParameter("mobile"));

        // Create Bean object
        StudentRegistration s = new StudentRegistration();
        s.setName(name);
        s.setEmail(email);
        s.setCourse(course);
        s.setMobile(mobile);

        // DAO call
        StudentRegistrationDAO dao = new StudentRegistrationDAO();
        int status = dao.insertStudent(s);

        // Response
        if (status > 0) {
            response.getWriter().println("Registration Successful");
        } else {
            response.getWriter().println("Registration Failed");
        }
    }
}