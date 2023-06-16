import java.util.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements MouseListener{
	int x,y;
	
	public MyFrame(){
		super("DrawWhereCLicked");
		addMouseListener(this);
					
	}
	public void mouseClicked(MouseEvent e){
				x=e.getX();
				y=e.getY();
				repaint();
	}
	public void mousePressed(MouseEvent e){
				
	}
	public void mouseReleased(MouseEvent e){
				
	}
	public void mouseMoved(MouseEvent e){
				
	}
	public void mouseEntered(MouseEvent e){
				
	}
	public void mouseExited(MouseEvent e){
				
	}
	public void paint(Graphics g){
		g.fillRect(x,y,10,10);
	}
}
	


class DrawWhereClicked{
	public static void main(String[] args){
		MyFrame f=new MyFrame();
		f.setVisible(true);
		f.setSize(500,500);
	}
}