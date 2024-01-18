package thirty1stbatch;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) 
	{
		String s[]= {"prashant","mayuri","harshal","satvik"};
		
		 System.out.println(s.length);
		 
		  System.out.println(s[0]);
		  
		  System.out.println(s[3]);
		  
		 // System.out.println(s[4]);//
		  
		  System.out.println(Arrays.toString(s));
		  
		  s[0]= "chakuli";
		  //first way
		  System.out.println(Arrays.toString(s));
		  
		  //second way
		  for (int i=3; i>=0; i--) {
			  System.out.println(s[i]);
			  
		  //third way
		  for (String p:s) {
			  System.out.println(p);
		  }
		  }
		

	}

}
