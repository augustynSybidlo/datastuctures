package datastructures;

import java.lang.reflect.Array;

public class MyStack<E> {

    private int size;
    private int top;
    private E[] stack;

    public MyStack(Class<E> cls, int size) {
        this.top = -1;
        this.size = size;
        @SuppressWarnings("unchecked")
        final E[] stack = (E[]) Array.newInstance(cls, size);
        this.stack = stack;
    }

    public void push(E data) throws StackOverflowError {
        checkAvailableSpace();
        stack[++top] = data;
    }


    public int checkAvailableSpace() throws StackOverflowError {
        int availableSpace = size - (top + 1);
        if (availableSpace == 0) throw new StackOverflowError();
        return availableSpace;
    }

}
