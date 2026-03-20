import java.util.*;
import java.io.*;

public class Customer extends User implements Serializable {
	static final long serialVersionUID = 1L;

	CheckingAccount checking = new CheckingAccount();
	SavingsAccount savings = new SavingsAccount();

	public static void main(String[] args){
		Customer c = new Customer();
		if (c.login()){
			System.out.println("Login was successful");
			//this.getReport();
		} // end if
	} // end main
	
	public Customer(){
		this.userName = "Alice";
		this.PIN = "1111";
	} // end constructor
	
	public Customer(String userName, String PIN){
		this.userName = userName;
		this.PIN = PIN;
	} // end Customer
	
	public String getReport(){
		String report = "User: " + this.getUserName();
		report += " , Checking: " + this.checking.getBalanceString();
		report += " , Savings: " + this.savings.getBalanceString();
		return report;
	} // end getReport
	
	public void start(){
		// don't do anything yet
	} // end start
	
	public String menu(){
		// finish later
		return " ";
	} // end menu

} // end class def
