package com.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author:罗钰超
 */
public class Socketserver {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket=serverSocket.accept();
        System.out.println("接收到"+socket.getClass());
        InputStream inputStream=socket.getInputStream();
        byte[] buf=new byte[1024];
        int readline=0;
        while((readline=inputStream.read(buf))!=-1){
            System.out.println(new String(buf,0,readline));
        }
        OutputStream outputStream=socket.getOutputStream();
        outputStream.write("你好世界收到了！".getBytes());
        socket.shutdownOutput();
        outputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
