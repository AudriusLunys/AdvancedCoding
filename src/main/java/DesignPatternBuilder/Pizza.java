package DesignPatternBuilder;

public class Pizza {
    private   String name;
    private int size;
    private boolean isCheeseAdded;
    private boolean isSauceAdded;
    private boolean isTakeaway;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isCheeseAdded() {
        return isCheeseAdded;
    }

    public void setCheeseAdded(boolean cheeseAdded) {
        isCheeseAdded = cheeseAdded;
    }

    public boolean isSauceAdded() {
        return isSauceAdded;
    }

    public void setSauceAdded(boolean sauceAdded) {
        isSauceAdded = sauceAdded;
    }

    public boolean isTakeaway() {
        return isTakeaway;
    }

    public void setTakeaway(boolean takeaway) {
        isTakeaway = takeaway;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + this.getName() + '\'' +
                ", size=" + this.getSize() +
                ", isCheeseAdded=" + (this.isCheeseAdded ? "[YES]" : "[NO]") +
                ", isSauceAdded=" + (this.isSauceAdded ? "[YES]" : "[NO]") +
                ", isTakeaway=" + (this.isTakeaway ? "[YES]" : "[NO]") +
                '}';
    }

    private Pizza (PizzaBuilder builder) {
        this.name = builder.name;
        this.size=builder.size;
        this.isCheeseAdded=builder.isCheeseAdded;
        this.isSauceAdded=builder.isSauceAdded;
        this.isTakeaway=builder.isTakeaway;

    }
    public static class PizzaBuilder {
        private   String name;
        private int size;
        private boolean isCheeseAdded;
        private boolean isSauceAdded;
        private boolean isTakeaway;

        public PizzaBuilder(String name, int size) {
            this.name = name;
            this.size = size;
        }

        public PizzaBuilder addCheese(boolean isCheeseAdded) {
            this.isCheeseAdded = isCheeseAdded;
            return this;
        }

        public PizzaBuilder addSauce (boolean isSauceAdded) {
            this.isSauceAdded=isSauceAdded;
            return  this;
        }

        public PizzaBuilder takeAway (boolean isTakeaway) {
            this.isTakeaway=isTakeaway;
            return this;
        }
        public Pizza build (){
            return new Pizza(this);
        }
    }

}

