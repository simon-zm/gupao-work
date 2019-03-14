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
		System.out.println("����ͨ����ǩOFFER");
	}

	private void before()
	{
		System.out.println("���Һ��ʵù�˾���ܿ�������ô�ߵĹ�˾");
	}
}
