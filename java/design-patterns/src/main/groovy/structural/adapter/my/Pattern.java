package structural.adapter.my;

public class Pattern
{
    private int id;
    private String name;
    private String description;

    protected Pattern(int id, String name, String description)
    {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    protected int getId()
    {
        return id;
    }

    protected String getName()
    {
        return name;
    }

    protected String getDescription()
    {
        return description;
    }
}
