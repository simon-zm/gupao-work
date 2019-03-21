package day06.decorator;

public class PersonHatDecorator implements Person
{
	private Person person;

	public PersonHatDecorator(Person person)
	{
		this.person = person;
	}

	public String driveCloth()
	{
		return person.driveCloth() + "带个帽子";
	}
}
