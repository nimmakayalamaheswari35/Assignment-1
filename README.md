# Assignment-1
 
Employee Details

Simple Code written to take the no.of  Employee details according to the user selection.

It is a program with a business logic and real entity.
In business logic we have given the properties like name,age,salary and designation of Employees.

Before creating the class in order for to take input from user we use Scanner class so importing Scanner is mandatory

    import java.util.Scanner;
##Emp class

In Emp class all the Parameters(states) are declared.
        
        String name;
       String design; 
      int name; 
       int age;
  Input is taken from the user by using Scanner object.(t)

       Scanner t=new Scanner(System.in);
And the methods(behaviours) to create the employee details are

read(),display(),raiseSal are defined as follows

read()

    void read()

       {
       System.out.println("Enter Name:");
     name=t.next();
    System.out.println("Enter Age:");
     age=sc.nextInt();
    System.out.println("Enter Salary:");
     sal=sc.nextInt();
    System.out.println("Enter design:");
    design=t.next();
    }
This method is written(used) to get/read the details of Employee.

Like the name age,sal, design of the Employee by using the methods in Scanner class like

        t.next();            ->for a string value(for example design & name here)
        t.nextInt();         ->for integer value
    display()

     void display()
     {
     System.out.println("Name:"+name);
     System.out.println("Age:"+age);
     System.out.println("Salary:"+sal);
     System.out.println("Designation:"+design);
     }
								
								
This method is gives/displays the record of the employee. 
   raise()
void raise()
     {
     sal=sal/1000;
     System.out.println("Salary raised ");
     }
In this method the logic is written to make hike in salary by 1000. and the sal is displayed along with the message that the Salary is raised

#MAIN CLASS

In the Main class.... variable choice is declared in order to give user the choice to choose the options and a Boolean variable is declared.

int c; boolean b=false; Emp m=null;

In the main method we make use of nextInt() of Scanner class to take users choice(integer format)
1.Create

2.Display

3.Raise salary

4.Exit

Enter choice
These are going to be displayed as menu to the user so that the user can make a choice that is kept in iterative statement for user felxibility and the choices are kept in switch case.

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
        
     case 2:  if(b) for(int j=0;j<m.length;j++)
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

![2021-05-17 (7)](https://user-images.githubusercontent.com/84019315/118486247-059a1380-b737-11eb-90ae-14c28f21c2d7.png)
![2021-05-17 (5)](https://user-images.githubusercontent.com/84019315/118485622-48a7b700-b736-11eb-91ab-9615c4bec4a6.png)
![2021-05-17 (6)](https://user-images.githubusercontent.com/84019315/118485741-68d77600-b736-11eb-9349-dd431fa11f49.png)




