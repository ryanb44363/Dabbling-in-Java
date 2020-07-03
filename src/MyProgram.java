import java.util.Scanner;  // This is for User Input.  Very similar to Python.

public class MyProgram {
	//----------------------------------------------------------------------
	// KEY TERMS:
	/* Class -> Method -> Identifier -> Statement (method or property)  */
	// Methods do something.
	// Properties store things.
	// Class - Contains everything, has members.
	// Access Modifier (Public / Private) - Who can use...
	// Static - No instance of class is required.
	// Object - Instance of a class (e.g. Running a Method).
	// Statement - Telling computer to do something.
	// *Main is always executed within the file (first). Point to start execution.
	// Arguments - What you pass through a method.
	// Parameter - Is the variable that stores the data from the method, such as an argument.
	// Define the method with a parameter.
	// Call the method with argument(s). ("")
	// Variable - Stores some value.
	// Expression - Evaluates to a value.
	// Operator - Work on operands to produce a value 
	// Operands - e.g. "+" operator uses to work with multiple values.
	// Literals - The value "" without doing 'String literal = new String("");', but rather 'String literal = "";'
	// Data Type = Type of data - How computer interprets data.  "5" != 5
	// Statically Typed Data - Variables are given data types up front.
	// Dynamically Typed Data - Variables that do not have types up front.
	// Primitive Typed Data - 
	// Object - Instance of a class (class of the data type).
	// Declaring variables in the right places saves time and prevents confusion.
	//----------------------------------------------------------------------

//  Static basically allows you to run the {} without calling it.
	
	public static void main(String[] args) { // Method.
		
	//  Class, member, method.
		System.out.println("Hello World!");  

		//a. ii.
		// (This is where you have to create your Object that will include the method, ExampleMethod)
		var x = new MyProgram();
		x.WorkingExampleMethod();
		MyProgram.UserInput(args);
     // MyProgram.example(args); // You have to include the "MyProgram" instead of "x" because that is the Static way of doing things.  
		// fin					 // "(args)" must be included since the method: example, includes args.
		MyProgram.datatypes();
		MyProgram.ScannerDetails();
		MyProgram.Morenumbers();
	}
	
	public String x = new String(); // This is a property.
	
	// Creating an Object.
	// a. i.
	public void WorkingExampleMethod() {  // This is a method.
		System.out.println("This should run when the method is called through an object (above!).");
	// fin	
		
	}
	
	// a. iii.
	public void FailedExampleMethod() {
		System.out.println("Unfortunately, this will not run since there is no object that calls for this method.");
		System.out.println("For this to be included in the console, the method must include 'static' or you must call it, as seen in a. ii.");
	}
	// fin
	
	
	// Understanding Arguments.
	//   This method expects an argument in String.
	public static void example(String[] args) { 
		//System.out.method(Argument);
		System.out.println("Since this is static, it should print, but it won't, since it is not included in main and is not called for.  Inlcude line 33 for the fix.");
	}
	
	public static void DynamicMethod(String[] args) {  // This method is dynamic since it includes arguments.
		System.out.println("Hello" + args[0] + args[1]); 
		// This Method contains two dynamic arguments, where you are able to give input into the string.
	}
	
	public static void UserInput(String[] args) {
		String string = new String("");  // This is more difficult!
		String easierstring = ""; // But it is easier!
		System.out.println(string);
		System.out.println("User Input:");
		System.out.println(string);
		System.out.println("What is your name?");

	 // Type Identifier = new type(argument);  - args from within the system.
		Scanner scanner = new Scanner(System.in);  // Also works as "java.util.Scanner scanner = new java.util.Scanner(System.in);"
		// Created variable scanner.
		String name = scanner.nextLine();  // This is what asks for the input.
		
		System.out.println("Hello " + name + "!");  // This is how the input is interpreted / used.
		
	}
	public static void datatypes() {
		int x = 5; // Primitive.
		Integer y = 5; // Object.
		
		System.out.println("");
		System.out.println("Primitive Variable: " + x);
		System.out.println("Object Variable: " + y);
		
	}
	public static final int Variable = 10;
	// Could be confusing to define variables and objects the same way.
	public static void Variables() {
		int x;
		x = 5; // Initialization for the variable
		x = 10; // Redefined the same variable, thereby changing the value of x.
		x = Variable; // This just redefined the int x to have the value of Variable, 10.
		
		final int Z = 5;  // This creates the constant Z, meaning that it cannot change or be redefined.
		
		boolean trueorfalse = true;
		// trueorfalse != "true"
		
		byte C = 2;
		char c = 'Z';
		short s = -12345;
		double S = -12.3;
		int i = 12;
		long z = 12122112;
		long Z1 = 121211212122112L;
		float f = 20.5f; // 32 bit. Smaller Container.
		double q = 20.5; // 64 bit. Bigger Container.
		
	}
	
	public static void ScannerDetails() {
		 Scanner scanner = new Scanner(System.in);
		 //scanner.nextLine();
		 System.out.println("Say something and I will repeat it.");
		 String x = scanner.nextLine();  // Asking for the input.
		 System.out.print(x);            // Printing said input.
		 
		 int y = scanner.nextInt(); // Asking for an integer input.
		 System.out.println(y);     // Printing said input.
		 System.out.println("");
		 double z = y + 10;
		 System.out.println("This is your entered value, " + y + " plus 10: " + z);
	
		 int x1 = (int)scanner.nextDouble();  // This is casting the int value into double.
		 System.out.println(x1);
	}
	
	public static void Morenumbers( ) {
		int a = 5;
		double b = a / 2;
		int c = a / 2;
		System.out.println("Dividing with integers: " + c);
		System.out.println("Dividing with doubles: " + b);
		
	}
	
}
