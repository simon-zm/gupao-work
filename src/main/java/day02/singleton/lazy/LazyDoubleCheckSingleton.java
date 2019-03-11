package day02.singleton.lazy;

public class LazyDoubleCheckSingleton
{
	private LazyDoubleCheckSingleton()
	{
	}

	private static volatile LazyDoubleCheckSingleton instance = null;

	public static LazyDoubleCheckSingleton getInstance()
	{
		if (null == instance)
		{
			synchronized (LazyDoubleCheckSingleton.class)
			{
				if (null == instance)
				{
					instance = new LazyDoubleCheckSingleton();
				}
			}
		}
		return instance;
	}
}
