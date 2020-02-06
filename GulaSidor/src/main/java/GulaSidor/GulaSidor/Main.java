package GulaSidor.GulaSidor; 

public class Main {

    static ContactBook book = new ContactBook();
    public static void main(String[] args) {
        
        LoadSave ls = new LoadSave();
        book = ls.Load();

        for (int i = 0; i < book.p.size(); i++) {
            System.out.println(book.p.get(i).name + ": " + book.p.get(i).number);
        }
    }
}