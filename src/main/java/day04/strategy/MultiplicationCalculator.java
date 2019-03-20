package day04.strategy;

public class MultiplicationCalculator implements ICalculator
{
	public void doCalculator(int num1, int num2)
	{
		System.out.println(num1 * num2);
	}
}
