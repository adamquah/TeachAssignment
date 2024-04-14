package Entity;

import java.io.Serializable;

public class TutorAssign implements Serializable {

    private String name;
    private String course;
    private String courseType;
    private String tutorialGroup;

    public TutorAssign(String name, String course, String courseType, String tutorialGroup) {
        this.name = name;
        this.course = course;
        this.courseType = courseType;
        this.tutorialGroup = tutorialGroup;
    }

    // Getters and setters for name, tutorId, course, courseType, and tutorialGroup

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getTutorialGroup() {
        return tutorialGroup;
    }

    public void setTutorialGroup(String tutorialGroup) {
        this.tutorialGroup = tutorialGroup;
    }

    // Additional functionalities can be added here
}
