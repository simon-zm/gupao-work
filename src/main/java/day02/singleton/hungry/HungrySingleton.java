package day02.singleton.hungry;

/**
 * 
 * @类描述：
 * 饿汉式单例
 * 1.在类加载得时候就立即初始化，创建了实例
 * 
 * 优点：
 * 没有加锁，执行效率高，用户体验更好
 * 线程安全
 * 缺点：
 * 不管使用与否，都会初始化，浪费资源空间
 * 
 */
public class HungrySingleton
{
	private HungrySingleton()
	{
	}

	private static final HungrySingleton instance = new HungrySingleton();

	public static HungrySingleton getInstance()
	{
		return instance;
	}
}
