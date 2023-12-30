package fundamentals.collections;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class MyStack<T> {
    private List<T> stackElements;

    public MyStack() {

        this.stackElements = new ArrayList<T>();
    }

    public void push(T element) {

        stackElements.add(element);
    }

    public T pop() {
        if (stackElements.isEmpty()) {
            throw new EmptyStackException();
        }
        return stackElements.remove(stackElements.size() - 1);
    }

    public boolean isEmpty() {
        return stackElements.isEmpty();
    }

    public int size() {
        return stackElements.size();
    }

    public T peek() {
        if (stackElements.isEmpty()) {
            throw new EmptyStackException();
        }
        return stackElements.get(stackElements.size() - 1);
    }

    public void display() {
        System.out.println("Stack: " + stackElements);
    }
}
