import java.lang.*;
import java.util.Scanner;
class Exceptionmain{
	public static void main(String...args){
		Scanner s = new Scanner(System.in);
		try{
			int age = s.nextInt();
			if(age<18)
				throw new AgeException("sorry");
		else
			System.out.println("please vote");
		}catch(AgeException ae){
			System.out.println(ae.getMessage());
		}
	}
}
			