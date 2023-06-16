import java.util.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener{
	TextField op1;
	TextField op2;
	TextField ans;
	Label l1,l2,l3;
	Button add,sub,mul,div;
	
	
	public MyFrame(){
		super("Gui Calc");
		
		l1=new Label("Num1");
		l2=new Label("Num2");
		l3=new Label("Answer");
		
		op1=new TextField(4);
		op2=new TextField(4);
		ans=new TextField(8);
		ans.setEditable(false);
		
		Panel up=new Panel();
		up.add(l1);
		up.add(op1);
		
		up.add(l2);
		up.add(op2);
		
		up.add(l3);
		up.add(ans);
		
		add("North",up);
		
		Panel down=new Panel();
		down.add(add=new Button("Add"));
		down.add(sub=new Button("Sub"));
		down.add(mul=new Button("Mul"));
		down.add(div=new Button("Div"));
		
		add("South",down);
		
		add.addActionListener(this);
		div.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
					
	}
	public void actionPerformed(ActionEvent e){
		int num1,num2,result;
		String arg=e.getActionCommand();
		num1=Integer.parseInt(op1.getText().trim());
		num2=Integer.parseInt(op2.getText().trim());
		
			if(arg.equals("Add")){
				result=num1+num2;
			ans.setText(""+result);
			}
			
			else if(arg.equals("Sub")){
				result=num1-num2;
			ans.setText(""+result);
			}
				
			else if(arg.equals("Mul")){
				result=num1*num2;
			    ans.setText(""+result);
			}
				
			else{
				result=num1/num2;
			    ans.setText(""+result);
			}
			
		}
	}
	
	

	


class GuiCalc{
	public static void main(String[] args){
		MyFrame f=new MyFrame();
		f.setVisible(true);
		f.setSize(300,100);
	}
}