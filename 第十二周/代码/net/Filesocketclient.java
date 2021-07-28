package com.net;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @Author:罗钰超
 */
public class Filesocketclient {
    public static void main(String[] args) throws Exception {
        Socket socket=new Socket(InetAddress.getLocalHost(),8888);
        System.out.println("客户端发送！");
        String path="e:\\f1.jpg";
        BufferedInputStream bi=new BufferedInputStream(new FileInputStream(path));
        byte[] bytes=StreamUtils.streamToByteArray(bi);
        BufferedOutputStream outputStream = new BufferedOutputStream(socket.getOutputStream());
        outputStream.write(bytes);
        bi.close();
        socket.shutdownOutput();
        InputStream inputStream=socket.getInputStream();
        String s=StreamUtils.streamToString(inputStream);
        System.out.println(s);
        inputStream.close();
        outputStream.close();
        socket.close();
    }
}
