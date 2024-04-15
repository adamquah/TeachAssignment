package Boundary;

import Entity.TutorAssign;
import java.util.Scanner;

public class Course_Assign_MaintenanceUI {
    Scanner scanner = new Scanner(System.in);
    
    public int getTutorInfo(){
        System.out.println("\nMain Menu");
        System.out.println("1. Add new tutor");
        System.out.println("2. Add new course");
        System.out.println("3. Add new course type");
        System.out.println("4. Add new tutorial group");
        System.out.println("5. Remove existing list");
        System.out.println("6. Update list details");
        System.out.println("7. Display");
        System.out.println("8. Previous");
        System.out.println("0. Quit");
        System.out.println("Enter choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        return choice;
    }
    
    public void listAllTutorInfo(TutorAssign[] tutors){
        System.out.println("\nList of Tutors:");
        for (TutorAssign tutor : tutors) {
            System.out.println("Tutor name: " + tutor.getName() + ", Course Name:" + tutor.getCourse() + ", Course Type:" + tutor.getCourseType() + ", Tutorial Group:" + tutor.getTutorialGroup());
        }
    }
    
    public void printTutorDetails(TutorAssign tutor){
        System.out.println("Tutor Details");
        System.out.println("Tutor Name: " + tutor.getName());
        System.out.println("Course: " + tutor.getCourse());
        System.out.println("Course Type: " + tutor.getCourseType());
        System.out.println("Tutorial Group: " + tutor.getTutorialGroup());
    }
    
    public String inputTutorName(){
        System.out.println("Enter tutor name: ");
        String tutorName = scanner.nextLine();
        return tutorName;
    }
    
    public String inputCourse(){
        System.out.println("Enter course name: ");
        String course = scanner.nextLine();
        return course;
    }
    
    public String inputCourseType(){
        System.out.println("Enter course type: ");
        String courseType = scanner.nextLine();
        return courseType;
    }
        
    public String inputTutorialGroup(){
        System.out.println("Enter tutorial group: ");
        String tutorialGroup = scanner.next();
        scanner.nextLine();
        return tutorialGroup;
    }
    
    public TutorAssign inputTutorDetails(){
        String tutorName = inputTutorName();
        String courseName = inputCourse();
        String courseType = inputCourseType();
        String tutorialGroup = inputTutorialGroup();
        
        System.out.println();
        return new TutorAssign(tutorName, courseName, courseType, tutorialGroup);
    }
}
