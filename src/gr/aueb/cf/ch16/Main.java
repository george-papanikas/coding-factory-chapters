package gr.aueb.cf.ch16;

public class Main {

    public static void main(String[] args) {
        ISpeakable alice = new Cat("alice"); // polymorphism
        ISpeakable bob = new Dog("bob"); // polymorphism

        alice.speak();
        bob.speak();
        doSpeak(alice);
        doSpeak(bob);
    }

    public static void doSpeak(ISpeakable speakable) { // polymorphic method
        speakable.speak();

    }
}
