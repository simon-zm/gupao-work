package day06.observer;

import com.google.common.eventbus.Subscribe;

public class Teacher
{
	private String name;

	public Teacher(String name)
	{
		this.name = name;
	}

	@Subscribe
	public void func(Object arg)
	{
		Question question = (Question) arg;
		System.out.println("===============================");
		System.out.println(name + "老师，你好！\n" + "您收到了一个提问，希望您解答，问题内容如下：\n"
				+ question.getContent() + "\n" + "咕泡出品，必属精品 www.gupaoedu.com"
				+ "提问者：" + question.getUserName());
	}
}