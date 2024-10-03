package ss7_abstraction.thuc_hanh;

public class Teacher {
    private int id;
    private String name;
    private String email;
    private String classname;

    public Teacher(int id, String name, String email, String classname){
        this.id = id;
        this.name = name;
        this.email = email;
        this.classname = classname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getClassname() {
        return classname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }
}
