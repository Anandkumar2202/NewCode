package org.bank;

public class BankInfo extends AxisBank{
	private void savings () {
		System.out.println("savings");
	}
	private void fixed() {
		System.out.println("fixed");
	}
	public static void main(String[] args) {
		BankInfo b=new BankInfo();
		b.savings();
		b.fixed();
		b.deposit();
	}


}
