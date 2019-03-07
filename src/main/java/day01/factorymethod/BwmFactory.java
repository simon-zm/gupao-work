package day01.factorymethod;

import day01.BmwCar;
import day01.ICar;

public class BwmFactory implements ICarFactory
{
	public ICar createCar()
	{
		return new BmwCar();
	}
}
