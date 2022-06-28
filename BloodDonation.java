import java.util.Scanner;
public class BloodDonation
{
  public static void main(String[] args)
  {
    int age,wgt;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter your age :");  //to print statement
	age=sc.nextInt();
	System.out.print("Enter your weight :");  //to print statement
	wgt=sc.nextInt();
	if(age>=25)
	{
	  if(wgt>=48)
	System.out.print("Eligible to donate blood");   //to print statement
	else
	System.out.print("Not eligible to donate blood"); //to print statement
	}
  }
}
