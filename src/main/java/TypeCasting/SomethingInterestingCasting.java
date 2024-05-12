package TypeCasting;

public class SomethingInterestingCasting {

	
	public static void main(String[] args) {
		
		char letter1 = 'a';
		System.out.println("The value of legtter1 is " + letter1);
		
		int num1 = 'a';
		System.out.println("The value of num1 is " + num1);  // 97 // ASCII value of small a. implicitly type cast 
		
		long num2 =397283423794L;
		System.out.println("The value of num2 is " + num2); // 397283423794
		
		char letter2 = (char) num2;
		System.out.println("The value of letter2 is " + letter2); //   // Explicitly type cast
		
		
		/*********************************************************/
		/* use of Bytes */
		
		byte num3 = 10;
		System.out.println("The value of num3 is " + num3); //10
		
		byte num4 = 12;
		System.out.println("The value of num4 is " + num4); //12
		
		int num5 = num3 + num4; // the smallest unit to store mathematical expression using operators is int, 
		//here we can not use sum value to byte compiler will give error. 
		System.out.println("The value of num5 is " + num5); // 22
		
		
		int num6 = num5 / 3; 
		System.out.println("The value of num6 is " + num6); // 7 // data loss 
		
		float num7 =  num5 / 3; 
		System.out.println("The value of num7 is " + num7); // 7.0 // while using float we implicitly invoke int value to float 
		
		// for proper float output either we should convert numerator to float i.e float(num5) or denominator to float i.e 3F
		
		float num8 =num5 / 3.0F; 
		System.out.println("The value of num8 is " + num8); // 7.3333335
		
		float num9 = (float) num5 /3; 
		System.out.println("The value of num9 is " + num9); // 7.3333335
		
		
	}
}
