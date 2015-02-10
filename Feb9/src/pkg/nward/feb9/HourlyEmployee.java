package pkg.nward.feb9;

public class HourlyEmployee extends Employee {

	private double rateOfPay;
	private int hours;
	private String status;
	
	
	
	@Override
	public double calculateMonthlyPay() {
		// TODO Auto-generated method stub
		return getRateOfPay() * getHours();
	}

	

	public int getHours() {
		return hours;
	}



	public void setHours(int hours) {
		this.hours = hours;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public double getRateOfPay() {
		return rateOfPay;
	}



	public void setRateOfPay(double rateOfPay) {
		this.rateOfPay = rateOfPay;
	}
	
	public String toString(){
		String parentString = super.toString();
		return parentString + rateOfPay + Double.toString(calculateMonthlyPay());
	}
	
}
