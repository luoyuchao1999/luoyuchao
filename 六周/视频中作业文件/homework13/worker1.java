package com.hspedu.homework.homework13;

public class worker1 extends emp{
    public worker1(String name, double salary, int day, double grade) {
        super(name, salary, day, grade);
    }
    public void shows(){
        System.out.println("普通员工");
        super.shows();
    }
}
