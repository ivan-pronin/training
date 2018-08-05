package behavioral.state

class HasCoinsState implements IState {
    StateMachine stateMachine
    Random randomWinner = new Random(System.currentTimeMillis())

    HasCoinsState(StateMachine stateMachine) {
        this.stateMachine = stateMachine
    }

    @Override
    void insertCoin() {
        println 'You can\'t insert another coin'
    }

    @Override
    void ejectCoin() {
        println 'Coin returned!'
        stateMachine.setCurrentState(stateMachine.getNoCoinState())
    }

    @Override
    void pushButton() {
        println 'You pushed the button...'
        int winner = randomWinner.nextInt(10)
        if (winner == 0 && stateMachine.getGumsCount() > 1) {
            stateMachine.setCurrentState(stateMachine.getWinnerState())
        } else {
            stateMachine.setCurrentState(stateMachine.getSoldState())
        }
    }

    @Override
    void dispense() {
        println 'No gumball dispensed yet! ...'
    }
}
