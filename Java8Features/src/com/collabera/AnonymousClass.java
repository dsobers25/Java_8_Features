package com.collabera;

// Java 8 

// Help to provide Functional Programming
// ||||||||||||||||||||||||||||||||||||||
// vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
	// Functional Interfaces --> only contain one abstract method
	// Marker Interfaces ---> have no methods, meant for doing certain specific operations in JVM or frameworks
	// Lambdas
	// Options<T>
	// default and static keywords in interfaces

// ******** Both are NOT same **********
// Streams - methods overloaded with functional programming for existing collections
//-> IOStreams or FileStreams

interface IAA {
	public void show();
}

interface Shape{
	public void draw();
}

class child implements IAA{
	public void show() {
		System.out.println("child");
	}
}

// anonymous class have no name and can be created on the fly
public class AnonymousClass {

	public static void main(String[] args) {
		// to create an object for an interface
		// you must have a class implementing it
		// and instantiate that class after declaring
		// the interface
		// class child implements the IAA interface
		IAA iaa = new child();
		
		// acts like a class but isn't
		// define the class while creating the object itself
		Shape iaa2 = new Shape(){
			public void draw() {
				System.out.println("Circle");
			}
		};
		
		System.out.println("hello");
	}

}
