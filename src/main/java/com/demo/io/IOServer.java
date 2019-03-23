package com.demo.io;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description:
 * @ClassName: IOServer
 * @Author WangChangJing
 * @Date 2019/3/1
 */
public class IOServer {
    public static void main(String[] args) throws Exception {
        // 创建一个ServerSocket来监听 8000 端口
        ServerSocket serverSocket = new ServerSocket(8000);

        new Thread(() -> {
            while (true) {
                try {
                    // (1) 阻塞方法获取新的连接，如果没有新连接，就一直在等待
                    Socket socket = serverSocket.accept();

                    // (2) 每一个新的连接都创建一个线程，负责读取数据
                    new Thread(() -> {
                        try {
                            int len;
                            byte[] data = new byte[1024];
                            InputStream inputStream = socket.getInputStream();
                            // (3) 按字节流方式读取数据
                            while ((len = inputStream.read(data)) != -1) {
                                System.out.println(new String(data, 0, len));
                            }
                        } catch (IOException e) {
                        }
                    }).start();

                } catch (IOException e) {
                }

            }
        }).start();
    }
}
