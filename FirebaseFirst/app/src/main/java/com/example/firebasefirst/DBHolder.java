package com.example.firebasefirst;

public class DBHolder {

    String name,city,contactno;

    public DBHolder(String name, String city, String contactno) {
        this.name = name;
        this.city = city;
        this.contactno = contactno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }
}
