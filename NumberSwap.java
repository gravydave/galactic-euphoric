//A quick number swapping algorithm to test pushing and committing in Git

import java.util.*;

public class NumberSwap
{
	public static void main(String[] args)
	{
		int x = 5;
		int y = 9;
		int temp;

		System.out.println("X equals = " + x);
		System.out.println("Y equals = " + y);
		
		//Swap algorithm
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("X now equals = " + x);
		System.out.println("Y now equlas = " + y);

	}

}
	
