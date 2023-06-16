import java.util.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame{
	MyFrame(){
		super("ClosingWindow");
		
		addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent we){
				System.out.println("Windwow Closed");
				System.exit(0);
			}
		});
		
	}
}
	
	//class MyWindowAdapter extends WindowAdapter{
		
	//}


class ClosingWindow{
	public static void main(String[] args){
		MyFrame f=new MyFrame();
		f.setVisible(true);
		f.setSize(500,500);
	}
}