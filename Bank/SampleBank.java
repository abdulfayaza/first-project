package Bank;

public class SampleBank {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Account accountObject1 = new Account("John Mayor");
		AccountList.addAccountToList(accountObject1);
		
		Account accountObject2 = new Account(5000, "Mary Roberts");
		AccountList.addAccountToList(accountObject2);
		
		ATMOperation atmSession1 =  new ATMOperation(1002);
		System.out.println(String.format("%d has balance: %d", 1002, atmSession1.getCustomerAccountbalance()));
		
		int updatedBalance = atmSession1.withdrawAmount(1000);
		System.out.println(String.format("%d has balance: %d", 1002, atmSession1.getCustomerAccountbalance()));

	}

}
