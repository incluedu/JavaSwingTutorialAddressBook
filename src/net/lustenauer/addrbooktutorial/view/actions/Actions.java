package net.lustenauer.addrbooktutorial.view.actions;

import net.lustenauer.addrbooktutorial.controller.Controller;

import javax.swing.*;

/**
 * @author Patric Hollenstein
 */
public class Actions {

    private Action exitAction;

    public Actions(Controller controller) {
        exitAction = new ExitAction(controller);
    }

    public Action getExitAction() {
        return exitAction;
    }
}
