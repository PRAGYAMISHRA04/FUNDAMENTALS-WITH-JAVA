import java.util.*;
class Employee
{
 String eName;
 int eId;
 double sal;
 String joining;
 Employee(String eName,int eId,double sal,String joining)
 {
 this.eName=eName;
 this.eId=eId;
 this.sal=sal;
this.joining=joining;
 }
 void display()
 {
 System.out.println("\n\nEmployee Name : "+eName);
 System.out.println("Employee ID: "+eId);
 System.out.println("Salary : "+sal);
 System.out.println("Date Of Joining : "+joining);
 }
 public static void main(String args[])
 {
 Scanner inp=new Scanner(System.in);
 System.out.println("Enter n");
 int n=inp.nextInt();
 String dum=inp.nextLine();
 Employee employee[]=new Employee[n];
 for(int i=0;i<n;i++)
 {
 System.out.println("Enter name");
 String eName=inp.nextLine();
 System.out.println("Enter employee id");
 int eId=inp.nextInt();
 System.out.println("Enter sal");
 double sal=inp.nextDouble();
 String d=inp.nextLine();
 System.out.println("Enter joining date"); 
 String joining=inp.nextLine();
 employee[i]=new Employee(eName,eId,sal,joining);
 }
 System.out.println("\nEmployees with sal less than 100000:");
 for(int i=0;i<n;i++)
 {
 if(employee[i].sal<100000)
 {
 System.out.println("Name: "+employee[i].eName+"\tEmp ID: "+employee[i].eId);
 }
 }
 String names[]=new String[n];
 for(int i=0;i<n;i++)
 {
 names[i]=employee[i].eName;
 }
 String t;
 for(int i=0;i<n-1;i++)
 {
 for(int j=0;j<n-1;j++)
 {
 if(names[j].compareTo(names[j+1])>0)
 {
 t=names[j];
 names[j]=names[j+1];
names[j+1]=t;
 }
 }
 }
 System.out.println("\nSorted Names:");
 for(int i=0;i<n;i++)
 {
 System.out.println(names[i]);
 }
 Employee e;
 for(int i=0;i<n-1;i++)
 {
 for(int j=0;j<n-1;j++)
 {
 if(employee[j].sal>employee[j+1].sal)
 {
 e=employee[j];
 employee[j]=employee[j+1];
 employee[j+1]=e;
 }
 }
 }
 System.out.println("\n\n Details of employee in ascending order of salary :");
 for(int i=0;i<n;i++)
 {
 employee[i].display();
 }
}
}
