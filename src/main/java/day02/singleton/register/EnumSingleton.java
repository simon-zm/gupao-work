package day02.singleton.register;

public enum EnumSingleton
{
	INSTANCE;
	public static EnumSingleton getInstance()
	{
		return INSTANCE;
	}
}
