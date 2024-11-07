package gr.aueb.cf.ch17.callback;

public class KnightApp {

    public static void main(String[] args) {
        IKnight kingArthur = new Knight();
        IKnight saintGeorge = new Knight();

        kingArthur.embarkOnMission(() -> System.out.println("Save the princess"));// lambda expression
        saintGeorge.embarkOnMission(() -> killTheDragon()); // lambda expression

        kingArthur.embarkOnMission(KnightApp::killTheDragon); // Method reference
    }

    public static void killTheDragon() {
        System.out.println("Kill the Dragon");
    }
}
