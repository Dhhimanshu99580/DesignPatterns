package builderpattern;

public class Main {

    public static void main(String args[]) {
        Director director = new Director();
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        director.constructPizza(pizzaBuilder);
        Pizza pizza = pizzaBuilder.getPizza();
        System.out.println(pizza.getPizzaCost());

        PizzaManualBuilder pizzaManualBuilder = new PizzaManualBuilder();
        director.constructPizza(pizzaManualBuilder);
        PizzaManual pizzaManual = pizzaManualBuilder.getPizzaManual();
        System.out.println(pizzaManual.print());
    }
}
