import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/* <applet code="DragRect" height="500" width="500"> </applet>*/

public class DragRect extends Applet{
	int sx=0,sy=0,ex=0,ey=0;
	
	public void init(){
		addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				sx=e.getX();
				sy=e.getY();
			}
			public void mouseClicked(MouseEvent e){
				Graphics g=getGraphics();
				g.drawString("Button is clicked at "+e.getX()+","+e.getY()+" for "+e.getClickCount()+" times.",e.getX(),e.getY());
			}
		});
		addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseDragged(MouseEvent e){
				ex=e.getX();
				ey=e.getY();
				repaint();
			}
			
		});
	}
	
	public void paint(Graphics g){
		g.drawRect(sx,sy,ex-sx,ey-sy);
	}
	
}