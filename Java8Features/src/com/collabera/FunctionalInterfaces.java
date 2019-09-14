package com.collabera;

@FunctionalInterface
interface FuncDisplay{ // SAM --> Single Abstract Method
	public void display();
}

class A{
	int a;
}

public class FunctionalInterfaces {
	
	// static methods can access only static variable and cannot
	// access instance variables
	static FuncDisplay funcDisplay = () -> {
		System.out.println("hello");
		System.out.println("world");
	};

	public static void main(String[] args) {
		// primitive data type
		int x = 10; // <---- literal - value that has no time
		// At runtime autoboxing is done, by assigning literals 
		// to data types
		
		// non primitive data type is and object
		Integer y = 10; // wrapperclass // boxing unboxing
		
		// boxing
		// x => y
		
		// y => x
		// unboxing
		
		A a = new A();
		
	}
	
	// single statement for lambda expression
//	FuncDisplay fd = () -> System.out.println("hello");
	
//	multiple statements for lambda expression
//	FuncDisplay fd = () -> {
//		System.out.println("hello");
//	};
}
