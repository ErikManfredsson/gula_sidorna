package GulaSidor.GulaSidor;

import java.util.ArrayList;
import java.util.List;

public class ContactBook {
    

    ArrayList<Person> p = new ArrayList<Person>();

    public ContactBook() {
        LoadSave ls = new LoadSave(); 
        
        p = ls.Load();
    }

    

}
