package adt;

import java.util.NoSuchElementException;
import java.util.Iterator;
import java.util.NoSuchElementException;


public class SortedCircularList<T extends comparable> implements SortedCircularListInterface<T>{

    private Node firstNode;
    private int numberOfEntries;
    private static final int DEFAULT_CAPACITY = 5;
    
    
    public SortedCircularList() {
    firstNode = null;
    numberOfEntries = 0;
  }
    
  public boolean add(T newEntry) {
        Node newNode = new Node(newEntry);

        Node previousNode = null;
        Node currentNode = firstNode;                                                
        while (currentNode != null && newEntry.compareTo(currentNode.data) > 0) {    
            previousNode = currentNode;                                             
            currentNode = currentNode.next;                                          
        }

        if (isEmpty() || (previousNode == null)) { 
            newNode.next = firstNode;              
            firstNode = newNode;                  
        } 
        else {	                             
            newNode.next = currentNode;      
            previousNode.next = newNode;   
        }
        numberOfEntries++;               
        return true;                        
    }

    public boolean remove(T anEntry) {
        
        if (firstNode == null) {       
            return false;
        } 
        else {
            Node previousNode = firstNode;                    
            Node currentNode = firstNode;                      
            while (currentNode != null && currentNode.data.compareTo(anEntry) < 0) { 
                previousNode = currentNode;               
                currentNode = currentNode.next;                
                
            }

            if (currentNode != null && currentNode.data.equals(anEntry)) {
                if (currentNode == firstNode) { 
                    firstNode = firstNode.next; 
                } 
                else {
                    previousNode.next = currentNode.next; 
                }
                numberOfEntries--;
                return true;
            }
        }
        return false;
    }

    public boolean contains(T anEntry) {
        boolean found = false;
        Node tempNode = firstNode;

        while (!found && (tempNode != null)) {             
            if (anEntry.compareTo(tempNode.data) <= 0) {  
                found = true;                              
            } else {                                       
                tempNode = tempNode.next;                  
            }
        }
        if (tempNode != null && tempNode.data.equals(anEntry)) {     
            return true;
        } else {
            return false;
        }
    }

    public final void clear() {
        firstNode = null;
        numberOfEntries = 0;
    }

    public int getNumberOfEntries() {
        return numberOfEntries;
    }

    public boolean isEmpty() {
        return (numberOfEntries == 0);
    }

    public String toString() {
        String outputStr = "";
        Node currentNode = firstNode;
        while (currentNode != null) {
            outputStr += currentNode.data + "\n";;
            currentNode = currentNode.next;
        }
        return outputStr;
    }

    private class Node {

        private T data;
        private Node next;

        private Node(T data) {
            this.data = data;
            next = null;
        }

        private Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
     
    public boolean add(T newEntry) {
        Node<T> newNode = new Node<>(newEntry);
        if (isEmpty()) {                           
            firstNode = newNode;                    
            firstNode.next = firstNode;             
            numberOfEntries++;                     
            return true;
        } else {                                   
            Node<T> current = firstNode;         
            Node<T> previous = null;               
            do {                                                  
                if (newEntry.compareTo(current.data) <= 0) {    
                    newNode.next = current;                       
                    if (previous != null) {                      
                        previous.next = newNode;                
                    } else {                                     
                        firstNode = newNode;                     
                    }
                    numberOfEntries++;
                    return true;
                }
                previous = current;
                current = current.next;
            } while (current != firstNode);
            
            newNode.next = firstNode;
            previous.next = newNode;
            numberOfEntries++;
            return true;
        }
    }

    public boolean remove(T anEntry) {
        if (isEmpty()) {
            return false; 
        } else {
            Node<T> current = firstNode;
            Node<T> previous = null;
            do {
                if (current.data.equals(anEntry)) {
                    if (numberOfEntries == 1) { 
                        firstNode = null; 
                    } else {
                        if (current == firstNode) { 
                            firstNode = firstNode.next; 
                        }
                        previous.next = current.next; 
                    }
                    numberOfEntries--;
                    return true;
                }
                previous = current;
                current = current.next;
            } while (current != firstNode); 
            return false; 
        }
    }

    public void clear() {
        firstNode = null;
        numberOfEntries = 0;
    }

    public boolean contains(T anEntry) {
        Node<T> current = firstNode;
        do {
            if (current.data.equals(anEntry)) {
                return true;
            }
            current = current.next;
        } while (current != firstNode);
        return false;
    }

    public int getNumberOfEntries() {
        return numberOfEntries;
    }

    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    public boolean getFirstNode() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(String newCourseCode, String newCourseName, int newCourseCreditHour) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Inner class for Node
    private static class Node<T> {

        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean listAll(T anEntry) {
        if (isEmpty()) {
            return false; 
        } else {
            Node<T> current = firstNode;
            boolean found = false;
            do {
                if (current.data.equals(anEntry)) {
                    System.out.println(current.data); 
                    found = true;
                }
                current = current.next;
            } while (current != firstNode);
            return found; 
        }

    
    
    
}