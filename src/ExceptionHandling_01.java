
//In Exception handling, we have five keywords to learn named as "try", "catch", "finally", "throws", "throw"...

//import java.util.Scanner;
//
//class Main {
//	
//	public static void main(String[] args) {
//
//		String s1 = "456";
//		
//		String s2 = "123";
//		
//		int num1 = Integer.parseInt(s1);
//		
//		int num2 = Integer.parseInt(s2);
//		
//		
//		
//		System.out.println(num1 + num2);
//	}
//	
//
//}



//import java.util.Scanner;
//
//public class Main {//try block can be followed by multiple catch blocks..
//	
//	public static void main(String[] args) {//Example of multiple catch blocks
//		
//		try {
//			int[] marks = {56, 46, 78, 87};
//			
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("Enter the Numerator!!");
//			
//			int numerator = sc.nextInt();
//			
//			System.out.println("Enter the Denominator!!");
//			
//			int denominator = sc.nextInt();
//			
//			int result = numerator/denominator;
//			
//			System.out.println("The Result is "+result);
//			
//			System.out.println("Enter the index which you wish to access from the array!!");
//			
//			int index = sc.nextInt();
//			
//			System.out.println(marks[index]);	
//		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("inside ArrayIndexOutOfBoundsException catch block...");
//			
//			e.printStackTrace();
//			main(null);
//		}
//		catch (ArithmeticException e) {
//			System.out.println("inside ArithmeticException catch block...");
//			e.printStackTrace();
//			main(null);
//		}
//	}
//}

