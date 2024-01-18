package thirty1stbatch;

public class MethodOverLoading {
	
	public void add() 
	{
		System.out.println("no arg method");
	}
	
	public void add (int x)
	{
		System.out.println("int arg method");
	}
	
	public void add (String s)
	{
		System.out.println("String arg method");
	}

	public static void main(String[] args)
	{
         MethodOverLoading m=new MethodOverLoading () ;
         m.add();
         m.add(10);
         m.add("hello");
         
	}

}
