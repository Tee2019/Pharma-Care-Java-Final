package pharma_care;

import java.util.*;

public class User extends Person {

    private String address, contactNumber;
    private Order order;

    public User(String name, String address, String contactNumber) {
        super(name);
        this.address = address;
        this.contactNumber = contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void displayReceipt() {
        order.display();
    }
}
