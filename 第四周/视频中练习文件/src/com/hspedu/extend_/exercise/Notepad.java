package com.hspedu.extend_.exercise;

public class Notepad extends Computer {
    private String color;

    public Notepad(String cpu, int memory, int disk, String color) {
        super(cpu, memory, disk);
        this.color = color;
    }
    public void info(){
        System.out.print("PC信息为：");
        System.out.println(getDetails()+",color" + color);
    }
}
