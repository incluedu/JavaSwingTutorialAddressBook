package net.lustenauer.addrbooktutorial.controller;

import net.lustenauer.addrbooktutorial.view.MainWindow;
import net.lustenauer.addrbooktutorial.view.actions.Actions;

import javax.swing.*;

/**
 * @author Patric Hollenstein
 */
public class Controller {
    private MainWindow mainWindow;
    private Actions actions;

    public Controller() {

        initActions();
        initMainWindow();
    }

    private void initActions() {
        actions = new Actions(this);
    }

    public Actions getActions() {
        return actions;
    }

    private void initMainWindow() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                mainWindow = new MainWindow(Controller.this);
                mainWindow.setVisible(true);
            }
        });
    }

    public MainWindow getMainWindow() {
        return mainWindow;
    }

    public void exit() {
        getMainWindow().dispose();
    }
}
