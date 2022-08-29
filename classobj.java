import java.util.Scanner;
class student
{
String stclass;
String stname;
int rollno;
void read()
{
Scanner s=new Scanner(System.in);
System.out.print("Enter the student class:");
stclass=s.next();
System.out.print("Enter the student name:");
stname=s.next();
System.out.print("Enter the student rollno:");
rollno=s.nextInt();
}
void display()
{
System.out.println("-----------------------------------------------------------------");

System.out.println("student class is :"+stclass);
System.out.println("student name is:"+stname);
System.out.println("student rollno is:"+rollno);
}
public static void main(String args[])
{
student a=new student();
student a1=new student();
a.read();
a1.read();
a.display();
a1.display();
}
}