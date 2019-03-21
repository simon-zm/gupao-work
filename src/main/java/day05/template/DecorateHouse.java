package day05.template;

public abstract class DecorateHouse
{
	/**
	 * 模板方法：就是定义了一个算法得固件，运行子类为一个或者多个步骤提供具体实现，但是子类不能改变算法得得结构。
	 * 模板模式通常又叫模板方法模式（Template Method Pattern）是指定义一个算法的骨
	 * 架，并允许子类为一个或者多个步骤提供实现。模板方法使得子类可以在不改变算法结
	 * 构的情况下，重新定义算法的某些步骤，属于行为性设计模式。模板方法适用于以下应
	 * 用场景：
	 * 1、一次性实现一个算法的不变的部分，并将可变的行为留给子类来实现。
	 * 2、各子类中公共的行为被提取出来并集中到一个公共的父类中，从而避免代码重复。
	 * 
	 */
	public abstract boolean isContainMaterail();

	void doDecorateHouse()
	{
		if (!isContainMaterail())
		{
			// 买材料
			purchaseMaterial();
		}
		// 找工人
		findWorker();
		// 开始施工
		constructHouse();
		// 交付
		complete();
	}

	final void complete()
	{
		System.out.println("完工");
	}

	final void constructHouse()
	{
		System.out.println("开始施工");
	}

	final void findWorker()
	{
		System.out.println("找工人");
	}

	final void purchaseMaterial()
	{
		System.out.println("购买材料");
	}
}
