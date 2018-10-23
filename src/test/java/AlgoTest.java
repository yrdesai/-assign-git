package test.java;
import static org.junit.Assert.*;

import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;
import main.java.SortDemoData;

public class AlgoTest {
	SortDemoData data = new SortDemoData();
	Item i1;
	Item i2;
	Item i3;
	
	/* testforunsorted() method is for unsorted list
	 * below test method covers Edge coverage and Condition coverage.
	 */

	@Test
	public void testforunsorted() 
	{
		i1 = new Item(12);
		i2 = new Item(4);
		i3 = new Item(10);
		Item[] itemList = new Item[3];
		itemList[0] = i1;
		itemList[1] = i2;
		itemList[2] = i3;
		data.initializeArray("4 10 12");
		
		SortAlgos.bubbleSort(itemList);
		
		assertTrue(data.myArray[0].key == itemList[0].key);
		assertTrue(data.myArray[1].key == itemList[1].key);
		assertTrue(data.myArray[2].key == itemList[2].key);
		
	}
	
	/* testfornull() method is for empty list
	 * below test method covers Node coverage and Edge coverage. 
	 */
	
	@Test(expected = NullPointerException.class)
	public void testfornull()
	{
		Item[] itemList = null;
		SortAlgos.bubbleSort(itemList);
		
	}
	
	/* testforsorted() method is for sorted list
	 * below test method covers Edge coverage and Condition coverage.
	 */
	
	@Test
	public void testforsorted() 
	{
		i1 = new Item(4);
		i2 = new Item(10);
		i3 = new Item(12);
		Item[] itemList = new Item[3];
		itemList[0] = i1;
		itemList[1] = i2;
		itemList[2] = i3;
		data.initializeArray("4 10 12");
		
		SortAlgos.bubbleSort(itemList);
		
		assertTrue(data.myArray[0].key == itemList[0].key);
		assertTrue(data.myArray[1].key == itemList[1].key);
		assertTrue(data.myArray[2].key == itemList[2].key);
		
	}

}
