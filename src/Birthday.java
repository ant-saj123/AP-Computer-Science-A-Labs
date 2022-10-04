public class Birthday {

    String name;
    String bday;

    public Birthday()
    {

    }

    public Birthday(String name, String bday)
    {
        this.name = name;
        this.bday = bday;
    }

    public String getName()
    {
        return name;
    }

    public String getBday()
    {
        return bday;
    }

    @Override
    public String toString()
    {
        return "Name: " + name + "\nBirthday: " + bday;
    }
}
