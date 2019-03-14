package day03.proxy.staticproxy;

public class EmployeeTest
{
	public static void main(String[] args)
	{
		Headhunter haHeadhunter = new Headhunter(new Employee());
		haHeadhunter.findWork();
	}
}
