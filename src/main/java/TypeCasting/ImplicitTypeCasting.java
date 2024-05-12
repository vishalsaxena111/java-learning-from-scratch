package TypeCasting;

public class ImplicitTypeCasting {
	
	/**This class represent the implicit type casting examples 
	 * 
	 * Implicit type casting or widening means when we store  small in units to the big container where our no data loss.
	 * 
	 * understand the below data types hierarchy.
	 * 
	 *  bytes-> short-> int -> long -> float -> double
	 *  				 ^
	 *  				 |
	 *  				char
	 * 
	 * */
	
	public static void main(String[] args) {
		
		int num1 = 10;
		System.out.println("the value of num1 is "+ num1); // 10
		
		int num2 = num1;
		System.out.println("the value of num2 is "+ num2); // 10
		
		float num3 = num2;
		System.out.println("the value of num3 is "+ num3); // 10.0
		
		float num4 = 40.67F;        // whenever we try to put decimal value to float we should use F
		System.out.println("the value of num4 is "+ num4); // 46.67 
		
		float num5 = 12;           // for int value its implicitly invoke int value to float like example num3
		System.out.println("the value of num5 is "+ num5); // 12.0
		
		long num6 = 9L;           // we can write here either 9 or 9L both are correct
		System.out.println("the value of num6 is "+ num6); // 9
	}
	

}
