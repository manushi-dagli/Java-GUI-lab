import java.util.*;
import java.awt.*;
import java.awt.event.*;


class MyFrame extends Frame{
	
	public void getButtonPanel(String label){
		Panel inner=new Panel();
		inner.setLayout(new BorderLayout());
		inner.add("North",new Button("Button"));
		inner.add("Center",new Button("Button"));
		inner.add("South",new Button("Button"));
	}
	
	public MyFrame(){
		super("PanelExam");
		Container outerPanel=new Container();
		outerPanel.setLayout(new GridLayout(1,2));
		outerPanel.add(getButtonPanel("Button"));
		for(int i=0;i<3;i++){
			outerPanel.add(new Button("Button "+i));
		}
		add("Center",outerPanel);
		}
	}


	


class PanelExam{
	public static void main(String[] args){
		MyFrame f=new MyFrame();
		f.setVisible(true);
		f.setSize(500,500);
	}
}