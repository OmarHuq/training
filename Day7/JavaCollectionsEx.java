package training.com.omar.Day7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;


public class JavaCollectionsEx {

	public static void main(String[] args) {
		
			String[] data = {"USA", "Mexico", "India", "Canada", "Russia"};
			int sizeOfArray = data.length;
			
			//*** ArrayList EXAMPLE ***
			
			List<String> arrList = new ArrayList<String>();
			
			//call function to add data to array list
			FunctionClass arrListObj = new FunctionClass(data,sizeOfArray);
			arrListObj.addToList(arrList);
			
			//Prints ArrayList using iterator
			System.out.println("Printing ArrayList: ");
			arrListObj.printList(arrList);
			
			//Uses remove to delete from ArrList
			System.out.println("Delete from List: ");
			arrList.remove(1);
			arrListObj.printList(arrList);
			
			//*******************************************************************************************
			//*** Linked List EXAMPLE ***
			
			List<String> linkList = new LinkedList<String>();
			
			FunctionClass linkListObj = new FunctionClass(data,sizeOfArray);
			linkListObj.addToList(linkList);
			
			//Prints Linked List Using Iterator
			System.out.println("Printing LinkedList: ");
			linkListObj.printList(linkList);
			
			//Uses remove to delete from Linked List
			System.out.println("Delete from List: ");
			linkList.remove(2);
			linkListObj.printList(linkList);
			
			//*******************************************************************************************
			//*** Vector EXAMPLE ***
			
			//Create new vector
			Vector<String> v = new Vector<String>();
			
			//add data to vector
			FunctionClass vectorObj = new FunctionClass(data,sizeOfArray);
			vectorObj.addToList(v);
			
			//Print Vector using Iterator
			System.out.println("Printing Vector: ");
			vectorObj.printList(v);
			
			//Delete from Vector using remove
			System.out.println("Delete from Vector: ");
			v.remove(2);
			vectorObj.printList(v);
			
			//*******************************************************************************************
			//*** Stack EXAMPLE ***
			
			Stack<String> stack = new Stack<String>();
			
			for(int i = 0; i < sizeOfArray; i++)
			{
				stack.push(data[i]);
			}
			System.out.println("Printing Stack: ");
			System.out.println(stack);
			
			System.out.println(stack.peek());
			
			stack.pop();
			System.out.println(stack);
			
			//*******************************************************************************************
			//*** HashSet EXAMPLE ***
			
			Set<String> hset = new HashSet<String>();
			
			FunctionClass hsetObj = new FunctionClass(data, sizeOfArray);
			hsetObj.addToSet(hset);
			
			System.out.println("Printing HashSet: ");
			hsetObj.printSet(hset);
			
			System.out.println("Delete from HashSet: ");
			hset.remove("Canada");
			hsetObj.printSet(hset);
			
			//*******************************************************************************************
			//*** LinkedHashSet EXAMPLE ***
			
			Set<String> lhset = new LinkedHashSet<String>();
			
			FunctionClass lhsetObj = new FunctionClass(data, sizeOfArray);
			lhsetObj.addToSet(lhset);
			
			System.out.println("Printing LinkedHashSet: ");
			lhsetObj.printSet(lhset);
			
			System.out.println("Delete from LinkedHashSet: ");
			lhset.remove("India");
			lhsetObj.printSet(lhset);
			
			//*******************************************************************************************
			//*** TreeSet EXAMPLE ***
			
			Set<String> tset = new TreeSet<String>();
			
			FunctionClass tsetObj = new FunctionClass(data, sizeOfArray);
			tsetObj.addToSet(tset);
			
			System.out.println("Printing TreeSet: ");
			tsetObj.printSet(tset);
			
			System.out.println("Delete from TreeSet: ");
			tset.remove("Russia");
			tsetObj.printSet(tset);
			
			
			Map<Integer, String> hm = new HashMap<Integer, String>();
			
			hm.put(1, "USA");
			hm.put(2, "Mexico");
			hm.put(3, "Canada");
			hm.put(4, "India");
			hm.put(5, "Russia");

			System.out.println(hm);
			
			System.out.println("Remove Element from Hash Table Using Key: ");
			hm.remove(3);
			System.out.println(hm);

			//Traverse Hash Map
			
			for (Entry<Integer, String> e : hm.entrySet())
	            System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
			
			}

}

class FunctionClass{
	
	String[] data;
	int size;
	
	FunctionClass(String[] d, int s)
	{
		this.data = d;
		this.size = s;
	}
	
	public void addToList(List<String> countries)
	{
		
		for(int i = 0; i < size; i++) {
			
			countries.add(data[i]);
		}
	}
	public void addToSet(Set<String> countries)
	{
		
		for(int i = 0; i < size; i++) {
			
			countries.add(data[i]);
		}
	}
	public void printList(List<String> countries) {
		
		Iterator<String> itr = countries.iterator();
		
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
	}
	public void printSet(Set<String> countries) {
		
		Iterator<String> itr = countries.iterator();
		
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
	}
	
	
}


