package net.lustenauer.addrbooktutorial.view;

import net.lustenauer.addrbooktutorial.controller.Controller;

import javax.swing.*;
import java.awt.*;

/**
 * @author Patric Hollenstein
 */
public class MainWindow extends JFrame{

    private final Controller controller;

    public MainWindow(Controller controller) {
        this.controller = controller;

        init();

    }

    private void init() {
        setTitle("Addressbook APP");
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
    }
}
