import java.util.Scanner;
class Emp
{
String name,design;
int age,sal;
Scanner t=new Scanner(System.in);

void read(){
System.out.println("\nEnter Name");
name=t.next();
System.out.println("Enter Age");
age=t.nextInt();
System.out.println("Enter Salary");
sal=t.nextInt();
System.out.println("Enter designation");
design=t.next();
}
void display(){
System.out.println("Name:"+name);
System.out.println("Age:"+age);
System.out.println("Salary:"+sal);
System.out.println("Designation:"+design);
}
void raise()
{
sal=sal/1000;
System.out.println("Salary Raised....");
}
}
public class Employee{
public static void main(String[] args){
Scanner t=new Scanner(System.in);
Emp[] m=null;
int c;
boolean b=false;
do{
System.out.println("\n1.Create");
System.out.println("2.Display");
System.out.println("3.Raised Salary");
System.out.println("4.Exit");
System.out.println("Enter your choice");
c=t.nextInt();
switch(c){
case 1:
      

          System.out.println("How many employees are you going to be entering?:");
          int length=t.nextInt();
          m=new Emp[length];
          for(int i=0;i<m.length;i++) 
          m[i]=new Emp();
          for(int j=0;j<m.length;j++)
          m[j].read();
         
      
        b=true;
        break;
        
case 2: if(b) for(int j=0;j<m.length;j++)
        m[j].display();
       
       else
       System.out.println("\nNo data...");
        break;
case 3: if(b) for(int j=0;j<m.length;j++)
      m[j].raise();
       else
       System.out.println("\nNo data...");
       break;
         }
}
while(c<4);
}
}


         

