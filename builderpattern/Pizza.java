package builderpattern;

public class Pizza {
    private final PizzaType pizzaType;
    private final int pizzaCost;
    private final String pizzaSize;
    private final String cheese;
    public Pizza(PizzaType pizzaType,int pizzaCost,String pizzaSize,String cheese) {
        this.pizzaType = pizzaType;
        this.pizzaCost = pizzaCost;
        this.pizzaSize = pizzaSize;
        this.cheese = cheese;
    }
    public PizzaType getPizzaType() {
        return pizzaType;
    }
    public int getPizzaCost() {
        return pizzaCost;
    }
    public String getPizzaSize() {
        return pizzaSize;
    }
    public String getCheese() {
        return cheese;
    }
}
