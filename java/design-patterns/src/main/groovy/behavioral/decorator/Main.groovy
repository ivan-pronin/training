package behavioral.decorator

class Main {

    static void printInfo(Coffee c) {
        System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients())
    }

    static void main(String[] args) {
        Coffee c = new SimpleCoffee()
        printInfo(c)

        c = new WithMilk(c)
        printInfo(c)

        c = new Spiced(c)
        printInfo(c)
    }
}
