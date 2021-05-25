package com.hspedu.smallchange.oop;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class smallchange1 {
    boolean flag=true;
    double money=0;
    double balance=0;
    String note="";
    String details="-----------------零钱通明细----------------";
    int choice=0;
    Scanner scanner=new Scanner(System.in);
    Date date = null; // date 是 java.util.Date 类型，表示日期
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm"); //可以用于日期格式化的
    public void details(){
        System.out.println(details);
    }
    public void income(){
        System.out.println("请输入收益");
        money=scanner.nextDouble();
        if(money<=0){
            System.out.println("收益应大于0");
        }
        balance+=money;
        date=new Date();
        details=details+"\n收益入账\t"+money+"\t"+sdf.format(date)+"\t"+balance;
        this.details();
    }
    public void pay(){
        System.out.println("请输入消费项目");
        note=scanner.next();
        System.out.println("请输入消费金额");
        money=scanner.nextDouble();
        if(money<=0||money>balance){
            System.out.println("钱不能小于0且不能大于余额");
        }
        balance+=money;
        details=details+"\n"+note+"\t"+money+"\t"+sdf.format(date)+"\t"+balance;
        this.details();
    }
    public void exit(){
        String key="";
        while(true){
            System.out.println("是否退出y/n?");
            key=scanner.next();
            if(key.equals("y")||key.equals("n")){
                break;
            }
        }
        if(key.equals("y")){
            flag=false;
        }
    }
    public void main(){
        do{
            System.out.println("\n================零钱通菜单===============");

        System.out.println("\t\t\t1 零钱通明细");
        System.out.println("\t\t\t2 收益入账");
        System.out.println("\t\t\t3 消费");
        System.out.println("\t\t\t4 退   出");
        System.out.println("请选择1-4");
        choice=scanner.nextInt();
        switch (choice){
            case 1:
                this.details();
                break;
            case 2:
                this.income();
                break;
            case 3:
                this.pay();
                break;
            case 4:
                this.exit();
                break;
            default:
                System.out.println("输入有误");
        }
        } while (flag);
        System.out.println("退出零钱通");
    }
}
