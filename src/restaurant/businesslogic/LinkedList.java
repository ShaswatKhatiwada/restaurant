
package restaurant.businesslogic;

import java.util.Iterator;

/**
 *
 * @author Shaswat
 * @
 */
public class LinkedList<E> implements Iterable<E> {

  private LinkedListNode head;
  private LinkedListNode tail;
  private int size;

  public LinkedList() {
    size = 0;
  }

  @Override
  public Iterator<E> iterator() {
    Iterator it = new LinkedListIterator(this);
    return it;
  }

  private class LinkedListNode {

    E element;
    LinkedListNode next;
    LinkedListNode prev;

    public LinkedListNode(E element, LinkedListNode next, LinkedListNode prev) {
      this.element = element;
      this.next = next;
      this.prev = prev;
    }
  }

  private class LinkedListIterator implements Iterator<E> {

    LinkedList<E> list;
    LinkedListNode pointer;

    public LinkedListIterator(LinkedList list) {
      this.list = list;
      pointer = list.head;
    }

    @Override
    public boolean hasNext() {
      if (list.isEmpty()) {
        return false;
      }
      return pointer != null;
    }

    @Override
    public E next() {
      LinkedListNode temp = pointer;
      pointer = pointer.next;
      return temp.element;
    }

  }

  /**
   * returns the size of the linked list
   *
   * @return
   */
  public int size() {
    return size;
  }

  /**
   * return whether the list is empty or not
   *
   * @return
   */
  public boolean isEmpty() {
    return size == 0;
  }

  /**
   * adds element at the end of the linked list
   *
   * @param element
   */
  public void add(E element) {

    LinkedListNode tmp = new LinkedListNode(element, null, tail);
    if (tail != null) {
      tail.next = tmp;
    }
    tail = tmp;
    if (head == null) {
      head = tmp;
    }
    size++;
  }

  /**
   * this method walks forward through the linked list
   */
  public void iterate() {

    LinkedListNode tmp = head;
    while (tmp != null) {
      tmp = tmp.next;
    }
  }

  /**
   * this method delete element from the end of the linked list
   *
   * @return
   * @throws restaurant.businesslogic.RestaurantException
   */
  public Boolean delete() throws RestaurantException {
    if (size == 0) {
      return false;
    }
    LinkedListNode tmp = tail;
    tail = tail.prev;
    tail.next = null;
    size--;
    return true;
  }

  public boolean delete(Object o) {
    if (size == 0) {
      return false;
    }
    if (o != null) {
      if (head.element.equals(o)) {
        head = head.next;
        head.prev = null;
        size--;
        return true;
      } else {
        LinkedListNode next = head.next;
        LinkedListNode temp = head;
        while (null != next) {
          if (next.element.equals(o)) {
            temp.next = next.next;
            next.next.prev = temp;
            next = null;
            size--;
            return true;
          }
          temp = next;
          next = temp.next;
        }
      }
    }
    return false;
  }
}
