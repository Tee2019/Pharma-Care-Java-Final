package pharma_care;

import java.io.*;
import java.util.*;

public class Cart {

    private ArrayList<Medicine> medicines;

    private int quantity;

    public Cart() {
        medicines = new ArrayList<>();
    }

    public void addMed(Medicine med, int quantity) {
        med.setQuantity(quantity);
        medicines.add(med);
    }

    public void removeMed(int index) {
        medicines.remove(index);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (var meds : medicines) {
            totalPrice += meds.getPrice() * meds.getQuantity();
        }
        return totalPrice;
    }

    public ArrayList<Medicine> getMedicines() {
        return medicines;
    }

    public void setMedicines(ArrayList<Medicine> medicines) {
        this.medicines = medicines;
    }
}
