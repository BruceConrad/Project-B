package fixtures;

public abstract class Fixture
{
	protected String name;
	protected String shortDescription;
	protected String longDescription;
	
	public Fixture()
	{
		this.name = null;
		this.shortDescription = null;
		this.longDescription = null;
	}
	
	public Fixture(String name, String shortDescription, String longDescription)
	{
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}
	
	public abstract String getName();
	
	public abstract void setName(String name);
	
	public abstract String getShortDescription();
	
	public abstract void setShortDescription(String shortDescription);
	
	public abstract String getLongDescription();
	
	public abstract void setLongDescription(String longDescription);
}
