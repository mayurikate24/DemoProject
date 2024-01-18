package thirty1stbatch;

public class StaticVar 
{
	
	static int y=50;     //static var

	public static void main(String[] args) 
	{
       System.out.println(y);           //diectly
       StaticVar obj= new StaticVar ();  
       System.out.println(obj.y);         //by object ref
       System.out.println(StaticVar.y);     //class ref

	}

}
