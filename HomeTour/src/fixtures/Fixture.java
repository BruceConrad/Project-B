package fixtures;

public abstract class Fixture
{
	protected String name;
	protected String shortDescription;
	protected String longDescription;
	protected String[] items;
	
	public Fixture()
	{
		this.name = null;
		this.shortDescription = null;
		this.longDescription = null;
		this.items = null;
	}
	
	public Fixture(String name, String shortDescription, String longDescription, String[] items)
	{
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
		this.items = items;
	}
}
