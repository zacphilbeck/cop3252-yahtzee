import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingDice extends JPanel
{
        @Override
        public void paintComponent(Graphics g)
        {
                super.paintComponent(g);
		this.setBackground(Color.GREEN);
		setLocation(800,500);
		setSize(800,200);	
              	g.setColor(Color.RED);
		g.fillRect(50,50,80,80);
		g.fillRect(150,50,80,80);
		g.fillRect(250,50,80,80);
		g.fillRect(350,50,80,80);
                g.fillRect(450,50,80,80);
                g.fillRect(550,50,80,80);
                setVisible(true);
        }
}


