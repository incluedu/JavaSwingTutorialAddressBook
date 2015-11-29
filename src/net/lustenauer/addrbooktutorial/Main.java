package net.lustenauer.addrbooktutorial;

import net.lustenauer.addrbooktutorial.controller.Controller;

import javax.swing.*;

/**
 * @author Patric Hollenstein
 */
public class Main {
    public static void main(String[] args) {


        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Controller();

            }
        });

    }
}
