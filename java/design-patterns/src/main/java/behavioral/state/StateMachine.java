package behavioral.state;

public class StateMachine {

    private IState soldState = new SoldState(this);
    private IState soldOutState = new SoldOutState(this);
    private IState noCoinState = new NoCoinState(this);
    private IState hasCoinState = new HasCoinsState(this);
    private IState winnerState = new WinnerState(this);
    private IState currentState = soldOutState;
    private int gumsCount;

    public StateMachine(int gumsCount) {
        this.gumsCount = gumsCount;
        if (gumsCount > 0) {
            currentState = noCoinState;
        }
    }

    public void insertCoin() {
        currentState.insertCoin();
    }

    public void ejectCoin() {
        currentState.ejectCoin();
    }

    public void pushButton() {
        currentState.pushButton();
        currentState.dispense();
    }

    public void releaseBall() {
        System.out.println("Gumball comes rolling out the slot...");
        gumsCount = gumsCount--;
    }

    public IState getSoldState() {
        return soldState;
    }

    public IState getSoldOutState() {
        return soldOutState;
    }

    public IState getNoCoinState() {
        return noCoinState;
    }

    public IState getHasCoinState() {
        return hasCoinState;
    }

    public IState getWinnerState() {
        return winnerState;
    }

    @Override
    public String toString() {
        return "StateMachine{" + "gumsCount=" + gumsCount + "}";
    }

    public void setSoldState(IState soldState) {
        this.soldState = soldState;
    }

    public void setSoldOutState(IState soldOutState) {
        this.soldOutState = soldOutState;
    }

    public void setNoCoinState(IState noCoinState) {
        this.noCoinState = noCoinState;
    }

    public void setHasCoinState(IState hasCoinState) {
        this.hasCoinState = hasCoinState;
    }

    public void setWinnerState(IState winnerState) {
        this.winnerState = winnerState;
    }

    public IState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(IState currentState) {
        this.currentState = currentState;
    }

    public int getGumsCount() {
        return gumsCount;
    }

    public void setGumsCount(int gumsCount) {
        this.gumsCount = gumsCount;
    }
}
