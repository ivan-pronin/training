package behavioral.state

class WinnerState implements IState {
    private StateMachine stateMachine

    WinnerState(StateMachine stateMachine) {
        this.stateMachine = stateMachine
    }

    @Override
    void insertCoin() {
        println 'No coins accepted...'
    }

    @Override
    void ejectCoin() {
        println 'No coins ejected...'
    }

    @Override
    void pushButton() {
        println 'Nothing happens'
    }

    @Override
    void dispense() {
        println 'You are a WINNER! Get two gumballs for a coin!'
        stateMachine.releaseBall()
        stateMachine.releaseBall()
        if (stateMachine.getGumsCount() == 0) {
            println 'Oops, out a gumballs!'
            stateMachine.setCurrentState(stateMachine.getSoldOutState())
        } else {
            stateMachine.setCurrentState(stateMachine.getNoCoinState())
        }
    }
}
