package gr.aueb.cf.ch11;

/**
 * Lazy instantiation.
 * Singleton pattern.
 */

public class CodingFactoryLazy {

    private static CodingFactoryLazy INSTANCE = null; // δεν πρεπει να ναι final γιατι θα πρεπει να αρχικοποιηθει οπωσδηποτε στον constructor

    private CodingFactoryLazy() {}

    public static CodingFactoryLazy getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CodingFactoryLazy();
        }
        return INSTANCE;
    }

    public void sayHello() {
        System.out.println("Hello Coding Factory");
    }
}
