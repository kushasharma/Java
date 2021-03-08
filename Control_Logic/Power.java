package project;
class power1
{
	Boolean checkNumber(int n)
	{
		if(n%2==0 && n!=0)
			return true;
		else
			return false;
	}
}
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       power1 p=new power1();
       System.out.println(p.checkNumber(16));
	}

}