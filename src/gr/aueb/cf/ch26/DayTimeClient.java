package gr.aueb.cf.ch26;

import javax.swing.table.TableRowSorter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

public class DayTimeClient {

    public static void main(String[] args) {
         StringBuilder sb = new StringBuilder();
         Socket socket = null;

        try {
            //InetAddress servAddress = InetAddress.getByName("time.nist.gov");
            InetAddress servAddress = InetAddress.getByName("127.0.0.1");
            int servPort = 13; //well-known port

            socket = new Socket(servAddress,servPort); // sockets use TCP protocol
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line = "";
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");

            }
            System.out.println("Daytime server says it is: " + sb); //sb.toString is called as it is converted into string inside println
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
