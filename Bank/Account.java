package Bank; 

public class Account {
	private int balance;
	 private static int accountNumberCounter = 1000;
	 private int accountNumber;
	 private String accountHolderName;
	 
	 public int getBalance(){
		 return this.balance;
	 }
	 
	 public int getAccountNumber(){
		 return this.accountNumber;
	 }
	 
	 public String getAccountHolderName(){
		 return this.accountHolderName;
	 }
	 
	 public Account(String customerName){
		 this(0,customerName);
	 }
	 
	 public Account(int openingBalance, String customerName){
		 accountNumberCounter++;
		 balance = openingBalance;
		 accountHolderName = customerName;
		 accountNumber = accountNumberCounter;
	 }
	 
	 public int depositAmount(int amount){
		 if(amount > 0)
		 {
			 balance += amount;
		 }
		 return balance;
	 }
	 
	 public int withdrawAmount(int amount){
		 if(amount > 0 && balance > 0)
		 {
			 balance -= amount;
		 }
		 return balance;
	 }
	 
	}
