
June 28

Java Basics:


1. fields vs properties

fields 指 class 中的 property


2. function vs method 

class 中的 method 叫 function


3. Access Modifiers: 控制访问权限

private: 后面的variable and method只能在本class 中访问
public：在所有地方都能访问
protected: 只有本class 和 继承的 class访问
default： 同package中可见


4. final: 
		一旦赋值，不可改变（variable)
		不能被override  （method)
		不能被继承		(class)

5. override vs overload

	override: (重写)

	重写是子类对父类的允许访问的方法的实现过程进行重新编写, 返回值和形参都不能改变。
	即外壳不变，核心重写！

	重写的好处在于子类可以根据需要，定义特定于自己的行为。 
	也就是说子类能够根据需要实现父类的方法。

	重写方法不能抛出新的检查异常或者比被重写方法申明更加宽泛的异常。
	例如： 父类的一个方法申明了一个检查异常 IOException，但是在重写这个方法的时候不能抛出 Exception 异常，
	因为 Exception 是 IOException 的父类，只能抛出 IOException 的子类异常。


	e.g：
	class Animal{
   public void move(){
      System.out.println("动物可以移动");
   		}
	}
 
	class Dog extends Animal{
   		public void move(){
      	System.out.println("狗可以跑和走");
   		}
	}
 
	public class TestDog{
	   public static void main(String args[]){
      	Animal a = new Animal(); // Animal 对象
      	Animal b = new Dog(); // Dog 对象
 
      	a.move();// 执行 Animal 类的方法
 
      	b.move();//执行 Dog 类的方法
   		}
	}

	Output:
	动物可以移动
	狗可以跑和走

	overload: (重载)

	重载(overloading) 是在一个类里面，方法名字相同，而参数不同。返回类型可以相同也可以不同。

	每个重载的方法（或者构造函数）都必须有一个独一无二的参数类型列表。
	
	最常用的地方就是构造器的重载。

	重载规则:

	a)被重载的方法必须改变参数列表(参数个数或类型不一样)；
	b)被重载的方法可以改变返回类型；
	c)被重载的方法可以改变访问修饰符；
	d)被重载的方法可以声明新的或更广的检查异常；
	e)方法能够在同一个类中或者在一个子类中被重载。
	f)无法以返回值类型作为重载函数的区分标准。



	e.g.
	public class Overloading {
    public int test(){
        System.out.println("test1");
        return 1;
    }
 
    public void test(int a){
        System.out.println("test2");
    }   
 
    //以下两个参数类型顺序不同
    public String test(int a,String s){
        System.out.println("test3");
        return "returntest3";
    }   
 
    public String test(String s,int a){
        System.out.println("test4");
        return "returntest4";
    }   
 
    public static void main(String[] args){
        Overloading o = new Overloading();
        System.out.println(o.test());
        o.test(1);
        System.out.println(o.test(1,"test3"));
        System.out.println(o.test("test4",1));
    }
}


	区别点		重载方法(override)		重写方法(overload)
	参数列表		必须修改					一定不能修改
	返回类型		可以修改					一定不能修改
	异常			可以修改					可以减少或删除，一定不能抛出新的或者更广的异常
	访问			可以修改					一定不能做更严格的限制（可以降低限制）

6. static
在程序中任何变量或者代码都是在编译时由系统自动分配内存来存储的，
而所谓静态就是指在编译后所分配的内存会一直存在，
直到程序退出内存才会释放这个空间，也就是只要程序在运行，
那么这块内存就会一直存在。
这样做有什么意义呢？
在Java程序里面，所有的东西都是对象，
而对象的抽象就是类，
对于一个类而言，如果要使用他的成员，
那么普通情况下必须先实例化对象后，
通过对象的引用才能够访问这些成员，
但是用static修饰的成员可以通过类名加“.”进行直接访问。

only one copy in memory, call it without instantiate.

7. Java garbage collection 机制


8， stack and heap structure

	stack: reference & primitive types, method call frame, local variable, control invocation such as recursion

	heap: objects, dynamic memory allocation with garbage collection --> mark/sweep

