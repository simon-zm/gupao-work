package day06.decorator;

public class PersonWatchDecorator implements Person
{
	private Person person;

	public PersonWatchDecorator(Person person)
	{
		super();
		this.person = person;
	}

	public String driveCloth()
	{
		return person.driveCloth() + "带个手表";
	}
}
