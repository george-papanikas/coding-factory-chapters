package gr.aueb.cf.ch26;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {

    public static void main(String[] args) {
        Socket sockFd = null;
        File file = new File("C:\\tmp\\testfd.txt");

        try (Scanner in = new Scanner(file)) {
            InetAddress servAddress = InetAddress.getByName("127.0.0.1");
            final int servPort = 7;

            sockFd = new Socket(servAddress, servPort);
            PrintWriter pw = new PrintWriter(sockFd.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(sockFd.getInputStream()));

            String line = null;
            do {
                line = in.nextLine();
                pw.println(line);
                pw.flush();
                System.out.println("Echo from server: " + br.readLine());
            } while (line.equals("BYE"));

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (sockFd != null) sockFd.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
