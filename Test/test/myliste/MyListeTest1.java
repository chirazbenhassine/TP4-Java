package test.myliste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import fr.dauphine.td3.MyList;

class MyListeTest1 {

	@Test
	public void testAddListe() {
		MyList liste = new MyList();
		liste.add("go");
		liste.add("I");
		assertEquals("I,go", liste.toString());
	}
	@Test
	public void testAddLast() {
		MyList liste = new MyList();
		liste.add("go");
		liste.addLast("to");
		liste.add("I");
		Assertions.assertEquals("I, go, to", liste.toString());

	}
	@Test
	public void testAdd() {
		MyList liste = new MyList();
		liste.add("go");
		liste.add("to",1);
		liste.add("I");
		liste.add("school",3);
		Assertions.assertEquals("I, go, to", liste.toString());

	}
	@Test
	public void testSize() {
		MyList liste = new MyList();
		liste.add("go");
		liste.add("to",1);
		liste.add("I");
		liste.add("school",3);
		Assertions.assertEquals(4, liste.size());
	}
	@Test
	public void getByIndex() {
		MyList liste = new MyList();
		liste.add("go");
		liste.addLast("to");
		liste.add("I");
		assertEquals("go",liste.get(1));
	}
	@Test
	public void testSumLetter() {
		MyList liste = new MyList();
		liste.add("go");
		liste.addLast("to");
		liste.add("I");
		assertEquals(5, liste.sumLettres());
	}
	
	


}
