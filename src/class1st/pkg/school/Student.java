package class1st.pkg.school;

public class Student {
    int roll;
    String name;
    String std;
    String ident="School";

    public Student(int roll, String name, String std) {
        this.roll = roll;
        this.name = name;
        this.std = std;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStd() {
        return std;
    }

    public void setStd(String std) {
        this.std = std;
    }

    public String getIdent() {
        return ident;
    }

    protected String print()
    {
        return "Hello";
    }




}

