import java.util.Scanner;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num, count = 1, total = 0;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
       while(count <= num)
       {
           total = total + count;
           count++;
       }

       System.out.println(total);
    
	}
}
