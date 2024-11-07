package gr.aueb.cf.ch16.functionalinterfaces;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class StudentApp {

    public static void main(String[] args) {
        Student[] students;
        students = new Student[] { // array initializer
                new Student(1, "Alice", "W."), new Student(2, "Bob", "D."), // anonymous instances as they have not references
                new Student(3, "Chris", "A."), new Student(4, "Jim", "K.")};

        printStudents(students, new IDChecker() { // anonymous class instance which implements interface
            @Override
            public boolean checkId(Student st) {
                return st.getId() >= 3;
            }
        });

        printStudents(students, (st) -> st.getId() <= 2); //(student) -> {return student.getId() <=2;});
        // st.getId() <= 2) --> call back

        printStudentsAll(students, (st) -> st.getId() <= 2);

        //using lamdas
        printAllStudents(students, (st) -> st.getId() <= 2, student -> student.printStudent());
        printAllStudents(students, (st) -> st.getId() <= 2, student -> Student.printStaticStudent(student));

        //using method references as student exists in both sides
        printAllStudents(students, (st) -> st.getId() <= 2, Student::printStudent);
        printAllStudents(students, (st) -> st.getId() <= 2, Student::printStaticStudent);
    }

    //1st way
    public static void printStudents(Student[] students, IDChecker checker) {
        for (Student student : students) {
            if (checker.checkId(student)) { //predicate is given at runtime
                System.out.println(student);
            }
        }
    }

    //2nd way (better than previous)
    public static void printStudentsAll(Student[] students, Predicate<Student> checker) {
        for (Student student : students) {
            if (checker.test(student)) {
                System.out.println(student);
            }
        }
    }

    //3rd way (better than previous)
    public static void printAllStudents(Student[] students, Predicate<Student> checker, Consumer<Student> action) {
        for (Student student : students) {
            if (checker.test(student)) {
                action.accept(student);
            }
        }
    }
}
