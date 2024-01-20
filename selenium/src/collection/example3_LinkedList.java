package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class example3_LinkedList 
{
public static void main(String[] args) 
{
	LinkedList ll = new LinkedList();
	ll.add("rahul");
	ll.add(200);
	ll.add('B');
	ll.add(85.5f);
	ll.add("rahul");
	ll.add(null);
	ll.add(null);
	
	System.out.println(ll);
	System.out.println(ll.size());
	System.out.println(ll.isEmpty()); //false
	System.out.println(ll.contains(100));//false
	System.out.println(ll.get(4)); //rahul
	System.out.println(ll);
	//add/insert info in between linkedlist
	ll.add(4,"mahesh");
	System.out.println(ll);
//remove/delete info in beetween linkedlist
  ll.remove(4);
  System.out.println(ll);
  //modify /update info in between linkedlist data
  ll.set(2, 'c');
  System.out.println(ll);
  
  System.out.println("----print linkedlist data using iterator cursor ");
  Iterator itr = ll.iterator();
 while(itr.hasNext())
 {
	 System.out.println(itr.next());
 }
 System.out.println("---print linked lis data using listiterator cursor---");
  ListIterator litr = ll.listIterator();
  while(litr.hasNext())
  {
	  System.out.println(litr.next());
	  
}
  System.out.println("---print linklist  data using for loop ");
  
  for(int i=0;i<=ll.size()-1;i++)
  {
	  System.out.println(ll.get(i));
  }
  System.out.println("----print linklist data using for each loop----");
  for(Object s1:ll)
  {
	  System.out.println(s1);
  }
  
  
 
}
}
