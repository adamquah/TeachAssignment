package control;

import adt.ListInterface;
import adt.ArrayList;
import Boundary.Course_Assign_MaintenanceUI;
import Entity.*;



public class CourseAssign {

    private ListInterface<TutorAssign> tutorList = new ArrayList<>();
    private Course tutorDAO = new TutorDAO();
    private Course_Assign_MaintenanceUI maintenanceUI = new Course_Assign_MaintenanceUI();

    // Constructor
    public CourseAssign() {
        tutorList = tutorDAO.retrieveFromFile();
    }

    // Add a tutor's name to the list
    public void addTutorName() {
        // Add implementation here
    }

    // Remove a tutor's name from the list
    public void removeTutorName() {
        // Add implementation here
    }
}
