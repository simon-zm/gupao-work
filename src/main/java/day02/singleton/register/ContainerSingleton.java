package day02.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// Spring使用该注册式单例
public class ContainerSingleton
{
	private ContainerSingleton()
	{
	}

	private static Map<String, Object> singleMap =
			new ConcurrentHashMap<String, Object>();

	public static Object getInstance(String className)
	{
		if (singleMap.containsKey(className))
		{
			Object obj = null;
			try
			{
				obj = Class.forName(className);
				singleMap.put(className, obj);
			}
			catch (ClassNotFoundException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return obj;
		}
		return singleMap.get(className);
	}
}
