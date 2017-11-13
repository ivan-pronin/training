package behavioral.strategy.ducks

class NoQuackAction implements IQuackable {

    @Override
    public void quack() {
        println 'Silence...cannot quack!'
    }
}
