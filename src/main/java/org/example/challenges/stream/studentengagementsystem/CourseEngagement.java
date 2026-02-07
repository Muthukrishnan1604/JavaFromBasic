package src.main.java.org.example.challenges.stream.studentengagementsystem;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.TextStyle;
import java.util.Locale;

public class CourseEngagement {

    private final Course course;

    private final LocalDate enrollmentDate;

    private String engagementType;

    private LocalDate lastActivityDate;

    private int lastLecture;

    public CourseEngagement(Course course, LocalDate enrollmentDate, String engagementType) {
        this.course = course;
        this.enrollmentDate = this.lastActivityDate = enrollmentDate;
        this.engagementType = engagementType;
    }

    public String getCourseCode() {
        return course.getCourseCode();
    }

    public int getEnrollmentYear() {
        return enrollmentDate.getYear();
    }

    public int getLastActivityYear() {
        return lastActivityDate.getYear();
    }

    public String getLastActivityMonth() {
        return lastActivityDate.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    }

    public int getMonthsSinceActive() {
        return (int) Period.between(lastActivityDate, LocalDate.now()).toTotalMonths();
    }

    public double getPercentComplete() {
        return (double) (lastLecture * 100) / course.getLectureCount();
    }

    public void watchLecture(int lectureCount, LocalDate lastActivityDate) {
        lastLecture = Math.max(lectureCount, lastLecture);
        this.lastActivityDate = lastActivityDate;
        engagementType = "Lecture " + lastLecture;
    }

    @Override
    public String toString() {
        return "%s: %s %d %s [%d]".formatted(course.getCourseCode(), getLastActivityMonth()
        , getLastActivityYear(), engagementType, getMonthsSinceActive());
    }
}
