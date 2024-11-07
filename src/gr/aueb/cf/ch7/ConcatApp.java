package gr.aueb.cf.ch7;

public class ConcatApp {

    public static void main(String[] args) {
        String title = "Dr. ";
        String firstName = "George";
        String lastName = "Papanikas";
        String fullName;
        String titledFullName;

        fullName = title + firstName + lastName;
        titledFullName = title.concat(firstName).concat(lastName);

        System.out.println(fullName);
        System.out.println(titledFullName);
    }
}
