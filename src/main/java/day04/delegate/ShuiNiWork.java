package day04.delegate;

public class ShuiNiWork implements IWorker
{
	public void doSome(String doType)
	{
		System.out.println("我是水泥工，负责" + doType);
	}
}
