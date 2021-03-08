package project;
import java.util.*;
class prime1
{
	Boolean primenumber(int n)
	{
		for (int i = 2; i < n; i++)
		    if (n % i == 0)
		        return false;
		return true;
	}
	void printPrime(int n)
	{
	for (int i = 2; i <= n; i++) 
	{
	    if (primenumber(i))
	        System.out.print(i + " ");
	}
	}
}
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prime1 p=new prime1();
		System.out.println("enter a number");
		Scanner scanner= new Scanner(System.in);
		int n1=scanner.nextInt();
		p.printPrime(n1);
		scanner.close();
	}
}