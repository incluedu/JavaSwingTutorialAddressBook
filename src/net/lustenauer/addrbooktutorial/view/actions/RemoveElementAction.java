package net.lustenauer.addrbooktutorial.view.actions;

import net.lustenauer.addrbooktutorial.controller.Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

/**
 * @author Patric Hollenstein
 */
public class RemoveElementAction extends XAbstractAction{
    public RemoveElementAction(Controller controller) {
        super(controller);

        putValue(NAME,"Remove Element");
        putValue(SHORT_DESCRIPTION,"Remove selected element from the addressbook");
        putValue(SMALL_ICON, buildImageIcon("/icons/16px/list-remove.png"));
        putValue(LARGE_ICON_KEY,buildImageIcon("/icons/32px/list-remove.png"));
        putValue(MNEMONIC_KEY, KeyEvent.VK_R);
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F6,0));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        controller.removeElement();
    }
}
