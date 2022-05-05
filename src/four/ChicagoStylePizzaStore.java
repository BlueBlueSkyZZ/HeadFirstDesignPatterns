package four;

public class ChicagoStylePizzaStore extends PizzaStore2 {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
//            pizza = new ChicagoCheesePizza();
        } else if (type.equals("pepperoni")) {
//            pizza = new ChicagoPepperoniPizza();
        } else if (type.equals("clam")) {
//            pizza = new ChicagoClamPizza();
        } else if (type.equals("veggie")) {
//            pizza = new ChicagoVeggiePizza();
        }

        return pizza;
    }

}
