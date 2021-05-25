package com.hspedu.homework.homework13;

public class emp {
    private String name;
    private double salary;
    private int day;
    private double grade;
    public emp(String name, double salary, int day,double grade) {
        this.name = name;
        this.salary = salary;
        this.day = day;
        this.grade=grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void shows(){
        System.out.println(name+"的工资为"+salary*day*grade);
    }
}
