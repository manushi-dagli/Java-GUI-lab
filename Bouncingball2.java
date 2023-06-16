import java.awt.*;
import java.awt.event.*;


class Bouncingball extends Thread{
	Thread t;
	int x,y,dir,height,r,g,b;
	Frame f;
	
	Bouncingball(ThreadGroup tg,Frame f,int h){
		this.f=f;
		height=h;
		x=20;
		y=(int)Math.random()*height;
		dir=-1;
		r=(int)Math.random()*255;
		g=(int)Math.random()*255;
		b=(int)Math.random()*255;
	}
	
	public void run(){
		while(true){
		if(y>=(height-15)){
			dir=1;
		}
		else if(y<=15){
			dir=-1;
		}
		y=y+(dir*5);
		f.repaint();
		try{
		t.sleep(100);
		}
		catch(InterruptedException ie){
			System.out.println(ie);
		}
		}
	}
	
	int getX(){
		return x;
	}
	int getY(){
		return y;
	}
	void setX(int x){
		this.x=x;
	}
	void setY(int y){
		this.y=y;
	}
}

class Bouncingball2 extends Frame implements MouseListener{
	Bouncingball[] arr=new Bouncingball[50];
	int count=0;
	ThreadGroup tg=new ThreadGroup("my Grp");
	
	public static void main(String[] args){
		Frame f=new MyFrame();
		f.setVisible(true);
		f.setSize(500,500);
	}
	public void paint(Graphics g){
		for(int i=0;i<count;i++){
			g.fillOval(arr[i].getX(),arr[i].getY(),20,20);
			g.setColor(new Color(arr[i].r,arr[i].g,arr[i].b));
		}
	}
	Bouncingball2(){
		arr[count]=new Bouncingball(tg,this,500);
		arr[count].start();
		count++;
		addMouseListener(this);
	}
	
	public void mouseClicked(MouseEvent e){
			if(count<20){
				int x,y;
				x=e.getX();
				y=e.getY();
				arr[count]=new Bouncingball(tg,this,500);
				count++;
				arr[count].setX(x);
				arr[count].setY(y);
				arr[count].start();
				}
			}
	
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
}