package thirty1stbatch;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
      HashSet<Integer> hs= new HashSet <Integer>();
      
      System.out.println(hs);
       
      hs.add(10);
      
      hs.add(20);
      
      hs.add(30);
      
      hs.add(40);
      
      hs.add(40);
      
      System.out.println(hs);
      
 System.out.println( hs.size());
 
 System.out.println(hs.remove(10));
 
 System.out.println(hs);
 
 System.out.println(hs.contains(30));
   
 System.out.println(hs);
 
 //for each loop.....
 for (int k:hs)
 {
	 System.out.println(k);
 }
      
	}

}
