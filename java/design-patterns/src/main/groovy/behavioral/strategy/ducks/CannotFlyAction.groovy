package behavioral.strategy.ducks

class CannotFlyAction implements IFlyable {

    @Override
    public void fly() {
        println 'Cannot fly, sorry )'
    }
}
