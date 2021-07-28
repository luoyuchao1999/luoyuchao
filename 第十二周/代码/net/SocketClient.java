package com.net;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @Author:罗钰超
 */
public class SocketClient {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket(InetAddress.getLocalHost(),9999);
        System.out.println("客户端连接"+socket.getClass());
        OutputStream outputStream=socket.getOutputStream();
//        outputStream.write("你好世界！".getBytes());
//        socket.shutdownOutput();
        BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("你好世界");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        InputStream inputStream=socket.getInputStream();
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream)) ;
        String str=bufferedReader.readLine();
        System.out.println(str);
        bufferedReader.close();
        bufferedWriter.close();
        inputStream.close();
        outputStream.close();
        socket.close();
        System.out.println("客户端退出");
    }
}
