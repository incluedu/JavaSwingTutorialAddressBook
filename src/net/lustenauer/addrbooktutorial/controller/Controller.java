package net.lustenauer.addrbooktutorial.controller;

import net.lustenauer.addrbooktutorial.model.Address;
import net.lustenauer.addrbooktutorial.model.AddressListModel;
import net.lustenauer.addrbooktutorial.model.AddressModel;
import net.lustenauer.addrbooktutorial.view.MainWindow;
import net.lustenauer.addrbooktutorial.view.actions.Actions;
import net.lustenauer.addrbooktutorial.view.addresspanel.AddressPanel;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import java.awt.event.ActionEvent;

/**
 * @author Patric Hollenstein
 */
public class Controller {

    public Controller() {
        initModel();
        initActions();
        initMainWindow();

        addressHandling();
    }


    // ***********
    // * ACTIONS *
    // ***********
    private Actions actions;

    private void initActions() {
        actions = new Actions(this);
    }

    public Actions getActions() {
        return actions;
    }

    // ***************
    // * MAIN WINDOW *
    // ***************
    private MainWindow mainWindow;

    private void initMainWindow() {
        mainWindow = new MainWindow(Controller.this);
        mainWindow.setVisible(true);
    }

    public MainWindow getMainWindow() {
        return mainWindow;
    }

    public void exit() {
        getMainWindow().dispose();
    }


    // ****************
    // * ADDRESS LIST *
    // ****************
    private AddressModel addressModel;
    private AddressListModel addressListModel;

    private void initModel() {

        addressModel = new AddressModel();
        addressListModel = new AddressListModel(addressModel);

        addressModel.addAddress(new Address("Patric Hollenstein"));
        addressModel.addAddress(new Address("Monika Grabher"));

    }

    public ListModel<?> getAddressListModel() {
        return addressListModel;
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

    private void doListSelection(ListSelectionEvent e) {
        Address a = (Address) mainWindow.getAddressListPanel().getAddressList().getSelectedValue();

        mainWindow.getAddressPanel().setValues(a.getName(), a.getStreetAddress(), a.getTownName()
                , a.getZipCode(), a.getCountry(), a.getPhoneNumber(), a.geteMailAddress(), a.getInfo());
    }

    private void addressHandling() {
        mainWindow.getAddressListPanel().getAddressList().getSelectionModel()
                .addListSelectionListener(e -> doListSelection(e));

        mainWindow.getAddressPanel().getBtnReset().addActionListener(e -> doResetAddressPanel(e));
        mainWindow.getAddressPanel().getBtnSave().addActionListener(e -> doSaveAddressPanel(e));
    }

    private void doSaveAddressPanel(ActionEvent e) {
        Address a = (Address) mainWindow.getAddressListPanel().getAddressList().getSelectedValue();
        AddressPanel p = mainWindow.getAddressPanel();

        a.setName(p.getNameField().getText());
        a.setStreetAddress(p.getStreetAddressField().getText());
        a.setTownName(p.getTownNameField().getText());
        a.setZipCode(p.getZipCodeField().getText());
        a.setCountry(p.getCountryField().getText());
        a.setPhoneNumber(p.getPhoneNumberField().getText());
        a.seteMailAddress(p.geteMailAddressField().getText());
        a.setInfo(p.getInfoArea().getText());
    }


    private void doResetAddressPanel(ActionEvent e) {
        Address a = (Address) mainWindow.getAddressListPanel().getAddressList().getSelectedValue();

        mainWindow.getAddressPanel().setValues(a.getName(), a.getStreetAddress(), a.getTownName()
                , a.getZipCode(), a.getCountry(), a.getPhoneNumber(), a.geteMailAddress(), a.getInfo());

    }


}
