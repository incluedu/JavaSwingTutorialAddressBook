package net.lustenauer.addrbooktutorial.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Patric Hollenstein
 */
public class AddressModel implements Serializable {

    private final ArrayList<Address> addresses = new ArrayList<>();

    public AddressModel() {
    }

    public void addAddress(Address address) {
        addresses.add(address);
    }

    public boolean removeAddress(Address address) {
        boolean result = addresses.remove(address);

        return result;
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }




}
