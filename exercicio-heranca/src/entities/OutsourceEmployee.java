package entities;

public class OutsourceEmployee  extends Employee{

	private double additionalCharge;

	
	public OutsourceEmployee() {
		super();// TODO Auto-generated constructor stub
	}
	
	
	public OutsourceEmployee(String name, Integer hours, Double valuePerHour, double additionalCharge) {
		super(name, hours, valuePerHour);
		this.setAdditionalCharge(additionalCharge);
	}

	public double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
}
