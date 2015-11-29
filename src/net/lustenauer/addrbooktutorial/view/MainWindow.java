package net.lustenauer.addrbooktutorial.view;

import net.lustenauer.addrbooktutorial.controller.Controller;
import net.lustenauer.addrbooktutorial.model.AddressListModel;
import net.lustenauer.addrbooktutorial.view.addresslist.AddressListPanel;
import net.lustenauer.addrbooktutorial.view.addresspanel.AddressPanel;
import net.lustenauer.addrbooktutorial.view.menus.MainMenuBar;
import net.lustenauer.addrbooktutorial.view.toolbar.MainToolBar;

import javax.swing.*;
import java.awt.*;

/**
 * @author Patric Hollenstein
 */
public class MainWindow extends JFrame{

    private final Controller controller;
    private MainToolBar toolBar;
    private AddressListPanel addressListPanel;

    public MainWindow(Controller controller) {
        this.controller = controller;

        init();
        setJMenuBar(new MainMenuBar(controller));

        add(buildToolbar(),BorderLayout.NORTH);
        add(buildAddressListPanel(),BorderLayout.WEST);
        add(buildAddressPanel(),BorderLayout.CENTER);

    }


    // *****************
    // * ADDRESS PANEL *
    // *****************
    AddressPanel addressPanel;

    private Component buildAddressPanel() {
        addressPanel = new AddressPanel();
        return addressPanel;
    }

    public AddressPanel getAddressPanel() {
        return addressPanel;
    }

    // ****************
    // * ADDRESS LIST *
    // ****************
    private Component buildAddressListPanel() {
        addressListPanel = new AddressListPanel(controller.getAddressListModel());
        return addressListPanel;
    }

    public AddressListPanel getAddressListPanel() {
        return addressListPanel;
    }

    // ***********
    // * TOOLBAR *
    // ***********
    private Component buildToolbar() {
        toolBar= new MainToolBar(controller);
        return toolBar;
    }

    public MainToolBar getToolBar() {
        return toolBar;
    }

    private void init() {
        setTitle("Addressbook APP");
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
    }
}
