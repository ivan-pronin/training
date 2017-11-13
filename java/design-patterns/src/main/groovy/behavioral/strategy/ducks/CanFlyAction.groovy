package behavioral.strategy.ducks

class CanFlyAction implements IFlyable {

    @Override
    public void fly() {
        println 'I am flying!'
    }
}
