package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class example2_vector
{
public static void main(String[] args)
{
	 Vector v = new Vector() ; //by default capacity=10
	 v.add("ganesh");
	 v.add(100);
	 v.add('A');
	 v.add(65.5f);
	 v.add("ganesh");
	 v.add(null);
	 v.add(null);
	 
	 System.out.println(v);
	 System.out.println(v.size());
	 System.out.println(v.isEmpty());
	 System.out.println(v.contains(100));
	 System.out.println(v.get(3));
	 System.out.println(v);
	 //add/insert info in between vector-->rieght shift operation
	 v.add(4,500);
	 System.out.println(v);
	 //remove/delete info in between vector vector--->left shift operation
	 v.remove(4);
	 System.out.println(v);
	 //update or modify
	 v.set(3, 75.5);
	 System.out.println(v);
	 System.out.println("----print vector data using iterator cursor----");
	 Iterator itr = v.iterator();
	 while(itr.hasNext())  //true
	 {
		 System.out.println(itr.next());
	 }
	 System.out.println("------print vector data using list itrator cursor---");
	 ListIterator litr = v.listIterator();
	 while(litr.hasNext())
	 {
		 System.out.println(litr.next());
	 }
	 System.out.println("------print vector data using for loop---");	
	 
	 for (int i=0;i<=v.size()-1;i++)
	 {
		System.out.println(v.get(i));
	 }
	 System.out.println("---print vectro data using for each loop---");
	 
	 for(Object s1:v)
	 {
		 System.out.println(s1);
	 }
	 System.out.println("-----print vector dats using enumeration curser--------");
	 
	  Enumeration enu = v.elements();
	  while(enu.hasMoreElements())
	  {
		  System.out.println(enu.nextElement());
	  }
	 }

}
