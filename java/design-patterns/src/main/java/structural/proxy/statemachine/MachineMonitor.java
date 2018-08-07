package structural.proxy.statemachine;

import java.rmi.RemoteException;

public class MachineMonitor {

    IStateMachineRemote stateMachineRemote;

    public MachineMonitor(IStateMachineRemote stateMachineRemote) {
        this.stateMachineRemote = stateMachineRemote;
    }

    void report()
    {
        try {
            System.out.println("Machine at: " + stateMachineRemote.getLocation());
            System.out.println("Inventory, gums: " + stateMachineRemote.getGumsCount());
            System.out.println("Current state: " + stateMachineRemote.getState());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
