package net.lustenauer.addrbooktutorial.view.actions;

import net.lustenauer.addrbooktutorial.controller.Controller;

import javax.swing.*;

/**
 * @author Patric Hollenstein
 */
public class Actions {

    private Action exitAction;
    private Action addElementAction;
    private Action removeElementAction;
    private Action searchElementAction;

    public Actions(Controller controller) {
        exitAction = new ExitAction(controller);
        addElementAction = new AddElementAction(controller);
        removeElementAction = new RemoveElementAction(controller);
        searchElementAction = new SearchElementAction(controller);
    }

    public Action getExitAction() {
        return exitAction;
    }

    public Action getAddElementAction() {
        return addElementAction;
    }

    public Action getRemoveElementAction() {
        return removeElementAction;
    }

    public Action getSearchElementAction() {
        return searchElementAction;
    }
}
