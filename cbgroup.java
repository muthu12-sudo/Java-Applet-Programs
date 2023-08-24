import  java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class cbgroup extends Applet implements ItemListener
{
	CheckboxGroup cbg=new CheckboxGroup();
	public void init()
	{
		cbg=new CheckboxGroup();
		Checkbox V=new Checkbox("Violet",cbg,true);
		Checkbox I=new Checkbox("Indigo",cbg,false);
		Checkbox B=new Checkbox("Blue",cbg,false);
		Checkbox G=new Checkbox("Green",cbg,false);
		Checkbox Y=new Checkbox("Yellow",cbg,false);
		Checkbox O=new Checkbox("Orange",cbg,false);
		Checkbox R=new Checkbox("Red",cbg,false);
		add(V);
		add(I);
		add(B);
		add(G);
		add(Y);
		add(O);
		add(R);
		V.addItemListener(this);
		I.addItemListener(this);
		B.addItemListener(this);
		G.addItemListener(this);
		Y.addItemListener(this);
		O.addItemListener(this);
		R.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		String C;
		C=cbg.getSelectedCheckbox().getLabel();
		if(C.equals("Violet"))
		setBackground(new Color(148,0,211));
		if(C.equals("Indigo"))
		setBackground(new Color(75,0,130));
		if(C.equals("Blue"))
		setBackground(Color.blue);
		if(C.equals("Green"))
		setBackground(Color.green);
		if(C.equals("Yellow"))
		setBackground(Color.yellow);
		if(C.equals("Orange"))
		setBackground(Color.orange);
		if(C.equals("Red"))
		setBackground(Color.red);
	}
}

		
		