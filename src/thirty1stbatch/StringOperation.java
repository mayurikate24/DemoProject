package thirty1stbatch;
public class StringOperation {
	public static void main(String[] args) {
		
		String name="prashant patil";
		String name1="PRASHANT PATIL";
		System.out.println(name.length());
		
		System.out.println(name.charAt(7));
		
		try {
		System.out.println(name.charAt(14));
		}
	    catch(StringIndexOutOfBoundsException e )
		{
	    	System.out.println("maximum index value is 13 ....do not use 14");
	    	System.out.println(name.charAt(14));
		}
		System.out.println(name.concat("Dhulekar"));
		
		System.out.println(name.equals("name1"));
		
		System.out.println(name.equalsIgnoreCase("name1"));
		
		System.out.println(name.substring(4));
		
		//substring overloading
		
		System.out.println(name.substring(2, 8));
		
		System.out.println (name.startsWith("p"));
		
		System.out.println(name.endsWith("l"));
		
		System.out.println(name.trim());
		
		System.out.println(name.replace("p", "m"));
	}

}
