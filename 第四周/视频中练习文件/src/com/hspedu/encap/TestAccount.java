package com.hspedu.encap;

public class TestAccount {
    public static void main(String[] args) {
        //创建Account
        Account account =new Account("大王",15,"55555");
        account.showInfo();
        Account account1 =new Account("大王吧",21,"abcdef");
        account1.showInfo();
    }
}
