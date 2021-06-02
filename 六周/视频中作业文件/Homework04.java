package com.hspedu.homework;

import com.hspedu.homework.homework13.manger1;
import com.hspedu.homework.homework13.worker1;

public class Homework04 {
    public static void main(String[] args) {
        manger1 manage = new manger1("刘备", 100, 20, 1.2,10000);

        manage.shows();

        worker1 worker = new worker1("关羽",50, 10, 1.0);
        worker.shows();

    }
}
