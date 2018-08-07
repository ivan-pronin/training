package behavioral.state;

public class WinnerState implements IState {

    transient private StateMachine stateMachine;

    public WinnerState(StateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println( "No coins accepted...");
    }

    @Override
    public void ejectCoin() {
        System.out.println( "No coins ejected...");
    }

    @Override
    public void pushButton() {
        System.out.println( "Nothing happens");
    }

    @Override
    public void dispense() {
        System.out.println( "You are a WINNER! Get two gumballs for a coin!");
        stateMachine.releaseBall();
        stateMachine.releaseBall();
        if (stateMachine.getGumsCount() == 0) {
            System.out.println( "Oops, out a gumballs!");
            stateMachine.setCurrentState(stateMachine.getSoldOutState());
        } else {
            stateMachine.setCurrentState(stateMachine.getNoCoinState());
        }

    }
}
