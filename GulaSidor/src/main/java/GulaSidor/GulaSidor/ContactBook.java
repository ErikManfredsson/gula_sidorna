package GulaSidor.GulaSidor;

import java.util.ArrayList;

public class ContactBook {
    

    ArrayList<Person> p = new ArrayList<Person>();

    public ContactBook(String a, String b) {
        LoadSave ls = new LoadSave(); 
        
        p = ls.Load().p;
    }
}
