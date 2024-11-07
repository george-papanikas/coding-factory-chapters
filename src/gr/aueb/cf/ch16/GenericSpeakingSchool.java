package gr.aueb.cf.ch16;

public class GenericSpeakingSchool {
    private final ISpeakable speakable; //composition

    // Dependency Injection which means that I am provided with interface in composition
    // IoC - Inversion of Control / control belongs to client who makes new() indirectly
    public GenericSpeakingSchool(ISpeakable speakable) { // polymorphic constructor
        this.speakable = speakable;
    }

    public void learnToSpeak() { // loose coupled
        speakable.speak();
    }
}
