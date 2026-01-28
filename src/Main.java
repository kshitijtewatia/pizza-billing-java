
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("=================================================");
        System.out.println("            🍕 WELCOME TO KSHITYY PIZZA 🍕          ");
        System.out.println("=================================================");
        System.out.println();

        // Regular Pizza Section
        System.out.println("📋 REGULAR PIZZA");
        System.out.println("-------------------------------------------------");
        System.out.println("Veg Regular Pizza        : ₹300");
        System.out.println("Non-Veg Regular Pizza    : ₹400");
        System.out.println();
        System.out.println("➕ Add-Ons (Optional)");
        System.out.println("• Extra Cheese           : ₹50");
        System.out.println("• Extra Toppings         : ₹70");
        System.out.println("-------------------------------------------------");
        System.out.println();

        // Deluxe Pizza Section
        System.out.println("👑 DELUXE PIZZA (All-Inclusive)");
        System.out.println("-------------------------------------------------");
        System.out.println("✔ Cheese Included");
        System.out.println("✔ Extra Toppings Included");
        System.out.println();
        System.out.println("Veg Deluxe Pizza         : ₹450");
        System.out.println("Non-Veg Deluxe Pizza     : ₹550");
        System.out.println("-------------------------------------------------");
        System.out.println();

        System.out.println("📌 NOTE:");
        System.out.println("• Regular pizza allows customization");
        System.out.println("• Deluxe pizza comes with cheese & toppings");
        System.out.println();

        System.out.println("👉 Please enter your choice to continue...");
        System.out.println("=================================================");

        System.out.println("🍕 Welcome to KSHITYY Pizza Shop 🍕");
        System.out.println("hello which pizza you want");
        System.out.println("1: regular pizza");
        System.out.println("2: deluxe pizza");
        int pizzaType = sc.nextInt();  //taking pizza type input

        System.out.println("1 veg");
        System.out.println("2: NON VEG");
        boolean isVeg = (sc.nextInt()==1); //taking input for veg or non veg

        Pizza pizza; //called parent class pizza
        if (pizzaType == 2) { //if deluxe pizza called 
            pizza = new DeluxePizza(isVeg);  //deluxeclass with isveg constructor called
            pizza.addExtraCheese();
            pizza.addExtraToppings();

            
        }else{
            pizza = new Pizza(isVeg);
        }

        if (pizzaType == 1) {
            System.out.println("want to add extra cheese (1=yes/0=no)");
            if (sc.nextInt()==1) pizza.addExtraCheese();//if yes extra cheese function called
            
            System.out.println("want extra topings (1=yes/0=no)");
            if (sc.nextInt()==1) pizza.addExtraToppings();// if yes extra topings function called
        }

        System.out.println("want to take away that pizza (1=yes/0=no)");
        if(sc.nextInt()==1) pizza.takeAway(); // th

   
        System.out.println("\n🧾 Final Bill");

    
        pizza.getBill();

        sc.close();
    }
}
