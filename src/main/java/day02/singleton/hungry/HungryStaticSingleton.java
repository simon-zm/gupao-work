package day02.singleton.hungry;

// ¶öººÊ½¾²Ì¬¿éµ¥Àý
public class HungryStaticSingleton
{
	private HungryStaticSingleton()
	{
	}

	private static final HungryStaticSingleton instance;
	static
	{
		instance = new HungryStaticSingleton();
	}

	public static HungryStaticSingleton getInstance()
	{
		return instance;
	}
}
