package net.lustenauer.addrbooktutorial.view.addresspanel;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

/**
 * @author Patric Hollenstein
 */
public class AddressPanel extends JPanel implements DocumentListener {

    private JTextField nameField;
    private JTextField streetAddressField;
    private JTextField townNameField;
    private JTextField zipCodeField;
    private JTextField countryField;
    private JTextField phoneNumberField;
    private JTextField eMailAddressField;
    private JTextArea infoArea;

    private JLabel nameLabel;
    private JLabel streetAddressLabel;
    private JLabel townNameLabel;
    private JLabel zipCodeLabel;
    private JLabel countryLabel;
    private JLabel phoneNumberLabel;
    private JLabel eMailAddressLabel;
    private JLabel infoLabel;

    private JButton btnSave;
    private JButton btnReset;


    public AddressPanel() {
        setLayout(new BorderLayout());

        add(buildFormPanel(),BorderLayout.CENTER);
        add(buildButtonPanel(),BorderLayout.SOUTH);
    }

    // ****************
    // * BUTTON PANEL *
    // ****************
    private Component buildButtonPanel() {
        JPanel bp = new JPanel(new FlowLayout(FlowLayout.TRAILING));

        btnReset = new JButton("Reset Entry");
        btnSave = new JButton(("Save Entry"));

        setEnableButtons(false);

        bp.add(btnReset);
        bp.add(btnSave);

        return bp;
    }

    private void setEnableButtons(boolean enabled) {
        btnReset.setEnabled(enabled);
        btnSave.setEnabled(enabled);
    }

    public JButton getBtnReset() {
        return btnReset;
    }

    public JButton getBtnSave() {
        return btnSave;
    }

    // **************
    // * FORM PANEL *
    // **************
    public Component buildFormPanel(){
        JPanel fp = new JPanel(new MigLayout());

        nameLabel = new JLabel("Name:");
        streetAddressLabel = new JLabel("Street Address:");
        townNameLabel = new JLabel("Town Name:");
        zipCodeLabel = new JLabel("Zip Code:");
        countryLabel = new JLabel("Country");
        phoneNumberLabel = new JLabel("Phone Nummber:");
        eMailAddressLabel = new JLabel("EMail Address:");
        infoLabel = new JLabel("Info:");


        nameField = new JTextField(20);
        streetAddressField = new JTextField(20);
        townNameField = new JTextField(20);
        zipCodeField = new JTextField(20);
        countryField = new JTextField(20);
        phoneNumberField = new JTextField(20);
        eMailAddressField = new JTextField(20);
        infoArea = new JTextArea(8, 30);

        nameField.getDocument().addDocumentListener(this);
        streetAddressField.getDocument().addDocumentListener(this);
        townNameField.getDocument().addDocumentListener(this);
        zipCodeField.getDocument().addDocumentListener(this);
        countryField.getDocument().addDocumentListener(this);
        phoneNumberField.getDocument().addDocumentListener(this);
        eMailAddressField.getDocument().addDocumentListener(this);
        infoArea.getDocument().addDocumentListener(this);

        infoArea.setBorder(BorderFactory.createEtchedBorder());


        fp.add(nameLabel);
        fp.add(nameField, "wrap");

        fp.add(streetAddressLabel);
        fp.add(streetAddressField, "wrap");

        fp.add(townNameLabel);
        fp.add(townNameField, "wrap");

        fp.add(zipCodeLabel);
        fp.add(zipCodeField, "wrap");

        fp.add(countryLabel);
        fp.add(countryField, "wrap");

        fp.add(phoneNumberLabel);
        fp.add(phoneNumberField, "wrap");

        fp.add(eMailAddressLabel);
        fp.add(eMailAddressField, "wrap");

        fp.add(infoLabel);
        fp.add(infoArea, "span2");

        return fp;

    }

    public JTextField getNameField() {
        return nameField;
    }

    public JTextField getStreetAddressField() {
        return streetAddressField;
    }

    public JTextField getTownNameField() {
        return townNameField;
    }

    public JTextField getZipCodeField() {
        return zipCodeField;
    }

    public JTextField getCountryField() {
        return countryField;
    }

    public JTextField getPhoneNumberField() {
        return phoneNumberField;
    }

    public JTextField geteMailAddressField() {
        return eMailAddressField;
    }

    public JTextArea getInfoArea() {
        return infoArea;
    }

    // ******************
    // * MISC METHODE'S *
    // ******************
    public void setValues(String name, String streetAddress, String townName,
                          String zipCode, String country, String phoneNumber,
                          String eMailAddress, String info) {
        nameField.setText(name);
        streetAddressField.setText(streetAddress);
        townNameField.setText(townName);
        zipCodeField.setText(zipCode);
        countryField.setText(country);
        phoneNumberField.setText(phoneNumber);
        eMailAddressField.setText(eMailAddress);
        infoArea.setText(info);

        setEnableButtons(false);

    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        setEnableButtons(true);
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        setEnableButtons(true);
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        setEnableButtons(true);
    }
}
