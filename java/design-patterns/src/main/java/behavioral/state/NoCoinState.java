package behavioral.state;

public class NoCoinState implements IState {
    public NoCoinState(StateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println( "You inserted coin");
        stateMachine.setCurrentState(stateMachine.getHasCoinState());
    }

    @Override
    public void ejectCoin() {
        System.out.println( "Nothing to eject =)");
    }

    @Override
    public void pushButton() {
        System.out.println( "Please, insert coin to get a gumball!");
    }

    @Override
    public void dispense() {
        System.out.println( "Please, insert coin to get a gumball!");
    }

    public StateMachine getStateMachine() {
        return stateMachine;
    }

    public void setStateMachine(StateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    private transient StateMachine stateMachine;
}
