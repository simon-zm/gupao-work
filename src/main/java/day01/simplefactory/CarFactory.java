package day01.simplefactory;

import day01.BenZCar;
import day01.BmwCar;
import day01.ICar;

public class CarFactory
{
	public ICar createCar(String carName)
	{
		if (carName.equals("BenZCar"))
		{
			return new BenZCar();
		}
		else if (carName.equals("BwmCar"))
		{
			return new BmwCar();
		}
		return null;
	}
}
