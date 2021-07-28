package com.net;

import javax.xml.bind.SchemaOutputResolver;
import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @Author:罗钰超
 */
public class Homework1client {
    public static void main(String[] args) throws Exception {
        Socket socket=new Socket(InetAddress.getLocalHost(),8888);
        System.out.println("客户端发送：");
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write(s);
        bufferedWriter.newLine();
        bufferedWriter.flush();
        System.out.println("接收到的反馈");
        BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String str=br.readLine();
        System.out.println(str);
//        BufferedInputStream bufferedInputStream=new BufferedInputStream(socket.getInputStream());
//        byte[] bytes=new byte[1024];
//        int readline=0;
//        while ((readline=bufferedInputStream.read())!=-1){
//            System.out.println(new String(bytes,0,readline));
//        }
        bufferedWriter.close();
        br.close();
        socket.close();
    }
}
