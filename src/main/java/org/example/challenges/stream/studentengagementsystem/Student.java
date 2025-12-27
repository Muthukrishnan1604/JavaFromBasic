package src.main.java.org.example.challenges.stream.studentengagementsystem;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

public class Student {

    private static long lastStudentId = 1;

    private static Random random = new Random();

    final private long studentId;

    private final String countryCode;

    private final int yearEnrolled;

    private final int ageEnrolled;

    private final String gender;

    private final boolean programmingExperience;

    private final Map<String, CourseEngagement> courseEngagementMap = new HashMap<>();

    public Student(String countryCode, int yearEnrolled, int ageEnrolled, String gender,
                   boolean programmingExperience, Course... courses) {
        this.studentId = lastStudentId++;
        this.countryCode = countryCode;
        this.yearEnrolled = yearEnrolled;
        this.ageEnrolled = ageEnrolled;
        this.gender = gender;
        this.programmingExperience = programmingExperience;

        for(Course course : courses) {
            addCourse(course);
        }
    }

    public long getStudentId() {
        return studentId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public int getYearEnrolled() {
        return yearEnrolled;
    }

    public int getAgeEnrolled() {
        return ageEnrolled;
    }

    public String getGender() {
        return gender;
    }

    public boolean hasProgrammingExperience() {
        return programmingExperience;
    }

    public Map<String, CourseEngagement> getCourseEngagementMap() {
        return Map.copyOf(courseEngagementMap);
    }

    public static Student getRandomStudent(Course... courses) {

        int maxYear = LocalDate.now().getYear() + 1;

        Student student = new Student(getRandomVal("CHN", "TKN", "MD"),
                random.nextInt(2015, maxYear),
                random.nextInt(18, 90),
                getRandomVal("M", "F", "U"), random.nextBoolean(), courses);

        for(Course c : courses) {
            int lecture = random.nextInt(1, c.getLectureCount());
            int year = random.nextInt(student.getYearEnrolled(), maxYear);
            int month = random.nextInt(1, 13);

            if(year == (maxYear - 1)) {
                if(month > LocalDate.now().getMonthValue()) {
                    month = LocalDate.now().getMonthValue();
                }
            }
            student.watchLecture(c.getCourseCode(), lecture, month, year);
        }

        return student;
    }

    public void addCourse(Course course) {
        addCourse(course, LocalDate.now());
    }

    public void addCourse(Course course, LocalDate enrolledDate) {
        courseEngagementMap.put(course.getCourseCode(), new CourseEngagement(course, enrolledDate, "Enrollment"));
    }

    public int getYearSinceEnrolled() {
        return LocalDate.now().getYear() - yearEnrolled;
    }

    public int getAge() {
        return ageEnrolled + getYearSinceEnrolled();
    }

    public int getMonthSinceActive(String courseCode) {
        CourseEngagement info = courseEngagementMap.get(courseCode);
        return info == null ? 0 : info.getMonthsSinceActive();
    }

    public int getMonthSinceActive() {
        int inactiveMonth = (LocalDate.now().getYear() - 2014) * 12;

        for(String key : courseEngagementMap.keySet()) {
            inactiveMonth = Math.min(inactiveMonth, getMonthSinceActive(key));
        }
        return inactiveMonth;
    }

    public double getPercentComplete(String courseCode) {
        var info = courseEngagementMap.get(courseCode);
        return info == null ? 0 : info.getPercentComplete();
    }

    public void watchLecture(String courseCode, int lectureNumber, int month, int year) {
        var activity = courseEngagementMap.get(courseCode);
        if(activity != null) {
            activity.watchLecture(lectureNumber, LocalDate.of(year, month, 1));
        }
    }

    private static String getRandomVal(String... data) {
        return data[random.nextInt(data.length)];
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", countryCode='" + countryCode + '\'' +
                ", yearEnrolled=" + yearEnrolled +
                ", ageEnrolled=" + ageEnrolled +
                ", gender='" + gender + '\'' +
                ", programmingExperience=" + programmingExperience +
                ", courseEngagementMap=" + courseEngagementMap +
                '}';
    }
}
