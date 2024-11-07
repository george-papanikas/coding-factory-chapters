package gr.aueb.cf.ch19.collections;

import java.security.PublicKey;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;

public class MyStack<T> {
    private final Deque<T> myStack = new ArrayDeque(); // implemented by Arrays

    public MyStack() {}

    public Deque<T> getMyStack() {
        return myStack;
    }

    public void push(T t) { //decoration & delegation
        myStack.push(t);
    }

    public T pop() {
        return myStack.pop();
    }

    public void forEach(Consumer<T> action) { //action is a lamda which implements Consumer interface
        myStack.forEach(action);
    }
}
