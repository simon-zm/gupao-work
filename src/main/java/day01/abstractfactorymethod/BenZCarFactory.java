package day01.abstractfactorymethod;

import day01.ICar;

public class BenZCarFactory implements ICarCreateFactory
{
	public ICar createMvpCar()
	{
		// TODO Auto-generated method stub
		return new BenZMvpCar();
	}

	public ICar createSportCar()
	{
		// TODO Auto-generated method stub
		return new BenZSportCar();
	}
}
