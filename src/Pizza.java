public class Pizza {
    private boolean isVeg;
    private int price;

    // Constructor
    public Pizza(boolean isVeg) {
        this.isVeg = isVeg;

        if (isVeg) {
            price = 300;
        } else {
            price = 400;
        }
    }

    public void addExtraCheese() {
        price += 50;
        System.out.println("Extra cheese added");
    }

    public void addExtraToppings() {
        price += 70;
        System.out.println("Extra toppings added");
    }

    public void takeAway() {
        price += 30;
        System.out.println("Take away opted");
    }

    public void getBill() {
        System.out.println("Total Bill Amount: ₹" + price);
    }
}
