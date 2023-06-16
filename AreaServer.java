import java.net.*;
import java.io.*;

class AreaServer{
	public static void main(String[] args){
		ServerSocket ss=new ServerSocket(5000);
		while(true){
		Socket s=ss.accept();
		BufferedReader brfromClient=new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintWriter toClient=new PrintWriter(s.getOutputStream(),true);
		}
	}
}