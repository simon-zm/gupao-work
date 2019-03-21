package day05.template;

public class JeonDecorateHouse extends DecorateHouse
{
	@Override
	public boolean isContainMaterail()
	{
		return true;
	}

	public static void main(String[] args)
	{
		JeonDecorateHouse house = new JeonDecorateHouse();
		house.doDecorateHouse();
	}
}
