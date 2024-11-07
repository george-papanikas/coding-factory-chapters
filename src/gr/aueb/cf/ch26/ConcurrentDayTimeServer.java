package gr.aueb.cf.ch26;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Date;

public class ConcurrentDayTimeServer implements Runnable {
    private final Socket sockFd;

    public ConcurrentDayTimeServer(Socket sockFd) {
        this.sockFd = sockFd;
    }

    @Override
    public void run() {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(sockFd.getOutputStream()))){
            bw.write(new Date().toString());
            bw.flush();
            sockFd.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
