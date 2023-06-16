import java.util.*;
import java.awt.*;
import java.awt.event.*;


class MyFrame extends Frame{
	
	public MyFrame(){
		super("GridLayoutDemo");
		setLayout(new GridLayout(3,3,5,5));
		for(int i=1;i<10;i++){
			add(new Button(""+i));
		}
	}

}
	


class GridLayoutDemo{
	public static void main(String[] args){
		MyFrame f=new MyFrame();
		f.setVisible(true);
		f.setSize(500,500);
	}
}