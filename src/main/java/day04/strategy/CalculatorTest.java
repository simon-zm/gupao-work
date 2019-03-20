package day04.strategy;

public class CalculatorTest
{
	public static void main(String[] args)
	{
		CalculatorUtils calculator = new CalculatorUtils(new AddCalculator());
		calculator.execute(1, 2);
		calculator = new CalculatorUtils(new MultiplicationCalculator());
		calculator.execute(1, 2);
	}
}
