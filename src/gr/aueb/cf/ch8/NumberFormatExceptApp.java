package gr.aueb.cf.ch8;

import java.util.Scanner;

public class NumberFormatExceptApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputStr = "";
        int inpuNum = 0;

        try {
            System.out.println("Please insert an int");
            inputStr = in.nextLine();
            inpuNum = Integer.parseInt(inputStr);
            System.out.println("Input num: " + inpuNum);
        } catch (NumberFormatException x) {
//            x.printStackTrace();
            System.out.println("Error in input");
        }
    }
}
