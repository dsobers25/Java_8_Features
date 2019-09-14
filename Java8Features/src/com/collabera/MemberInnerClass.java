package com.collabera;

// nested class
public class MemberInnerClass {

	// Member variables
	private int data = 30;
	
	// Member Functions
	public void show() {
		
	}
	
	// inner class, Member Inner Class
	class Inner{
		void msg() {
			System.out.println("data is  + data");
		}
	}
	
	public static void main(String[] args) {
		MemberInnerClass outterClass = new MemberInnerClass();
		System.out.println();
		
		MemberInnerClass.Inner inner = outterClass.new Inner();
		
	}

}
