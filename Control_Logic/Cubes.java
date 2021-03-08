package project;
class cube
{
	int cube1(int n)
	{
		int n2,cube1,cubes2=0;
		while(n!=0)
	     {

	        n2 = n%10;

	        cube1 = n2*n2*n2;

	        cubes2 = cubes2 + cube1;

	        n = n/10; 

	      }
		return cubes2;
	}
}
public class Cubes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cube c=new cube();
		System.out.println(c.cube1(131));

	}

}
