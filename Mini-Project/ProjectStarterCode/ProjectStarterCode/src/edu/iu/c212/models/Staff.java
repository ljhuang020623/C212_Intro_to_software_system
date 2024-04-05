package edu.iu.c212.models;

public class Staff {
    private final String fullName;
    private final int age;
    private final String role;
    private final String availability;
    public Staff(String name, int age, String role, String av){
        this.fullName = name;
        this.age = age;
        this.role = role;
        this.availability = av;
    }
    public String getName(){return fullName;}
    public int getAge(){return age;}
    public String getRole(){return role;}
    public String getAvailability(){return availability;}
}
