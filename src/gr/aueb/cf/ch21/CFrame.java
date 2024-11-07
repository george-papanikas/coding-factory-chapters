package gr.aueb.cf.ch21;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CFrame extends JFrame {

    public CFrame() {
        //View
        this.setSize(500, 250);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Coding Factory");

        JPanel contentPane = new JPanel();
        this.setContentPane(contentPane);

        JButton btn = new JButton("Warning Button");

        //Controller
        btn.addActionListener(new ActionListener() { // we register a click listener on button which takes as a parameter a functional interface
        // ActionListener (LISTENER) is a functional interface anonymous class which has one method actionPerformed (HANDLER) which handles onclick event (callback)
            // instead of functional interface we could have used a lamda expression
            @Override
            public void actionPerformed(ActionEvent e) {
                // JOptional is pop-up
                JOptionPane.showMessageDialog(null, "Message", "Title", JOptionPane.WARNING_MESSAGE);
            }
        });
        contentPane.add(btn);
    }
}
