package src.main.java.org.example.challenges.stream.studentengagementsystem;

public final class Course {

    private final String courseCode;

    private final String title;

    private final int lectureCount;

    public Course(String courseCode, String title, int lectureCount) {
        super();
        if(lectureCount <= 0) {
            this.lectureCount = 1;
        } else {
            this.lectureCount = lectureCount;
        }
        this.courseCode = courseCode;
        this.title = title;
    }

    public Course(String courseCode, String title) {
        this.courseCode = courseCode;
        this.title = title;
        this.lectureCount = 40;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getTitle() {
        return title;
    }

    public int getLectureCount() {
        return lectureCount;
    }

    @Override
    public String toString() {
        return "%s %s".formatted(courseCode, title);
    }
}
