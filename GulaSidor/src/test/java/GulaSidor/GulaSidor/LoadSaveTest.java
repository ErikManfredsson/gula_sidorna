package GulaSidor.GulaSidor;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoadSaveTest {
		
    @Test
    public void FindingFile()
    {
        LoadSave ls = new LoadSave();
        ContactBook cb = new ContactBook();
        assertEquals(cb.getClass(), ls.Load().getClass()); 
    }
}
