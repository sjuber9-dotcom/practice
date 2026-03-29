package com.nit.beans;

public class StudentRegistration {

    private String name;
    private String email;
    private String course;
    private long mobile;

    public StudentRegistration() {}

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public long getMobile() { return mobile; }
    public void setMobile(long mobile) { this.mobile = mobile; }
}