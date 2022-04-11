package four;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {

        } else if (type.equals("pepperoni")) {

        } else if (type.equals("clam")) {

        } else if (type.equals("veggie")) {

        }

        return pizza;
    }

}
