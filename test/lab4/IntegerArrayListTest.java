package lab4;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntegerArrayListTest {

	@Test
	public void testAddIntInt() {
		// IntegerArrayList is tested
		   IntegerArrayList tester = new IntegerArrayList();
		   tester.add(10);

		   // Tests
		   assertEquals("Should return 10", 10, tester.get(0));
	}

	@Test
	public void testAddInt() {
		// IntegerArrayList is tested
		   IntegerArrayList tester = new IntegerArrayList();
		   tester.add(3);

		   // Tests
		   assertEquals("Should return 3", 3, tester.get(0));
	}

	@Test
	public void testRemove() {
		// IntegerArrayList is tested
		   IntegerArrayList tester = new IntegerArrayList();
		   tester.add(5);

		   // Tests
		   assertEquals("Should remove 5", 5, tester.remove(0));

	}

	@Test
	public void testGet() {
		// IntegerArrayList is tested
		   IntegerArrayList tester = new IntegerArrayList();
		   tester.get(9);

		   // Tests
		   assertEquals("Should return value in index 9", -1, tester.get(9));

	
	}

	@Test
	public void testIndexOf() {
		// IntegerArrayList is tested
		   IntegerArrayList tester = new IntegerArrayList();
		   tester.indexOf(7);

		   // Tests
		   assertEquals("Should return the index of specifide value", -1, tester.indexOf(7));
		
	}

	@Test
	public void testIsEmpty() {
		// IntegerArrayList is tested
		   IntegerArrayList tester = new IntegerArrayList();
		   tester.isEmpty();

		   // Tests
		   assertEquals("Should return value index is full, otherise return -1", -1, tester.indexOf(2));
		
	}

}
