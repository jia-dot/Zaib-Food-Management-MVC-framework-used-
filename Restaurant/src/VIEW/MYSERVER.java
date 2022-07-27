package VIEW;
import java.io.*;
import java.net.*;
public class MYSERVER {
	public static void main (String args[]) throws IOException{
		
	ServerSocket ss=new ServerSocket(1234);
	Socket s=ss.accept();
	OutputStream sos=s.getOutputStream();
	DataOutputStream dos=new DataOutputStream(sos);
	dos.writeUTF("Hello");
	dos.close();
	sos.close();
	s.close();
	ss.close();
	}
}
