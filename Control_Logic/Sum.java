package project;
class sum3
{
	int sum2(int n)
	{  int sum1=0;
		for(int i=1;i<=n;i++)
		{    if(i%3==0 || i%5==0)
			sum1=sum1+i;
		}
		return sum1;
	}
}
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       sum3 s=new sum3();
       System.out.println(s.sum2(14));
	}
}
