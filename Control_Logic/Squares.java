package project;
import java.lang.Math;
class square
{
	int calculateDifference(int n)
	{   
	int sum_square,sum_of_squares;
	sum_of_squares = (n * (n + 1) * (2 * n + 1)) / 6; 
	sum_square = (n * (n + 1)) / 2; 
	  
    // Square of k 
	sum_square = sum_square * sum_square; 
      
    // Differences between l and k 
    int m = Math.abs(sum_of_squares - sum_square); 
    return m;
	}
}
public class Squares 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		square s=new square();
		System.out.println(s.calculateDifference(2));
	}
}