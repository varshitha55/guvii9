/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class divtwo
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		while(n!=1)
		{
			if(n%2!=0)
			{
				i=n;
				break;
			}
			n=n/2;
		}
		System.out.print(n);
	}
}
