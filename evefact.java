/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class evefact
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				if(i%2==0)
				{
					count++;
				}
			}
		}
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				if(i%2==0)
				{
					if(count==1)
					System.out.print(i);
					else
					{
					  System.out.print(i);
					  System.out.print(" ");
					  count--;
					}
				}
			}
		}
		
	}
}
