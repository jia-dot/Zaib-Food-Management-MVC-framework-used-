package VIEW;
import java.io.*;
import java.net.*;
public class MYCLIENT {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Socket s=new Socket("localhost",1234);
InputStream is=s.getInputStream();
DataInputStream dis=new DataInputStream(is);
String st=new String(dis.readUTF());
System.out.println(st);
dis.close();
is.close();
s.close();
	}

}
