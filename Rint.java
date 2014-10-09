import java.net.*;
import java.rmi.*;
public interface Rint extends Remote
{
	 public String rev(String s1)throws RemoteException;
     public int cmpr(String s1,String s2)throws RemoteException;
     public String concat(String s1,String s2)throws RemoteException;
     public String ucse(String s1)throws RemoteException;
	public String lcse(String s2)throws RemoteException;
	public void close()throws RemoteException;
}



