package com.net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author:罗钰超
 */
public class Filesocketserver {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务端等待接收");
        Socket socket=serverSocket.accept();
        BufferedInputStream bis=new BufferedInputStream(socket.getInputStream());
        byte[] bytes=StreamUtils.streamToByteArray(bis);
        String path="src\\abc.jpg";
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(path));
        bos.write(bytes);
        bos.close();
        BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write("我是服务端我收到了！");
        bufferedWriter.flush();
        socket.shutdownOutput();
//        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
//        outputStreamWriter.write("我是服务端我收到了");
//        outputStreamWriter.close();
        bufferedWriter.close();
        bis.close();
        socket.close();
        serverSocket.close();
    }
}
