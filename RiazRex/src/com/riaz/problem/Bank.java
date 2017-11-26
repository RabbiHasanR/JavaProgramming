package com.riaz.problem;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SaveingAccount sa = new SaveingAccount(2000, 500);
		CurrentAccount ca = new CurrentAccount(5000, 5000);
		FRD frd = new FRD(10000, 5000, 6);
		Mudarab m = new Mudarab(3000, 400);
		// ca.deposit();
		// ca.withdraw();
		// sa.intarest();
		m.deposit();
		m.withdraw();
	}

}
