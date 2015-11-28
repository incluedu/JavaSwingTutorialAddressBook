package net.lustenauer.addrbooktutorial.controller;

import net.lustenauer.addrbooktutorial.model.Address;
import net.lustenauer.addrbooktutorial.model.AddressListModel;
import net.lustenauer.addrbooktutorial.model.AddressModel;
import net.lustenauer.addrbooktutorial.view.MainWindow;
import net.lustenauer.addrbooktutorial.view.actions.Actions;

import javax.swing.*;

/**
 * @author Patric Hollenstein
 */
public class Controller {
    private MainWindow mainWindow;
    private Actions actions;
    private AddressModel addressModel;

    public Controller() {

        initModel();
        initActions();
        initMainWindow();
    }


    private void initActions() {
        actions = new Actions(this);
    }

    public Actions getActions() {
        return actions;
    }

    private void initMainWindow() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                mainWindow = new MainWindow(Controller.this);
                mainWindow.setVisible(true);
            }
        });
    }

    public MainWindow getMainWindow() {
        return mainWindow;
    }

    public void exit() {
        getMainWindow().dispose();
    }

    public void addElement() {
        System.out.println("add");
    }

    public void removeElement() {
        System.out.println("remove");
    }


    public void searchElement() {
        System.out.println("search");
    }

    private AddressListModel addressListModel;


    // **********************
    // * ADDRESS LIST MODEL *
    // **********************
    private void initModel() {

        addressModel = new AddressModel();
        addressListModel = new AddressListModel(addressModel);

        addressModel.addAddress(new Address("Patric Hollenstein"));
        addressModel.addAddress(new Address("Monika Grabherr"));

    }


    public ListModel<?> getAddressListModel() {
        return addressListModel;
    }
}
