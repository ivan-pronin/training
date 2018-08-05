package behavioral.state

class SoldOutState implements IState{
    private StateMachine stateMachine

    SoldOutState(StateMachine stateMachine) {
        this.stateMachine = stateMachine
    }

    @Override
    void insertCoin() {
        println 'Sorry, out of gumballs, no coins accepted...'
    }

    @Override
    void ejectCoin() {
        println 'Nothing to eject, no coin inserted'
    }

    @Override
    void pushButton() {
        println 'Sorry, out of gumballs'
    }

    @Override
    void dispense() {
        println 'Sorry, out of gumballs, nothing to dispense...'
    }
}
