package day06.observer;

public class GuavaTest
{
	public static void main(String[] args)
	{
		GuPer gper = GuPer.getInstance();
		gper.register(new Teacher("mic"));
		gper.register(new Teacher("tom"));
		gper.post(new Question("jeon", "怎么做一个架构师"));
	}
}
