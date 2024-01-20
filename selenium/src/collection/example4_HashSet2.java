package collection;

import java.util.ArrayList;
import java.util.HashSet;

public class example4_HashSet2 
{
public static void main(String[] args) 
{
	 ArrayList al = new ArrayList();   //by default capacity 10
	 al.add("ganesh");
	 al.add(100);
	 al.add('A');
	 al.add(65.5f);
	 al.add("ganesh");
	 al.add(null);
	 al.add(null);
	 System.out.println(al);
	 
	 HashSet hs = new HashSet();
	 System.out.println(hs);
	 
}
}
