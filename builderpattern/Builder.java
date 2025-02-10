package builderpattern;

public interface Builder {
    void SetPizzaType(PizzaType pizzaType);
    void SetPizzaCost(int cost);
    void SetPizzaSize(String size);
    void SetCheese(String cheese);
}
