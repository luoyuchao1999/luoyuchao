package com.hspedu.smallchange;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class small {
    //化繁为简
    //1. 先完成显示菜单，并可以选择菜单，给出对应提示
    //2. 完成零钱通明细
    //3. 完成收益入账
    //4. 消费
    //5. 退出
    //6. 用户输入4退出时，给出提示"你确定要退出吗? y/n"，必须输入正确的y/n ，否则循环输入指令，直到输入y 或者 n
    //7. 在收益入账和消费时，判断金额是否合理，并给出相应的提示
    public static void main(String[] args) {
        //定义相关的变量
        boolean flag=true;
        double money=0;
        double balance=0;
        String note="";
        String details="-----------------零钱通明细----------------";
        int choice=0;
        String key="";
        Scanner scanner=new Scanner(System.in);
        Date date = null; // date 是 java.util.Date 类型，表示日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm"); //可以用于日期格式化的
        do{
            System.out.println("\n================零钱通菜单===============");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退     出");
            System.out.println("请选择1-4");
            choice=scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println(details);
                    break;
                case 2:
                    System.out.println("请输入收益");
                    money=scanner.nextDouble();
                    if(money<=0){
                        System.out.println("收益应大于0");
                    }
                    balance+=money;
                    date=new Date();
                    details=details+"\n收益入账\t"+money+"\t"+sdf.format(date)+"\t"+balance;
                    System.out.println(details);
                    break;
                case 3:
                    System.out.println("请输入消费项目");
                    note=scanner.next();
                    System.out.println("请输入消费金额");
                    money=scanner.nextDouble();
                    if(money<=0||money>balance){
                        System.out.println("钱不能小于0且不能大于余额");
                    }
                    balance+=money;
                    details=details+"\n"+note+"\t"+money+"\t"+sdf.format(date)+"\t"+balance;
                    System.out.println(details);
                    break;
                case 4:
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
                    break;
                default:
                    System.out.println("输入有误");
            }
        }while (flag);
        System.out.println("退出零钱通");
    }
}