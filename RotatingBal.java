import java.awt.*;

class RotatingBallFrame extends Frame implements Runnable{
	int xOrigin;
	int yOrigin;
	int radius=100;
	int ballradius=10;
	double currAngle;
	Thread t;
	
	RotatingBallFrame(int x,int y,double angle){
		xOrigin=x;
		yOrigin=y;
		currAngle=angle;
		setBackground(Color.black);
		t=new Thread(this,"RotatingBall");
		t.start();
	}
	
	public void run(){
		while(true){
			currAngle+=2;
			repaint();
			try{
			t.sleep(100);
			}
			catch(InterruptedException ie){
				System.out.println(ie.getMessage());
			}
		}
	}
	
	public void paint(Graphics g){
		g.setColor(Color.white);
		g.drawOval(xOrigin-radius,yOrigin-radius,radius*2,radius*2);
		
		int ballx,bally;
		ballx=(int)(radius*Math.cos(currAngle*Math.PI/180));
		bally=(int)(radius*Math.sin(currAngle*Math.PI/180));
		
		g.setColor(Color.RED);
		g.fillOval(ballx+xOrigin-ballradius,bally+yOrigin-ballradius,ballradius*2,ballradius*2);
	}
	
	
}

class RotatingBal{
	public static void main(String[] args){
		RotatingBallFrame f=new RotatingBallFrame(200,200,0);
		f.setSize(500,500);
		f.setVisible(true);
	}
}