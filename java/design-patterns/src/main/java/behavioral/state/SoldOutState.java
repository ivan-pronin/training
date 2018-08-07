package behavioral.state;

public class SoldOutState implements IState {
    public SoldOutState(StateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println( "Sorry, out of gumballs, no coins accepted...");
    }

    @Override
    public void ejectCoin() {
        System.out.println( "Nothing to eject, no coin inserted");
    }

    @Override
    public void pushButton() {
        System.out.println( "Sorry, out of gumballs");
    }

    @Override
    public void dispense() {
        System.out.println( "Sorry, out of gumballs, nothing to dispense...");
    }

    public StateMachine getStateMachine() {
        return stateMachine;
    }

    public void setStateMachine(StateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    private transient StateMachine stateMachine;
}
