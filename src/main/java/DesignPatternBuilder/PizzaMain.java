package DesignPatternBuilder;

public class PizzaMain {
    public static void main(String[] args) {

        Pizza margarita = new Pizza.PizzaBuilder("Margarita", 55).addCheese(true).addSauce(true).takeAway(false).build();
        System.out.println(margarita.toString());
    }
}
