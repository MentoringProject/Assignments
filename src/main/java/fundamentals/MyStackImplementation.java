package fundamentals;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class MyStackImplementation {
    private List<Integer> stackElements;

    public MyStackImplementation() {

        this.stackElements = new ArrayList<>();
    }

    public void push(int element) {

        stackElements.add(element);
    }

    public int pop() {
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

    public int peek() {
        if (stackElements.isEmpty()) {
            throw new EmptyStackException();
        }
        return stackElements.get(stackElements.size() - 1);
    }

    public void display() {
        System.out.println("Stack: " + stackElements);
    }
}
