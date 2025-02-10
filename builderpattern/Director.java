package builderpattern;

import static builderpattern.PizzaType.ITALIAN;

public class Director {

     public void constructPizza(Builder builder) {
         builder.SetCheese("Italian");
         builder.SetPizzaCost(200);
         builder.SetPizzaType(ITALIAN);
         builder.SetPizzaSize("Medium");
     }

}
