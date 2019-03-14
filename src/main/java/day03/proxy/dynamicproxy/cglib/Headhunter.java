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
		// 要把哪个设置为即将生成的新类父类
		enhancer.setSuperclass(target.getClass());
		enhancer.setCallback(this);
		return enhancer.create();
	}

	private void after()
	{
		System.out.println("面试通过，签OFFER");
	}

	private void before()
	{
		System.out.println("查找合适的公司");
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
