package day02.singleton.lazy;

/**
 * 
 * 懒汉式单例：只有在调用得时候才会被初始化
 * 优点：节省资源
 * 缺点：这种写法线程不安全
 */
public class LazySingleton
{
	private LazySingleton()
	{
	}

	private static LazySingleton instance = null;

	public static LazySingleton getInstance()
	{
		if (null == instance)
		{
			return new LazySingleton();
		}
		return instance;
	}
}
