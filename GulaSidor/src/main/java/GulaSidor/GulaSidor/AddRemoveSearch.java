package GulaSidor.GulaSidor;

import java.util.ArrayList;

public class AddRemoveSearch {

    ContactBook cb = new ContactBook(); 
    public ArrayList<Person> foundpeople = new ArrayList<Person>(); 

 //     Lägger till en ny person i listan    
    public void Add(String a, long b) {
        Person newPerson = new Person(); 
        newPerson.name=a;
        newPerson.number=b; 
        cb.p.add(newPerson); 
    }
//      Går igenom ArrayList och om det matchar namn eller nummer så raderas den 
    public void Remove(String a, long b) {
        for (int i = 0; i < cb.p.size(); i++) {
            if(cb.p.get(i).name==a || cb.p.get(i).number==b) {
                cb.p.remove(i);
            }
        }
    }
// Vid sökning så öppnas en tom ArrayList som fylls på med namn/nummer som matchar sökningen
    public void Search (String a, long b) {
        foundpeople = new ArrayList<Person>(); 
        for (int i = 0; i < cb.p.size(); i++) {
            if(cb.p.get(i).name==a || cb.p.get(i).number==b) {
                foundpeople.add(cb.p.get(i));
            }
        }
    }
     
}