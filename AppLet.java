import java.awt.*;
import java.applet.*;

/*<applet code="AppLet" height="500" width="500"> </applet> */

public class AppLet extends Applet{
	public void init(){
		System.out.println("Init");
	}
	public void start(){
		System.out.println("Strt");
	}
	public void stop(){
		System.out.println("Stop");
	}
	public void destroy(){
		System.out.println("Ddestroy");
	}
	
	public void paint(Graphics g){
		setBackground(Color.yellow);
		System.out.println("Paint");
	}
}