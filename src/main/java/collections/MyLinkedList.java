package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        while (current != null) {
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

    public Optional<T> next(T data) {
        Node<T> current = first;
        while (current != null) {
            if (current.data.equals(data)) {
                return Optional.ofNullable(current.next != null ? current.next.data : null);
            }
            current = current.next;
        }
        return Optional.empty();
    }

    public Optional<T> previous(T data) {
        Node<T> current = first;
        while (current != null) {
            if (current.data.equals(data)) {
                return Optional.ofNullable(current.previous != null ? current.previous.data : null);
            }
            current = current.next;
        }
        return Optional.empty();
    }

    static class Node<T> {
        T data;
        Node<T> next;
        Node<T> previous;

        public Node(T data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }
}
