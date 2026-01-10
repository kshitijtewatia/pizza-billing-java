import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("🍕 Welcome to Pizza Shop 🍕");
        System.out.println("1. Veg Pizza (₹300)");
        System.out.println("2. Non-Veg Pizza (₹400)");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        Pizza pizza;

        if (choice == 1) {
            pizza = new Pizza(true);
        } else {
            pizza = new Pizza(false);
        }

        System.out.print("Add extra cheese? (1 = Yes, 0 = No): ");
        int cheese = sc.nextInt();
        if (cheese == 1) {
            pizza.addExtraCheese();
        }

        System.out.print("Add extra toppings? (1 = Yes, 0 = No): ");
        int toppings = sc.nextInt();
        if (toppings == 1) {
            pizza.addExtraToppings();
        }

        System.out.print("Take away? (1 = Yes, 0 = No): ");
        int takeAway = sc.nextInt();
        if (takeAway == 1) {
            pizza.takeAway();
        }

        System.out.println("\n🧾 Final Bill");
        pizza.getBill();

        sc.close();
    }
}
