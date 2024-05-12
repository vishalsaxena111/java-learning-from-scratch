package TypeCasting;

public class ExplicitTypeCasting {
	
	public static void main(String[] args) {
		
		/**This class represent the explicit type casting examples 
		 * 
		 * Explicit type casting or narrowing means when we put large in units to the small container where our some data loss.
		 * 
		 * understand the below data types hierarchy.
		 * 
		 *  bytes <- short <- int <- long <- float <- double
		 *  				   |
		 *  				  char
		 * 
		 * */
		
		long num1 = 989787299L;
		System.out.println("the value of num1 is "+ num1); // 989787299L
		
		byte num2 = (byte) num1;
		System.out.println("the value of num2 is "+ num2); // -93 // a random number which we don't know here explicitly doing 
		//casting which cause some data loss.
		
		float num3 = 7638.78F;
		System.out.println("the value of num3 is "+ num3); // 7638.78
		
		int num4 = (int) num3;
		System.out.println("the value of num4 is "+ num4); // 7638  // some data loss after decimal 
		
		
		
	}

}
