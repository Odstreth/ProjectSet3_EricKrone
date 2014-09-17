
public class Test {

	public static void main(String[] args) {
		Account test = new Account(1122, 20000, 4.5);
		try{
			test.withdraw(2500);
		}
		catch(InsufficientFundsException E){
			System.out.println(E.toString());
		}
		test.deposit(3000);
		System.out.println("The balance is: " + test.getBalance());
		System.out.println("The monthy interest rate is: " + test.getMonthlyInterestRate());
		System.out.println("The account was created on: " + test.getDateCreated());
		
		try{
			test.withdraw(30000);
		}
		catch(InsufficientFundsException E){
			System.out.println(E.toString());
		}
	}

}
