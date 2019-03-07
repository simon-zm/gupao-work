package day01.abstractfactorymethod;

import day01.ICar;

public interface ICarCreateFactory
{
	ICar createMvpCar();

	ICar createSportCar();
}
