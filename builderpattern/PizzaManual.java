package builderpattern;

public class PizzaManual {
    private final PizzaType pizzaType;
    private final int pizzaCost;
    private final String pizzaSize;
    private final String cheese;
    public PizzaManual(PizzaType pizzaType,int pizzaCost,String pizzaSize,String cheese) {
        this.pizzaType = pizzaType;
        this.pizzaCost = pizzaCost;
        this.pizzaSize = pizzaSize;
        this.cheese = cheese;
    }
    public String print() {
        String info = "";
        info += "Type of Pizza: " + pizzaType + "\n";
        info += "Price of Pizza: " + pizzaCost + "\n";
        info += "Size of Pizza - " + pizzaSize +"\n";
        info += "Cheese type used: " + cheese + "\n";
        return info;
    }
}
