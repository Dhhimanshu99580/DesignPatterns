package builderpattern;

public class Main {

    public static void main(String args[]) {
        Director director = new Director();
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        director.constructPizza(pizzaBuilder);
        Pizza pizza = pizzaBuilder.getPizza();
        System.out.println(pizza.getPizzaCost());


    }
}
