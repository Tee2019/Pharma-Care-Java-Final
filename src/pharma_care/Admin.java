package pharma_care;
import java.util.*;

public class Admin extends Person
{
    String password;

    public Admin(String name, String password) {
        super(name);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void displayReceipt(ArrayList<User> receipt, int i)
    {
        
    }
}
