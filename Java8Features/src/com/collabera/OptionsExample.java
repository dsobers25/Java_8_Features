package com.collabera;

import java.util.Optional;

// this annotation makes sure you aren't adding any additional methods
@FunctionalInterface
interface Options {
	public Optional<?> display();	
}

public class OptionsExample {

	public static void main(String[] args) {
		
		Options function = ()->{
			if(true) {
				return Optional.of(1);
			} else {
				return Optional.of("");
			}
		};
		
		// one way to use it
//		Options function = () -> 2;
		// same result if typed this way
//		Options function = () -> {
//			return 2;
//		};
	}

}
