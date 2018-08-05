package behavioral.template

abstract class CaffeineBeverageHooked {

    final void prepareRecipe() {
        boilWater()
        brew()
        pourInCup()
        if (needCondiments()) {
            addCondiments()
        }
    }

    abstract void addCondiments()

    // It's a hook, subclasses may want to Override it, but not necessary
    boolean needCondiments() {
        return true
    }

    void pourInCup() {
        println 'Pour in cup'
    }

    void boilWater() {
        println 'Boil water'
    }

    abstract void brew()
}
