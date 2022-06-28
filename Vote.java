import java.util.Scanner;
public class Vote
{
  public static void main(String[] args)
  {
    int age;
	Scanner sc=new Scanner(System.in);    //create scanner
	System.out.print("Enter your age :");     //to print statement
	age=sc.nextInt();
	if(age>=18)
	System.out.print("Eligible for vote");   //to print a statement
	else
	System.out.print("Not eligible for vote");    //to print a statement
  }
}
