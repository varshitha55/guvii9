/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class intl
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		if(n>=-2147483648 && n<=2147483647)
		System.out.println("INT");
		else
		System.out.println("LONG");
	}
}
