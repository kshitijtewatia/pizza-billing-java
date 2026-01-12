public class Pizza {
    private boolean isVeg;
    private int price;
    private int basePrice;
    private int extraCheesePrice = 50;
    private int extraTopingsPrice = 70;
    private int bagpackPrice = 30;

    private boolean isextraCheeseAdded = false;
    private boolean isextraTopingsAdded = false;
    private boolean isbagpackOpted = false;
    

    // Constructor
    public Pizza(boolean isVeg) {
        this.isVeg = isVeg;

        if (isVeg) {
            price = 300;
            basePrice = 300;
        } else {
            price = 400;
            basePrice = 400;
        }
    }

    public void addExtraCheese() {
        isextraCheeseAdded = true;
        price += 50;
        System.out.println("Extra cheese added");
    }

    public void addExtraToppings() {
        isextraTopingsAdded = true;
        price += 70;
        System.out.println("Extra toppings added");
    }

    public void takeAway() {
        isbagpackOpted = true;
        price += 30;
        System.out.println("Take away opted");
    }

    public void getBill() {
        System.out.println("hello there is your bill");
        System.out.println("base price of your pizza is: " + basePrice );
        if (isextraCheeseAdded) {
            System.out.println("you added extra cheese: " + extraCheesePrice);
            }
        if (isextraTopingsAdded) {
            System.out.println("you added extra topings: " + extraTopingsPrice);
            
        }
        if (isbagpackOpted) {
            System.out.println("you opted bagpack also: " + bagpackPrice);
            
        }
       
       
        System.out.println("Total Bill Amount: ₹" + price);
        System.out.println("please rate our service, THANK YOU");
    }
}
