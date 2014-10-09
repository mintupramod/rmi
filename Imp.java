import java.io.*;
import java.rmi.*;
import java.lang.String;
import java.rmi.server.*;
public class Imp extends UnicastRemoteObject implements Rint
{

        public Imp()throws RemoteException
        {
        //      throw new RemoteException();
        }
	  public String rev(String s1)throws RemoteException
        {
                String r="";
                int l=s1.length();
                for(int i=l-1;i>=0;i--)
                {
                        r=r+s1.charAt(i);
                }
                return(r);
               // System.out.println("Reverse:"+r);
        }

        public int cmpr(String s1,String s2)throws RemoteException
        {
               int c;
      if(s1.compareTo(s2)>0)
      {
	c=1;
       
      }
      else if(s1.compareTo(s2)<0)
      {
c=2;
         
      }
      else
      { 
c=0;
       
      }
return(c);
   }
	
                /*if(c!=0)
                {
                        System.out.println("Strings are equal");
                }
                else
                        System.out.println("strings are not equal");
        }*/
        
        public String concat(String s1,String s2)throws RemoteException
        {
                s1=s1+s2;
		return(s1);
		 // System.out.println("Concatenation:"+s1);
        }
    /*    public void cse(String s1,String s2)throws RemoteException
        {
		
                s1=s1.toLowerCase();
                System.out.println("lower:"+s1);
                s2=s2.toUpperCase();
                System.out.println("upper:"+s2);
        }

}*/
 public String ucse(String s1)throws RemoteException
   
   {
     String lstr;
     lstr=s1.toLowerCase();
	return(lstr);
   }

  public String lcse(String s2)throws RemoteException
   
   {
     String ustr;
     ustr=s2.toUpperCase();
	return(ustr);
   }
  public void close()throws RemoteException
	{
		System.exit(0);
	}
}
