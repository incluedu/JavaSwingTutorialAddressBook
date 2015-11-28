package net.lustenauer.addrbooktutorial.view.actions;

import net.lustenauer.addrbooktutorial.controller.Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

/**
 * @author Patric Hollenstein
 */
public class AddElementAction extends XAbstractAction{
    public AddElementAction(Controller controller) {
        super(controller);

        putValue(NAME,"Add Element");
        putValue(SHORT_DESCRIPTION,"Add an element to the addressbook");
        putValue(SMALL_ICON, buildImageIcon("/icons/16px/list-add.png"));
        putValue(LARGE_ICON_KEY,buildImageIcon("/icons/32px/list-add.png"));
        putValue(MNEMONIC_KEY, KeyEvent.VK_A);
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F5,0));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        controller.addElement();
    }
}
