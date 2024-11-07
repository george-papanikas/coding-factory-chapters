package gr.aueb.cf.ch17.callback;

public class Main {

    public static void main(String[] args) {
        IKnight sirLancelot = new Knight();
        IKnight kingArthur = new Knight();

        sirLancelot.embarkOnMission(new IMission() {
            @Override
            public void embark() {
                System.out.println("Save the Princess");
            }
        });

        kingArthur.embarkOnMission(new IMission() { // anonymous classes should be kept as short as possible
            @Override
            public void embark() { // It is meant Main.killTheDragon
                killTheDragon();

            }
        });
    }
    public static void killTheDragon() {
        System.out.println("Kill the Dragon");

    }
}
