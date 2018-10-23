package test.java;


import static org.junit.Assert.*;


import java.util.List;
import java.util.Objects;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;
import main.java.SortDemoData;

public class SortDemoTest{
	SortDemoData data = new SortDemoData();


	/**
	* testNewAccountsType checks for valid input types in the 1st parameter
	*/
	@Test
	public void testNumber() {
	   data.initializeArray("20");
	   assertTrue(data.myArray.length == 20);
	   
	   data.initializeArray("30");
	   assertTrue(data.myArray.length == 30);
	   
	   data.initializeArray("0");
	   assertTrue(data.myArray.length == 0);
	}


	/**
	 * testNewAccountsType checks for valid input types in the 1st parameter
	 */
	@Test (expected=java.lang.NegativeArraySizeException.class)
	public void negativeArraySize() {
	    data.initializeArray("-3");  
	}
	
	/**
	 * testNewAccountsType checks for valid input types in the 1st parameter
	 */
	@Test (expected=java.lang.NumberFormatException.class)
	public void NonIntegerValue() {
	    data.initializeArray("5.5 7 9");  
	}
	
	/**
	 * testNewAccountsType checks for valid input types in the 1st parameter
	 */
	@Test (expected=java.util.NoSuchElementException.class)
	public void NoSuchElem() {
	    data.initializeArray("");  
	}
	
	/**
	 * testNewAccountsType checks for valid input types in the 1st parameter
	 */
	@Test (expected=java.lang.NumberFormatException.class)
	public void NoNumber() {
	    data.initializeArray("5 8 y 4");  
	}
	
	/**
	 * testNewAccountsType checks for valid input types in the 1st parameter
	 */
	@Test
	public void SameNumber() {
	    data.initializeArray("5 64 4");  
	    
	    SortDemoData data2 = new SortDemoData();
	    data2.initializeArray("5 64 4");
		assertTrue(data.myArray.length == 3);
		assertTrue(data.myArray[0].key == data2.myArray[0].key );
		assertTrue(data.myArray[1].key == data2.myArray[1].key );
		assertTrue(data.myArray[2].key == data2.myArray[2].key );
	}

	
	
	// TODO: Include your test cases below
	// For selection sort.
	@Test
	public void testforunsortedselection() 
	{
		Item[] itemList = new Item[3];
		itemList[0] = new Item(12);
		itemList[1] = new Item(10);
		itemList[2] = new Item(4);
		data.initializeArray("4 10 12");
		
		SortAlgos.selectionSort(itemList);
		
		assertTrue(data.myArray[0].key == itemList[0].key);
		assertTrue(data.myArray[1].key == itemList[1].key);
		assertTrue(data.myArray[2].key == itemList[2].key);
		
	}
	
	/* testfornull() method is for empty list
	 * below test method covers Node coverage and Edge coverage. 
	 */
	
	@Test(expected = NullPointerException.class)
	public void testfornullselection()
	{
		Item[] itemList = null;
		SortAlgos.selectionSort(itemList);
		
	}
	
	/* testforsorted() method is for sorted list
	 * below test method covers Edge coverage and Condition coverage.
	 */
	
	@Test
	public void testforsortedselection() 
	{
		Item[] itemList = new Item[3];
		itemList[0] = new Item(4);
		itemList[1] = new Item(10);
		itemList[2] = new Item(12);
		data.initializeArray("4 10 12");
		
		SortAlgos.selectionSort(itemList);
		
		assertTrue(data.myArray[0].key == itemList[0].key);
		assertTrue(data.myArray[1].key == itemList[1].key);
		assertTrue(data.myArray[2].key == itemList[2].key);
		
	}
	
	// For insertion sort.
	@Test
	public void testforunsortedinsertion() 
	{
		Item[] itemList = new Item[3];
		itemList[0] = new Item(12);
		itemList[1] = new Item(10);
		itemList[2] = new Item(4);
		data.initializeArray("4 10 12");
		
		SortAlgos.insertionSort(itemList);
		
		assertTrue(data.myArray[0].key == itemList[0].key);
		assertTrue(data.myArray[1].key == itemList[1].key);
		assertTrue(data.myArray[2].key == itemList[2].key);
		
	}
	
	/* testfornull() method is for empty list
	 * below test method covers Node coverage and Edge coverage. 
	 */
	
	@Test(expected = NullPointerException.class)
	public void testfornullinsertion()
	{
		Item[] itemList = null;
		SortAlgos.insertionSort(itemList);
		
	}
	
	/* testforsorted() method is for sorted list
	 * below test method covers Edge coverage and Condition coverage.
	 */
	
