package com.example.demofirebasetorecycler;

public class model
{
    String name,course,email,purl;
    model()
    {

    }
    public model(String name, String course, String email, String purl) {
        this.name = name;
        this.course = course;
        this.email = email;
        this.purl = purl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPurl() {
        return purl;
    }

    public void setPurl(String purl) {
        this.purl = purl;
    }
}
