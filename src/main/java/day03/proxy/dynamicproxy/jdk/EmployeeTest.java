package day03.proxy.dynamicproxy.jdk;

public class EmployeeTest
{
	public static void main(String[] args)
	{
		Headhunter headhunter = new Headhunter(new ITEmployee());
		IEmployee employee = (IEmployee) headhunter.getProxy();
		employee.findWork();
	}
}
