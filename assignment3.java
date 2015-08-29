package assignments;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class assignment3 {
 public static void main(String[] args){
	 int choice,price=0,discount=0,bill=0;
		Date date=new Date();
		Calendar cal=Calendar.getInstance();
		cal.setTime(date);
		String cart="abcd",period="abcd";
		System.out.println("select item");
		System.out.println("1.AndroidOne rs 20000");
		System.out.println("2.Yureka Rs.5000");
		Scanner sc=new Scanner(System.in);
		choice=sc.nextInt();
		switch(choice)
		{	case 1: price=15000;
					cart="AndroidOne";
					break;
			case 2: price=50000;
					cart="Yureka";
					break;
		}
		System.out.println("select the contract period");
		System.out.println("1. six months");
		System.out.println("2. one year");
		System.out.println("3. two years");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1: discount=10;
					cal.add(Calendar.DATE,180);
					period="six months";
					break;
			case 2: discount=20;
					cal.add(Calendar.DATE,365);
					period="one year";
					break;
			case 3: discount=50;		
					cal.add(Calendar.DATE,730);
					period="two years";
					break;
			default:System.out.println("Invalid input");
		}
		bill=price-(price*discount)/100;
		System.out.println("............invoice...........");
		System.out.println("billing date is "+date);
		System.out.println("product selected is"+cart);
		System.out.println("actual price is Rs."+price);
		System.out.println("contract period you selected is"+period);
		System.out.println("discount given is "+discount+"%");
		System.out.println("total amount to be paid is "+bill);
		System.out.println("contract end date is "+cal.getTime());
 }
}
