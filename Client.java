import java.net.*;
import java.rmi.*;
import java.io.*;
import java.rmi.Naming.*;
public class Client
{
        public static void main(String args[])throws IOException,NotBoundException
        {
		System.out.println("Enter your IP Address");
		   InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		 String ip=br.readLine();
                Rint f=(Rint)Naming.lookup("//"+ip+"/localhost");
               /* String s1=b.readLine();
		String s2=b.readLine();
                f.cmpr(s1,s2);
                f.rev(s1);
                f.concat(s1,s2);
                f.cse(s1,s2);*/
		
        
	try
	{
	do
	{
	System.out.println("MENU 1.REVERSE 2.COMPARE3.CONCATINATE 4.Uppercase5.Lowercase6.Exit");
		System.out.println("Enter the choice");
		int ch=Integer.parseInt(br.readLine());
	
	int c;
	String r,s1,s2,con,lstr,ustr;
	switch(ch)
	{
	case 1:
		System.out.println("Enter the String");
		 s1=br.readLine();
		r=f.rev(s1);
		System.out.println("reverse is"+r);
		break;
	case 2:
		System.out.println("Enter the String");
		s1=br.readLine();
		System.out.println("Enter the second String");
		s2=br.readLine();
		c=f.cmpr(s1,s2);
		if(c==0)
		 System.out.println("strings are equal");
		else 
		System.out.println("strings are not equal");
		break;
	case 3:
		System.out.println("Enter the String");
		s1=br.readLine();
		System.out.println("Enter the second String");
		 s2=br.readLine();
		con=f.concat(s1,s2);
		System.out.println("The String after concatenation is :"+con);
		break;
	case 4:
		System.out.println("Enter the String");
		 s1=br.readLine();		lstr=f.lcse(s1);
		 System.out.println("lower to upper:"+lstr);
		break;
	case 5:
		System.out.println("Enter the String");
		 s2=br.readLine();
		ustr=f.ucse(s2);
		System.out.println("upper to lower:"+ustr);
		break;

	case 6: f.close();
		System.exit(0);
	default:
		System.out.println("Exit");

	}
}while(true);
  }
 catch(Exception e)
  {
  System.out.println(e.getMessage());
//  e.printStackTrace();
 }
}
}
