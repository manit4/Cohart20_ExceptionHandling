import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

//=================throws keyword start from here===================

public class ExceptionHandling_02 {

	public static void main(String[] args) throws Exception {
		
		
			String filePath = "C:\\lasagna\\";
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the file name from where you wish to read data!!");
			
			String fileName = sc.next();
			
			String completePath = filePath+fileName;

			File f = new File(completePath);

			FileReader reader = new FileReader(f);

			System.out.println((char)reader.read());
				
	}
}


//public class ExceptionHandling_02 {
//
//	public static void main(String[] args) {
//		
//		try {
//			String filePath = "C:\\lasagna\\";
//			
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("Enter the file name from where you wish to read data!!");
//			
//			String fileName = sc.next();
//			
//			String completePath = filePath+fileName;
//
//			File f = new File(completePath);
//
//			FileReader reader = new FileReader(f);
//
//			System.out.println((char)reader.read());	
//		}
//		catch (Exception e) {
//			System.out.println("inside catch...");
//			e.printStackTrace();
//			
//			main(null);
//		}
//		
//				
//	}
//}


//public class ExceptionHandling_02 {
//
//	public static void main(String[] args) {
//		
//		try {
//			String filePath = "C:\\lasagna\\";
//			
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("Enter the file name from where you wish to read data!!");
//			
//			String fileName = sc.next();
//			
//			String completePath = filePath+fileName;
//
//			File f = new File(completePath);
//
//			FileReader reader = new FileReader(f);
//
//			System.out.println((char)reader.read());	
//		}
//		catch (Exception e) {
//			System.out.println("inside catch...");
//			e.printStackTrace();
//		}
//		
//				
//	}
//}



//public class ExceptionHandling_02 {//This is the program in which I gave up to handle the undesired situation might arise on runtime
//									//and would rather go for "throws" keyword. Throws keyword is used when you are not interested 
//									//in handling problem which might arise on runtime....
//
//	public static void main(String[] args) throws Exception {
//		
//			File f = new File("C:\\lasagna\\file1.txt");
//			
//			FileReader reader = new FileReader(f);
//			
//			System.out.println((char)reader.read());		
//	}
//}




//public class ExceptionHandling_02 {//This program is actually handling the code and the code-handling is done with the help of try
//and catch blocks
//
//	public static void main(String[] args) {
//		
//		try {
//			File f = new File("C:\\lasagna\\file1.txt");
//			
//			FileReader reader = new FileReader(f);
//			
//			System.out.println((char)reader.read());	
//		}
//		catch(Exception e) {
//			System.out.println("inside catch...");
//			e.printStackTrace();
//		}
//		
//		
//	}
//}



//public class ExceptionHandling_02 {
//
//	public static void main(String[] args) {
//
//		File f = new File("C:\\lasagna\\file1.txt");
//		
//		FileReader reader = new FileReader(f);//This statement is problematic since if you are coding for input/output operations
//												//the you have to keep the code either in try catch block or declared to be thrown
//												//the help of throws keyword
//		
//		System.out.println(reader.read());//This statement is problematic since if you are coding for input/output operations
//											//the you have to keep the code either in try catch block or declared to be thrown
//											//the help of throws keyword
//		
//	}
//}


//public class ExceptionHandling_02 {
//
//	public static void main(String[] args) {
//
//		String[] names = {"Stephenson", "Falguni", "Ali"};
//		
//		System.out.println(names[0]);
//		System.out.println(names[1]);
//		System.out.println(names[2]);
//		
//		System.out.println(names[4]);
//		
//	}
//}


//==================finally block starts from here=================


//public class ExceptionHandling_02 {
//
//	public static void main(String[] args) {
//
//		try {
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("Kinldy enter the Numerator!!");
//			
//			int numerator = sc.nextInt();
//			
//			System.out.println("Kinldy enter the Denominator!!");
//			
//			int denominator = sc.nextInt();
//			
//			int result = numerator/denominator;
//			
//			System.out.println("the result is "+result);
//		}
//		catch (Exception e) {
//				System.out.println("inside catch...");
//		}
//		finally {
//			System.out.println("Code to close the file");
//
//			System.out.println("code to Return back the connection to connection-pool");
//		}
//	}
//}


//public class ExceptionHandling_02 {//finally block is always executed irrespective of whether Exception is raised or not...
//									//We write only that code in finally block which is mandatory to be executed whether we have Exception
//									//raised or not....Important things such as closing the file or returning back the connection to the 
//									//connection pool....
//
//	public static void main(String[] args) {
//
//		try {
//			System.out.println("Trying to establish connection");
//
//			System.out.println("You open the file first");
//
//			System.out.println("You start reading or writing the data from the file of remote computer");		
//		}
//		catch (Exception e) {
//			System.out.println("inside catch");
//		}
//		finally {
//			System.out.println("Code to close the file");
//
//			System.out.println("code to Return back the connection to connection-pool");
//		}
//	}
//
//}



//
////==================finally block starts from here=================
//
//public class ExceptionHandling_02 {
//	
//	public static void main(String[] args) {
//		
//		try {
//			System.out.println("Trying to establish connection");
//			
//			System.out.println("You open the file first");
//			
//			System.out.println("You start reading or writing the data from the file of remote computer");
//			
//			System.out.println("Code to close the file");
//			
//			System.out.println("code to Return back the connection to connection-pool");	
//		}
//		catch (Exception e) {
//			System.out.println("code to close the file");
//			System.out.println("code to return back the connection to connection-pool");
//		}
//			
//	}
//
//}




//public class ExceptionHandling_02 {
//	
//	public static void main(String[] args) {
//		
//		try {
//			int i = 4/0;	
//		}
//		catch (ArithmeticException e) {
//			System.out.println("inside catch of ArithmeticException...");
//		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("inside catch of ArrayIndexOutOfBoundsException");
//		}
//		catch (StringIndexOutOfBoundsException e) {
//			System.out.println("inside catch of StringIndexOutOfBoundsException");
//		}
//		
//		
//	}
//
//}
