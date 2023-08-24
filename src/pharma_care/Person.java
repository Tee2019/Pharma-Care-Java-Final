package pharma_care;

import java.util.*;

public abstract class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int search(String key, ArrayList<Medicine> meds) {
        int flag = 0;
        for (Medicine m : meds) {
            if (m.getMedName().toLowerCase().contains(key.toLowerCase()) == true || m.getDosageForm().toLowerCase().contains(key.toLowerCase()) == true || m.getIndication().toLowerCase().contains(key.toLowerCase()) == true) {
                m.display();
                flag++;
            }
        }
        return flag;
    }

    public abstract void displayReceipt();
}
