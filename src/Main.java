
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("🍕 Welcome to  Pizza Shop 🍕");
        System.out.println("hello which pizza you want");
        System.out.println("1: regular pizza");
        System.out.println("2: deluxe pizza");
        int pizzaType = sc.nextInt();

        System.out.println("1 veg");
        System.out.println("2: NON VEG");
        boolean isVeg = (sc.nextInt()==1);

        Pizza pizza;
        if (pizzaType == 2) {
            pizza = new DeluxePizza(isVeg);

            
        }else{
            pizza = new Pizza(isVeg);
        }

        if (pizzaType == 1) {
            System.out.println("want to add extra cheese (1=yes/0=no)");
            if (sc.nextInt()==1) pizza.addExtraCheese();
            
            System.out.println("want extra topings (1=yes/0=no)");
            if (sc.nextInt()==1) pizza.addExtraToppings();
        }

        System.out.println("want to take away that pizza (1=yes/0=no)");
        if(sc.nextInt()==1) pizza.takeAway();

   
        System.out.println("\n🧾 Final Bill");

    
        pizza.getBill();

        sc.close();
    }
}
