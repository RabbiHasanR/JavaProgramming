package com.qus.solve5;

public class Businessman {
	public double asset = 20000000;
	public double oneCarValue = 10000;
	public double oneYearEarning;
	public double oneYearCost;

	public long earning() {
		double oneMonthProfitFromAsset = asset * 0.05;
		double oneYearProfitFromAsset = oneMonthProfitFromAsset * 12;

		String a = String.valueOf(200);
		double oneDaySellCar = 10000 * 3;
		double monthlySellCar = oneDaySellCar * 30;
		double yearlySellCar = monthlySellCar * 12;
		return (long) (oneYearEarning = (oneYearProfitFromAsset + yearlySellCar));
	}

	public double cost() {
		double monthlyPayforSoftwareCompany = 70000;
		double yearlyPayForSoftwareCompany = monthlyPayforSoftwareCompany * 12;

		double payBasicSalary = 500;
		double monthlySalary = 500 * 7 * 30;
		double payYearlySalary = monthlySalary * 12;
		return oneYearCost = (yearlyPayForSoftwareCompany + payYearlySalary);
	}

	public void display() {
		long yearlyProfit = (long) (earning() - cost());
		System.out.println("Yealy Earning=" + earning());
		System.out.println("Yearly Cost=" + cost());
		System.out.println("Yearly Profit=" + yearlyProfit);

	}

}
