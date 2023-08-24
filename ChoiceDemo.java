import java.awt.*;
import  java.applet.*;
import java.awt.event.*;
public class ChoiceDemo extends Applet implements ItemListener
{
	Choice C=new Choice();
	Image img;
	public void init()
	{
		C.add("Rose");
		C.add("Lotus");
		C.add("Sunflower");
		C.add("Lilly");
		add(C);
		C.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		String s;
		s=C.getSelectedItem();
		if(s.equals("Rose"))
		    img=getImage(getDocumentBase(),"Rose.jpg");
		else if(s.equals("Lotus"))
		    img=getImage(getDocumentBase(),"Lotus.jpg");
		else if(s.equals("Sunflower"))
		    img=getImage(getDocumentBase(),"Sunflower.jpg");
		else if(s.equals("Lilly"))
		    img=getImage(getDocumentBase(),"Lilly.jpg");
		g.drawImage(img,50,50,this);
	}
}
