package day04.delegate;

public class TiQiangWorker implements IWorker
{
	public void doSome(String doType)
	{
		System.out.println("我是砌墙工，负责" + doType);
	}
}
