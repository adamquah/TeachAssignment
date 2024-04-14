/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import adt.CircularListInterface;
import adt.SortedCircularList;
import entity.Faculty;

/**
 *
 * @author Moon
 */
public class FacultyInitializer {
    public CircularListInterface<Faculty> initializeFaculties() {
        CircularListInterface<Faculty> fList = new SortedCircularList<>();
        
        fList.add(new Faculty("FOAS", "Faculty of Applied Science"));
        fList.add(new Faculty("FOCS", "Faculty of Computer and Information Technology"));
        fList.add(new Faculty("FCCI", "Faculty of Communication and Creative Industries"));
        fList.add(new Faculty("FOET", "Faculty of Engineering and Technology"));
        fList.add(new Faculty("FOBE", "Faculty of Built Environment"));
        fList.add(new Faculty("FSSH", "Faculty of Social Science and Humanities"));
        fList.add(new Faculty("FAFB", "Faculty of Accountancy, Finance and Business"));
        
        return fList; 
    }

    public CircularListInterface<Faculty> getAllFaculty() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public CircularListInterface<Faculty> getAllFaculties() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