//import java.util.Scanner;
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		try {
//			int[] marks = {56, 46, 78, 87};
//			
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("Enter the Numerator!!");
//			
//			int numerator = sc.nextInt();
//			
//			System.out.println("Enter the Denominator!!");
//			
//			int denominator = sc.nextInt();
//			
//			int result = numerator/denominator;
//			
//			System.out.println("The Result is "+result);
//			
//			System.out.println("Enter the index which you wish to access from the array!!");
//			
//			int index = sc.nextInt();
//			
//			System.out.println(marks[index]);	
//		}
//		catch (Exception e) {
//			System.out.println("inside catch block...");
//			
//			e.printStackTrace();
//			main(null);
//		}
//	}
//}



//import java.util.Scanner;
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		int[] marks = {56, 46, 78, 87};
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter the Numerator!!");
//		
//		int numerator = sc.nextInt();
//		
//		System.out.println("Enter the Denominator!!");
//		
//		int denominator = sc.nextInt();
//		
//		int result = numerator/denominator;
//		
//		System.out.println("The Result is "+result);
//		
//		System.out.println("Enter the index which you wish to access from the array!!");
//		
//		int index = sc.nextInt();
//		
//		System.out.println(marks[index]);
//	}
//}


//import java.util.Scanner;
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		try {
//			int[] salaries = {3453, 4645, 6786};
//			
//			System.out.println(salaries[1]);
//			
//			System.out.println(salaries[4]);
//		}
//		catch (ArrayIndexOutOfBoundsException e) {//The Object of ArrayIndexOutOfBoundsException will be held by the reference variable of Reference Variable of 
//										//ArrayIndexOutOfBoundsException class itself...
//			System.out.println("inside catch block...");
//			e.printStackTrace();
//		}
//		
//	}
//}



//import java.util.Scanner;
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		try {
//			int i = 4/0;	
//		}
//		catch (ArithmeticException e) {//The Object of ArithmeticException will be held by the reference variable of Reference Variable of 
//										//ArithmeticException class itself...
//			System.out.println("inside catch block...");
//			e.printStackTrace();
//		}
//		
//	}
//}



//import java.util.Scanner;
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		Main m = new Main();
//		
//		m.arrayAccess();
//			
//	}
//	
//	void arrayAccess() {
//		
//		try {
//			
//			int[] salaries = {4545, 66767, 1223};
//			
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("Kindly give the index which you wish to access!!");
//			
//			int index = sc.nextInt();
//			
//			System.out.println(salaries[index]);
//			
//		}
//		catch (Exception e) {
//			System.out.println("inside catch block...");
//			e.printStackTrace();
//			
//			main(null);
//		}
//	}
//}










//import java.util.Scanner;
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		try {
//		
//			int[] salaries = {4545, 66767, 1223};
//			
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("Kindly give the index which you wish to access!!");
//			
//			int index = sc.nextInt();
//			
//			System.out.println(salaries[index]);
//			
//		}
//		catch (Exception e) {
//			System.out.println("inside catch block...");
//			e.printStackTrace();
//			
//			main(null);
//		}	
//	}
//}











//import java.util.Scanner;
//
//public class Main {//This is another way to write code...
//	
//	public static void main(String[] args) {
//		
//		
//		
//		int[] salaries = {4545, 66767, 1223};
//	
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Kindly give the index which you wish to access!!");
//		
//		int index = sc.nextInt();
//		
//		System.out.println(salaries[index]);
//	}
//}



//public class Main {//This is another way to write code...
//	
//	public static void main(String[] args) {
//		
//		
//		int[] salaries = {4545, 66767, 1223};
//	
//		System.out.println(salaries[0]);
//		
//		System.out.println(salaries[1]);
//		
//		System.out.println(salaries[2]);
//		
//		System.out.println(salaries[3]);//This statement is certainly problematic since the array size is 3, however you are trying to
//										//access index outside its range or size since the last index you can access is 2 of array size 3
//										//This is one more situation which runtime or Java can not handle and will end-up throwing
//										//Exception on runtime...
//	
//	}
//}



//import java.util.Scanner;
// 
//public class Main {//This is another way to write code...
//	
//	public static void main(String[] args) {
//		
//		Main m = new Main();
//		
//		m.divideInputs();
//	}
//	
//	void divideInputs() {
//		
//		try {
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("Kinldy Enter any Number from Numerator!!");
//			
//			int numerator = sc.nextInt();
//			
//			System.out.println("Kindly Enter any Number for denominator!!");
//			
//			int denominator = sc.nextInt();
//			
//			int result = numerator/denominator;
//			
//			System.out.println("The Result is "+result);	
//		}
//		catch (Exception e) {
//			System.out.println("inside catch block...");
//			e.printStackTrace();
//			divideInputs();
//		}	
//	}
//}



//import java.util.Scanner;
//
//public class Main {//This program is to handle the situation of previous code when I was dividing Numerator/Denominator....And Handling
//					//is done only with try and catch blocks
//	
//	public static void main(String[] args) {
//		
//		try {
//			
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("Enter any number for Numerator!!");
//			
//			int numerator = sc.nextInt();
//			
//			System.out.println("Enter any number for Denominator!!");
//			
//			int denominator = sc.nextInt();
//			
//			int result = numerator/denominator;
//			
//			System.out.println("The Result is "+result);	
//		}	
//		catch (Exception e) {
//			
//			System.out.println("inside catch...");
//			
//			e.printStackTrace();
//			
//			main(null);
//		}
//	}
//}




//import java.util.Scanner;
//
//public class Main {//This program is to handle the situation of previous code when I was dividing Numerator/Denominator....And Handling
//					//is done only with try and catch blocks
//	
//	public static void main(String[] args) {
//		
//		try {
//			
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("Enter any number for Numerator!!");
//			
//			int numerator = sc.nextInt();
//			
//			System.out.println("Enter any number for Denominator!!");
//			
//			int denominator = sc.nextInt();
//			
//			int result = numerator/denominator;
//			
//			System.out.println("The Result is "+result);	
//		}	
//		catch (Exception e) {//catch block will run only and only if "try" block generated or raised an exception. For instance,
//							//if denominator is given 0 by the user...
//							//"Exception e" in parenthesis of catch block is there to hold the respective or dedicated Exception 
//							//class object thrown from the try block if any Exception is raised and in this situation, ArithmeticException
//							//Class object will be generated since the dedicated Exception class Object is ArithmeticException when you
//							//try to divide any number by zero...
//			
//			System.out.println("inside catch...");
//			
//			e.printStackTrace();//printStackTrace() is used to print the complete trace of the exception such as the potential reason of 
//								//of problem or exception raised, line number on which exception raised and the method name also...
//		}
//	}
//}


//import java.util.Scanner;
//
//public class Main {//This program is to handle the situation of previous code when I was dividing Numerator/Denominator....And Handling
//					//is done only with try and catch blocks
//	
//	public static void main(String[] args) {
//		
//		try {//This is "try" block which is used to enclose the statement/s which might be problematic to you on runtime. However, this
//			//code is filled with error since try can not come alone. In short, try must be followed by either "catch" block or "finally"
//			//block or both try as well as finally together....
//			
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("Enter any number for Numerator!!");
//			
//			int numerator = sc.nextInt();
//			
//			System.out.println("Enter any number for Denominator!!");
//			
//			int denominator = sc.nextInt();
//			
//			int result = numerator/denominator;
//			
//			System.out.println("The Result is "+result);	
//		}		
//	}
//}





//import java.util.Scanner;
//
//public class Main {//This program I wrote as a novice or innocent person who is not at all aware of the undesired situation might 
						//generate on runtime
//	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter any number for Numerator!!");
//		
//		int numerator = sc.nextInt();
//		
//		System.out.println("Enter any number for Denominator!!");
//		
//		int denominator = sc.nextInt();
//		
//		int result = numerator/denominator;
//		
//		System.out.println("The Result is "+result);
//		
//	}
//
//}







//public class Main {//Exception is the undesired situation generated on run-time which alters the normal program flow. In short, Exceptions
						//are only generated on runtime...
//	
//	public static void main(String[] args) {
//		
//		int i = 4;
//		
//		System.out.println("The value of i before updation "+i);
//		
//		i = 4/0;//R.H.S of this statement leads to the Exception or undesired situation because any number divided by 0 is infinity which 
//				//Computer can not handle..So While executing the program if run-time environment encounters any situation which is 
//				//problematic to machine or computer will make the computer program flow stopped unexpectedly and any statement written
//				//after the problematic statement will not be executed and the program will will stop suddenly...
//		
//		System.out.println("the value of i after updation is: "+i);
//	}
//
//}
