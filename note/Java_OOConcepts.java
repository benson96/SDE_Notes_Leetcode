
Object Oriented Programming Concepts in Java

Object-oriented programming: 
	As the name suggests, Object-Oriented Programming or OOPs refers to languages that uses objects in programming. 

	Object-oriented programming aims to implement real-world entities like inheritance, polymorphism etc in programming. 

	The main aim of OOP is to bind together the data and the functions 
	that operate on them so that no other part of the code can access this data except that function.


1. Polymorphism: 
	Polymorphism refers to the ability of OOPs programming languages to differentiate between entities with the same name.
	This is done by Java with the help of the signature and decalration of these entities.

	// Java program to demonstrate Polymorphism 

	// This class will contain 
	// 3 methods with same name, 
	// yet the program will 
	// compile & run successfully 
	public class Sum { 

		// Overloaded sum(). 
		// This sum takes two int parameters 
		public int sum(int x, int y) 
		{ 
			return (x + y); 
		} 

		// Overloaded sum(). 
		// This sum takes three int parameters 
		public int sum(int x, int y, int z) 
		{ 
			return (x + y + z); 
		} 

		// Overloaded sum(). 
		// This sum takes two double parameters 
		public double sum(double x, double y) 
		{ 
			return (x + y); 
		} 

		// Driver code 
		public static void main(String args[]) 
		{ 
			Sum s = new Sum(); 
			System.out.println(s.sum(10, 20)); 
				System.out.println(s.sum(10, 20, 30)); 
			System.out.println(s.sum(10.5, 20.5)); 
		} 
	} 

	Polymorphism in Java rae mainly of 2 types:
		Overloading in Java
		Overriding in Java

2. Inheritence:

	Inheritence is an important of OOP.

	It is the mechanism in java by which one class is allowed to inherit the features of another class.

	//Java program to illustrate the 
	// concept of inheritance 

	// base class 
	class Bicycle 
	{ 
		// the Bicycle class has two fields 
		public int gear; 
		public int speed; 
		
		// the Bicycle class has one constructor 
		public Bicycle(int gear, int speed) 
		{ 
			this.gear = gear; 
			this.speed = speed; 
		} 
		
		// the Bicycle class has three methods 
		public void applyBrake(int decrement) 
		{ 
			speed -= decrement; 
		} 
		
		public void speedUp(int increment) 
		{ 
			speed += increment; 
		} 
	
		// toString() method to print info of Bicycle 
		public String toString() 
		{ 
			return("No of gears are "+gear + "\n" + "speed of bicycle is "+speed); 
		} 
	} 

	// derived class 
	class MountainBike extends Bicycle 
	{ 
	
		// the MountainBike subclass adds one more field 
		public int seatHeight; 

		// the MountainBike subclass has one constructor 
		public MountainBike(int gear,int speed, int startHeight) 
		{ 
		// invoking base-class(Bicycle) constructor 
			super(gear, speed); 
			seatHeight = startHeight; 
		} 
		
		// the MountainBike subclass adds one more method 
		public void setHeight(int newValue) 
		{ 
			seatHeight = newValue; 
		} 
	
		// overriding toString() method 
		// of Bicycle to print more info 
		@Override
		public String toString() 
		{ 
			return (super.toString()+ "\nseat height is "+seatHeight); 
		} 
	
	} 

	// driver class 
	public class Test 
	{ 
		public static void main(String args[]) 
		{ 
		
			MountainBike mb = new MountainBike(3, 100, 25); 
			System.out.println(mb.toString()); 
			
		} 
	} 


	Output:

	No of gears are 3
	speed of bicycle is 100
	seat height is 25

