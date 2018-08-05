package behavioral.state

class SoldState implements IState {
    StateMachine stateMachine

    SoldState(StateMachine stateMachine) {
        this.stateMachine = stateMachine
    }

    @Override
    void insertCoin() {
        println 'Please, wait, we\'re giving you a gumball!'
    }

    @Override
    void ejectCoin() {
        println 'Sorry, you\'ve already pushed the button'
    }

    @Override
    void pushButton() {
        println 'Pushing button twice won\'t give you a gumball!'
    }

    @Override
    void dispense() {
        stateMachine.releaseBall()
        if (stateMachine.getGumsCount() > 0) {
            stateMachine.setCurrentState(stateMachine.getNoCoinState())
        } else {
            println 'Oops, out a gumballs!'
            stateMachine.setCurrentState(stateMachine.getSoldOutState())
        }
    }
}
