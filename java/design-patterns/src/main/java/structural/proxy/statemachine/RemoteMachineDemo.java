package structural.proxy.statemachine;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class RemoteMachineDemo {

    public static void main(String[] args) {
        IStateMachineRemote machine;
        int gumsCount;
        if (args.length < 2) {
            System.out.println("Wrong args number, need <name>, <gumsCount>");
            System.exit(1);
        }

        try {
            gumsCount = Integer.parseInt(args[1]);
            String location = args[0];
            machine = new StateMachineRemote(location, gumsCount);
            Naming.rebind("Statemachine", machine);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
