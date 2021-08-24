package MathClass;

public class JavaMathClass {
	public static void main(String[] args) {
		System.out.println("----Use of Java MATH class----\n\n");
		
		// Link of all Math class
		//https://www.javatpoint.com/java-math

		int x = 20;
		int y = 16;
		
		System.out.printf("Maximum Number in %d and %d is: %d\n",x,y,Math.max(x, y));
		
		System.out.printf("Minimum Number in %d and %d is: %d\n",x,y,Math.min(x, y));
		
		System.out.println("Square root of y is :"+ Math.sqrt(y));
		
		int z = 2;
		System.out.printf("Power of %d and %d is: %f\n",x,z, Math.pow(x, z));
		
			double random = Math.random()*100 ;
			int Round = (int) Math.round(random);
			
			
		System.out.println("Random value :" + Round);
		
		//Math.ceil() mains it converts the float point to the upper round case
		float num = 12.25f;
		
		System.out.println("Ceil it: " + Math.ceil(num)); //result 13
		
		//Math class has huge huge source...This is good
	}
}
