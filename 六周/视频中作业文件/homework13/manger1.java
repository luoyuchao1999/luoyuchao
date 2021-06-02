package com.hspedu.homework.homework13;

public class manger1 extends emp{
    private double jiangjin;

    public manger1(String name, double salary, int day, double grade, double jiangjin) {
        super(name, salary, day, grade);
        this.jiangjin = jiangjin;
    }

    public double getJiangjin() {
        return jiangjin;
    }

    public void setJiangjin(double jiangjin) {
        this.jiangjin = jiangjin;
    }
    public void shows(){

        System.out.println("经理"+getName()+"的工资为"+getSalary()*getDay()*getGrade()+jiangjin);
    }
}
