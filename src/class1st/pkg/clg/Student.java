package class1st.pkg.clg;
public class Student {
    int id;
    String name;
    String branch;
    String ident="College";

    public Student(int id, String name, String branch) {
        this.id = id;
        this.name = name;
        this.branch = branch;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getIdent() {
        return ident;
    }

    private String print()
    {
        return "Hello";
    }



}
