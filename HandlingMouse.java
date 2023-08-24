import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class HandlingMouse extends Applet implements 
MouseListener,MouseMotionListener
{
	int x=10,y=10;
	String S="OK";
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void mouseClicked(MouseEvent e)
	{
		x=e.getX();
		y=e.getY();
		setBackground(Color.cyan);
		showStatus("Clicked at X="+x+"Y="+y);
		S="Mouse Clicked";
		repaint();
	}
	public void mouseEntered(MouseEvent e)
	{
		setBackground(Color.yellow);
		showStatus("Mouse Entered");
		S="Mouse Entered";
		repaint();
	}
	public void mouseExited(MouseEvent e)
	{
		setBackground(Color.black);
		showStatus("Mouse Exited");
		S="Mouse Exited";
		repaint();
	}
	public void mousePressed(MouseEvent e)
	{
		setBackground(Color.red);
		showStatus("Mouse pressed");
		S="Mouse pressed";
		repaint();
	}
	public void mouseReleased(MouseEvent e)
	{
		setBackground(Color.white);
		showStatus("Mouse Released");
		S=("Mouse Released");
		repaint();
	}
	public void mouseDragged(MouseEvent e)
	{
		x=e.getX();
		y=e.getY();
		setBackground(Color.green);
		showStatus("Mouse Dragged at X="+x+"Y="+y);
		S="Mouse Dragged";
		repaint();
	}
	public void mouseMoved(MouseEvent e)
	{
		x=e.getX();
		y=e.getY();
		setBackground(Color.blue);
		showStatus("Mouse moved at X="+x+"Y="+y);
		S="Mouse Moved";
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(S,x,y);
	}
}