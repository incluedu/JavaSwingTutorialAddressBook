package net.lustenauer.addrbooktutorial.model;

import javax.swing.*;

/**
 * @author Patric Hollenstein
 */
public class AddressListModel extends AbstractListModel<Address>{
    private final AddressModel addressModel;

    public AddressListModel(AddressModel addressModel) {
        this.addressModel = addressModel;
    }

    @Override
    public int getSize() {
        return addressModel.getAddresses().size();
    }

    @Override
    public Address getElementAt(int index) {
        return addressModel.getAddresses().get(index);
    }

}
