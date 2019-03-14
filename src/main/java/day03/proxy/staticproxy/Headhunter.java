package day03.proxy.staticproxy;

public class Headhunter
{
	private Employee employee;

	public Headhunter(Employee employee)
	{
		this.employee = employee;
	}

	void findWork()
	{
		before();
		employee.findWory();
		after();
	}

	private void after()
	{
		System.out.println("面试通过，签OFFER");
	}

	private void before()
	{
		System.out.println("查找合适得公司，能开的起这么高的公司");
	}
}
