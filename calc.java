import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class calc extends Applet implements ActionListener
{
	String msg="";
	int v1,v2,result;
	TextField t1=new TextField(10);
	Button b[]=new Button[10];
	Button add,sub,mul,div,mod,clr,eq;
	char op;
	public void init()
	{
		setBackground(Color.green);
		GridLayout g1=new GridLayout(4,5);
		setLayout(g1);
		for(int i=0;i<10;i++)
		{
			b[i]=new Button(""+i);
		}
		add=new Button("+");
		sub=new Button("-");
		mul=new Button("*");
		div=new Button("/");
		mod=new Button("%");
		clr=new Button("clear");
		eq=new Button("=");
		add(t1);
		for(int i=0;i<10;i++)
		{
			add(b[i]);
		}
		add(add);
		add(sub);
		add(mul);
		add(div);
		add(mod);
		add(clr);
		add(eq);
		for(int i=0;i<10;i++)
		{
			b[i].addActionListener(this);
		}
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		mod.addActionListener(this);
		clr.addActionListener(this);
		eq.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str=ae.getActionCommand();
		char ch=str.charAt(0);
		if(Character.isDigit(ch))
		         t1.setText(t1.getText()+str);
		else if(str.equals("+"))
		{
			v1=Integer.parseInt(t1.getText());
			op='+';
			t1.setText("");
		}
		else if(str.equals("-"))
		{
			v1=Integer.parseInt(t1.getText());
			op='-';
			t1.setText("");
		}
		else if(str.equals("*"))
		{
			v1=Integer.parseInt(t1.getText());
			op='*';
			t1.setText("");
		}
		else if(str.equals("/"))
		{
			v1=Integer.parseInt(t1.getText());
			op='/';
			t1.setText("");
		}
		else if(str.equals("%"))
		{
			v1=Integer.parseInt(t1.getText());
			op='%';
			t1.setText("");
		}
		else if(str.equals("="))
		{
			v2=Integer.parseInt(t1.getText());
			if(op=='+')
			      result=v1+v2;
			else if(op=='-')
			      result=v1-v2;
		    else if(op=='*')
			      result=v1*v2;
			else if(op=='/')
			      result=v1/v2;
		    else if(op=='%')
			      result=v1%v2;
		    t1.setText(""+result);
		}
		if(str.equals("clear"))
		{
			t1.setText("");
		}
	}
}

		
				  
				
		    			
			
		