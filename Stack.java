import java.util.ArrayList;

class Stack {
    private int maxSize; // Maximum size of the stack
    private ArrayList<Integer> stack; // ArrayList to hold stack elements

    // Constructor to initialize the stack
    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new ArrayList<>();
    }

    // Push an element onto the stack
    public void push(int element) {
        if (size() < maxSize) {
            stack.add(element);
            System.out.println(element + " pushed to stack.");
        } else {
            System.out.println("Stack overflow! Cannot push more elements.");
        }
    }

    // Pop an element from the stack
    public Integer pop() {
        if (size() > 0) {
            Integer poppedElement = stack.remove(stack.size() - 1);
            System.out.println(poppedElement + " popped from stack.");
            return poppedElement;
        } else {
            System.out.println("Stack underflow! No elements to pop.");
            return null;
        }
    }

    // Peek at the top element of the stack
    public Integer peek() {
        if (size() > 0) {
            Integer topElement = stack.get(stack.size() - 1);
            System.out.println("Top element is " + topElement + ".");
            return topElement;
        } else {
            System.out.println("Stack is empty! No elements to peek.");
            return null;
        }
    }

    // Get the current size of the stack
    public int size() {
        return stack.size();
    }

    // Example usage
    public static void main(String[] args) {
        Stack myStack = new Stack(5);

        // Push elements onto the stack
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);
        myStack.push(60); // This should show "Stack overflow!"

        // Peek at the top element
        myStack.peek();

        // Pop elements from the stack
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop(); // This should show "Stack underflow!"

        // Check the size of the stack
        System.out.println("Current stack size: " + myStack.size());
    }
}