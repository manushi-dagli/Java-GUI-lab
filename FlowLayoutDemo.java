import java.util.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame{
	
	public void addBtn(){
		for(int i=0;i<15;i++){
			add(new Button("Button "+i));
		}
	}
	public MyFrame(){
		super("FlowLayoutDemo");
		setLayout(new FlowLayout(FlowLayout.LEFT));
		addBtn();
	}
	
	
	
}
	


class FlowLayoutDemo{
	public static void main(String[] args){
		MyFrame f=new MyFrame();
		f.setVisible(true);
		f.setSize(500,500);
	}
}