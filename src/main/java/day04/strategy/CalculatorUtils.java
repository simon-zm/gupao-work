package day04.strategy;

public class CalculatorUtils
{
	private ICalculator calculator;

	public ICalculator getCalculator()
	{
		return calculator;
	}

	public void setCalculator(ICalculator calculator)
	{
		this.calculator = calculator;
	}

	public void execute(int num1, int num2)
	{
		calculator.doCalculator(num1, num2);
	}

	public CalculatorUtils(ICalculator calculator)
	{
		super();
		this.calculator = calculator;
	}
}
