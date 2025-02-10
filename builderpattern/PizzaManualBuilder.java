package builderpattern;

public class PizzaManualBuilder implements Builder{
    private PizzaType pizzaType;
    private int pizzaCost;
    private String pizzaSize;
    private String cheese;

    @Override
    public void SetPizzaType(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }

    @Override
    public void SetPizzaCost(int cost) {
        this.pizzaCost = cost;
    }

    @Override
    public void SetPizzaSize(String size) {
        this.pizzaSize = size;
    }

    @Override
    public void SetCheese(String cheese) {
        this.cheese = cheese;
    }
    public PizzaManual getPizzaManual() {
        return new PizzaManual(pizzaType,pizzaCost,pizzaSize,cheese);
    }
}
