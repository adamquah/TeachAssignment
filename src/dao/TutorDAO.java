package dao;

import adt.*;
import Entity.TutorAssign;
import java.io.*;

public class TutorDAO {
    private String fileName="tutors.dat";
    
 public void saveToFile(ListInterface<TutorAssign> TutorList){
    File file = new File(fileName);
    try {
      ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream(file));
      ooStream.writeObject(TutorList);
      ooStream.close();
    } catch (FileNotFoundException ex) {
      System.out.println("\nFile not found");
    } catch (IOException ex) {
      System.out.println("\nCannot save to file");
    }
     
 }
    
    
 public ListInterface<TutorAssign> retrieveFromFile() {
    File file = new File(fileName);
    ListInterface<TutorAssign> TutorList = new ArrayList<>();
    try {
      ObjectInputStream oiStream = new ObjectInputStream(new FileInputStream(file));
      TutorList = (ArrayList<TutorAssign>) (oiStream.readObject());
      oiStream.close();
    } catch (FileNotFoundException ex) {
      System.out.println("\nNo such file.");
    } catch (IOException ex) {
      System.out.println("\nCannot read from file.");
    } catch (ClassNotFoundException ex) {
      System.out.println("\nClass not found.");
    } finally {
      return TutorList;
    }
  }   
    
    
       
}
