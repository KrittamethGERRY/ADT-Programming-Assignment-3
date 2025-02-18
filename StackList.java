public class StackList {
    private Node top;
    private int size;
    private boolean isEmpty;

    public StackList() {
        this.top = null;
        this.size = 0;
        this.isEmpty = true;
    }

    public void push(char data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.setNext(top);
            top = newNode;
        }
        size++;
    }

    public char pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        char operator = top.getData();
        top = top.getNext();
        size--;
        if (size == 0) {
            this.isEmpty = true;
        }
        return operator;

    }

    public char peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return top.getData();
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return top == null;
    }
}

class Node {
    private char data;
    private Node next;

    public Node(char data) {
        this.data = data;
        this.next = null;
    }

    public void setNext(Node newNode) {
        this.next = newNode;
    }

    public Node getNext() {
        return this.next;
    }

    public char getData() {
        return this.data;
    }
}