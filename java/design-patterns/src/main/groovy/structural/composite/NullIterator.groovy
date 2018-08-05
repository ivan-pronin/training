package structural.composite

class NullIterator implements Iterator<MenuComponent> {

    @Override
    boolean hasNext() {
        return false
    }

    @Override
    MenuComponent next() {
        return null
    }
}
