import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet code="FreeDraw" height="500" width="500"> </applet>*/

public class FreeDraw extends Applet{
	public static void main(String[] args){
		Frame f=new Frame("Free Drawing");
		f.setSize(500,500);
		f.setVisible(true);
	
		FreeDraw fd=new FreeDraw();
		fd.init();
		
		f.add("Center",fd);
	}
	
	public void init(){
		MyCanvas c=new MyCanvas();
		c.setBackground(Color.yellow);
		
		setLayout(new BorderLayout());
		add("Center",c);
	}
	
	
}
class MyCanvas extends Canvas{
	final int csize=20;
	Point linestart=new Point(0,0);
	
	MyCanvas(){
		addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				linestart.move(e.getX(),e.getY());
			}
		});
		addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseDragged(MouseEvent e){
				Graphics g=getGraphics();
				if(e.isMetaDown()){
					g.setColor(getBackground());
					g.fillOval(e.getX()-(csize/2),e.getY()-(csize/2),csize,csize);
				}
				else{
					g.setColor(Color.black);
					g.drawLine(linestart.x,linestart.y,e.getX(),e.getY());
				}
				linestart.move(e.getX(),e.getY());
			}
		});
	}
	public void paint(Graphics g){
		System.out.println("paint called");
	}
}