	@Test
	public void testforsortedinsertion() 
	{
		Item[] itemList = new Item[3];
		itemList[0] = new Item(4);
		itemList[1] = new Item(10);
		itemList[2] = new Item(12);
		data.initializeArray("4 10 12");
		
		SortAlgos.insertionSort(itemList);
		
		assertTrue(data.myArray[0].key == itemList[0].key);
		assertTrue(data.myArray[1].key == itemList[1].key);
		assertTrue(data.myArray[2].key == itemList[2].key);
		
	}
	
	// For merge sort.
	@Test
	public void testforunsortedmerge() 
	{
		Item[] itemList = new Item[3];
		itemList[0] = new Item(12);
		itemList[1] = new Item(10);
		itemList[2] = new Item(4);
		data.initializeArray("4 10 12");
		
		SortAlgos.mergeSort(itemList);
		
		assertTrue(data.myArray[0].key == itemList[0].key);
		assertTrue(data.myArray[1].key == itemList[1].key);
		assertTrue(data.myArray[2].key == itemList[2].key);
		
	}
	
	/* testfornull() method is for empty list
	 * below test method covers Node coverage and Edge coverage. 
	 */
	
	@Test(expected = NullPointerException.class)
	public void testfornullmerge()
	{
		Item[] itemList = null;
		SortAlgos.mergeSort(itemList);
		
	}
	
	/* testforsorted() method is for sorted list
	 * below test method covers Edge coverage and Condition coverage.
	 */
	
	@Test
	public void testforsortedmerge() 
	{
		Item[] itemList = new Item[3];
		itemList[0] = new Item(4);
		itemList[1] = new Item(10);
		itemList[2] = new Item(12);
		data.initializeArray("4 10 12");
		
		SortAlgos.mergeSort(itemList);
		
		assertTrue(data.myArray[0].key == itemList[0].key);
		assertTrue(data.myArray[1].key == itemList[1].key);
		assertTrue(data.myArray[2].key == itemList[2].key);
		
	}	
	
	// For quick sort.
	@Test
	public void testforunsortedquick() 
	{
		Item[] itemList = new Item[3];
		itemList[0] = new Item(12);
		itemList[1] = new Item(10);
		itemList[2] = new Item(4);
		data.initializeArray("4 10 12");
		
		SortAlgos.quickSort(itemList);
		
		assertTrue(data.myArray[0].key == itemList[0].key);
		assertTrue(data.myArray[1].key == itemList[1].key);
		assertTrue(data.myArray[2].key == itemList[2].key);
		
	}
	
	/* testfornull() method is for empty list
	 * below test method covers Node coverage and Edge coverage. 
	 */
	
	@Test(expected = NullPointerException.class)
	public void testfornullquick()
	{
		Item[] itemList = null;
		SortAlgos.quickSort(itemList);
		
	}
	
	/* testforsorted() method is for sorted list
	 * below test method covers Edge coverage and Condition coverage.
	 */
	
	@Test
	public void testforsortedquick() 
	{
		Item[] itemList = new Item[3];
		itemList[0] = new Item(4);
		itemList[1] = new Item(10);
		itemList[2] = new Item(12);
		data.initializeArray("4 10 12");
		
		SortAlgos.quickSort(itemList);
		
		assertTrue(data.myArray[0].key == itemList[0].key);
		assertTrue(data.myArray[1].key == itemList[1].key);
		assertTrue(data.myArray[2].key == itemList[2].key);
		
	}
	
	// For heap sort.
	@Test
	public void testforunsortedheap() 
	{
		Item[] itemList = new Item[3];
		itemList[0] = new Item(12);
		itemList[1] = new Item(10);
		itemList[2] = new Item(4);
		data.initializeArray("4 10 12");
		
		SortAlgos.heapSort(itemList);
		
		assertTrue(data.myArray[0].key == itemList[0].key);
		assertTrue(data.myArray[1].key == itemList[1].key);
		assertTrue(data.myArray[2].key == itemList[2].key);
		
	}
	
	/* testfornull() method is for empty list
	 * below test method covers Node coverage and Edge coverage. 
	 */
	
	@Test(expected = NullPointerException.class)
	public void testfornullheap()
	{
		Item[] itemList = null;
		SortAlgos.heapSort(itemList);
		
	}
	
	/* testforsorted() method is for sorted list
	 * below test method covers Edge coverage and Condition coverage.
	 */
	
	@Test
	public void testforsortedheap() 
	{
		Item[] itemList = new Item[3];
		itemList[0] = new Item(4);
		itemList[1] = new Item(10);
		itemList[2] = new Item(12);
		data.initializeArray("4 10 12");
		
		SortAlgos.heapSort(itemList);
		
		assertTrue(data.myArray[0].key == itemList[0].key);
		assertTrue(data.myArray[1].key == itemList[1].key);
		assertTrue(data.myArray[2].key == itemList[2].key);
		
	}
	
			
		
	
	
}