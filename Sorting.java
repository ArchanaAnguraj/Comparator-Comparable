
package ONLINEVDOS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;


//1.compareTo()-----Comparable


class Employee implements Comparable<Employee>{ //for get compare method we implements comparable and override it why we give employee its generics
	private int id;
	private String name;
	private String dept;
	private int salary;
	
	public Employee()
	{
		
	}
	public Employee(int id,String name,String dept,int salary)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" "+id;
}
	@Override
		public int compareTo(Employee e2) {
			
			Employee e1=this;
//			Integer id1=e1.id;
//			Integer id2=e2.id;          //based on the id sorting
			
//			if(id1>id2)
//				return 1;
//			else if(id1<id2)        // 1 way
//				return -1;
//			else return 0;
			
			
//			
//			int n=id1.compareTo(id2); //2way by using integer compare to internaly
//			return n;
			
//			String id1=e1.name;
//			String id2=e2.name;
//			
//			int n=id1.compareTo(id2);
//			return n;
			
			
			return e1.name.compareTo(e2.name);    //we cant give like these  for integer (id)--because its primitive
		}                                         //String--automaticaly object
}



public class Sorting {

	public static void main(String[] args) {
    ArrayList<Employee> a=new ArrayList<Employee>();	
    Employee e1=new Employee(2, "tim","it",10000);
    Employee e2=new Employee(1, "archu","it",20000);   //get input by programmer
    Employee e3=new Employee(4,"mia","it",100000);
    Employee e4=new Employee(3,"tom","it",100000);
   a.add(e1);
   a.add(e2);
   a.add(e3);
   a.add(e4);
   System.out.println(a);
   Collections.sort(a); //we cant sort without creatig compare to
		
   System.out.println(a);
		
		
	//get input from user	
		Scanner sc=new Scanner(System.in);
		ArrayList<Employee> a1=new ArrayList<Employee>();
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
		Employee e=new Employee();
		System.out.println("Enter the details");
		String input=sc.nextLine();
		String[]a=input.split(",");
		int id=Integer.parseInt(a[0]);  //convert String to int why because we store String array..but set id return type is int so string -int doesnot work
		e.setId(id);
                e.setName(a[1]);
                e.setDept(a[2]);
                e.setSalary(Integer.parseInt(a[3]));
                a1.add(e);
		}
	
	       Collections.sort(a1);   //if we use treeset dont give compare method its automaticaly doing
	      System.out.println(a1);

	}
	

}

//-----------------------------------------------//
//2.compare()-----Comparator

class Employee{
	private int id;
	private String name;
	private String email;
	private String dept;
	private int salary;
	

	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee()
	{
		
	}
	public Employee(int id,String name,String dept,int salary)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
		
	}
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}

	public String getDept() {
		return dept;
	}

	public int getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
	
		return id+" "+name+" "+email+" "+dept+" "+salary;
	}
}
class Demo1 implements Comparator<Employee>
{


	@Override
	public int compare(Employee e1,Employee e2) {
		
		Integer i1=e1.getId();
		Integer i2=e2.getId();
		
		return i1.compareTo(i2);
	}
}
class Demo2 implements Comparator<Employee>
{

	@Override
	public int compare(Employee e1,Employee e2){
		return e1.getName().compareTo(e2.getName());
	}
	
}
class Demo3 implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getEmail().compareTo(o2.getEmail());
	}
	
}

class Demo4 implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getDept().compareTo(o2.getDept());
	}
	
}
class Demo5 implements Comparator<Employee>
{
	@Override
	public int compare(Employee o1, Employee o2) {
		Integer i1=o1.getSalary();
		Integer i2=o2.getSalary();
		
		return i1.compareTo(i2);
	}
}

public class Sorting {

	public static void main(String[] args) {
		    Demo1 d1=new Demo1();
		    Demo2 d2=new Demo2();
		    Demo3 d3=new Demo3();
		    Demo4 d4=new Demo4();
		    Demo5 d5=new Demo5();
		    
		    TreeSet <Employee>ts=null;
		   Scanner sc=new Scanner(System.in); 
		   System.out.print("SORTING BASED ON \n 1.id\n 2.name\n 3.Email\n 4.Salary");
		   int option =sc.nextInt();
        
            
            switch(option)
            {
            case 1:ts=new TreeSet<Employee>(d1);
            	break;
            case 2:ts=new TreeSet<Employee>(d2);
            	break;
            case 3:ts=new TreeSet<Employee>(d3);
            	break;
            case 4:ts=new TreeSet<Employee>(d4);
            	break;
            case 5:ts=new TreeSet<Employee>(d5);
            	break;
            	default:System.out.println("invalid input");
            	break;
            
            }
            System.out.println("Enter the number of employee");
            int n=sc.nextInt();
            sc.nextLine();
		    for(int i=0;i<n;i++) {
			Employee e=new Employee();
			System.out.println("Enter the details");
			String input=sc.nextLine();
			String[]a=input.split(",");
			int id=Integer.parseInt(a[0]); 
			e.setId(id);
	        e.setName(a[1]);
	        e.setEmail(a[2]);
	        e.setDept(a[3]);
	        e.setSalary(Integer.parseInt(a[4]));
	        ts.add(e);
		  }
		    System.out.println(ts);
		   
		
	}
}

















