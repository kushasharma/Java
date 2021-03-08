package project;
class fib
{
	int fib1(int n)              //recursive
	{
		if(n<=1)
			return n;
		return fib1(n-1)+fib1(n-2);
	}
	int fib2(int n1)             //iterative
	{
		if (n1 <= 1) {
            return n1;
        }
 
        int previousFib = 0, currentFib = 1;
        for (int i = 0; i < n1 - 1; i++)
        {
            int newFib = previousFib + currentFib;
            previousFib = currentFib;
            currentFib = newFib;
        }
 
        return currentFib;
	}
}
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fib f=new fib();
		System.out.println(f.fib1(9));
        System.out.println(f.fib2(9));
	}

}
