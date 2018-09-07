package structural.proxy;

public interface MyRemote extends java.rmi.Remote {
    public abstract java.lang.String sayHello() throws java.rmi.RemoteException;
}
