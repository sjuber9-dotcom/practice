package com.nit.dao;

import java.sql.*;

import com.nit.beans.StudentRegistration;
import com.nit.connection.DBConnection;


public class StudentRegistrationDAO {

    public int insertStudent(StudentRegistration s) {

        int status = 0;

        try {
            Connection con = DBConnection.getConnection();
            // Query
            String query = "INSERT INTO studentregistration (name, email, course, mobile) VALUES (?, ?, ?, ?)";
            
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setString(3, s.getCourse());
            ps.setLong(4, s.getMobile());

            status = ps.executeUpdate();

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }
}