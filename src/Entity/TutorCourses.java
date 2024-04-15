package Entity;

public class TutorCourses implements Comparable<TutorCourses> {

    private String courseCode;
    private String courseName;
    private int courseCreditHour;

    public TutorCourses(String courseCode, String courseName, int courseCreditHour) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseCreditHour = courseCreditHour;
    }

    // Getters and setters

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseCreditHour() {
        return courseCreditHour;
    }

    public void setCourseCreditHour(int courseCreditHour) {
        this.courseCreditHour = courseCreditHour;
    }

    @Override
    public String toString() {
        return "Course Code: " + courseCode + ", Course Name: " + courseName + ", Credit Hours: " + courseCreditHour;
    }

    @Override
    public int compareTo(TutorCourses c) {
        return courseName.compareTo(c.getCourseName());
    }
}
