package project;
class order1
{
	Boolean checkNumber(int n)
	{  
		int lastSeen = 10;
	    int current;

	    while (n > 0) {
	        current = n % 10;
	        if (lastSeen < current)
	            return false;
	        lastSeen = current;
	        n /= 10;
	    }
	    return true;
	}
}
public class Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        order1 o1=new order1();
        System.out.println(o1.checkNumber(134498));
	}

}