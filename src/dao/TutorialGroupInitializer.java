package dao;

import adt.SortedLinkedList;
import adt.SortedLinkedListInterface;
import entity.TutGroup;

public class TutorialGroupInitializer {

    // Method to return a collection of tutorial groups with hard-coded entity values
    public ListInterface<TutorialGroup> initializeTutorialGroups() {
        ListInterface<TutorialGroup> tutorialGroupList = new ArrayList<>();
        
        // Initialize tutorial groups and add them to the list
        tutorialGroupList.add(new TutorialGroup("Faculty of Applied Science (FOAS)", "Bachelor of Science (Honours) in Applied Physics ", 1, new ArrayList<String>() {
            {
                add("Aaron Ting Ee Shen");
                add("James Chan");
                add("Wong Man Ee");
            }
        }));
        
        tutorialGroupList.add(new TutorialGroup("Faculty of Computer and Information Technology(FOCS)", "Bachelor of Computer Science (Honours) in Data Science", 1, new ArrayList<String>() {
            {
                add("Teo Jia Qian");
                add("Louis Khor");
                add("Celine Wong");
            }
        }));
        
        tutorialGroupList.add(new TutorialGroup("Faculty of Communication and Creative Industries(FCCI)", "Bachelor of Communication (Honours) in Broadcasting", 1, new ArrayList<String>() {
            {
                add("Ben Lim");
                add("Ethan Wong");
                add("Kim Lau");
            }
        }));
        
        tutorialGroupList.add(new TutorialGroup("Faculty of Engineering and Technology(FOET)", "Bachelor of Electrical and Electronics Engineering (Honours) in Engineering" , 1, new ArrayList<String>() {
            {
                add("Amy Wong");
                add("Dan Lee");
                add("Simon Liu");
            }
        }));
        
        tutorialGroupList.add(new TutorialGroup("Faculty of Built Environment(FOBE)", "Bachelor of Real Estate Management (Honours) Graduates", 1, new ArrayList<String>() {
            {
                add("Lee Hong");
                add("Justin Goh");
                add("Sean Koh");
            }
        }));
        
        tutorialGroupList.add(new TutorialGroup("Faculty of Social Science and Humanities(FSSH)", "Bachelor of Hospitality Management (Honours)", 1, new ArrayList<String>() {
            {
                add("Lee Hong");
                add("Justin Goh");
                add("Sean Koh");
            }
        }));
        
        tutorialGroupList.add(new TutorialGroup("Faculty of Accountancy, Finance and Business (FAFB)", "Bachelor of Accounting (Honours)", 1, new ArrayList<String>() {
            {
                add("Aaron Ting Ee Shen");
                add("James Chan");
                add("Wong Man Ee");
            }
        }));
             
        return tutorialGroupList;
    }

    public static void main(String[] args) {
        // Illustrate how to use the initializeTutorialGroups() method
        TutorialGroupInitializer groupInitializer = new TutorialGroupInitializer();
        ListInterface<TutorialGroup> tutorialGroupList = groupInitializer.initializeTutorialGroups();
        System.out.println("\nTutorial Groups:\n" + tutorialGroupList);
    }
}
