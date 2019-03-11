package day02.singleton.lazy;

// 懒汉式单例:内部类得方式实现
// 优点：
// 延迟加载，只有在调用得时候才会初始化
public class LazyInnerSingleton
{
	private LazyInnerSingleton()
	{
	}

	public static LazyInnerSingleton getInstance()
	{
		return SingleHolder.INSTANCE;
	}

	private static class SingleHolder
	{
		private static final LazyInnerSingleton INSTANCE =
				new LazyInnerSingleton();
	}
}
