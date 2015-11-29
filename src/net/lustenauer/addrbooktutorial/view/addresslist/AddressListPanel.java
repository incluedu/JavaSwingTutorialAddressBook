package net.lustenauer.addrbooktutorial.view.addresslist;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import java.awt.*;

/**
 * @author Patric Hollenstein
 */
public class AddressListPanel extends JPanel{

    private final JList addressList;
    private final ListModel<?> listModel;

    public AddressListPanel(ListModel<?> listModel) {
        this.listModel = listModel;

        setPreferredSize(new Dimension(300,0));
        setLayout(new BorderLayout());


        addressList = new JList<>(listModel);
        addressList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        addressList.getSelectionModel().addListSelectionListener(e -> doListSelection(e));

        add(new JScrollPane(addressList),BorderLayout.CENTER);

    }

    private void doListSelection(ListSelectionEvent e) {
        System.out.println("doListSelection");
    }

    public JList getAddressList() {
        return addressList;
    }
}
