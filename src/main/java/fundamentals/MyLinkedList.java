package fundamentals;

import java.util.ArrayList;
import java.util.List;

public class MyLinkedList<T> {
    private Node<T> first;
    private Node<T> last;

    public MyLinkedList() {
        this.first = null;
        this.last = null;
    }

    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            newNode.next = first;
            first.previous = newNode;
            first = newNode;
        }
    }

    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);
        if (last == null) {
            first = newNode;
            last = newNode;
        } else {
            newNode.previous = last;
            last.next = newNode;
            last = newNode;
        }
    }

    public void remove(T data) {
        Node<T> current = first;
        while (current != first) {
            if (current.data.equals(data)) {
                if (current.previous != null) {
                    current.previous.next = current.next;
                } else {
                    first = current.next;
                }
                if (current.next != null) {
                    current.next.previous = current.previous;
                } else {
                    last = current.previous;
                }
                return;
            }
            current = current.next;
        }
    }

    public T[] toArray() {
        List<T> list = new ArrayList<>();
        Node<T> current = first;

        while (current != null) {
            list.add(current.data);
            current = current.next;
        }
        return (T[]) list.toArray();
    }

    public T next(T data) {
        Node<T> current = first;
        while (current != null) {
            if (current.data.equals(data)) {
                return current.next != null ? current.next.data : null;
            }
            current = current.next;
        }
        return null;
    }

    public T previous(T data) {
        Node<T> current = first;
        while (current != null) {
            if (current.data.equals(data)) {
                return current.previous != null ? current.previous.data : null;
            }
            current = current.next;
        }
        return null;
    }
}
