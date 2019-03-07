package day01.factorymethod;

import day01.BenZCar;
import day01.ICar;

public class BenZFactory implements ICarFactory
{
	public ICar createCar()
	{
		return new BenZCar();
	}
}
