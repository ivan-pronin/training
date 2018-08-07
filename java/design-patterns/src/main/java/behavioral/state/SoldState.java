package behavioral.state;

public class SoldState implements IState {
    public SoldState(StateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Please, wait, we\'re giving you a gumball!");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Sorry, you\'ve already pushed the button");
    }

    @Override
    public void pushButton() {
        System.out.println("Pushing button twice won\'t give you a gumball!");
    }

    @Override
    public void dispense() {
        stateMachine.releaseBall();
        if (stateMachine.getGumsCount() > 0) {
            stateMachine.setCurrentState(stateMachine.getNoCoinState());
        } else {
            System.out.println("Oops, out a gumballs!");
            stateMachine.setCurrentState(stateMachine.getSoldOutState());
        }

    }

    public StateMachine getStateMachine() {
        return stateMachine;
    }

    public void setStateMachine(StateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    private transient StateMachine stateMachine;
}
