//project with polymorphism and inheritance
import java.util.Scanner;
class BankAccount{	
	private static int balance;
  void deposit(int balance){
	this.balance = balance + this.balance;
		System.out.println("Your current balance is "+ this.balance +"rs"); 
  }										
  void withdraw(int balance){
		this.balance = this.balance-balance;
		if(this.balance <= 0){
        System.out.println("Your balance is low pls deposit first"); } 
		else {
		System.out.println("Your current balance is "+ this.balance +"rs");
	  }											
}
  public void showBalance() {
	  System.out.println("Your current balance is "+ this.balance +"rs");
	  
  }
}
															
class HDFCBankAccount extends BankAccount{
	private static int balance;
  void deposit(int balance){
	this.balance = balance + this.balance;
		System.out.println("Your current balance in HDFC bank is "+ this.balance +"rs"); 
  }									
  void withdraw(int balance){
	this.balance = this.balance-balance;
		if(this.balance <= 0){
        System.out.println("Your balance is in HDFC bank low pls deposit first"); } 
		else {
		System.out.println("Your current balance in HDFC bank is "+ this.balance +"rs");
  }										
}
  public void showBalance() {
	  System.out.println("Your current balance in HDFC bank is "+ this.balance +"rs");
	  
  }
}
																	
class ICICIBankAccount extends BankAccount{		
	private static int balance;
	void deposit(int balance){
		this.balance = balance + this.balance;	
		System.out.println("Your current balance in ICICI bank is "+ this.balance +"rs"); 
	}											
	void withdraw(int balance){
		this.balance = this.balance-balance;
		if(this.balance <= 0){
        System.out.println("Your balance in ICICI bank is low pls deposit first"); } 
		else {
		System.out.println("Your current balance in ICICI bank is "+ this.balance +"rs");
	}											
}
	public void showBalance() {
		  
		System.out.println("Your current balance in ICICI bank is "+ this.balance +"rs");	  
	  }
}
											
class SBIBankAccount extends BankAccount{
	private static int balance;
	void deposit(int balance){
		this.balance = balance + this.balance;	
		System.out.println("Your current balance in SBI bank is "+ this.balance +"rs"); 
	}				
	void withdraw(int balance){
		this.balance = this.balance-balance;
		if(this.balance <= 0){
        System.out.println("Your balance is in SBI bank is low pls deposit first"); } 
		else {
		System.out.println("Your current balance in SBI bank is "+ this.balance +"rs"); }
		
	}
	public void showBalance() {
		System.out.println("Your current balance in SBI bank is "+ this.balance +"rs");
		  
	  }
	
}
	
	class ATM {
	void deposit(BankAccount acc) {
		System.out.print("Please enter the amount to deposit");
		Scanner scn2 = new Scanner(System.in);
	acc.deposit(scn2.nextInt());
	}
	void withdraw(BankAccount acc){
		System.out.print("Please enter the amount to withdraw");
		Scanner scn3 = new Scanner(System.in);
	acc.withdraw(scn3.nextInt());
	}
	void showBalance(BankAccount Acc) {
		Acc.showBalance();
	}
	}
class Customer {
  public static void main(String[] args) {
	  ATM atm = new ATM();
	  Scanner scn1 = new Scanner(System.in);
	  while(1 == 1){
		  System.out.println("Please select:\n1: deposite money \n2: withdraw money  \n3: show current balance ");
		  int opn = scn1.nextInt();
		  
		  if(opn == 1){ 
		  	System.out.println("Please select bank for depositing money \n 1: HDFC \n 2: ICICI \n 3: SBI");
		      int opn2 = scn1.nextInt();
		  	if(opn2 == 1){
		  atm.deposit(new HDFCBankAccount()); 
		  	} else if(opn2 == 2){
		  atm.deposit(new ICICIBankAccount());
		  	}  else if(opn2 == 3) {
		  atm.deposit(new SBIBankAccount()); }
		  } 
		  
		  else if(opn == 2) {
		  	System.out.println("Please select bank for withdrawing money \n 1: HDFC \n 2: ICICI \n 3: SBI");
		      int opn3 = scn1.nextInt();
		  	if(opn3 == 1){
		  atm.withdraw(new HDFCBankAccount());
		  }
		  else if(opn3 == 2) {
		  atm.withdraw(new ICICIBankAccount());
		  	  }
		  	  else if(opn3 == 3) {
		  atm.withdraw(new SBIBankAccount());
		  	  }
		  }
		  
		  else if(opn == 3) {
			  System.out.println("Please select bank to show balance \n 1: HDFC \n 2: ICICI \n 3: SBI");
			  int opn4 = scn1.nextInt();
			  if(opn4 == 1){
				  atm.showBalance(new HDFCBankAccount());
				  }
				  else if(opn4 == 2) {
				  atm.showBalance(new ICICIBankAccount());
				  	  }
				  	  else if(opn4 == 3) {
				  atm.showBalance(new SBIBankAccount());
				  	  }
			  
			  
			 
		  }
		  	  }
  }
}
	  

