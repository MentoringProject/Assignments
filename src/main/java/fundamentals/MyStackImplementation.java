package fundamentals;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class MyStackImplementation<T> {
    private List<T> stackList;

    public MyStackImplementation() {
        this.stackList = new ArrayList<>();
    }

    public void push(T element) {
        stackList.add(element);
    }

    public T pop() {
        if (stackList.isEmpty()) {
            throw new EmptyStackException();
        }
        return stackList.remove(stackList.size() - 1);
    }

    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    public int size() {
        return stackList.size();
    }

    public T peek() {
        if (stackList.isEmpty()) {
            throw new EmptyStackException();
        }
        return stackList.get(stackList.size() - 1);
    }

    public void display() {
        System.out.println("Stack: " + stackList);
    }
}
