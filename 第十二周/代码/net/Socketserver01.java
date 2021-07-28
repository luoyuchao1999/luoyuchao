package com.net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author:罗钰超
 */
public class Socketserver01 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket=serverSocket.accept();
        System.out.println("接收到"+socket.getClass());
        InputStream inputStream=socket.getInputStream();
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream)) ;
        String str=bufferedReader.readLine();
        System.out.println(str);
        OutputStream outputStream=socket.getOutputStream();
        BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("你好世界收到了");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
        outputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