3.Encapsulation: 
	Encapsulation is defined as the wrapping up of data under a single unit.

	It is the mechanism that binds together code and the data it manipulates.Other way to think about encapsulation is, 
	it is a protective shield that prevents the data from being accessed by the code outside this shield.

	Technically in encapsulation, the variables or data of a class is hidden from any other class 
	and can be accessed only through any member function of own class in which they are declared.

	As in encapsulation, the data in a class is hidden from other classes, so it is also known as data-hiding.

	Encapsulation can be achieved by: 
		Declaring all the variables in the class as private,
		writing public methods in the class to set and get the values of variables.

	// Java program to demonstrate encapsulation 
	public class Encapsulate 
	{ 
		// private variables declared 
		// these can only be accessed by 
		// public methods of class 
		private String geekName; 
		private int geekRoll; 
		private int geekAge; 

		// get method for age to access 
		// private variable geekAge 
		public int getAge() 
		{ 
		return geekAge; 
		} 

		// get method for name to access 
		// private variable geekName 
		public String getName() 
		{ 
		return geekName; 
		} 
	
		// get method for roll to access 
		// private variable geekRoll 
		public int getRoll() 
		{ 
		return geekRoll; 
		} 

		// set method for age to access 
		// private variable geekage 
		public void setAge( int newAge) 
		{ 
		geekAge = newAge; 
		} 

		// set method for name to access 
		// private variable geekName 
		public void setName(String newName) 
		{ 
		geekName = newName; 
		} 
	
		// set method for roll to access 
		// private variable geekRoll 
		public void setRoll( int newRoll) 
		{ 
		geekRoll = newRoll; 
		} 
	} 

	public class TestEncapsulation 
	{     
    	public static void main (String[] args)  
    	{ 
        	Encapsulate obj = new Encapsulate(); 
          
        	// setting values of the variables  
        	obj.setName("Harsh"); 
        	obj.setAge(19); 
        	obj.setRoll(51); 
          
        	// Displaying values of the variables 
       		System.out.println("Geek's name: " + obj.getName()); 
        	System.out.println("Geek's age: " + obj.getAge()); 
        	System.out.println("Geek's roll: " + obj.getRoll()); 
          
        	// Direct access of geekRoll is not possible 
        	// due to encapsulation 
        	// System.out.println("Geek's roll: " + obj.geekName);         
   		} 
	} 

	Advantages of Encapsulation:

	Data data-hiding
	Increased Flexibility
	Reusability
	Testing code is easy. (unit test)


4. Abstraction

	In java, abstraction is achieved by interfaces and abstract class. 
	We can achieve 100% abstraction using interfaces.

	Abstract classes and Abstract methods :

	An abstract class is a class that is declared with abstract keyword.

	An abstract method is a method that is declared without an implementation.

	An abstract class may or may not have all abstract methods. Some of them can be concrete methods

	A method defined abstract must always be redefined in the subclass,
	thus making overriding compulsory OR either make subclass itself abstract.

	Any class that contains one or more abstract methods must also be declared with abstract keyword.

	There can be no object of an abstract class.
	That is, an abstract class can not be directly instantiated with the new operator.

	An abstract class can have parametrized constructors and default constructor is always present in an abstract class.

// Java program to illustrate the 
// concept of Abstraction 
abstract class Shape 
{ 
	String color; 
	
	// these are abstract methods 
	abstract double area(); 
	public abstract String toString(); 
	
	// abstract class can have constructor 
	public Shape(String color) { 
		System.out.println("Shape constructor called"); 
		this.color = color; 
	} 
	
	// this is a concrete method 
	public String getColor() { 
		return color; 
	} 
} 
class Circle extends Shape 
{ 
	double radius; 
	
	public Circle(String color,double radius) { 

		// calling Shape constructor 
		super(color); 
		System.out.println("Circle constructor called"); 
		this.radius = radius; 
	} 

	@Override
	double area() { 
		return Math.PI * Math.pow(radius, 2); 
	} 

	@Override
	public String toString() { 
		return "Circle color is " + super.color + 
					"and area is : " + area(); 
	} 
	
} 
class Rectangle extends Shape{ 

	double length; 
	double width; 
	
	public Rectangle(String color,double length,double width) { 
		// calling Shape constructor 
		super(color); 
		System.out.println("Rectangle constructor called"); 
		this.length = length; 
		this.width = width; 
	} 
	
	@Override
	double area() { 
		return length*width; 
	} 

	@Override
	public String toString() { 
		return "Rectangle color is " + super.color + 
						"and area is : " + area(); 
	} 

} 
public class Test 
{ 
	public static void main(String[] args) 
	{ 
		Shape s1 = new Circle("Red", 2.2); 
		Shape s2 = new Rectangle("Yellow", 2, 4); 
		
		System.out.println(s1.toString()); 
		System.out.println(s2.toString()); 
	} 
} 

	Output:

	Shape constructor called
	Circle constructor called
	Shape constructor called
	Rectangle constructor called
	Circle color is Redand area is : 15.205308443374602
	Rectangle color is Yellowand area is : 8.0

	Encapsulation vs Data Abstraction

	Encapsulation is data hiding(information hiding) while Abstraction is detail hiding(implementation hiding).

	While encapsulation groups together data and methods that act upon the data, 
	data abstraction deals with exposing the interface to the user and hiding the details of implementation.

	Advantages of Abstraction

	It reduces the complexity of viewing the things.

	Avoids code duplication and increases reusability.

	Helps to increase security of an application or program as only important details are provided to the user.


