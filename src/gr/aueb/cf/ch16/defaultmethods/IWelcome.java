package gr.aueb.cf.ch16.defaultmethods;

public interface IWelcome {
    void saySomething(String message); // public abstract method which should override itself

    default void sayHelloCodingFactory() { // public default
        System.out.print("Hello");
        sayCodingFactory();
    }

    private void sayCodingFactory() {

        System.out.println("Coding Factory");
    }

    static void sayHelloCoding() { // public static, to avoid poor implementation - non-overridable
        System.out.println("Hello ");
        sayCoding(); // only static methods can be called
    }

    private static void sayCoding() {

        System.out.println("Coding");
    }
}
