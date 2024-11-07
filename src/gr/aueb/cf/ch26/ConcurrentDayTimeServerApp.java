package gr.aueb.cf.ch26;


import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ConcurrentDayTimeServerApp {
    private static final int port = 13;
    public static void main(String[] args) {

        try (ServerSocket servFd = new ServerSocket()) {
            servFd.bind((new InetSocketAddress("127.0.0.1", port)));
            System.out.println("Server started ...");

            while (true) {
                Socket connectedFd = servFd.accept();
                Thread socketThread = new Thread(new ConcurrentDayTimeServer(connectedFd));
                socketThread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
