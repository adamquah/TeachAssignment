/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package adt;

/**
 *
 * @author hp
 */
public interface SortedLinkedListInterface<T extends Comparable<T>> {
    
  public boolean add(T newEntry);
  public boolean remove(T anEntry);
  public boolean contains(T anEntry);
  public void clear();
  public int getNumberOfEntries();
  public boolean isEmpty();
    
}
