package builderpattern;

public class PizzaBuilder implements Builder{

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
        this.pizzaCost= cost;
    }

    @Override
    public void SetPizzaSize(String size) {
        this.pizzaSize= size;
    }

    @Override
    public void SetCheese(String cheese) {
        this.cheese=cheese;
    }
    public Pizza getPizza() {
        return new Pizza(pizzaType,pizzaCost,pizzaSize,cheese);
    }
}
