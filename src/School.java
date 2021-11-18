public class School {
    private String name;
    private HashSet<Education> educations;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public HashSet<Education> getEducations()
    {
        return educations;
    }

    public void setEducations(HashSet<Education> educations)
    {
        this.educations = educations;
    }

    public School(String name)
    {
        this.name = name;
        HashSet<Education> educations = new HashSet<>;

    }
}
