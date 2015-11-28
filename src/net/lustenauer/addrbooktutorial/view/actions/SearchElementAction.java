package net.lustenauer.addrbooktutorial.view.actions;

import net.lustenauer.addrbooktutorial.controller.Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

/**
 * @author Patric Hollenstein
 */
public class SearchElementAction extends XAbstractAction{
    public SearchElementAction(Controller controller) {
        super(controller);

        putValue(NAME,"Search Element");
        putValue(SHORT_DESCRIPTION,"Search element in the addressbook");
        putValue(SMALL_ICON, buildImageIcon("/icons/16px/system-search.png"));
        putValue(LARGE_ICON_KEY,buildImageIcon("/icons/32px/system-search.png"));
        putValue(MNEMONIC_KEY, KeyEvent.VK_S);
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F7,0));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        controller.searchElement();
    }
}
