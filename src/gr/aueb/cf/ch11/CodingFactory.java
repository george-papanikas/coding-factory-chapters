package gr.aueb.cf.ch11;
/**
 * Eager instantiation.
 * Mono-Coding Factory Universe.
 * Singleton Pattern.
 */
public class CodingFactory {

    private static final CodingFactory INSTANCE = new CodingFactory();

    private CodingFactory() {}

    public static CodingFactory getInstance() {
        return INSTANCE;
    }

    public void sayHello() {
        System.out.println("Hello Coding Factory");
    }
}
