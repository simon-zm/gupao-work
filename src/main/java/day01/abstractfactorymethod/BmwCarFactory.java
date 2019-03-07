package day01.abstractfactorymethod;

import day01.ICar;

public class BmwCarFactory implements ICarCreateFactory
{
	public ICar createMvpCar()
	{
		// TODO Auto-generated method stub
		return new BmwMvpCar();
	}

	public ICar createSportCar()
	{
		// TODO Auto-generated method stub
		return new BmwSportCar();
	}
}
