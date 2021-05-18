package com.hspedu.pkg;

import java.util.Arrays;

public class Import01 {

    public static void main(String[] args) {

        //使用系统提供 Arrays 完成 数组排序
        int[] arr = {-1, 20, 2, 13, 3};
        //比如对其进行排序
        //传统方法是，自己编写排序(冒泡)
        //系统是提供了相关的类，可以方便完成 Arrays
        Arrays.sort(arr);
        //输出排序结果
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
