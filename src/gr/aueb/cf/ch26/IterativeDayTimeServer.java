package gr.aueb.cf.ch26;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.Provider;
import java.util.Date;

public class IterativeDayTimeServer extends Thread {

    @Override
    public void run() {
        ServerSocket servFd;
        final int serverPort = 13;

        try {
            servFd = new ServerSocket();
            servFd.bind(new InetSocketAddress("127.0.0.1", serverPort), 100); // 100 refers to maximum number of requests waiting in queue
            System.out.println("Daytime server is ready ...");

            while (true) {
                Socket connectedFd = servFd.accept();
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(connectedFd.getOutputStream()));
                bw.write(new Date().toString());
                bw.flush();
                connectedFd.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
