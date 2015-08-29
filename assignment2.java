package assignments;

import java.util.Scanner;

class Mathbasic
{
	double sum(double...a)
	{
		double sum=0;
		for(double i:a)
		{
			sum=sum+i;
		}
		return sum;
	}
	double sub(double a,double b)
	{
		return a-b;
	}
	double mul(double a,double b)
	{
		return a*b;
	}
	double div(double a,double b)
	{
		return a/b;
	}
	void simple()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 2 Operands");
		double a = input.nextDouble();
		double b = input.nextDouble();
		System.out.println("Enter your choice 1 .add \n 2.sub 3.mul 4.divide");
		int z = input.nextInt();
		switch(z)
		{
		case 1: System.out.println(sum(a,b));
		break;
		case 2:System.out.println(sub(a,b));
		break;
		case 3:System.out.println(mul(a,b));
		break;
		case 4:System.out.println(div(a,b));
		break;
		default : System.out.println("Wrong input");
		}
	}
}
class MathScien extends Mathbasic
{
	void scientific()
	{
		System.out.println("Welcome to scientific calculator");
		System.out.println("Enter a operand");
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		System.out.println("Enter your Choice 1.sine \n 2.cos \n 3.tan \n 4.exp \n 5.pow \n 6.log \n 7.ceil \n 8.floor");
		int x=input.nextInt();
		switch(x)
		{
			case 1: System.out.println(Math.sin(a));
			break;
			case 2: System.out.println(Math.cos(a));
			break;
			case 3: System.out.println(Math.tan(a));
			break;
			case 4: System.out.println(Math.exp(a));
			break;
			case 5:
				  double b=input.nextDouble();
				  System.out.println(Math.pow(a, b));
			break;
			case 6: System.out.println(Math.log(a));
			break;
			case 7: System.out.println(Math.ceil(a));
			break;
			case 8: System.out.println(Math.floor(a));
			break;
			default:System.out.println("Invalid input");
		}
		
	}
}
public class assignment2 extends MathScien {

	assignment2()
	{
		int choice=1;
		Scanner input = new Scanner(System.in);
		while(choice==1)
		{
			System.out.println("Enter 1. BASIC 2.SCIENTIFIC");
			int x= input.nextInt();
			if(x==1)
			{
				simple();
			}
			else if(x==2)
			{
				scientific();
			}
			else
			{
				System.out.println("Invalid input");
			}
			System.out.println("Want to continue 1.Yes 2.No");
			choice = input.nextInt();
		}
		System.out.println("Thank you for using it ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assignment2 obj = new assignment2();
	}

}
