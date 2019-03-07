package day01.factorymethod;

public class FactoryMethodTest
{
	public static void main(String[] args)
	{
		ICarFactory factory = new BenZFactory();
		factory.createCar().printCarInfo();
	}
}
