package pharma_care;

import java.util.*;

public class Order {

    private int oId;
    private static int autoAdd = 100;
    private int rId;
    private User user;
    private Cart cart;

    public Order(User user, Cart cart) {
        this.oId = ++autoAdd;
        this.user = user;
        this.cart = cart;
    }

    void alignment(int k, int length) {
        k = k - length;
        while (k != 0) {
            System.out.print(" ");
            k--;
        }
    }

    public int getoId() {
        return oId;
    }

    public void setoId(int oId) {
        this.oId = oId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private static void printHeader() {
        //System.out.println("------------------------------------------------");
        System.out.println("                   PHARMA CARE                  ");
        System.out.println(" Beribadh Road, Mohammadpur, Dhaka, Bangladesh  ");
        System.out.println("             Contact us: 01**-*******           ");
        System.out.println("           Email: pharmacare@gmail.com          ");
        System.out.println("------------------------------------------------");
    }

    public void display() {
        double totalCost = 0.0;
        int l = 0;
        printHeader();
        System.out.println("Order Id: " + oId);
        System.out.println("------------------------------------------------");
        System.out.println("Customer name: " + user.getName());
        System.out.println("Phone Number: " + user.getContactNumber());
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        System.out.println("Items                  Qty                 price");
        System.out.println("------------------------------------------------");
        for (Medicine x : cart.getMedicines()) {
            System.out.print(x.getMedName());
            alignment(23, x.getMedName().length());
            System.out.print(x.getQuantity());
            l = (int) (Math.log10(x.getQuantity()) + 1);
            alignment(19, l);
            System.out.print("$" + x.getPrice());
            totalCost += x.getPrice() * x.getQuantity();
            System.out.println();
        }
        System.out.println("------------------------------------------------");
        System.out.println("                       Total:            $" + totalCost);

        System.out.println("         Thank You for Using Our Service");
    }
}
