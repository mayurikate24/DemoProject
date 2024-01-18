package thirty1stbatch;

public class SwitchCaseFallThrough {

	public static void main(String[] args) {
		int n=20;
		switch(n) {
		
		case 10:
			System.out.println("I am 10");
		
		case 20:
			System.out.println("I am 20");
			 
		case 30:
			System.out.println("I am 30");
			
		default:
			System.out.println("none of the above");
		
		}
		System.out.println("this belongs to main method");

	}

}
