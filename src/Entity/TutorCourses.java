package entity;

public class TutorCourses implements Comparable<TutorCourse> {

    public static String getAllCourse() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from 
    }

    public static void course() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from 
    }

    public static void addItem(String bmit_1723_IT_Fundamentals_and_Application) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from 
    }

    public static void removeAllItems() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from 
    }
    private String courseCode;
    private String courseName;
    private int courseCreditHour;

    public Course(String courseCode, String courseName, int courseCreditHour) {

    }

    public Course() {
        throw new UnsupportedOperationException("Not supported yet."); 
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
        return courseCode + " | " + courseName + " | Credit Hours: " + courseCreditHour;
    }

    @Override
    public int compareTo(Course c) {
        return courseName.compareTo(c.courseName);
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); 

    public void pack() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void setCourseCreditHours(int newCreditHours) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