5. Classes and Objects in Java

	A class is a user defined blueprint or prototype from which objects are created.  
	It represents the set of properties or methods that are common to all objects of one type. 
	In general, class declarations can include these components, in order:

		Modifiers : A class can be public or has default access.

		Class name: The name should begin with a initial letter (capitalized by convention).

		Superclass(if any): The name of the class’s parent (superclass), if any, preceded by the keyword extends.
		 					A class can only extend (subclass) one parent.

		Interfaces(if any): A comma-separated list of interfaces implemented by the class, 
							if any, preceded by the keyword implements. 
							A class can implement more than one interface.

		Body: The class body surrounded by braces, { }.


	Constructors are used for initializing new objects. 
	Fields are variables that provides the state of the class and its objects, 
	Methods are used to implement the behavior of the class and its objects.

	Object

	It is a basic unit of Object Oriented Programming and represents the real life entities.  
	A typical Java program creates many objects, which as you know, interact by invoking methods. An object consists of :

	State : It is represented by attributes of an object. 
			It also reflects the properties of an object.

	Behavior : It is represented by methods of an object. 
			   It also reflects the response of an object with other objects.

	Identity : It gives a unique name to an object and enables one object to interact with other objects.

// Class Declaration 

public class Dog 
{ 
	// Instance Variables 
	String name; 
	String breed; 
	int age; 
	String color; 

	// Constructor Declaration of Class 
	public Dog(String name, String breed, 
				int age, String color) 
	{ 
		this.name = name; 
		this.breed = breed; 
		this.age = age; 
		this.color = color; 
	} 

	// method 1 
	public String getName() 
	{ 
		return name; 
	} 

	// method 2 
	public String getBreed() 
	{ 
		return breed; 
	} 

	// method 3 
	public int getAge() 
	{ 
		return age; 
	} 

	// method 4 
	public String getColor() 
	{ 
		return color; 
	} 

	@Override
	public String toString() 
	{ 
		return("Hi my name is "+ this.getName()+ 
			".\nMy breed,age and color are " + 
			this.getBreed()+"," + this.getAge()+ 
			","+ this.getColor()); 
	} 

	public static void main(String[] args) 
	{ 
		Dog tuffy = new Dog("tuffy","papillon", 5, "white"); 
		System.out.println(tuffy.toString()); 
	} 
} 

	Output:

	Hi my name is tuffy.
	My breed,age and color are papillon,5,white


6. Constructors in Java

	Constructors are used to initialize the object’s state. 
	Like methods, a constructor also contains collection of statements(i.e. instructions) 
	that are executed at time of Object creation.

	Rules for writing Constructor:

	Constructor(s) of a class must has same name as the class name in which it resides.

	A constructor in Java can not be abstract, final, static and Synchronized.

	Access modifiers can be used in constructor declaration to control its access 
	i.e which other class can call the constructor

	Types of constructor:

	1. no-argument constructor:

// Java Program to illustrate calling a 
// no-argument constructor 
import java.io.*; 
  
class Geek 
{ 
    int num; 
    String name; 
  
    // this would be invoked while an object 
    // of that class is created. 
    Geek() 
    { 
        System.out.println("Constructor called"); 
    } 
} 
  
class GFG 
{ 
    public static void main (String[] args) 
    { 
        // this would invoke default constructor. 
        Geek geek1 = new Geek(); 
  
        // Default constructor provides the default 
        // values to the object like 0, null 
        System.out.println(geek1.name); 
        System.out.println(geek1.num); 
    } 
} 

	Output :

	Constructor called
	null
	0
	Parameterized Constructor:

// Java Program to illustrate calling of 
// parameterized constructor. 
import java.io.*; 
  
class Geek 
{ 
    // data members of the class. 
    String name; 
    int id; 
  
    // constructor would initialize data members 
    // with the values of passed arguments while 
    // object of that class created. 
    Geek(String name, int id) 
    { 
        this.name = name; 
        this.id = id; 
    } 
} 
  
class GFG 
{ 
    public static void main (String[] args) 
    { 
        // this would invoke the parameterized constructor. 
        Geek geek1 = new Geek("adam", 1); 
        System.out.println("GeekName :" + geek1.name + 
                           " and GeekId :" + geek1.id); 
    } 
} 

	Output:

	GeekName :adam and GeekId :1



	Does constructor return any value?

	There are no “return value” statements in constructor, 
	but constructor returns current class instance. 
	We can write ‘return’ inside a constructor.


	Constructor Overloading

	Like methods, we can overload constructors for creating objects in different ways. 
	Compiler differentiates constructors on the basis of numbers of parameters, 
	types of the parameters and order of the parameters.

// Java Program to illustrate constructor overloading 
// using same task (addition operation ) for different 
// types of arguments. 
import java.io.*; 

class Geek 
{ 
	// constructor with one argument 
	Geek(String name) 
	{ 
		System.out.println("Constructor with one " + 
					"argument - String : " + name); 
	} 

