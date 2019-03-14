package day03.proxy.dynamicproxy.cglib;

import day03.proxy.dynamicproxy.jdk.ITEmployee;

public class EmployeeTest
{
	public static void main(String[] args) throws Exception
	{
		ITEmployee ITEmployee =
				(ITEmployee) new Headhunter().getInstance(new ITEmployee());
		ITEmployee.findWork();
	}
}
