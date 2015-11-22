package net.lustenauer.addrbooktutorial.view.toolbar;

import net.lustenauer.addrbooktutorial.controller.Controller;
import net.lustenauer.addrbooktutorial.view.actions.Actions;

import javax.swing.*;

/**
 * @author Patric Hollenstein
 */
public class MainToolBar extends JToolBar {
    private final Controller controller;
    private final Actions actions;

    public MainToolBar(Controller controller) {
        this.controller = controller;
        actions = controller.getActions();

        setFloatable(false);

        add(actions.getExitAction());
    }
}
