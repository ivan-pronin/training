package structural.composite

abstract class MenuComponent {

    void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException()
    }

    void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException()
    }

    MenuComponent getChild(int position) {
        throw new UnsupportedOperationException()
    }

    Iterator<MenuComponent> iterator() {
        throw new UnsupportedOperationException()
    }

    String getName() {
        throw new UnsupportedOperationException()
    }

    String getDescription() {
        throw new UnsupportedOperationException()
    }

    double getPrice() {
        throw new UnsupportedOperationException()
    }

    void print() {
        throw new UnsupportedOperationException()
    }


}
