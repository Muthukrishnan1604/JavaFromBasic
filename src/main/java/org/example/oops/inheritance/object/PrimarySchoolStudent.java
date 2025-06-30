package src.main.java.org.example.oops.inheritance.object;

import src.main.java.org.example.oops.constructor.StudentConstructor;

public class PrimarySchoolStudent extends StudentConstructor {

    private String parentName;

    public PrimarySchoolStudent(String studentName, int rollId, String parentName) {
        super(studentName, rollId);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return super.toString() + "PrimarySchoolStudent = "
                + "{ Parent Name = " + this.parentName + " }";
    }
}
