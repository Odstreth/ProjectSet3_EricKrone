
public class InsufficientFundsException extends Exception {

	/**
	 * I don't know what this serialVerisionUID is
	 */
	private static final long serialVersionUID = 1L;
	private double amount;

	public InsufficientFundsException(double amount){
		this.amount = amount;
	}
	
	@Override
	public String toString()
	{
		return "Balance is too low. Your account is short: " + this.amount;
	}
}
