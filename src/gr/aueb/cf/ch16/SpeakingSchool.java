package gr.aueb.cf.ch16;

/**
 * Tightly coupled
 */

public class SpeakingSchool {
    private Cat cat; // alternatively private Cat cat = new Cat(); and void constructor

    public SpeakingSchool() {
        cat = new Cat();
    }

    public void learnToSpeak() { // tightly coupled
        cat.speak();
    }
}
