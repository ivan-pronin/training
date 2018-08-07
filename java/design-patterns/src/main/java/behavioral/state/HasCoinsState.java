package behavioral.state;

import java.util.Random;

public class HasCoinsState implements IState {
    
    public HasCoinsState(StateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println( "You can\'t insert another coin");
    }

    @Override
    public void ejectCoin() {
        System.out.println( "Coin returned!");
        stateMachine.setCurrentState(stateMachine.getNoCoinState());
    }

    @Override
    public void pushButton() {
        System.out.println( "You pushed the button...");
        int winner = randomWinner.nextInt(10);
        if (winner == 0 && stateMachine.getGumsCount() > 1) {
            stateMachine.setCurrentState(stateMachine.getWinnerState());
        } else {
            stateMachine.setCurrentState(stateMachine.getSoldState());
        }

    }

    @Override
    public void dispense() {
        System.out.println( "No gumball dispensed yet! ...");
    }

    public StateMachine getStateMachine() {
        return stateMachine;
    }

    public void setStateMachine(StateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    public Random getRandomWinner() {
        return randomWinner;
    }

    public void setRandomWinner(Random randomWinner) {
        this.randomWinner = randomWinner;
    }

    private transient StateMachine stateMachine;
    private Random randomWinner = new Random(System.currentTimeMillis());
}
