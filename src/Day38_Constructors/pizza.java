package Day38_Constructors;
/*. create a custom class for pizza that should contain the following:

                instance variables:

                        size (either small, medium, large)

                        number of cheese topping

                        number of pepperoni toppings

                Add a constructor that can allow user to set the size and toppisngs of the pizza

                instance method:

                        calcCost(): returns the total cost as double

                        toString(): a String return method that's containing the pizza' size, quantity of each topping, and the pizza cost as calculated by calcCost()

                Pizza cost is determined by:

                        Small: $10 + $1.5 per pepperoni topping + 1 per cheese topping

                        Medium: $12 + $1.5 per pepperoni topping + 1 per cheese topping

                        Large: $14 + $1.5 per pepperoni topping + 1 per cheese topping

    create a class called Order

            create five objects of the pizza

            create an arraylist of pizza and add those 5 objects into it

            calculate the total price of the order (use for each loop)

 */
public class pizza {
    String size;
    int cheese;
    int pepporoni;
    double cost;
    int count;

    public void customizeOrder(String size, int cheese, int pepporoni, double cost, int count) {
        this.size = size;
        this.cheese = cheese;
        this.pepporoni = pepporoni;
        this.cost = cost;
        this.count = count;
    }

    public pizza(String size, int cheese, int pepporoni, double cost, int count) {
        this.size = size;
        this.cheese = cheese;
        this.pepporoni = pepporoni;
        this.cost = cost;
        this.count = count;

    }
    //public double area (double reduis,double pi) {
    //   return pi * reduis * reduis;

    //}
    //public double peremiter(double pi,double reduis){
    // return 2*pi*reduis;
    //}


    public double calCost() {

        if (size.equals("smal")) {
            return cost = 12 * count + (pepporoni * 1.5) + (cheese * 1);
        } else if (size.equals("medium")) {
            return cost = 12 * count + (pepporoni * 1.5) + (cheese * 1);
        } else if (size.equals("large")) {
            return cost = 14 * count + (pepporoni * 1.5) + (cheese * 1);

        } else {
            return 0;
        }

    }

    public String toString() {
        return "i want to order" + size + "sizepizza," + "I want add" + cheese + "cheesetopping and"
                + pepporoni + "pepporoni.\n" + "you have bout " + count + "" + size + "pizza and total price:" + calCost();
    }


}
