import java.util.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements MouseListener{
	int x,y;
	
	public MyFrame(){
		super("PDrawWhereCLicked");
		addMouseListener(this);
					
	}
	public void mouseClicked(MouseEvent e){
				x=e.getX();
				y=e.getY();
				Graphics g=getGraphics();
				g.fillRect(x,y,10,10);
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
}
	


class PDrawWhereClicked{
	public static void main(String[] args){
		MyFrame f=new MyFrame();
		f.setVisible(true);
		f.setSize(500,500);
	}
}