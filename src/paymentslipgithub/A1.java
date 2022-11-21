package paymentslipgithub;

import java.util.Scanner;

public class A1 {
	public static void main(String[] args) {
		PaymentSlip employee1 = new PaymentSlip();

		Scanner myScanner = new Scanner(System.in);

		System.out.println("Please enter name of employee");

		String name = myScanner.nextLine();

		employee1.setName(name);

		System.out.println("Enter the employee´s hourly rate");

		int hourlyRate = myScanner.nextInt();

		employee1.sethourlyRate(hourlyRate);

		System.out.println("How many hours has the employee worked this month?");

		int hoursWorked = myScanner.nextInt();

		employee1.sethoursWorked(hoursWorked);

		// myScanner.close();

		System.out.println("--------------------");

		System.out.println("##Payment information##");

		System.out.println("Name:          \t \t" + employee1.getName());

		System.out.println("Hourly rate:  \t \t" +  "$" + employee1.getHourlyRate());

		System.out.println("Hours worked: \t \t" + employee1.gethoursWorked());

		System.out.println("\t");
		

		System.out.println("Salary before tax: \t" +  "$" + employee1.calculateSalary());

		System.out.println("Salary after tax:  \t" +  "$" + employee1.calculateNetsalary());
		System.out.println("\t");

		System.out.println("If you have any questions regarding your salary, contact Bob");
		System.out.println("--------------------");

	}

}


