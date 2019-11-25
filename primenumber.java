import java.util.Scanner;

public class primenumber {
	static void findprime(int num)
	{ 
	  int flag=0;
	  for(int i=2; i<num; i++)
	  {
		  if(num%i==0)
			  flag=1;
	  }
	  if(flag==0)
		  System.out.println(num+ " is a prime number");
	  else
		  System.out.println(num+ " is not a prime number");
	}

	public static void main(String[] args) 
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num = sc.nextInt();
		findprime(num);
	}
}


