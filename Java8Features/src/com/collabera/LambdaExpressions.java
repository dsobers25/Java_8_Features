package com.collabera;

interface NoArgs{
	public void noArgs();
}

interface SingleArgs{
	public int singleArgs(int i);
}

interface MultipleArgs{
	public int multipleArgs(int a, int b);
}

public class LambdaExpressions {

	public static void main(String[] args) {
		
		NoArgs noArgs = () -> {};
		
		SingleArgs singleArgs = (int a) -> {return 1;};
		SingleArgs singleArgs1 = (a) -> {return 1;};
		SingleArgs singleArgs2 = a -> 1;
	}

}
