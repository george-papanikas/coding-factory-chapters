package gr.aueb.cf.ch20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NonCapturingApp {

    public static void main(String[] args) {
        String s = "HelloWorld HelloWorldWorld";

        Pattern pattern = Pattern.compile("(Hello)(?:World)+"); // ?: non-capturing group
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            for (int i = 1; i <= matcher.groupCount(); i++) { //groupCount = 1 as (World) group is non captured
                System.out.println(matcher.group(i)); // .group()/.group(0) includes the whole string
            }
        }
    }
}
