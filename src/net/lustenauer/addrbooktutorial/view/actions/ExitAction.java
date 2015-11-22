package net.lustenauer.addrbooktutorial.view.actions;

import net.lustenauer.addrbooktutorial.controller.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

/**
 * @author Patric Hollenstein
 */
public class ExitAction extends XAbstractAction{
    public ExitAction(Controller controller) {
        super(controller);

        putValue(NAME,"Exit");
        putValue(SHORT_DESCRIPTION,"Exit the application");
        putValue(SMALL_ICON, buildImageIcon("/icons/16px/system-log-out.png"));
        putValue(LARGE_ICON_KEY,buildImageIcon("/icons/32px/system-log-out.png"));
        putValue(MNEMONIC_KEY, KeyEvent.VK_X);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        controller.exit();
    }
}
