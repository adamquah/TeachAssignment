package Boundary;

import Entity.TutorCourses;
import java.util.Scanner;

public class Course_Assign_MaintenanceUI {
    Scanner scanner = new Scanner(System.in);

    public void listAllCourses(TutorCourses[] courses){
        System.out.println("\nList of Courses:");
        for (TutorCourses course : courses) {
            System.out.println("Tutor name: " + course.getTutorName() + ", Tutor Code: " + course.getTutorID() + ", Course Name:" + course.getCourseName() + ", Course Code:" + course.getCourseID());
        }
    }

    public void CourseAssignList(TutorCourses course){
        System.out.println("Course Details");
        System.out.println("Tutor Name: " + course.getTutorName());
        System.out.println("Tutor Code: " + course.getTutorID());
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Course Code: " + course.getCourseID());
    }

    public String FacultyList(){
        StringBuilder sb = new StringBuilder();
        sb.append("1.FOAS - Faculty of Applied Science\n");
        sb.append("2.FOCS - Faculty of Computer and Information Technology\n");
        sb.append("3.FCCI - Faculty of Communication and Creative Industries\n");
        sb.append("4.FOET - Faculty of Engineering and Technology\n");
        sb.append("5.FOBE - Faculty of Built Environment\n");
        sb.append("6.FSSH - Faculty of Social Science and Humanities\n");
        sb.append("7.FAFB - Faculty of Accountancy, Finance and Business\n");
        return sb.toString();
    }

    public int Faculty(){
        System.out.println("Select your faculty: ");
        System.out.println(FacultyList());
        int faculty;
        while (true) {
            try {
                faculty = Integer.parseInt(scanner.nextLine());
                if (faculty >= 1 && faculty <= 7) {
                    break;
                } else {
                    System.out.println("Invalid input! Please enter a number between 1 and 7.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
            }
        }
        return faculty;
    }

    public String inputName(){
        System.out.println("Enter your name: ");
        return scanner.nextLine();
    }

    public String inputID(){
        System.out.println("Enter your ID: ");
        return scanner.nextLine();
    }

    public Course inputCourseDetails() {
        String tutorName = inputName();
        String tutorID = inputID();
        int faculty = Faculty();
        return new Course(tutorName, tutorID, faculty);
    }
}
