/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class onetwo
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=0;i<=n;i++)
		{
			for(int j=n;j>=0;j--)
			{
				if((i*1)+(j*2)==n)
				count++;
			}	
		}
		System.out.println(count);
	}
}
