package Day7.Task;
import java.util.HashMap;
import java.util.Scanner;
public class MainApp1 {
    static HashMap<String, String> userMap = new HashMap<>();
    static Scanner sc = new Scanner(System.in);
    static BLClass bl = new BLClass();

    public static void main(String[] args) {
        // Add some users to the userMap
        userMap.put("user1", "password1");
        userMap.put("user2", "password2");

        boolean status = false;
        while (!status) {
            displayMenu();
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    buyProduct();
                    break;
                case 3:
                    cancelProduct();
                    break;
                case 4:
                    bl.displayAllProducts();
                    break;
                case 5:
                    logout();
                    break;
                case 6:
                    status = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("=================================");
        System.out.println("1. Log in");
        System.out.println("2. Add Product to Cart");
        System.out.println("3. Remove Product from Cart");
        System.out.println("4. Display all products");
        System.out.println("5. Sign out");
        System.out.println("6. Exit");
        System.out.println("==================================");
        System.out.print("Enter a number: ");
    }

    static boolean loggedInUser = false;
    private static void login() {
        System.out.print("Enter username: ");
        String username = sc.next();
        System.out.print("Enter password: ");
        int password = sc.nextInt();
        if (userMap.containsKey(username)) {
            userMap.get(username);
        }
        loggedInUser = true;
        System.out.println("Login successful");
        }  {
            System.out.println("Invalid username or password");
        }

        private static void buyProduct() {
            if (loggedInUser) {
                System.out.print("Enter product name: ");
                String productName = sc.next();

                System.out.print("Enter product price: ");
                double productPrice = sc.nextDouble();

                bl.buyProduct(productName, productPrice);
            } else {
                System.out.println("You need to log in first");
            }
        }

        private static void cancelProduct() {
            if (loggedInUser) {
                System.out.print("Enter product name: ");
                String productName = sc.next();
                bl.cancelProduct(productName);
            } else {
                System.out.println("You need to log in first");
            }
        }

        private static void logout() {
            loggedInUser = false;
            System.out.println("Logged out");
        }
    }
