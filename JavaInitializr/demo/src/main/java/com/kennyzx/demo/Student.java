package com.kennyzx.demo;

public class Student {
    private long id;
    private String name;
    private String passport;

    public Student() {
        this(0, "", ""); 
    }

    public Student(String name, String passport) {
        this(0, name, passport); 
    }

    public Student(long id, String name, String passport) {
        this.id = id;
        this.name = name;
        this.passport = passport; 
    }

    public long getId() { return id;} 
    public void setId(long id) { this.id = id; }

    public String getName() { return name;} 
    public void setId(String name) { this.name = name; }

    public String getPassport() { return passport;} 
    public void setPassport(String passport) { this.passport = passport; } 

    @Override 
    public String toString() {
        return String.format("Student [id=%s, name=%s, passport=%s]", id, name, passport);
    }
}
