package day04.delegate;

public class ProjectManager
{
	void assigneWork(String dotype, BaoTouManager baoTouManager)
	{
		baoTouManager.doSome(dotype);
	}
}
