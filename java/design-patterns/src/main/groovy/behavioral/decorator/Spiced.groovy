package behavioral.decorator

class Spiced extends CoffeeDecorator {

    public Spiced(Coffee c) {
        super(c)
    }

    public double getCost() {
        return super.getCost() + 0.2
    }

    public String getIngredients() {
        return super.getIngredients() + ", Spiced"
    }
}
