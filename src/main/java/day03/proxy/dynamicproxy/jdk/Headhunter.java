package day03.proxy.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Headhunter implements InvocationHandler
{
	private Object Object;

	public Headhunter(Object target)
	{
		this.Object = target;
	}

	public Object getProxy()
	{
		return Proxy.newProxyInstance(Object.getClass().getClassLoader(),
				Object.getClass().getInterfaces(), this);
	}

	private void after()
	{
		System.out.println("����ͨ����ǩOFFER");
	}

	private void before()
	{
		System.out.println("���Һ��ʵĹ�˾");
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable
	{
		before();
		Object obj = method.invoke(Object, args);
		after();
		return obj;
	}
}
