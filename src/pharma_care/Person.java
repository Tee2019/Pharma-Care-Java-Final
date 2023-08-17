package pharma_care;
import java.util.*;

public abstract class Person 
{
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
    
    public abstract void displayReceipt(ArrayList<User> receipt, int i);
}
