package bankingfinance;

public class Main {

	public static void main(String[] args) {
		BankDataCenter bank = new BankDataCenter();
		
		bank.add(new User(101,"ASDF1231","ravi",42000));
		bank.add(new User(101,"FDSA1296","allu",32900));
		bank.add(new User(101,"HJGK1265","kali",100));
		bank.add(new User(101,"KGJS1212","lucky",40000));
		bank.add(new User(101,"LKSC1223","sona",89000));
		bank.add(new User(101,"MNVB3483","alice",1000));
		
		
		
		/*
		 	1.Use lambda to check minimum balance rule.

			2.Use lambda to calculate simple interest.
			
			3.Use lambda to validate withdrawal amount.
			
			4.Use lambda to print account details.
			
			5.Use lambda to compare two account balances.
		 */
		
		System.out.println("1.Use lambda to check minimum balance rule.");
		bank.list.stream()
					.filter(User-> User.getAmount()<2500)
					.forEach(x-> System.out.println(x.getAccoundHolderName() +" your amount "+x.getAmount()+ " please mentain amound at least 2500"));
		
		
		System.out.println("\n2.Use lambda to calculate simple interest.");
		bank.list.stream()
					.forEach(x-> System.out.println("Account Number : "+x.getAccountNumber()+" and simple intrest: " + (x.getAmount()*10*5)/100));
		
		
		System.out.println("\n3.Use lambda to validate withdrawal amount.");
		double withdrawAmount = 3932;
		String accountNumber = "KGJS1212";
		
		bank.list.stream()
					.filter(Bank-> Bank.getAccountNumber().equalsIgnoreCase(accountNumber))
					.forEach(x-> {
						double amount = x.getAmount();
						if(!(withdrawAmount<=amount)) {
							System.out.println("Amount is invalid!");
						}else {
							x.setAmount((amount-withdrawAmount));
							System.out.println("Withdraw success");
						}
					});
		
		
		System.out.println("\n4.Use lambda to print account details.");
		bank.list.stream()
					.forEach(System.out::println);
		
		
		System.out.println("\n5.Use lambda to compare two account balances.");
		User u1 = bank.list.get(0);
		User u2 = bank.list.get(4);
		
		
		int result = Double.compare(u1.getAmount(), u2.getAmount());
		
		if(result>0) {
			System.out.println(u1.getAccoundHolderName()+ " has higher blance than "+u2.getAccoundHolderName());
		}else {
			System.out.println(u1.getAccoundHolderName()+ " has higher blance than "+u2.getAccoundHolderName());
		}
	}
}
