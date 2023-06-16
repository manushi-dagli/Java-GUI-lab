import java.util.*;
import java.awt.*;
import java.awt.event.*;


class MyFrame extends Frame{
		
	public MyFrame(){
		super("Poly");
		repaint();
	}
	public void paint(Graphics g){
		int x[]={20,33,54,67};
		int y[]={32,54,56,87};
		g.fillPolygon(x,y,4);
	}
}


	


class Poly{
	public static void main(String[] args){
		MyFrame f=new MyFrame();
		f.setVisible(true);
		f.setSize(500,500);
	}
}