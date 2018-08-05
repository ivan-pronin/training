package structural.composite

class MenuItem extends structural.composite.MenuComponent {

    String name
    double price

    MenuItem(String name, double price) {
        this.name = name
        this.price = price
    }

    @Override
    Iterator<MenuComponent> iterator() {
        return new NullIterator()
    }

    @Override
    String getName() {
        return name
    }

    @Override
    double getPrice() {
        return price
    }

    @Override
    void print() {
        println "MenuItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
