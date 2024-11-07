package gr.aueb.cf.ch17.runnable;

public class Main {

    public static void main(String[] args) {
        Knight kingArthur = new Knight("King Arthur"); // only runnable instances should be used eg Runnable, not IKnight
        Knight sirLancelot = new Knight("Sir Lancelot");
        Knight saintGeorge = new Knight("Saint George");

        new Thread(kingArthur).start(); // kingArthur has converted to Thread instance
        new Thread(sirLancelot).start();
        new Thread(saintGeorge).start();
    }
}
