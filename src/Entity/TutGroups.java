public class TutGroups {
    // Fields
    private String tutorialGroup;
    private int numberOfStudents;
    
 
    
    // Constructors
    public TutGroups() {
    }
    
    public TutGroups(String tutorialGroup, int numberOfStudents, String faculty) {
        this.tutorialGroup = tutorialGroup;
        this.numberOfStudents = numberOfStudents;
        this.faculty = faculty;
    }
    
    // Getters and setters
    public String getTutorialGroup() {
        return tutorialGroup;
    }
    
    public void setTutorialGroup(String tutorialGroup) {
        this.tutorialGroup = tutorialGroup;
    }
    
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    
    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }
    
   
    // Override toString() method
    @Override
    public String toString() {
        return "Tutorial{" +
                "tutorialGroup='" + tutorialGroup + '\'' +
                ", numberOfStudents=" + numberOfStudents +
                ", faculty='" + faculty + '\'' +
                '}';
    }
}
