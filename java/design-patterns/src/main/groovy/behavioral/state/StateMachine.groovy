package behavioral.state

class StateMachine {

    IState soldState = new SoldState(this)
    IState soldOutState = new SoldOutState(this)
    IState noCoinState = new NoCoinState(this)
    IState hasCoinState = new HasCoinsState(this)
    IState winnerState = new WinnerState(this)
    IState currentState = soldOutState
    int gumsCount

    StateMachine(int gumsCount) {
        this.gumsCount = gumsCount
        if (gumsCount > 0) {
            currentState = noCoinState
        }
    }

    void insertCoin() {
        currentState.insertCoin()
    }

    void ejectCoin() {
        currentState.ejectCoin()
    }

    void pushButton() {
        currentState.pushButton()
        currentState.dispense()
    }

    void releaseBall() {
        println 'Gumball comes rolling out the slot...'
        gumsCount--
    }

    IState getSoldState() {
        return soldState
    }

    IState getSoldOutState() {
        return soldOutState
    }

    IState getNoCoinState() {
        return noCoinState
    }

    IState getHasCoinState() {
        return hasCoinState
    }

    IState getWinnerState() {
        return winnerState
    }

    @Override
    String toString() {
        return "StateMachine{" +
                "gumsCount=" + gumsCount +
                '}'
    }
}
