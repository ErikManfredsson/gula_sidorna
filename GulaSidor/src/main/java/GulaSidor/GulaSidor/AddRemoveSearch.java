package GulaSidor.GulaSidor;

import java.util.ArrayList;

public class AddRemoveSearch {

    ContactBook cb = new ContactBook(); 
    public ArrayList<Person> foundpeople = new ArrayList<Person>(); 

    AddRemoveSearch(ContactBook book)
    {
        cb = book;
    }

 //     Lägger till en ny person i listan    
    public void Add(String a, String b) {
        Person newPerson = new Person(); 
        newPerson.name=a;
        newPerson.number=b; 
        cb.p.add(newPerson); 
    }
//      Går igenom ArrayList och om det matchar namn eller nummer så raderas den 
    public void Remove(String a, String b) {
        for (int i = 0; i < cb.p.size(); i++) {
            if(cb.p.get(i).name==a || cb.p.get(i).number==b) {
                cb.p.remove(i);
            }
        }
    }
// Vid sökning så öppnas en tom ArrayList som fylls på med namn/nummer som matchar sökningen
    public void Search (String a, String b) {
        foundpeople = new ArrayList<Person>();

        for (int i = 0; i < cb.p.size(); i++) 
        {
            for (int j = 0; j < cb.p.size(); j++) 
            {
                if(cb.p.get(i).fname.matches(".*" + a + ".*"))
                {
                    foundpeople.add(cb.p.get(i));
                }

                if(cb.p.get(i).lname.matches(".*" + a + ".*"))
                {
                    foundpeople.add(cb.p.get(i));
                }

                if(cb.p.get(i).number.matches(".*" + b + ".*"))
                {
                    foundpeople.add(cb.p.get(i));
                }

                String temp = a + " " + b;
                String temp2 = cb.p.get(i).fname + " " + cb.p.get(i).lname + " " + cb.p.get(i).number;
    
                if(temp2.matches(".*" + temp + ".*"))
                {
                    foundpeople.add(cb.p.get(i));
                }
            }
        }
    }
}