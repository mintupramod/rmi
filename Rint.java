import java.net.*;
import java.rmi.*;
public interface Rint extends Remote
{
     public void cmpr(String s1,String s2)throws RemoteException;
     public void concat(String s1,String s2)throws RemoteException;
     public void cse(String s1, String s2)throws RemoteException;
     public void rev(String s1)throws RemoteException;
}

