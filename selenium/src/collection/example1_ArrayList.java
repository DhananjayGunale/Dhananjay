package collection;

import java.util.ArrayList;

public class example1_ArrayList 
{
public static void main(String[] args)
{
ArrayList al=new ArrayList(); //by default capacity =10	
al.add("ganesh");
al.add(100);
al.add('A');
al.add(65.5f);
al.add("ganesh");
al.add(null);
al.add("kamlesh");
System.out.println(al);
System.out.println(al.size());
System.out.println(al.isEmpty());  //false
System.out.println(al.contains(100)); //false
System.out.println(al.get(2));  //A
System.out.println(al);

System.out.println("----------");
al.add(2, 200);   //add/insert info in between arraylist---right shift operation
System.out.println(al);
//remove delete info in between arraylist--left shift operation
al.remove(2);
System.out.println(al);
//update or modify
al.set(2, 'B');
System.out.println(al);

}
}
