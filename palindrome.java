import java.util.Scanner;
 class palindrome
  {
  public static void main(String args[])
    {
	 Scanner s = new Scanner(System.in);
     System.out.print("Enter a number: ");
     int i = s.nextInt();
      int temp = i;    
	 int sum = 0;
	 int rem;
     while(i>0)
	   {    
        rem = i% 10;   
        sum = (sum*10)+rem;    
        i = i/10;    
       }    
      if(temp==sum)    
        System.out.println("Given number is Palindrome");    
      else    
        System.out.println("Given number is not a Palindrome");    
     }  
}
