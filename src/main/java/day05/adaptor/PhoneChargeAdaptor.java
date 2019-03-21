package day05.adaptor;

public class PhoneChargeAdaptor implements IPhoneCharge
{
	private AndroidCharge androidCharge;

	public PhoneChargeAdaptor(AndroidCharge androidCharge)
	{
		this.androidCharge = androidCharge;
	}

	public void chargeIphone()
	{
		androidCharge.chargeAndriodPhone();
		System.out.println("加了转接头，可以给IPHONE充电了");
	}
}
