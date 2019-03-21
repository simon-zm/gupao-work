package day05.adaptor;

public class AdaptorTest
{
	public static void main(String[] args)
	{
		PhoneChargeAdaptor adaptor =
				new PhoneChargeAdaptor(new AndroidCharge());
		adaptor.chargeIphone();
	}
}
