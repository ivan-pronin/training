package structural.proxy.statemachine;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ProxyMonitorDemo {

    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        String location = "rmi://127.0.0.1/Statemachine";
        IStateMachineRemote machineRemote = (IStateMachineRemote) Naming.lookup(location);
        MachineMonitor monitor = new MachineMonitor(machineRemote);
        System.out.println(monitor);
        monitor.report();
    }
}
