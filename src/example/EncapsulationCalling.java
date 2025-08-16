package example;

public class EncapsulationCalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation obj = new Encapsulation();
		obj.setBankaccount(111555);
		int account = obj.getBankaccount();
		System.out.println(account);
		obj.setAcctbalance(165656.89);
		double balance = obj.getAcctbalance();
		System.out.println(balance);
		obj.setName("Neeraj");
		String name = obj.getName();
		System.out.println(name + " account number is " + account+ " having balance " + balance);
		
	}

}
