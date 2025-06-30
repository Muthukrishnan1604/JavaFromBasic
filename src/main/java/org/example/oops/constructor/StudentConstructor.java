package src.main.java.org.example.oops.constructor;

/*
If we define a parameterized constructor in a class,
the compiler does not automatically provide a default (no-argument) constructor.
Therefore, if we need a default constructor, we must define it explicitly.
*/

public class StudentConstructor {

    private String studentName;

    private int rollId;

    public StudentConstructor(String studentName, int rollId) {
        this.studentName = studentName;
        this.rollId = rollId;
        this();
    }

    public StudentConstructor() {
        super();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRollId() {
        return rollId;
    }

    public void setRollId(int rollId) {
        this.rollId = rollId;
    }

    @Override
    public String toString() {
        return "Student = "
                + "{ Student Name = " + this.studentName +  " , Student Roll Id = " + rollId +
                "}" ;
    }
}
