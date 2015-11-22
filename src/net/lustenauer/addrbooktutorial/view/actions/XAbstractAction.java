package net.lustenauer.addrbooktutorial.view.actions;

import net.lustenauer.addrbooktutorial.controller.Controller;

import javax.swing.*;
import java.net.URL;

/**
 * @author Patric Hollenstein
 */
public abstract class XAbstractAction extends AbstractAction{
    protected Controller controller;

    public XAbstractAction(Controller controller) {
        this.controller = controller;
    }

    protected ImageIcon buildImageIcon(String location){
        URL imageURL = XAbstractAction.class.getResource(location);
        return imageURL == null ? null : new ImageIcon(imageURL);
    }
}
