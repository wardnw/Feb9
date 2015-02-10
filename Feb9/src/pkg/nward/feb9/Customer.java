package pkg.nward.feb9;

public class Customer extends Person {
	
	private int custID;
	private String registDate;
	private String zipCode;
	private int discountPoints;
	

	
	public int getCustID() {
		return custID;
	}
	public void setCustID(int custID) {
		this.custID = custID;
	}
	public String getRegistDate() {
		return registDate;
	}
	public void setRegistDate(String registDate) {
		this.registDate = registDate;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public int getDiscountPoints() {
		return discountPoints;
	}
	public void setDiscountPoints(int discountPoints) {
		this.discountPoints = discountPoints;
	}

	public double calculateDiscount(double amount){
		double discount = amount - getDiscountPoints();
		return discount;
				
	}
	
	@Override
	public String toString(){
		String parentString = super.toString();
		return getCustID() + ", " + getRegistDate() + ", " + parentString;
	}
	
}
