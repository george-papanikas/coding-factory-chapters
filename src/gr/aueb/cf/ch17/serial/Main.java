package gr.aueb.cf.ch17.serial;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        File file = new File("C:/tmp/serial216.ser");
        Student student = new Student(1, "Alice", "W.");
        writeObj(student, file);

        Student studentToRead;
        studentToRead = readObj(file);
        System.out.println(studentToRead);

    }

    public static void writeObj(Student stu, File file) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(stu);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Student readObj(File file) {
        Student student = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            student = (Student) ois.readObject();
        } catch (IOException|ClassNotFoundException e) {
            e.printStackTrace();
        }
        return student;
    }
}
