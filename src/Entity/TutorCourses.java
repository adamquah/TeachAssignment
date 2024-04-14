package Entity; // Package declaration should be the first non-comment line

import java.io.Serializable;

public class TutorCourses implements Serializable {
    private String tutorName;
    private String Faculty;
    private String courseName;
    private String courseID;

    
    
    // Constructor
    public TutorCourses() {
          
    }
    
    public String getTutorName() {
        return tutorName;
    }

    public void setTutorName(String tutorName) {
        this.tutorName = tutorName;
    }
    
    public String getFaculty() {
        return Faculty;
    }

    public void setFaculty(String faculty) {
        this.Faculty = faculty;
    }
      
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
     // Getter and setter methods
    public String getCourseID() {
        return courseID;
    }
    
    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }
        
    
  
}

