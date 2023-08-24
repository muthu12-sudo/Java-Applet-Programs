import  java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class checkbox extends Applet implements ItemListener
{
	Checkbox cb1=new Checkbox("Windows 98/XP");
	Checkbox cb2=new Checkbox("Windows NT/2000");
	Checkbox cb3=new Checkbox("Solaris");
	Checkbox cb4=new Checkbox("MacOS");
	TextArea txt=new TextArea(10,50);
	public void init()
	{
		add(cb1);
		add(cb2);
		add(cb3);
		add(cb4);
		add(txt);
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		cb4.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		String s;
		s="Current State";
		txt.setText(s);
		s="\n"+"Windows 98/XP:"+cb1.getState();
		txt.append(s);
		s="\n"+"Windows NT/2000:"+cb2.getState();
		txt.append(s);
		s="\n"+"Solaris"+cb3.getState();
		txt.append(s);
		s="\n"+"MacOS"+cb4.getState();
		txt.append(s);
	}
}
