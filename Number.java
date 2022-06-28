import java.util.Scanner;
public class Number
{
  public static void main(String[] args)
  {
    int no;          //declear a variable 
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number :");
	no=sc.nextInt();
	if(no>0)   //check the number is greater than 0 or not
	System.out.print("It is positive number");
	else if(no<0)         //check the number is less than 0 or not
	System.out.print("It is a negative number");
	else  //execute when the above two conditions returns false
	System.out.println("The number is 0");
  }
}
