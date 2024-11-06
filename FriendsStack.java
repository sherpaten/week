import java.util.Scanner;
import java.util.Stack;

class FriendsStack {
    private Stack<String> stack;

    // Constructor to initialize the stack
    public FriendsStack() {
        this.stack = new Stack<>();
    }

    // Method to push a name onto the stack
    public void push(String name) {
        this.stack.push(name);
    }

    // Method to pop a name from the stack
    public String pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty. No names to remove.");
            return null;
        }
        return this.stack.pop();
    }

    // Method to display the names in the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("The stack is empty.");
            return;
        }
        System.out.println("Names in the stack:");
        for (int i = 0; i < stack.size(); i++) {
            System.out.println((i + 1) + ": " + stack.get(i));
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Main method to interact with the user
    public static void main(String[] args) {
        FriendsStack friendsStack = new FriendsStack();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the names of 5 friends:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Friend " + (i + 1) + ": ");
            String name = scanner.nextLine();
            friendsStack.push(name);
        }

        // Displaying the names
        friendsStack.display();

        // Removing a name from the stack
        System.out.print("\nDo you want to remove a name? (yes/no): ");
        String removeName = scanner.nextLine();
        if (removeName.equalsIgnoreCase("yes")) {
            String removedFriend = friendsStack.pop();
            if (removedFriend != null) {
                System.out.println("Removed: " + removedFriend);
            }
        }

        // Displaying the names after popping
        friendsStack.display();

        scanner.close();
    }
}