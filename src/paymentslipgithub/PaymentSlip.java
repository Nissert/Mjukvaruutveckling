package paymentslipgithub;

public class PaymentSlip {
	private String name;
	private int hourlyRate;
	private int hoursWorked;

	private final double tax = 0.7;

//Getter Setter operations

	public int calculateSalary() {
		return hoursWorked * hourlyRate;
	}

	public double calculateNetsalary() {
		return calculateSalary() * tax;
	}

	public String getName() {
		return name;
	}

	public int getHourlyRate() {
		return hourlyRate;
	}

	public int gethoursWorked() {
		return hoursWorked;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void sethourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public void sethoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

}



