package GulaSidor.GulaSidor; 

public class Main {

    static ContactBook book = new ContactBook();
    public static void main(String[] args) {
        
        LoadSave ls = new LoadSave();
        book = ls.Load();

        AddRemoveSearch ars = new AddRemoveSearch(book);
        ars.Search("Simon Södergren", "");
  //      ars.Add("Simon Södergren", "0721641288");

        for (int i = 0; i < ars.foundpeople.size(); i++) {
            System.out.println("Found: "+ ars.foundpeople.get(i).fname + " " + ars.foundpeople.get(i).lname + " " + ars.foundpeople.get(i).number);
        }
        //ars.Remove("Noah Sophiasson", "072721456");

 //       ls.Save(book);
    }
}