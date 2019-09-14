package com.collabera;

interface Collections{
	public void forEach();
	default public void forEach(int functions) {
		System.out.println("default implementation for this");
	};
}

class arraylist implements Collections {
	@Override
	public void forEach() {
		System.out.println("arraylist implementation for this");
	}
	
	@Override
	public void forEach(int functions) {
		System.out.println("arraylist implementation for this");
	}
	
	public void forEach(boolean functions) {
		System.out.println("arraylist implementation for this");
	}
}
	
public class ImportanceOfStaticDefaultMethods{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
