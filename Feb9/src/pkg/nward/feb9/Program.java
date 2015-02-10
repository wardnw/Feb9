package pkg.nward.feb9;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c = new Customer();
		c.setName("Steve");
		c.setEmail("Steve@Steveconger.com");
		c.setPhone("1234567890");
		c.setZipCode("44240");
		c.setRegistDate("2/2/2012");
		
		HourlyEmployee e = new HourlyEmployee();
		e.setName("Nate");
		e.setDept("IT");
		e.setHireDate("2/12/2013");
		e.setRateOfPay(14);
		e.setHours(80);
		e.setEmail("nate@nate.org");
		
		System.out.println(c.toString());
		System.out.println(e.toString());
		
	}

}
