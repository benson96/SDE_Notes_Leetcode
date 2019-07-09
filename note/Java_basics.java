Java Programming basics:


1. Java Environment:

	The programming environment of Java consists of three components mainly:

		JDK
		JRE
		JVM

	Difference between JDK, JRE and JVM:

	The Java Development Kit (JDK) is a software development environment used for developing Java applications and applets
	It includes the Java Runtime Environment (JRE), an interpreter/loader (Java), a compiler (javac), 
	an archiver (jar), a documentation generator (Javadoc) and other tools needed in Java development.

	JRE stands for “Java Runtime Environment” and may also be written as “Java RTE.” 
	The Java Runtime Environment provides the minimum requirements for executing a Java application; 
	it consists of the Java Virtual Machine (JVM), core classes, and supporting files.

	JVM stands for  "JAVA VIRTUAL MACHINE"

	~ A specification where working of Java Virtual Machine is specified. 
	But implementation provider is independent to choose the algorithm. 
	Its implementation has been provided by Sun and other companies.
	~ An implementation is a computer program that meets the requirements of the JVM specification
	~ Runtime Instance Whenever you write java command on the command prompt to run the java class, 
	an instance of JVM is created.


	JDK = JRE + DEVELOPMENT Tool 
	JRE = JVM + Library Classes

	JDK – Java Development Kit (in short JDK) is Kit which provides the environment to develop and execute(run) the Java program. 
		JDK is a kit(or package) which includes two things
			Development Tools(to provide an environment to develop your java programs)
			JRE (to execute your java program).

	Note : JDK is only used by Java Developers.

	JRE – Java Runtime Environment (to say JRE) 
		is an installation package which provides environment to only run(not develop) the java program(or application)onto your machine. 
		JRE is only used by them who only wants to run the Java Programs i.e. end users of your system.
	JVM – Java Virtual machine(JVM)
		is a very important part of both JDK and JRE because it is contained or inbuilt in both. 
		Whatever Java program you run using JRE or JDK goes into JVM and JVM is responsible for executing the java program line by line hence it is also known as interprete

2. Basic Syntax:

	main method: 
	In Java programming language, every application must contain a main method whose signature is:

	public static void main(String[] args)

	public: So that JVM can execute the method from anywhere.
	static: Main method is to be called without object. 
	The modifiers public and static can be written in either order.
	void: The main method does not return .
	main(): Name configured in the JVM.
	String[]: The main method accepts a single argument: 
          	an array of elements of type String


3. Data Type in Java:

	There are majorly two types of languages. 
	First one is Statically typed language where each variable and expression type is already known at compile time.
	Once a variable is declared to be one of a certain data type, it cannot hold values of other data types.
	E.G. C,C++,JAVA

	Other, Dynamically typed languages: These languages can receive different data types over the time. (Python, Ruby)

	Java is statically typed and a strongly typed language, 
	because in Java, each type of data (such as integer, character) is predifined as part of the programming language.

	Java has two categories of data:

		Primitive data (e.g. number, character)
		Object data (programmer created types)

		8 primitive data types:

			boolean
			byte
			char
			short
			int
			long
			float
			double

4. Variables in JAVA:

	There are three types of variables in Java

		Local Variables
		Instance Variables
		Static Variables


		Local Variables: A variable defined within a block or method or constructor：

			These variable are created when the block in entered or the function is called and destroyed after exiting from the block or when the call returns from the function.

			The scope of these variables exists only within the block in which the variable is declared. i.e. we can access these variable only within that block.

			Initilisation of Local Variable is Mandatory.

			public class StudentDetails { 
    			public void StudentAge() { 

        			// local variable age 
        			int age = 0; 
        			age = age + 5; 
        			System.out.println("Student age is : " + age); 
    			} 
  
  			  public static void main(String args[]){ 

        		StudentDetails obj = new StudentDetails(); 
        		obj.StudentAge(); 
    			} 
			} 


		Instance Variables: 

			Instance variables are non-static variables and are declared in a class outside any method, constructor or block.

			As instance variables are declared in a class, these variables are created when an object of the class is created and destroyed when the object is destroyed.

			Unlike local variables, we may use access specifiers for instance variables. 
			If we do not specify any access specifier then the default access specifier will be used.

			Initilisation of Instance Variable is not Mandatory. Its default value is 0

			Instance Variable can be accessed only by creating objects.

			class Marks { 
   				 // These variables are instance variables. 
   				 // These variables are in a class 
    			 // and are not inside any function 
  	 			 int engMarks; 
    			 int mathsMarks; 
    			 int phyMarks; 
			} 


			Static Variables: 
				Static variables are also known as Class variables.

				These variables are declared similarly as instance variables, 
				the difference is that static variables are declared using the static keyword within a class outside any method constructor or block.

				Unlike instance variables, we can only have one copy of a static variable per class irrespective of how many objects we create.

				Static variables are created at the start of program execution and destroyed automatically when execution ends.

				Initilisation of Static Variable is not Mandatory. Its default value is 0

				If we access the static variable like Instance variable (through an object), 
				the compiler will show the warning message and it won’t halt the program. 
				The compiler will replace the object name to class name automatically.

				If we access the static variable without the class name, Compiler will automatically append the class name.

				To access static variables, we need not create an object of that class, we can simply access the variable as

					class_name.variable_name;


				class Emp { 
  
    			// static variable salary 
    			public static double salary; 
    			public static String name = "Harsh"; 
				} 
  
				public class EmpDemo { 
    				public static void main(String args[]) 
    				{ 
  
        			// accessing static variable without object 
        			Emp.salary = 1000; 
        			System.out.println(Emp.name + "'s average salary:" + Emp.salary); 
    				} 
				} 


	Instance variable Vs Static variable

	Each object will have its own copy of instance variable whereas
	We can only have one copy of a static variable per class irrespective of how many objects we create.

	Changes made in an instance variable using one object will not be reflected in other objects as each object has its own copy of instance variable. 
	In case of static, changes will be reflected in other objects as static variables are common to all object of a class.

	We can access instance variables through object references and Static Variables can be accessed directly using class name.

	Syntax for static and instance variables:

	class Example
    {
        static int a; //static variable
        int b;        //instance variable
    }


    
