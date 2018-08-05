package behavioral.state

class NoCoinState implements IState {

    StateMachine stateMachine

    NoCoinState(StateMachine stateMachine) {
        this.stateMachine = stateMachine
    }

    @Override
    void insertCoin() {
        println 'You inserted coin'
        stateMachine.setCurrentState(stateMachine.getHasCoinState())
    }

    @Override
    void ejectCoin() {
        println 'Nothing to eject =)'
    }

    @Override
    void pushButton() {
        println 'Please, insert coin to get a gumball!'
    }

    @Override
    void dispense() {
        println 'Please, insert coin to get a gumball!'
    }
}
