package behavioral.template

class TeaBeverage extends behavioral.template.CaffeineBeverageHooked {
    @Override
    void addCondiments() {
        println 'Adding lemon into tea'
    }

    @Override
    void brew() {
        println 'Brewing the tea'
    }
}
