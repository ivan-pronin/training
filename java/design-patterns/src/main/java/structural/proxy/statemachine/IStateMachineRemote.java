package structural.proxy.statemachine;

import behavioral.state.IState;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IStateMachineRemote extends Remote {

    int getGumsCount() throws RemoteException;

    String getLocation() throws RemoteException;

    IState getState() throws RemoteException;
}
