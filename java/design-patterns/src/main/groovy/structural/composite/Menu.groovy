package structural.composite

class Menu extends structural.composite.MenuComponent {

    List<MenuComponent> menuComponents = new ArrayList<>()
    String name
    String description

    Menu(String name, String description) {
        this.name = name
        this.description = description
    }

    @Override
    void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent)
    }

    @Override
    void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent)
    }

    @Override
    MenuComponent getChild(int position) {
        menuComponents.get(position)
    }

    @Override
    Iterator<MenuComponent> iterator() {
        return menuComponents.iterator()
    }

    @Override
    String getName() {
        return name
    }

    @Override
    String getDescription() {
        return description
    }

    @Override
    void print() {
        println "Menu: ${getName()}"
        println getDescription()
        def iterator = iterator()
        while (iterator.hasNext()) {
            iterator.next().print()
        }
    }
}
