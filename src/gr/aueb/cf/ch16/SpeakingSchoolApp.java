package gr.aueb.cf.ch16;

public class SpeakingSchoolApp {

    public static void main(String[] args) {
        ISpeakable whiteCat = new Cat("White Cat");
        ISpeakable blackDog = new Dog("Black Dog");

        //Wiring
        GenericSpeakingSchool catSchool = new GenericSpeakingSchool(whiteCat);
        GenericSpeakingSchool dogSchool = new GenericSpeakingSchool(blackDog);
        catSchool.learnToSpeak();
        dogSchool.learnToSpeak();

        whiteCat.speak();
        blackDog.speak();
    }
}
