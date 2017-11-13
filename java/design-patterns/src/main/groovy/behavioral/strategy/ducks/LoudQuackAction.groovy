package behavioral.strategy.ducks

class LoudQuackAction implements IQuackable {

    @Override
    public void quack() {
        println 'Quacking!'
    }
}
