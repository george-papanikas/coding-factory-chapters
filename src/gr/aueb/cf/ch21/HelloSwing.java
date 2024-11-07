package gr.aueb.cf.ch21;

import javax.swing.*;
import java.awt.*;

public class HelloSwing {

    public static void main(String[] args) {
        JFrame helloFrame = new JFrame("Coding Factory"); // Coding Factory is the title of the frame

        helloFrame.setSize(500, 250);
        helloFrame.setLocationRelativeTo(null);
        helloFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // EXIT_ON_CLOSE is a enum

        // Default Layout Manager on Content Pane is Flow
        JPanel contentPane = new JPanel(new FlowLayout());
        contentPane.add(new JLabel("Hello World"));

        helloFrame.setContentPane(contentPane);
        helloFrame.setVisible(true);
    }
}
