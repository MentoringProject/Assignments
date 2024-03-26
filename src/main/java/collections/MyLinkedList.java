package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MyLinkedList<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;

    public MyLinkedList() {
        this.first = null;
        this.last = null;
        this.size = 0;
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
        size++;
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
        size++;
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
                size--;
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

    public T getFirst() {
        if(first != null) {
            return first.data;
        }
        return null;
    }

    public T getLast() {
        if (last != null) {
            return last.data;
        }
        return null;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public void removeFirst() {
        if (first != null) {
            if (first.next != null) {
                first = first.next;
                first.previous = null;
            }else  {
                first = null;
                last = null;
            }
            size--;
        }
    }

    public void removeLast() {
        if (last != null) {
            if (last.previous != null) {
                last = last.previous;
                last.next = null;
            }else {
                first = null;
                last = null;
            }
            size--;
        }
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        if (current.previous != null) {
            current.previous.next = current.next;
        }else {
            first = current.next;
        }

        if (current.next != null) {
            current.next.previous = current.previous;
        }else {
            last = current.previous;
        }

        size--;
    }

    public void clear() {
        first = null;
        last = null;
        size = 0;
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
