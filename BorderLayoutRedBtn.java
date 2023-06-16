import java.util.*;
import java.awt.*;
import java.awt.event.*;

class MyButton extends Button{
	
	MyButton(String title){
		super(title);
	}
	
	public void paint(Graphics g){
		setBackground(Color.RED);
		setForeground(Color.BLACK);
	}
}

class MyFrame extends Frame{
	
	public MyFrame(){
		super("ActionEventClose");
		add("Center",new MyButton("Center"));
		add("North",new Button("North"));
		add("South",new Button("South"));
		add("West",new Button("West"));
		add("East",new Button("East"));
	}
	public void actionPerformed(ActionEvent e){
			System.exit(0);
	}
}
	


class BorderLayoutRedBtn{
	public static void main(String[] args){
		MyFrame f=new MyFrame();
		f.setVisible(true);
		f.setSize(500,500);
	}
}