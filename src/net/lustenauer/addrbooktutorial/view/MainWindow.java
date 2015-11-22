package net.lustenauer.addrbooktutorial.view;

import net.lustenauer.addrbooktutorial.controller.Controller;
import net.lustenauer.addrbooktutorial.view.menus.MainMenuBar;
import net.lustenauer.addrbooktutorial.view.toolbar.MainToolBar;

import javax.swing.*;
import java.awt.*;

/**
 * @author Patric Hollenstein
 */
public class MainWindow extends JFrame{

    private final Controller controller;
    private MainToolBar toolBar;

    public MainWindow(Controller controller) {
        this.controller = controller;

        init();
        setJMenuBar(new MainMenuBar(controller));

        add(buildToolbar(),BorderLayout.NORTH);

    }

    private Component buildToolbar() {
        toolBar= new MainToolBar(controller);
        return toolBar;
    }

    private void init() {
        setTitle("Addressbook APP");
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
    }
}
