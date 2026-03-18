import java.util.*;
import java.io.*;

public class CheckingAccount implements HasMenu, Serializable {
	double balance;

	public static void main(String[] args){
		CheckingAccount ca = new CheckingAccount();
		ca.start();
	} // end main

	public CheckingAccount(){
		this.balance = 0d;
	} // end constructor
	
	public CheckingAccount(double balance){
		this.balance = balance;
	} // end constructor

	public String menu(){
		Scanner input = new Scanner(System.in);
		System.out.println("0) Quit ");
		System.out.println("1) Check Balance");
		System.out.println("2) Make a Deposit");
		System.out.println("3) Make a Withdrawal");
		System.out.println();
		System.out.print("Please enter 0-3: ");
		String response = input.nextLine();
		return response;
	} // end menu
	
	public void start(){
		boolean keepGoing = true;
		String response;
		while(keepGoing){
			response = menu();
			if (response.equals("0")){
				keepGoing = false;
			} else if (response.equals("1")){
				System.out.println(" Checking Balance... ");
			} else if (response.equals("2")){
				System.out.println(" Making a Deposit... ");
			} else if (response.equals("3")){
				System.out.println(" Making a Withdrawal... ");
			} else {
				System.out.println(" Please enter 0, 1, 2, or 3 ");
			} // end if
		} // end while
	} // end start
	
} // end class def

