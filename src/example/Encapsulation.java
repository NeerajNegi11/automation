package example;

public class Encapsulation {
 
	private int bankaccount;
	private String name;
	private double acctbalance;
	
	public void setBankaccount(int bankaccount) 
	{
		this.bankaccount = bankaccount;
	}
	public int getBankaccount() {
		return bankaccount;
	}

	public void setAcctbalance(double acctbalance) {
		this.acctbalance = acctbalance;
	}
	public double getAcctbalance() {
		return acctbalance;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


}
