package project;
import java.util.*;
class traffic1
{
	void signal()
	{
		String s=new String();
		Scanner sc= new Scanner(System.in);
		 s=sc.nextLine();
		    //Switch expression  
		    switch(s){  
		    //Case statements  
		    case "red": System.out.println("stop");  
		    break;  
		    case "yellow": System.out.println("ready");  
		    break;  
		    case "green": System.out.println("go");  
		    break;

	}
		    sc.close();
	}
}
public class Traffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		traffic1 t1=new traffic1();
		t1.signal();
		
	}
}