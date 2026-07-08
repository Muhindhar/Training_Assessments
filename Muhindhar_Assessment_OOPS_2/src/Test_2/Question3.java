package Test_2;
import java.util.*;
class employee{
	int employeeId;
	String name;
	String designation;
	double salary;
	public employee(int employeeId, String name, String designation, double salary) {
		this.employeeId = employeeId;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	public void display() {
		System.out.println("Employee id : "+ employeeId);
		System.out.println("Employee name : "+name);
		System.out.println("Employee designation : "+designation);
		System.out.println("Employee salary : "+salary);
	}
	
	public void increaseSalary(double percentage) {
		salary=salary+(salary*(percentage/100));
	}
	public void increaseSalary(double percentage, double bonus) {
		salary=salary+(salary*(percentage/100))+bonus;
	}	
}
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();  

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Designation: ");
        String designation = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        employee emp = new employee(id, name, designation, salary);
        emp.display();
 
        System.out.println("1. Increase the salary by percentage");
        System.out.println("2. Increase the salary by percentage and bonus");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {

        case 1:
        	System.out.println("Enter hike percentage:");
        	double h = sc.nextDouble();
        	emp.increaseSalary(h);
        	break;

        case 2:
        	System.out.println("Enter hike percentage:");
        	double h1 = sc.nextDouble();
        	System.out.println("Enter bonus amount:");
        	double h2 = sc.nextDouble();
        	emp.increaseSalary(h1, h2);
        	break;

        default:
        	System.out.println("Invalid choice");
        }

        System.out.println("Updated Details:");
        emp.display();
	}
}
