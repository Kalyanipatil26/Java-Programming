import java.util.Scanner;
class Palindrome
{   
  int r,sum=0,temp,a,n;  
  Scanner s=new Scanner(System.in); 
 void read()
 {
  System.out.print("Enter no :- ");
  n=s.nextInt();
 }
void display()
 {
  temp=n;    
  while(n>0){    
   r=n%10;  
   sum=(sum*10)+r;    
   n=n/10;    
  } 
  if(temp==sum)   
  {
   System.out.print("Number is palindrome");    
  }
  else    
  {
   System.out.print("Number is not palindrome");    
  }
 }
}
class demo
{
	public static void main(String args[])
	{
Palindrome p1=new Palindrome();
	p1.read();
	p1.display();
}
}
   	
public static void main(String args[])
    {
    	palindrome p=new palindrome();
    	p.read();
    	p.show();
    }
}
  }
