package day01.simplefactory;

import day01.ICar;

public class SimpleFactoryTest
{
	public static void main(String[] args)
	{
		CarFactory factory = new CarFactory();
		ICar car = factory.createCar("BenZCar");
		car.printCarInfo();
	}
}
