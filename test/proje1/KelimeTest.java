package proje1;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class KelimeTest {

    public KelimeTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testGetKelime() {
        System.out.println("*****getKelime() metodunun testidir*****");
        Kelime ornekKelime = new Kelime("test");
        String expResult = "test";
        String result = ornekKelime.getKelime();
        assertEquals(expResult, result);

    }

    @Test
    public void testSetKelime() {
        System.out.println("*****setKelime() metodunun testidir*****");
        String yeniKelime = "TestPassed";
        Kelime ornekKelime = new Kelime("test");
        ornekKelime.setKelime(yeniKelime);

    }

    @Test
    public void testGetUzunluk() {
        System.out.println("*****getUzunluk() metodunun testidir*****");
        Kelime ornekKelime = new Kelime("notepad");
        int expResult = 7;
        int result = ornekKelime.getUzunluk();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testEquals() {
        System.out.println("*****equals() metodunun testidir*****");
        Kelime kelime2 = new Kelime("test");
        Kelime kelime1 = new Kelime("test");
        boolean expResult = true;
        boolean result = kelime1.equals(kelime2);
        assertEquals(expResult, result);
       
    }

    @Test
    public void testSingleTransposition() {
        System.out.println("*****singleTransposition() metodunun testidir*****");
        Kelime kelime2 = new Kelime("aali");
        Kelime kelime1 = new Kelime("alaii");
        kelime1.singleTransposition(kelime2);
    }


}
