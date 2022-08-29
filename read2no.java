import java.util.Scanner;
class demo
{
	int a,b;
	Scanner sc=new Scanner(System.in);
	
void read()
{
	System.out.print("enter value of a");
	a=sc.nextInt();
	System.out.print("enter value of b");
	b=sc.nextInt();
}

void display()
{
	System.out.println(a);
	System.out.println(b);
}
}

class prog1
{
	 public static void main(String args[])
	 {
	 	demo d1=new demo();
	 	d1.read();
	 	d1.display();
	 }
}