package structural.composite

class CompositeDemo {

    static void main(String[] args) {
        MenuComponent mainMenu = new Menu('Main', 'main menu')
        MenuComponent burgerMenu = new Menu('Burger', 'burgers')
        MenuComponent pizzaMenu = new Menu('Pizza', 'pizzas')

        MenuItem hamBurger = new MenuItem('Hamburger', 1.5)
        MenuItem cheaseBurger = new MenuItem('CheaseBurger', 2)
        MenuItem bigTastyBurger = new MenuItem('Big tasty', 5)

        burgerMenu.add(hamBurger)
        burgerMenu.add(cheaseBurger)
        burgerMenu.add(bigTastyBurger)

        MenuItem cheasePizza = new MenuItem('4 seasons', 6)
        MenuItem meatPizza = new MenuItem('Meat pizza', 7)
        pizzaMenu.add(cheasePizza)
        pizzaMenu.add(meatPizza)

        mainMenu.add(burgerMenu)
        mainMenu.add(pizzaMenu)
        mainMenu.print()
    }
}
