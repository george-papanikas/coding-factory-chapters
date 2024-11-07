package gr.aueb.cf.ch16.defaultmethods;

public class Main {

    public static void main(String[] args) {
        IWelcome welcome = new CodingFactory();
        welcome.sayHelloCodingFactory();
        welcome.saySomething("\u2764");
    }
}
