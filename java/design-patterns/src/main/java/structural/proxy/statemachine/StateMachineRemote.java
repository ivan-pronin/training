package structural.proxy.statemachine;

import behavioral.state.IState;
import behavioral.state.StateMachine;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class StateMachineRemote extends UnicastRemoteObject implements IStateMachineRemote {

    private StateMachine stateMachine;
    private String location;

    public StateMachineRemote(String location, int gumsCount) throws RemoteException {
        this.location = location;
        this.stateMachine = new StateMachine(gumsCount);
    }

    public void insertCoin() {
        stateMachine.insertCoin();
    }

    public void ejectCoin() {
        stateMachine.ejectCoin();
    }

    public void pushButton() {
        stateMachine.pushButton();
    }

    @Override
    public String toString() {
        return stateMachine.toString();
    }

    @Override
    public int getGumsCount() throws RemoteException {
        return stateMachine.getGumsCount();
    }

    @Override
    public String getLocation() throws RemoteException {
        return location;
    }

    @Override
    public IState getState() throws RemoteException {
        return stateMachine.getCurrentState();
    }
}
