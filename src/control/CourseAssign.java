package control;

//comment
import adt.*;
import Boundary.Course_Assign_MaintenanceUI;
import Entity.*;
import dao.*;

import java.util.LinkedList;
import java.util.List;

public class CourseAssign {

     
    private ListInterface<TutorAssign> tutorAssignList = new ArrayList<>();
    private ListInterface<TutorCourses> courses = new ArrayList<>();
    private TutorDAO tutorDAO = new TutorDAO();
    private CourseInitializer courseInitializer = new CourseInitializer();
       //private Course_Assign_MaintenanceUI maintenanceUI = new Course_Assign_MaintenanceUI();
       
    public  CourseAssign() {
        tutorAssignList = tutorDAO.retrieveFromFile();
        courses = courseInitializer.initializeCourses();
    }

    public List<TutorAssign> getTutorAssignListAsList() {

        // Create a new list instance.
        List<TutorAssign> list = new LinkedList<TutorAssign>();
        // Iterate over elements of ListInterface and add them to the List.
        for(int i = 1; i <= tutorAssignList.getNumberOfEntries(); i++) {
            list.add(tutorAssignList.getEntry(i));
        }
        return list;
    }

    public void addNewTutorAssign(TutorAssign newTutorAssign) {
        tutorAssignList.add(newTutorAssign);
        tutorDAO.saveToFile(tutorAssignList);
  }

    public void updateTutorAssign(int index,TutorAssign editTutorAssign) {
        tutorAssignList.replace(index, editTutorAssign);
        tutorDAO.saveToFile(tutorAssignList);
    }

    public List<TutorCourses> coursesArrayList() {
        // Create a new list instance.
        List<TutorCourses> list = new LinkedList<TutorCourses>();
        // Iterate over elements of ListInterface and add them to the List.
        for(int i = 1; i <= courses.getNumberOfEntries(); i++) {
            list.add(courses.getEntry(i));
        }
        return list;
    }
    

}

