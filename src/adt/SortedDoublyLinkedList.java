package adt;

public class SortedDoublyLinkedList<T extends Comparable<T>> implements SortedDoublyLinkedListInterface<T> {

    public Node<T> firstNode;
    private Node<T> lastNode;
    private int size;

    public SortedDoublyLinkedList() {
        firstNode = null;
        lastNode = null;
        size = 0;
    }

    public static class Node<T> {

        public T data;
        public Node<T> next;
        private Node<T> previous;

        private Node(T data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
        
        public T getData() {
        return data;
    }

    public Node<T> getNext() {
        return next;
    }
    }

    @Override
    public boolean add(T newEntry) {
        Node<T> newNode = new Node<>(newEntry);
        if (isEmpty()) {
            firstNode = newNode;
            lastNode = newNode;
        } else if (newEntry.compareTo(firstNode.data) <= 0) {
            newNode.next = firstNode;
            firstNode.previous = newNode;
            firstNode = newNode;
        } else {
            Node<T> currentNode = firstNode;
            while (currentNode.next != null && newEntry.compareTo(currentNode.next.data) > 0) {
                currentNode = currentNode.next;
            }
            if (currentNode.next == null) {
                newNode.previous = currentNode;
                currentNode.next = newNode;
                lastNode = newNode;
            } else {
                newNode.next = currentNode.next;
                newNode.previous = currentNode;
                currentNode.next.previous = newNode;
                currentNode.next = newNode;
            }
        }
        size++;
        return true;
    }

    public boolean update(int givenPosition, T newEntry) {
    if (givenPosition < 1 || givenPosition > size) {
        throw new IndexOutOfBoundsException("Invalid position: " + givenPosition);
    }

    Node<T> currentNode = getNodeAt(givenPosition);
    currentNode.data = newEntry;
    return true;
}

    private Node<T> getNodeAt(int givenPosition) {
        if (givenPosition < 1 || givenPosition > size) {
            throw new IndexOutOfBoundsException("Invalid position: " + givenPosition);
        }

        Node<T> currentNode = firstNode;
        for (int i = 1; i < givenPosition; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    @Override
    public T remove(int givenPosition) {
        // Implementation omitted for brevity
        return null;
    }

    @Override
    public void clear() {
        firstNode = null;
        lastNode = null;
        size = 0;
    }

    @Override
    public boolean replace(int givenPosition, T newEntry) {
        // Implementation omitted for brevity
        return false;
    }

    @Override
    public T getEntry(int givenPosition) {
        // Implementation omitted for brevity
        return null;
    }

    @Override
    public boolean contains(T anEntry) {
        // Implementation omitted for brevity
        return false;
    }

    @Override
    public int getNumberOfEntries() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        // A linked list is typically not considered "full"
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> currentNode = firstNode;
        while (currentNode != null) {
            sb.append(currentNode.data).append("\n");
            currentNode = currentNode.next;
        }
        return sb.toString();
    }
}

//  static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
//    DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
//    if (head == null)
//        return newNode;
//    
//    DoublyLinkedListNode current = head;
//    DoublyLinkedListNode previous = null;
//    
//    if (data < current.data) {
//        newNode.next = current;
//        newNode.prev = null;
//        current.prev = newNode;
//        return newNode;
//    }
//    
//    while (current != null && data > current.data) {
//        previous = current;
//        current = current.next;
//    }
//    
//    if (current == null) {
//        newNode.prev = previous;
//        newNode.next = null;
//        previous.next = newNode;
//    } else {
//        newNode.prev = previous;
//        newNode.next = previous.next;
//        previous.next = newNode;
//        newNode.next.prev = newNode;
//    }
//    
//    return head;
//  }
