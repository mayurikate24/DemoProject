package thirty1stbatch;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) 
	{
	 ArrayList<Integer> obj=new ArrayList<Integer> ();
	  
	 obj.add(10);     //index 0
	 obj.add(20);     //index 1
	 obj.add(30);     //index 2
	 obj.add(40);     //index 3
	 obj.add(30);     //index 4
	 
	 System.out.println(obj);
	 
	 System.out.println(obj.size());
	 
	 System.out.println(obj.get(2));
	 
	 System.out.println(obj.get(4));
	 
	 obj.remove(0);
	 System.out.println(obj);
	 
	 obj.add(10);
	 System.out.println(obj);
	 
	 obj.add(0, 66);
	 System.out.println(obj);
	 
	 obj.set(4, 22);
	 System.out.println(obj);
	 
	 System.out.println(obj.contains(40));
	 
	 //obj.clear();
	 System.out.println(obj);
	 
	 //for loop
	 for (int i=0; i<obj.size(); i++) {
		 System.out.println(obj.get(i));
	 }
	 System.out.println();
	 //for each loop
	 for (int m:obj) {
		 System.out.println(m);
	 }
	 

	}

}
