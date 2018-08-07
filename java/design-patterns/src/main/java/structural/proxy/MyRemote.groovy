package structural.proxy

import java.rmi.Remote
import java.rmi.RemoteException

interface MyRemote extends Remote {

    String sayHello() throws RemoteException
}