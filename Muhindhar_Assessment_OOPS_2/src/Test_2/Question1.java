package Test_2;

import java.util.*;


class Customer {
	private int cusid;
	private String name;
	private char gender;
	
	
	public Customer(int cusid, String name, char gender) {
		this.cusid = cusid;
		this.name = name;
		this.gender = gender;
	}


	public int getId() {
		return cusid;
	}


	public void setId(int cusid) {
		this.cusid = cusid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Customer id=" + cusid ;
	}
 }
	
class account{
	private int id;
	private Customer customer;
	private double balance = 0.0;
	public account(int id, Customer customer, double balance) {
		super();
		this.id = id;
		this.customer = customer;
		this.balance = balance;
		
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	

	

public void withdraw(double amount){
	if(balance>=0) {
		balance-=amount;
		System.out.println(balance);
	}
	else {
		System.out.println("Amount withdrawn exceeds the current balance");
	}
}
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println(balance);
		}
	}
}


class Question1{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the account id : ");
		int id = sc.nextInt();
		
		System.out.println("Enter the customer id :");
		int custid = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the customer name : ");
		String name  = sc.nextLine();
		
		System.out.println("Enter the gender (m/f)");
		char gen = sc.next().charAt(0);
		
		System.out.println("Enter the balance");
		double bal = sc.nextDouble();
		
		Customer c = new Customer(custid,name,gen);
		
		account ac = new account(id,c,bal);
		boolean f = true;
		while(f) {
		System.out.println("PLEASE SELECT ONE OPTION FROM BELOW\r\n"
				+ "1.WITHDRAW\r\n"
				+ "2. DEPOSIT\r\n"
				+ "3. CHECK BALANCE\r\n"
				+ "4. EXIT ");
		int choice  = sc.nextInt();
		
		
	switch (choice){
	case 1:
		System.out.print("ENTER AMOUNT TO WITHDRAW: ");
		double withdraw = sc.nextDouble();
		ac.withdraw(withdraw);
		break;
	
	case 2:{
		System.out.print("ENTER AMOUNT TO DEPOSIT: ");
		double deposit = sc.nextDouble();
		ac.deposit(deposit);
		break;
	}
	case 3:{
		System.out.println("CURRENT BALANCE: "+ac.getBalance());
		break;
		
	}
	case 4:{
		if(choice==4)
		System.out.println("Thank You!");
		return;
			}
		}
	}
	}
}

