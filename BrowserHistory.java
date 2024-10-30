import java.util.Scanner;
import java.util.Stack;

public history Here's the Java code for the browser history stack:
import java.util.Scanner;
import java.util.Stack;

public class BrowserHistory {
    public static void main(String[] args) {
        Stack<String> historyStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        int choice;
        String url;

        do {
            System.out.println("Browser History");
            System.out.println("1. Visit New Page");
            System.out.println("2. Go Back to Last Page");
            System.out.println("3. Delete All History");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter page URL: ");
                    url = scanner.next();
                    historyStack.push(url);
                    System.out.println("Page added to history.");
                    break;

                case 2:
                    if (!historyStack.isEmpty()) {
                        String lastVisited = historyStack.pop();
                        System.out.println("Last visited page: " + lastVisited);
                    } else {
                        System.out.println("History is empty.");
                    }
                    break;

                case 3:
                    historyStack.clear();
                    System.out.println("History cleared.");
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        scanner.close();
    }
}

Explanation:
 * Stack: We use a Stack data structure to represent the browser history. The Stack class in Java provides methods like push(), pop(), peek(), empty(), and clear() to manage the stack.
 * User Interaction: The code uses a Scanner object to take user input for the desired action (visit, go back, clear history, or exit).
 * Action Handling:
   * Visit New Page: The new URL is added to the top of the stack using push().
   * Go Back to Last Page: The top element (last visited URL) is removed from the stack using pop() and displayed to the user.
   * Delete All History: The stack is cleared using clear().
   * Exit: The program terminates.
 * Error Handling: The code checks if the stack is empty before popping an element to avoid potential exceptions.
This code effectively simulates a browser history stack, allowing users to visit new pages, go back to previous pages, and clear the entire history.
 * https://www.tutorialandexample.com/hotel-management-system-in-java
 {
    public static void main(String[] args) {
        Stack<String> historyStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        int choice;
        String url;

        do {
            System.out.println("---Browser History---");
            System.out.println("1. Visit New Page");
            System.out.println("2. Go Back to Last Page");
            System.out.println("3. Delete All History");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter page URL: ");
                    url = scanner.next();
                    historyStack.push(url);
                    System.out.println("Page added to history.");
                    break;

                case 2:
                    if (!historyStack.isEmpty()) {
                        String lastVisited = historyStack.pop();
                        System.out.println("Last visited page: " + lastVisited);
                    } else {
                        System.out.println("History is empty.");
                    }
                    break;

                case 3:
                    historyStack.clear();
                    System.out.println("History cleared.");
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        scanner.close();
    }
}

