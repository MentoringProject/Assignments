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

    public void addFirst(final T data) {
        Node<T> newNode = new Node<T>() {
            T nodeData = data;
            private Node<T> next;
            private Node<T> previous;

            @Override
            public T getData() {
                return nodeData;
            }            @Override
            public void setNext(Node<T> next) {
                this.next = next;
            }

            @Override
            public Node<T> getNext() {
                return next;
            }

            @Override
            public Node<T> getPrevious() {
                return previous;
            }            @Override
            public void setPrevious(Node<T> previous) {
                this.previous = previous;
            }



        };

        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            newNode.setNext(first);
            first.setPrevious(newNode);
            first = newNode;
        }
    }

    public void addLast(T data) {
        Node<T> newNode = new Node<T>() {
            T nodeData = data;
            private Node<T> next;
            private Node<T> previous;

            @Override
            public T getData() {
                return nodeData;
            }            @Override
            public void setNext(Node<T> next) {
                this.next = next;
            }

            @Override
            public Node<T> getNext() {
                return next;
            }

            @Override
            public Node<T> getPrevious() {
                return previous;
            }            @Override
            public void setPrevious(Node<T> previous) {
                this.previous = previous;
            }



        };

        if (last == null) {
            first = newNode;
            last = newNode;
        } else {
            newNode.setPrevious(last);
            last.setNext(newNode);
            last = newNode;
        }
    }

    public void remove(T data) {
        Node<T> current = first;
        while (current != null) {
            if (current.getData().equals(data)) {
                if (current.getPrevious() != null) {
                    current.getPrevious().setNext(current.getNext());
                } else {
                    first = current.getNext();
                }
                if (current.getNext() != null) {
                    current.getNext().setPrevious(current.getPrevious());
                } else {
                    last = current.getPrevious();
                }
                return;
            }
            current = current.getNext();
        }
    }

    public T[] toArray() {
        List<T> list = new ArrayList<>();
        Node<T> current = first;

        while (current != null) {
            list.add(current.getData());
            current = current.getNext();
        }
        return (T[]) list.toArray();
    }

    public T next(T data) {
        Node<T> current = first;
        while (current != null) {
            if (current.getData().equals(data)) {
                return current.getNext() != null ? current.getNext().getData() : null;
            }
            current = current.getNext();
        }
        return null;
    }

    public T previous(T data) {
        Node<T> current = first;
        while (current != null) {
            if (current.getData().equals(data)) {
                return current.getPrevious() != null ? current.getPrevious().getData() : null;
            }
            current = current.getNext();
        }
        return null;
    }

    private interface Node<T> {
        T getData();

        Node<T> getNext();

        void setNext(Node<T> next);

        Node<T> getPrevious();

        void setPrevious(Node<T> previous);

    }
}
