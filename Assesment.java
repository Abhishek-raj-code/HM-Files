import java.util.*;
 
abstract class Employee{
    String name;
    int id;
    String des;
    float salary;
    Employee(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the name:");
         name = sc.next();
        System.out.println("Enter the id:");
         id = sc.nextInt();
    }
    public void display(){
        System.out.println("Name:"+name);
        System.out.println("Designation:"+des);
        System.out.println("id:"+id);
        System.out.println("salary:"+salary);
     }
     public void raise_salary(){
        salary = salary + (10/100)*salary;
        System.out.println(salary);
     }
 
}
 
class Dev extends Employee{
    
    Dev(){
         des="Developer";
      salary=200000;
    }
    
}
 
class Clerk extends Employee{
    
    Clerk(){
         des="Clerk";
    
     salary=100000;
    }
     
}
class Tester extends Employee{
    Tester(){
        des ="Tester";
        salary=50000;
    }
}
class Manager extends Employee{
    Manager(){
    des="Manager";
    salary=80000;
    }
}
/**
* Assesment
*/
public class Assesment {
 
    public static void main(String[] args)
        
        {
            int ch1,ch2=0;
            Tester t=null;
            Dev d = null;
            Manager m= null;
            Clerk c = null;
            do{
                System.out.println("1) Create");
                System.out.println("2) Display");
                System.out.println("3) Raise Salary");
                System.out.println("4) Exit");
    
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the choice :");
                ch1= sc.nextInt();
            
                if(ch1==1)
                {
                    do{
                        System.out.println("1) Developer");
                        System.out.println("2) Clerk");
                        System.out.println("3) Manager");
                        System.out.println("4) Tester");
                        System.out.println("5) Exit");
    
                        System.out.print("Enter the choice :");
                         ch2= sc.nextInt();
            
                        if(ch2==1)
                        {
                            d = new Dev();
                        }
                        if(ch2==2)
                        {
                            c = new Clerk();
                        }
                        if(ch2==3)
                        {
                            m = new Manager();
                        }
                        if(ch2==4)
                        {
                            t = new Tester();
                        }
                        if(ch2==5){
                            break;
                        }
                    }while(ch1!=5);
                }
                if(ch1==2)
                {
                    do{
                        System.out.println("1) Developer");
                        System.out.println("2) Clerk");
                        System.out.println("3) Manager");
                        System.out.println("4) Tester");
    
                        System.out.println("5) Exit");
    
                        System.out.print("Enter the choice :");
                         ch2= sc.nextInt();
            
                        if(ch2==1)
                        {
                            d.display();
                        }
                        if(ch2==2)
                        {
                            c.display();
                        }
                        if(ch2==3)
                        {
                            m.display();
                        }
                        if(ch2==4)
                        {
                            t.display();
                        }
                        if (ch2==5){
                            break;
                        }
                    }while(ch1!=5);     
                }
                if(ch1==3)
                {
                    do{
                        System.out.println("1) Developer");
                        System.out.println("2) Clerk");
                        System.out.println("3) Manager");
                        System.out.println("4) Tester");
    
                        System.out.println("5) Exit");
    
                        System.out.print("Enter the choice :");
                         ch2= sc.nextInt();
            
                        if(ch2==1)
                        {
                            d.raise_salary();
                        }
                        if(ch2==2)
                        {
                            c.raise_salary();
                        }
                        if(ch2==3)
                        {
                            m.raise_salary();
                        }
                        if(ch2==4)
                        {
                            t.raise_salary();
                        }
                        if(ch2==5){
                                break;
                        }
                    }while(ch1!=5);
                }
                if(ch1==4)
                {
                    System.out.println("Thank You");
                    System.exit(0);
                }
    
            }while(ch1!=4);
            
        }
    
 
 
    }