package day01.abstractfactorymethod;

public class AbstractfactoryMethodTest
{
	public static void main(String[] args)
	{
		ICarCreateFactory factory = new BenZCarFactory();
		factory.createMvpCar().printCarInfo();
		factory.createSportCar().printCarInfo();
	}
}
