package day06.observer;

import com.google.common.eventbus.EventBus;

public class GuPer
{
	private String name = "GPer 生态圈";

	private static GuPer gper = null;

	private static EventBus eventBus = new EventBus();

	private GuPer()
	{
	}

	public static GuPer getInstance()
	{
		if (null == gper)
		{
			gper = new GuPer();
		}
		return gper;
	}

	public String getName()
	{
		return name;
	}

	public static void register(Object obj)
	{
		eventBus.register(obj);
	}

	public static void unregister(Object obj)
	{
		eventBus.unregister(obj);
	}

	public static void post(Object obj)
	{
		eventBus.post(obj);
	}
	// @Subscribe
	// public void publishQuestion(Question question)
	// {
	// System.out.println(
	// question.getUserName() + "在" + this.name + "上提交了一个问题。");
	// }
}
