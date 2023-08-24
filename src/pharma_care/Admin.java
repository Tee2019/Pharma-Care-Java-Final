package pharma_care;

import java.util.*;

public class Admin extends Person {

    String password, code;
    ArrayList<Order> receipt = new ArrayList<>();

    public Admin(String name, String password) {
        super(name);
        this.password = password;
        this.code = code;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void displayReceipt() {
        for (Order o : receipt) {
            o.display();
        }
    }
}
