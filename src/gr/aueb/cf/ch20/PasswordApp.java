package gr.aueb.cf.ch20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordApp {

    public static void main(String[] args) {
        String password = "Adddd9";
        // at least 6 chars, one upper-case and one number
        Pattern pattern = Pattern.compile("(?=.*?[A-Z])(?=.*?[0-9])^.{6,}$");
        Matcher matcher = pattern.matcher(password);

        if (matcher.matches()) {
            System.out.println(matcher.group());
        }
    }
}
