package com.net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author:罗钰超
 */
public class Homework1server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(8888);
        System.out.println("我是服务端");
        Socket socket=serverSocket.accept();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s=bufferedReader.readLine();
        String answer="";
        if("name".equals(s)){
            answer="你好我是java";
        }else if("hobby".equals(s)){
            answer="编写程序！";
        }else{
            answer="你在说什么牛马？";
        }

        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(socket.getOutputStream());
        bufferedOutputStream.write(answer.getBytes());
        bufferedOutputStream.flush();
        socket.shutdownOutput();
        bufferedOutputStream.close();
        bufferedReader.close();
        socket.close();
        serverSocket.close();
    }
}
