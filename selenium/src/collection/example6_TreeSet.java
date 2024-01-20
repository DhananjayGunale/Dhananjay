package collection;

import java.util.TreeSet;

public class example6_TreeSet 
{
public static void main(String[] args)
{
	TreeSet ts=new TreeSet();
	ts.add(300);
	ts.add(200);
ts.add(100);
ts.add(500);
ts.add(400);
ts.add(700);
ts.add(600);
ts.add(700);
System.out.println(ts);
System.out.println(ts.size());
System.out.println(ts.isEmpty());
System.out.println(ts.contains(500));
ts.remove(400);
System.out.println(ts);

}
}
