
import java.util.Date;
import java.util.HashMap;

public class Contact {
    
    String nm;
    String rg;
    Date doB;
    HashMap<String, String> email;
    HashMap<String, String> phNo;
    Address addr;


    public Contact(){
        addr = new Address();


    }
}
