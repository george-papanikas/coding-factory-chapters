package gr.aueb.cf.ch21;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        //Event Dispatch Thread (EDT)
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CFrame().setVisible(true);
            }
        });
    }
}
