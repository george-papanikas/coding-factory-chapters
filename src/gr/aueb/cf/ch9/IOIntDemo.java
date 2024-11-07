package gr.aueb.cf.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class IOIntDemo {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:/tmp/IntIn.txt"));
        PrintStream ps = new PrintStream("C:/tmp/IntOut.txt");
        String token;
        int num = 0, sum = 0, count = 0;
        double average = 0.0;

        while (sc.hasNext()) {
            token = sc.next();
            if (isInt(token)) {
                num = Integer.parseInt(token);
                count++;
                sum += num;
            }
        }

        average = (double) sum / count;
        ps.printf("The sum is %d%n", sum);
        ps.printf("The average value  is %.2f", average);

        sc.close();
        ps.close();
    }
        public static boolean isInt(String s) {
            try {
                Integer.parseInt(s);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
}
