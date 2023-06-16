import java.awt.*;
import java.awt.event.*;

class LadderFrame extends Frame implements Runnable,ActionListener{
	int xOrigin,yOrigin;
	int LStartX,LStartY;
	int LEndX,LEndY;
	Thread t;
	Button Start;
	
	LadderFrame(){
		Start=new Button("Start");
		t=new Thread(this,"Sliding Ladder");
		
		setBackground(Color.black);
		Start.addActionListener(this);
		
		xOrigin=500;
		yOrigin=500;
		
		add(Start);
		setLayout(new FlowLayout());
	}
	
	public void actionPerformed(ActionEvent ae){
		LStartX=xOrigin;
		LStartY=yOrigin-300;
		LEndX=xOrigin+400;
		LEndY=yOrigin;
		
		t=new Thread(this,"Ladder");
		t.start();
	}
	
	public void run(){
		while(true){
			if(LStartY==yOrigin){ 
				t.stop();
			}
		LStartY+=10;
		LEndX+=10;
		try{
			t.sleep(100);
		}
		catch(InterruptedException ie){
			System.out.println(ie);
		}
		repaint();
		}
	}
	
	public void paint(Graphics g){
		g.setColor(Color.white);
		g.drawLine(xOrigin-25,yOrigin,xOrigin+525,yOrigin);
		g.drawLine(xOrigin,yOrigin+25,xOrigin,yOrigin-325);
		
		g.setColor(Color.red);
		g.drawLine(LStartX,LStartY,LEndX,LEndY);
		
	}
} 

class ladder{
	public static void main(String[] args){
		LadderFrame lf=new LadderFrame();
		lf.setVisible(true);
		lf.setSize(7000,7000);
	}
}