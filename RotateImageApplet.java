import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class RotateImageApplet extends Applet implements ActionListener
{
    Image img;
	Button rotate;
	boolean src=true;

    public void init()
    {
		rotate=new Button("Rotate");
        img = getImage(getDocumentBase(), "Image1.jpg");
		rotate.setBounds(600,550,150,50);
		setLayout(null);
		add(rotate);
		rotate.addActionListener(this);
    }

    public void paint(Graphics g)
    {
		if(src==false)
		{
        int imgWidth = img.getWidth(null)/2;
        int imgHeight = img.getHeight(null)/2;
        
        // rotate the image 90 degrees
        Graphics2D g2d = (Graphics2D)g;
        g2d.rotate(Math.toRadians(180));
	
        g2d.drawImage(img,-imgWidth-675,-imgHeight-260, null, this);
		}
		else{
			g.drawImage(img,475,10,this);
		}
    }
	public void actionPerformed(ActionEvent e){
       if(e.getSource()==rotate){
		   if(src==true){
          src=false;
          repaint();
		   }
		   else{
			   src=true;
			   repaint();
		   }
      }

  }	
}
/*
	<applet code="RotateImageApplet.class" height=568 width=1360>
	</applet>
	*/