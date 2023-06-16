import java.util.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements MouseMotionListener{
	int x,y;
	
	public MyFrame(){
		super("MouseMove");
		addMouseMotionListener(this);
					
	}
	public void mouseMoved(MouseEvent e){
				x=e.getX();
				y=e.getY();
				repaint();
	}
	public void mouseDragged(MouseEvent e){
				
	}
	public void paint(Graphics g){
		g.drawString("("+x+","+y+")",x,y);
	}
}
	


class MouseMove{
	public static void main(String[] args){
		MyFrame f=new MyFrame();
		f.setVisible(true);
		f.setSize(500,500);
	}
}