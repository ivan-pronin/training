package behavioral.template

class CoffeeBeverage extends behavioral.template.CaffeineBeverageHooked {
    @Override
    void addCondiments() {
        println 'Adding milk into coffee'
    }

    @Override
    void brew() {
        println 'Brew the coffee'
    }
}
