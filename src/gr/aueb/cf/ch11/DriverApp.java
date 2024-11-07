package gr.aueb.cf.ch11;

public class DriverApp {

    public static void main(String[] args) {
        Teacher alice = new Teacher();

        alice.setId(1);
        alice.setFirstname("Alice");
        alice.setLastname("W.");

        System.out.println("Id: " + alice.getId());
        System.out.println("Firstname: " + alice.getFirstname());
        System.out.println("Lastname: " + alice.getLastname());
    }
}
