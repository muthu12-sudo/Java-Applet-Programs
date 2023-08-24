import java.awt.*;
import  java.applet.*;
import java.awt.event.*;
class menus extends Frame implements ActionListener
{
	Menu m1,m2;
	MenuItem n,save,close,cut,copy,paste;
	MenuBar mb;
	menus()
	{
		setSize(500,500);
		setTitle("menu example");
		mb=new MenuBar();
		m1=new Menu("file");
		m2=new Menu("edit");
		n=new MenuItem("new");
		save=new MenuItem("save");
		close=new MenuItem("close");
		cut=new MenuItem("cut");
		copy=new MenuItem("copy");
		paste=new MenuItem("paste");
		m1.add(n);
		m1.add(save);
		m1.add(close);
        m2.add(cut);	
		m2.add(copy);
		m2.add(paste);
		mb.add(m1);
		mb.add(m2);
		setMenuBar(mb);
		setVisible(true);
		addWindowListener(new MyWindowAdapter());
		close.addActionListener(this);
	}
	class MyWindowAdapter extends WindowAdapter
	{
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
			//setVisible(false);
		}
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s=ae.getActionCommand();
		if(s.equals("close"))
		System.exit(0);
	}
	public static void main(String args[])
	{
		new menus();
	}
}
