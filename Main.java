package com.AssignmentDay;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Savings_Account save = new Savings_Account();
		Current_Account curr = new Current_Account();
		save.checkBankBalance();
		save.validateUser();
		curr.checkBankBalance();
		curr.validateUser();
		
		
		
	}

}
