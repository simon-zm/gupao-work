package day06.decorator;

public class DecoratorTest
{
	public static void main(String[] args)
	{
		/**
		 * 1、装饰者模式和适配器模式都是属于包装器模式（Wrapper）
		 * 2、装饰者模式可以实现被装饰者与相同的接口或者继承被装 饰者作为它的子类，而适配器和被适配者可以实现不同的接口
		 * 装饰者--is a
		 * 适配器--has a
		 */
		Person person = new Jeon();
		person = new PersonHatDecorator(person);
		person = new PersonWatchDecorator(person);
		System.out.println(person.driveCloth());
	}
}
