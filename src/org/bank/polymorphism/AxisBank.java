package org.bank.polymorphism;

public class AxisBank extends BankInfo{
	@Override
	public void deposit() {
		 System.out.println("Deposit:6779");
	}
public static void main(String[] args) {
	AxisBank a=new AxisBank();
	a.deposit();
	a.fixed();
	a.savings();
	
}
}
