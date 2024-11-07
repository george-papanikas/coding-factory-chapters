package gr.aueb.cf.ch1;

import gr.aueb.cf.ch1.model.Point;
import gr.aueb.cf.ch11.HelloUtil;

//import java.util.Scanner;
//import java.util.*;
//import java.lang.*; μονο αυτο γινεται αυτοματα import στη java
//import static java.lang.Math.abs; ωστε να καλεις την abs μονο με abs

/**
 * Prints <b>Hello World!</b> on
 * standard output (console)
 * Defines a {@link HelloWorld} type inline tag
 *
 * @author gp block tag
 * @version 1.0
 * @since 0.1
 */
public class HelloWorld {
    /**
     *
     */
    private java.util.Scanner sc = new java.util.Scanner(System.in);
    private Point point;
    private String s;

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Hello World!");
        int abs = java.lang.Math.abs(-3);// το java.lang γινεται αυτοματα import δεν χρειαζεται να το κανω εγω οπως εδω
        HelloUtil.sayHello();
    }
}
