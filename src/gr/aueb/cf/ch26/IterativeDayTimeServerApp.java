package gr.aueb.cf.ch26;

import java.util.Scanner;

public class IterativeDayTimeServerApp {

    public static void main(String[] args) {
        IterativeDayTimeServer dayTimeServer = new IterativeDayTimeServer();
        dayTimeServer.start();

 /*     Scanner sc = new Scanner(System.in);    //mine solution
        System.out.println("start/stop");
        String op = sc.nextLine();
        if (op.equals("start")) dayTimeServer.start();
        if (op.equals("stop")) dayTimeServer.interrupt();*/
    }
}
