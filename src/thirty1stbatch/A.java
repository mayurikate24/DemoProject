package thirty1stbatch;

public class A {
	
	public void add() //method
	{
      System.out.println(10+20);
	}
	
	public void login ()
	{
	  System.out.println("Code to login functionality");
	}
	
	public void verifyLoginButton () 
	{
		System.out.println("Code to verify login button");
	}

	public static void main(String[] args) 
	{
		A obj= new A();  // Object
		obj.add();       // calling the method by object ref.........
		obj.login();
		obj.verifyLoginButton();
		obj.add();
		

	}

}
