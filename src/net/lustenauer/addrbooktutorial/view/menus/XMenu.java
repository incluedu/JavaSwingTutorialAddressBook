package net.lustenauer.addrbooktutorial.view.menus;

import javax.swing.*;

/**
 * @author Patric Hollenstein
 */
public class XMenu extends JMenu {
    public XMenu() {
    }

    public XMenu(String s) {
        super(s);
    }

    public XMenu(Action a) {
        super(a);
    }

    public XMenu(String s, boolean b) {
        super(s, b);
    }

    public XMenu (String name, char mnemonic){
        this(name);
        setMnemonic(mnemonic);
    }
}
