package gr.aueb.cf.ch11;

import java.util.Scanner;

/**
 * Definition of a simple Student class.
 * POJO (Plain Old Java Object)
 * Student Java Bean
 */
public class Student {
    private static int studentsCount;
    static Scanner in = new Scanner(System.in);

    // static block μπορεις να εχεις και κωδικα μέσα
    static {
        System.out.println("Please insert a number");
        int num = in.nextInt();
        studentsCount = (num == 1) ? 1 : 0;
}
    private int id;
    private String firstname;
    private String lastname;

    //Constructor
    public Student() {
        studentsCount++;
    } // ακμα και ετσι ο constructor λειτουργει ως default constructor, αλλά δεν χρειάζεται καν να τον δηλώσουμε
//        id = 0;   // εκτός και να βάλουμε overloaded constructor που σημαίνει ότι πρέεπι να τον δηλώσουμε
//        firstname = null;
//        lastname = null;

    // Overloaded Constructor
    public Student(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        studentsCount++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname (String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public static int getStudentsCount() {
        return studentsCount;
    }

    public static void setStudentsCount(int studentsCount) {
        Student.studentsCount = studentsCount;
    }
}
