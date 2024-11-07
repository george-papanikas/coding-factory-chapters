package gr.aueb.cf.ch16.defaultmethods;

public class CodingFactory implements IWelcome {

    @Override
    public void saySomething(String message) {
        System.out.println("Please get the message: " + message);
    }

    @Override
    public void sayHelloCodingFactory() {
        IWelcome.super.sayHelloCodingFactory(); // interfaces are not being instantiated
        System.out.println("\u2764".repeat(5));
    }
}
