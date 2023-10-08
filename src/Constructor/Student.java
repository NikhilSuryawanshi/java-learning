package Constructor;

public class Student {
    private int id;
    private String name;
    private String surname;
    private String mob;

    public Student(int id,String  name,String surname,String mob)
    {
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.mob=mob;
    }
    public Student(int id,String  name,String mob)
    {
        this.id=id;
        this.name=name;
//        this.surname="Blank";
        this.mob=mob;
    }
    public void setId(int id)
    {
        this.id =id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setSurname(String surname)
    {
        this.surname=surname;
    }
    public void setMob(String mob)
    {
        this.mob=mob;
    }

    public int getId()
    {
        return this.id;
    }
    public String getName()
    {
        return this.name;
    }
    public String getSurname()
    {
        return this.surname;
    }
    public String getMob()
    {
        return this.mob;
    }

public String toString()
{
    return "Student{ id:"+this.id+", name:"+this.name+", surname:"+this.surname+", mob:"+this.mob+"}";
}


}
