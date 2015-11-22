package net.lustenauer.addrbooktutorial.controller;

import net.lustenauer.addrbooktutorial.view.MainWindow;

import javax.swing.*;

/**
 * @author Patric Hollenstein
 */
public class Controller {
    private MainWindow mainWindow;

    public Controller() {

        initMainWindow();
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
}
