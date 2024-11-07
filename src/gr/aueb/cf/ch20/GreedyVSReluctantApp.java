package gr.aueb.cf.ch20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GreedyVSReluctantApp {

    public static void main(String[] args) {
        String passwordFile = "thanos:1234;chris:4567;alice:8907;";

        //Pattern pattern = Pattern.compile(".*;"); // Greedy
        Pattern pattern = Pattern.compile(".*?;"); // Reluctant
        Matcher matcher = pattern.matcher(passwordFile);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
