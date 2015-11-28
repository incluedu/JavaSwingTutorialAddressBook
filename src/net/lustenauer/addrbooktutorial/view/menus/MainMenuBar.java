package net.lustenauer.addrbooktutorial.view.menus;

import net.lustenauer.addrbooktutorial.controller.Controller;
import net.lustenauer.addrbooktutorial.view.actions.Actions;

import javax.swing.*;

/**
 * @author Patric Hollenstein
 */
public class MainMenuBar extends JMenuBar {
    private final Controller controller;
    private final Actions actions;

    public MainMenuBar(Controller controller) {
        this.controller = controller;
        actions = controller.getActions();

        add(buildFileMenu());
        add(buildEditMenu());
    }

    private JMenu buildEditMenu() {
        XMenu m = new XMenu("Edit", 'E');

        m.add(actions.getAddElementAction());
        m.add(actions.getRemoveElementAction());
        m.add(actions.getSearchElementAction());

        return m;
    }

    private JMenu buildFileMenu() {
        XMenu m = new XMenu("File", 'F');

        m.add(actions.getExitAction());

        return m;
    }
}
