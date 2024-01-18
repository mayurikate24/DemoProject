package thirty1stbatch;

public class LocalVar {
	
	public void login ()
	{
		int i=10 ;   //Local variable
		System.out.println(i);
	}

	public static void main(String[] args) 
	{
		LocalVar obj= new LocalVar ();    //object
		obj.login();                      //object reference
		int x=20;                         //LocalVar
		System.out.println(x);

	}

}
