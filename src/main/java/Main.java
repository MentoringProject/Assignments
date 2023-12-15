import fundamentals.MyStack;

public class Main {

    public static void main(String[] args) {
        MyStack stackImplementation = new MyStack();

        stackImplementation.push(2);
        stackImplementation.push(12);
        stackImplementation.push(22);
        stackImplementation.display();

        System.out.println("Pop: " + stackImplementation.pop());
        System.out.println("IsEmpty: " + stackImplementation.isEmpty());
        System.out.println("Size: " + stackImplementation.size());
        System.out.println("Peek: " + stackImplementation.peek());
        stackImplementation.display();
    }
}
