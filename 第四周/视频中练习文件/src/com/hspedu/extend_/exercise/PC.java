package com.hspedu.extend_.exercise;

//编写PC子类，继承Computer类，添加特有属性【品牌brand】

public class PC extends Computer{
  private String brand;

  public PC(String cpu, int memory, int disk, String brand) {
    super(cpu, memory, disk);
    this.brand = brand;
  }
  public void info(){
    System.out.print("PC信息为：");
    System.out.println(getDetails()+",brand" + brand);
  }
}
