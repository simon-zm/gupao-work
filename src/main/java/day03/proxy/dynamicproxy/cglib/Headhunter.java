package day03.proxy.dynamicproxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class Headhunter implements MethodInterceptor
{
	public Object getInstance(Object target) throws Exception
	{
		Enhancer enhancer = new Enhancer();
		// Ҫ���ĸ�����Ϊ�������ɵ����ุ��
		enhancer.setSuperclass(target.getClass());
		enhancer.setCallback(this);
		return enhancer.create();
	}

	private void after()
	{
		System.out.println("����ͨ����ǩOFFER");
	}

	private void before()
	{
		System.out.println("���Һ��ʵĹ�˾");
	}

	public java.lang.Object intercept(java.lang.Object obj, Method method,
			java.lang.Object[] args, MethodProxy proxy) throws Throwable
	{
		before();
		Object obj1 = proxy.invokeSuper(obj, args);
		after();
		return obj1;
	}
}
