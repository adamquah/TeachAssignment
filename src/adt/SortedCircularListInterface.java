package adt;


public interface SortedCircularListInterface<T> {


  public boolean add(T newEntry);
  public T remove(int givenPosition);
  public boolean contains(T anEntry);
  public void clear();
  public int getNumberOfEntries();
  public boolean add(int newPosition, T newEntry);
  public T getEntry(int givenPosition);
  public boolean isEmpty();
  

  public boolean isFull();
}
