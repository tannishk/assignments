package assignments;
import java.util.Scanner;
class cart
{
    String items[] =  {"RAM","MOUSE","KEYBOARD","MONITER","CHIP"};
    int price[] = new int[5];
    String incart[] = new String[10];
    int total,index=0;
    int count;
    cart()
    {
        for(int i=10;i<=50;i=i+10)
        {
            price[(i/10)-1]=i;
        }
    }
    void display()
    {
        System.out.println("Following items are avaliable");
        for(int i=0;i<5;i++)
        {
            System.out.println(items[i] +" --  rs" + price[i]);
        }
    }
    void input()
    {
        System.out.println("Select the item number");
        Scanner input= new Scanner(System.in);
        int choice = input.nextInt();
        total = total + price[(choice - 1)];
        incart[index] = items[(choice - 1)];
        index++;
    }
    void cart_display()
    {
        for(int i=0;i<index;i++)
        {
            System.out.println(incart[i]);
        }
        System.out.println("Total is "+total);
    }
}
public class assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Welcome to shop folks");
	        Scanner input= new Scanner(System.in);
	        int choice = 1;
	        cart c = new cart();
	        while(choice == 1)
	        {
	        	c.display();
	        	c.input();
	        	System.out.print("Want to enter more 1 -- yes or 0 -- no");
	        	choice = input.nextInt();
	        	
	        }
	        c.cart_display();
	        System.out.println("Thank you for using my cart");
	        input.close();
			}

}