	// constructor with two arguments 
	Geek(String name, int age) 
	{ 

		System.out.println("Constructor with two arguments : " + 
				" String and Integer : " + name + " "+ age); 

	} 

	// Constructor with one argument but with different 
	// type than previous.. 
	Geek(long id) 
	{ 
		System.out.println("Constructor with one argument : " + 
											"Long : " + id); 
	} 
} 

class GFG 
{ 
	public static void main(String[] args) 
	{ 
		// Creating the objects of the class named 'Geek' 
		// by passing different arguments 

		// Invoke the constructor with one argument of 
		// type 'String'. 
		Geek geek2 = new Geek("Shikhar"); 

		// Invoke the constructor with two arguments 
		Geek geek3 = new Geek("Dharmesh", 26); 

		// Invoke the constructor with one argument of 
		// type 'Long'. 
		Geek geek4 = new Geek(325614567); 
	} 
} 

	Output:

	Constructor with one argument - String : Shikhar
	Constructor with two arguments - String and Integer : Dharmesh 26
	Constructor with one argument - Long : 325614567

	How constructors are different from methods in Java?

	Constructor(s) must have the same name as the class within which it defined while it is not necessary for the method in java.

	Constructor(s) do not return any type while method(s) have the return type or void if does not return any value.

	Constructor is called only once at the time of Object creation while method(s) can be called any numbers of time.


7. Methods in Java:

	Method Declaration

	In general, method declarations has six components :

		Modifier-: Defines access type of the method 
			i.e. from where it can be accessed in your application. 
			In Java, there 4 type of the access specifiers.
				public: accessible in all class in your application.
				protected: accessible within the class in which it is defined and in its subclass(es)
				private: accessible only within the class in which it is defined.
				default (declared/defined without using any modifier) : accessible within same class and package within which its class is defined.

		The return type : The data type of the value returned by the method or void if does not return a value.

		Method Name : the rules for field names apply to method names as well, but the convention is a little different.

		Parameter list : Comma separated list of the input parameters are defined, 
						 preceded with their data type, within the enclosed parenthesis. 
						 If there are no parameters, you must use empty parentheses ().

		Exception list : The exceptions you expect by the method can throw, you can specify these exception(s).

		Method body : it is enclosed between braces. The code you need to be executed to perform your intended operations.

// Program to illustrate methodsin java 
import java.io.*; 
  
class Addition { 
      
    int sum = 0; 
      
    public int addTwoInt(int a, int b){ 
          
        // adding two integer value. 
        sum = a + b; 
          
        //returning summation of two values. 
        return sum;  
    } 
      
} 
  
class GFG { 
    public static void main (String[] args) { 
      
        // creating an instance of Addition class  
        Addition add = new Addition(); 
          
        // calling addTwoInt() method to add two integer using instance created 
        // in above step. 
        int s = add.addTwoInt(1,2); 
        System.out.println("Sum of two integer values :"+ s); 
          
    } 
} 


// Java program to illustrate different ways of calling a method 
import java.io.*; 
  
class Test  
{ 
    public static int i = 0; 
    // constructor of class which counts 
    //the number of the objects of the class. 
    Test() 
    { 
        i++; 
          
    } 
    // static method is used to access static members of the class  
    // and for getting total no of objects  
    // of the same class created so far 
    public static int get()  
    { 
        // statements to be executed.... 
        return i; 
    } 
  
    // Instance method calling object directly  
    // that is created inside another class 'GFG'. 
    // Can also be called by object directly created in the same class  
    // and from another method defined in the same class  
    // and return integer value as return type is int. 
    public int m1() 
    { 
        System.out.println("Inside the method m1 by object of GFG class"); 
          
        // calling m2() method within the same class. 
        this.m2(); 
          
        // statements to be executed if any 
        return 1; 
    } 
  
    // It doesn't return anything as  
    // return type is 'void'. 
    public void m2()  
    { 
  
        System.out.println("In method m2 came from method m1"); 
    } 
} 
  
class GFG  
{ 
    public static void main(String[] args)  
    { 
        // Creating an instance of the class 
        Test obj = new Test(); 
          
        // Calling the m1() method by the object created in above step. 
        int i = obj.m1(); 
        System.out.println("Control returned after method m1 :" + i); 
          
        // Call m2() method 
        // obj.m2(); 
        int no_of_objects = Test.get(); 
          
        System.out.print("No of instances created till now : "); 
        System.out.println(no_of_objects); 
          
    } 
} 

	Output :

	Inside the method m1 by object of GFG class
	In method m2 came from method m1
	Control returned after method m1 :1
	No of instances created till now : 1