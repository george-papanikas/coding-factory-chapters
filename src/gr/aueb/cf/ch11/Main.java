package gr.aueb.cf.ch11;

/**
 * Driver class
 */
public class Main {

    public static void main(String[] args) {
        Student alice = new Student(); // Δηλωση και αρχικοποίηση, object or instance της κλασης Student ειναι η alice
        Student bob = new Student(2, "Bob", "D." );

        System.out.println("Number of students: " + Student.getStudentsCount());

        //Set
        alice.setId(1);
        alice.setFirstname("Alice");
        alice.setLastname("Wonderland");

        bob.setId(3);

        //Get
        System.out.println("Id: " + alice.getId());
        System.out.println("Firstname: " + alice.getFirstname());
        System.out.println("Lastname: " + alice.getLastname());

        System.out.println("Id: " + bob.getId());
        System.out.println("Firstname: " + bob.getFirstname());
        System.out.println("Lastname: " + bob.getLastname());
    }
}
