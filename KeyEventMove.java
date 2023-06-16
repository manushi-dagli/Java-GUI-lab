import java.util.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements KeyListener{
	char keyChar='M';
	int x=50,y=50;
	
	public MyFrame(){
		super("KeyEventMove");
		addKeyListener(this);
					
	}
	public void keyPressed(KeyEvent e){
		switch(e.getKeyCode()){
			case KeyEvent.VK_DOWN:y+=20;break;
			case KeyEvent.VK_UP:y-=20;break;
			case KeyEvent.VK_LEFT:x-=20;break;
			case KeyEvent.VK_RIGHT:x+=20;break;
		}
		repaint();
	}
	
	public void keyTyped(KeyEvent e){
				
	}
	public void keyReleased(KeyEvent e){
				
	}
	public void paint(Graphics g){
		g.drawString(String.valueOf(keyChar),x,y);
	}
	
}
	


class KeyEventMove{
	public static void main(String[] args){
		MyFrame f=new MyFrame();
		f.setVisible(true);
		f.setSize(500,500);
	}
}