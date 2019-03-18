package day04.delegate;

public class WorkTest
{
	public static void main(String[] args)
	{
		ProjectManager pm = new ProjectManager();
		pm.assigneWork("ÆöÇ½", new BaoTouManager());
	}
}
