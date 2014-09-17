

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Account {

	/**
	 * @param args
	 */
	
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated = new GregorianCalendar().getTime();;
	
	public Account(){
		this.id = 0;
		this.balance = 0;
		this.annualInterestRate = 0;

	}
	
	public Account(int id, double balance){
		this.id = id;
		this.balance = balance;
		
	}
	
	
	public int getId(){
		return this.id;
	}
	
	public double getBalance(){
		return this.balance;
	}
	
	public void setAnnualInterestRate(double rate){
		this.annualInterestRate = rate/100;
	}
	
	public double getAnnualInterestRate(){
		return this.annualInterestRate;
	}
	
	public Date getDateCreated(){
		return dateCreated; 
	}
	
	public double getMonthlyInterestRate(){
		return this.annualInterestRate/12;
	}
	
	public void withdraw(double amount)throws InsufficientFundsException{
		if(balance <= amount){
			throw new InsufficientFundsException(amount-balance);	
		}
		else{
			balance -= amount;
		}
		
	}
		
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
}
