/**
 * 
 */
package com.cybersolveit.core.java;

/**
 * Field variables are the variables which are declared outside any method and whereas local variables 
 * are the ones which are declared within a method and they exist only when the method is called.
 * 
 * Keywords: break, float, int, instanceOf, import, return, static, this, switch, break, while, for, do, class, char, void, long, short, double
 * 
 */

/**
 * @author supra
 *
 */
public class VariablesAndDataTypesDemo {

	
	
	
	
	static int age;
	static double balance;
	static boolean isWinter;
	static long distanceBetweenTwoCountries;
	static char aChar;
	static double height;
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//calling the method which prints its local 
		printLocalVariables();
	
	
		System.out.println(age + "\n" + isWinter + "\n" + distanceBetweenTwoCountries +"\n" + aChar + "\n" + height);
		
		int x = 65;
		
		if (x < 5) {
			System.out.println("HAHA");
			
		}
		
		else if (x > 5 && x < 20) {
			System.out.println("BAHA");
			
		}
		
		else if (x > 20  && x < 50) {
			System.out.println("SUSHI");
			
		}
		
		else if (x > 50 && x < 70) {
			System.out.println("This is the life");
			
		}
		
		
		else {
			System.out.println("NAAA");
		}
	
	
	}
	
	
	public static void printLocalVariables()
	{
		char dollar = '$';     //assignment operator, actual equal to is ==
		System.out.println(dollar);
		
		String greeting = "Welcome to Core Java";
		System.out.println(greeting);
		
		int  numberOfStudents= 0;
		System.out.println(numberOfStudents);
		
		long totalScore = 0; 
		System.out.println(totalScore);
		
		float weight = 0;
		System.out.println(weight);
		
		double totalWeight = 0;
		System.out.println(totalWeight);
		
		byte byteNum = 20;
		System.out.println(byteNum);
		
		
	}

}
