import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.Container;
import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.JOptionPane;

public class Yahtzee extends JFrame
{
	private JPanel displayPanel;
	private JPanel display2Panel;
	private JLabel firstlabel;
	private JLabel secondlabel;
	private JLabel thirdlabel;
	private JLabel fourthlabel;
	private JLabel fifthlabel;
        private JLabel sixthlabel;
        private JLabel totalscorelabel;
        private JLabel bonuslabel;
        private JLabel totalupperlabel;
        private JLabel lowersectionlabel;
	private JLabel threeofkindlabel;
        private JLabel fourofkindlabel;
        private JLabel fullhouselabel;
        private JLabel SMStraightlabel;
        private JLabel LGStraightlabel;
	private JLabel yahtzeelabel;
	private JLabel chancelabel;
	private JLabel yahtzeebonuslabels;
	private JLabel totallowerlabel;
	private JLabel grandtotallabel;
	private JButton onesJButton;
	private JButton twosJButton;
	private JButton threesJButton;
	private JButton foursJButton;
	private JButton fivesJButton;
	private JButton sixesJButton;
	private JButton threeofkindJButton;
	private JButton fourofkindJButton;
	private JButton fullhouseJButton;
	private JButton SMStraightJButton;
	private JButton LGStraightJButton;
	private JButton yahtzeeJButton;

	public Yahtzee()
	{
		super("Yahtzee Game");
//		onesTextField = new JTextField(10);
//		twosTextField = new JTextField(10);
//		threesTextField = new JTextField(10);
//		foursTextField = new JTextField(10);
		firstlabel = new JLabel();
		secondlabel = new JLabel();
		thirdlabel = new JLabel();
		fourthlabel = new JLabel();
		fifthlabel = new JLabel();
		sixthlabel = new JLabel();
		totalscorelabel = new JLabel();
		bonuslabel = new JLabel();
		totalupperlabel = new JLabel();
		lowersectionlabel = new JLabel();
		threeofkindlabel = new JLabel();
		fourofkindlabel = new JLabel();
		fullhouselabel = new JLabel();
		SMStraightlabel = new JLabel();
		LGStraightlabel = new JLabel();
		yahtzeelabel = new JLabel();
		chancelabel = new JLabel();
		yahtzeebonuslabels = new JLabel();
		totallowerlabel = new JLabel();
		grandtotallabel = new JLabel();
	
		displayPanel = new JPanel();
		display2Panel = new JPanel();
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
		setSize(1800,1800);
		setResizable(false);
//		super("Yahtzee Game");
		getContentPane().setBackground(Color.GREEN);

      	        onesJButton = new JButton("Put in ones score");
     		twosJButton = new JButton("Put in twos score");
        	threesJButton = new JButton("Put in threes score");
       		foursJButton = new JButton("fours score");
       		fivesJButton = new JButton("fives score");
       		sixesJButton = new JButton("six score");
     		threeofkindJButton = new JButton("threeofakind");
        	fourofkindJButton = new JButton("four of kind");
       		fullhouseJButton = new JButton("25");
        	SMStraightJButton = new JButton("30");
    	   	LGStraightJButton = new JButton("40");
        	yahtzeeJButton = new JButton("50");
  
		
		DrawingLayout drawinglayout = new DrawingLayout();
		drawinglayout.setBackground(Color.WHITE);		

		displayPanel.setLayout(new GridLayout(18,0, 20, 20));

		firstlabel.setText("Ones");
		displayPanel.add(firstlabel);
	
		secondlabel.setText("Twos");
		displayPanel.add(secondlabel);

		thirdlabel.setText("Threes");
		displayPanel.add(thirdlabel);

		fourthlabel.setText("Fours");
		displayPanel.add(fourthlabel);

		fifthlabel.setText("Fives");
		displayPanel.add(fifthlabel);
			
		sixthlabel.setText("Sixes");
		displayPanel.add(sixthlabel);

		totalscorelabel.setText("Total Score");
		displayPanel.add(totalscorelabel);
	
		bonuslabel.setText("Bonus");
		displayPanel.add(bonuslabel);

                totalupperlabel.setText("Total Upper Score");
                displayPanel.add(totalupperlabel);

                lowersectionlabel.setText("Lower Section");
                displayPanel.add(lowersectionlabel);

                threeofkindlabel.setText("3 of a kind");
                displayPanel.add(threeofkindlabel);

                fourofkindlabel.setText("4 of a kind");
                displayPanel.add(fourofkindlabel);

                fullhouselabel.setText("Full House");
                displayPanel.add(fullhouselabel);

                SMStraightlabel.setText("SM Straight");
                displayPanel.add(sixthlabel);

                LGStraightlabel.setText("LG Straight");
                displayPanel.add(totalscorelabel);

                yahtzeelabel.setText("Yahtzee");
                displayPanel.add(bonuslabel);

		chancelabel.setText("Chance");
		displayPanel.add(chancelabel);

		yahtzeebonuslabels.setText("Yahtzee Bonus");
		displayPanel.add(yahtzeebonuslabels);

		totallowerlabel.setText("Total Lower Section Score");
		displayPanel.add(totallowerlabel);
		
		grandtotallabel.setText("Grand Total");
		displayPanel.add(grandtotallabel);
	
		add(displayPanel);

		display2Panel.setLayout(new GridLayout(12,0,20,20));
	
		onesJButton.setText("getonesnumber");
		display2Panel.add(onesJButton);
		
		twosJButton.setText("getstwosnumber");
		display2Panel.add(twosJButton);
		
		threesJButton.setText("getthreesnumber");
		display2Panel.add(threesJButton);

		foursJButton.setText("getfoursnumber");
		display2Panel.add(foursJButton);

                fivesJButton.setText("getonesnumber");
                display2Panel.add(fivesJButton);

                sixesJButton.setText("getstwosnumber");
                display2Panel.add(sixesJButton);

                threeofkindJButton.setText("getthreesnumber");
                display2Panel.add(threeofkindJButton);

                fourofkindJButton.setText("getfoursnumber");
                display2Panel.add(fourofkindJButton);
	
                fullhouseJButton.setText("getonesnumber");
                display2Panel.add(fullhouseJButton);

                SMStraightJButton.setText("getstwosnumber");
                display2Panel.add(SMStraightJButton);

                LGStraightJButton.setText("getthreesnumber");
                display2Panel.add(LGStraightJButton);

                yahtzeeJButton.setText("getfoursnumber");
                display2Panel.add(yahtzeeJButton);


		ButtonClick handler = new ButtonClick();
		onesJButton.addActionListener(handler);
		twosJButton.addActionListener(handler);
		threesJButton.addActionListener(handler);
		foursJButton.addActionListener(handler);

		add(display2Panel);
	
		setVisible(true);
	}


	private class ButtonClick implements ActionListener //REPLACE THIS CODE TO ADD NUMBER 
	{						    //ON BUTTON CLICKED TO USER SCORE
        	@Override
        	public void actionPerformed(ActionEvent event)
        	{
                	JOptionPane.showMessageDialog(Yahtzee.this, String.format(
                	"You press: %s", event.getActionCommand()));
        	}
	}

	public static void main(String args[])
	{
		new Yahtzee();
	}
}

