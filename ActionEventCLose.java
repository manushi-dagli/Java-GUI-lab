import java.util.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener{
	Button b;
	public MyFrame(){
		super("ActionEventClose");
		setLayout(new FlowLayout());
		b=new Button("Exit");
		add(b);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
			System.exit(0);
	}
}
	


class ActionEventCLose{
	public static void main(String[] args){
		MyFrame f=new MyFrame();
		f.setVisible(true);
		f.setSize(500,500);
	}
}