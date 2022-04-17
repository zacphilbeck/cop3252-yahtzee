import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
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
import java.awt.Font;

public class YahtzeeGameDisplay extends JFrame
{
	private JPanel displayPanel;
	private JPanel display2Panel;
	private JLabel blanklabel;
	private JLabel firstplayerlabel;
	private JLabel secondplayerlabel;
	private JLabel thirdplayerlabel;
	private JLabel fourthplayerlabel;
	private JLabel firstlabel;
	private JLabel secondlabel;
	private JLabel thirdlabel;
	private JLabel fourthlabel;
	private JLabel fifthlabel;
        private JLabel sixthlabel;
        private JLabel lowersumlabel;
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
	private JLabel titlelabel;

        private JLabel firstlabel2;
        private JLabel secondlabel2;
        private JLabel thirdlabel2;
        private JLabel fourthlabel2;
        private JLabel fifthlabel2;
        private JLabel sixthlabel2; 
        private JLabel threeofkindlabel2;
        private JLabel fourofkindlabel2;
        private JLabel fullhouselabel2; 
        private JLabel SMStraightlabel2;
        private JLabel LGStraightlabel2;
        private JLabel yahtzeelabel2;
        private JLabel chancelabel2;
  	
	private JLabel player1label;
        private JLabel player1ones;
        private JLabel player1twos;
        private JLabel player1threes;
        private JLabel player1fours;
        private JLabel player1fives;
        private JLabel player1sixes;
        private JLabel player1lowersum;
        private JLabel player1bonus;
        private JLabel player1threeofkind;
        private JLabel player1fourofkind;
        private JLabel player1fullhouse;
        private JLabel player1SMStraight;
        private JLabel player1LGStraight;
        private JLabel player1chance;
        private JLabel player1yahtzee;
        private JLabel player1grandtotal;
  
	private JLabel player2label;
        private JLabel player2ones;
        private JLabel player2twos;
        private JLabel player2threes;
        private JLabel player2fours;
        private JLabel player2fives;
        private JLabel player2sixes;
        private JLabel player2lowersum;
        private JLabel player2bonus;
        private JLabel player2threeofkind;
        private JLabel player2fourofkind;
        private JLabel player2fullhouse;
        private JLabel player2SMStraight;
        private JLabel player2LGStraight;
        private JLabel player2chance;
        private JLabel player2yahtzee;
        private JLabel player2grandtotal;

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
	private JButton chanceJButton;
	private JButton yahtzeeJButton;

	public YahtzeeGameDisplay()
	{
		super("Yahtzee Game");

        	onesJButton = new JButton();
       		twosJButton = new JButton();
       		threesJButton = new JButton();
        	foursJButton = new JButton();
        	fivesJButton = new JButton();
        	sixesJButton = new JButton();
      		threeofkindJButton = new JButton();
        	fourofkindJButton = new JButton();
        	fullhouseJButton = new JButton();
        	SMStraightJButton = new JButton();
        	LGStraightJButton = new JButton();
      		chanceJButton = new JButton(); 
	 	yahtzeeJButton = new JButton();

		blanklabel = new JLabel("");
		firstlabel = new JLabel("Ones", JLabel.CENTER);
		secondlabel = new JLabel("Twos", JLabel.CENTER);
		thirdlabel = new JLabel("Threes", JLabel.CENTER);
		fourthlabel = new JLabel("Fours", JLabel.CENTER);
		fifthlabel = new JLabel("Fives", JLabel.CENTER);
		sixthlabel = new JLabel("Sixes", JLabel.CENTER);
		lowersumlabel = new JLabel("Sum", JLabel.CENTER);
		bonuslabel = new JLabel("Bonus", JLabel.CENTER);
		threeofkindlabel = new JLabel("3 of a kind", JLabel.CENTER);
		fourofkindlabel = new JLabel("4 of a kind", JLabel.CENTER);
		fullhouselabel = new JLabel("Full house", JLabel.CENTER);
		SMStraightlabel = new JLabel("SM straight", JLabel.CENTER);
		LGStraightlabel = new JLabel("LG straight", JLabel.CENTER);
		chancelabel = new JLabel("Chance", JLabel.CENTER);
		yahtzeelabel = new JLabel("Yahtzee", JLabel.CENTER);
		grandtotallabel = new JLabel("Total Score", JLabel.CENTER);
		firstplayerlabel = new JLabel("Player 1", JLabel.CENTER);
 
                firstlabel2 = new JLabel("Ones", JLabel.CENTER);
                secondlabel2 = new JLabel("Twos", JLabel.CENTER);
                thirdlabel2 = new JLabel("Threes", JLabel.CENTER);
                fourthlabel2 = new JLabel("Fours", JLabel.CENTER);
                fifthlabel2 = new JLabel("Fives", JLabel.CENTER);
                sixthlabel2 = new JLabel("Sixes", JLabel.CENTER);
                threeofkindlabel2 = new JLabel("3 of a kind", JLabel.CENTER);
                fourofkindlabel2 = new JLabel("4 of a kind", JLabel.CENTER);
                fullhouselabel2 = new JLabel("Full house", JLabel.CENTER);
                SMStraightlabel2 = new JLabel("SM straight", JLabel.CENTER);
                LGStraightlabel2 = new JLabel("LG straight", JLabel.CENTER);
                chancelabel2 = new JLabel("Chance", JLabel.CENTER);
                yahtzeelabel2 = new JLabel("Yahtzee", JLabel.CENTER);

		player1label = new JLabel("Player 1", JLabel.CENTER);
	       	player1ones = new JLabel("", JLabel.CENTER);
         	player1twos = new JLabel("", JLabel.CENTER);
        	player1threes = new JLabel("", JLabel.CENTER);
       		player1fours = new JLabel("", JLabel.CENTER);
        	player1fives = new JLabel("", JLabel.CENTER) ;
        	player1sixes = new JLabel("", JLabel.CENTER);
        	player1lowersum = new JLabel("", JLabel.CENTER);
       		player1bonus = new JLabel("", JLabel.CENTER);   
         	player1threeofkind = new JLabel("", JLabel.CENTER);
        	player1fourofkind = new JLabel("", JLabel.CENTER);
       		player1fullhouse = new JLabel("", JLabel.CENTER);
       		player1SMStraight = new JLabel("", JLabel.CENTER);
      		player1LGStraight = new JLabel("", JLabel.CENTER);
      		player1chance = new JLabel("", JLabel.CENTER);  
      		player1yahtzee = new JLabel("", JLabel.CENTER); 
       		player1grandtotal = new JLabel("", JLabel.CENTER);

		player2label = new JLabel("Player 2", JLabel.CENTER);
                player2ones = new JLabel("", JLabel.CENTER);
                player2twos = new JLabel("", JLabel.CENTER); 
                player2threes = new JLabel("", JLabel.CENTER);
                player2fours = new JLabel("", JLabel.CENTER);
                player2fives = new JLabel("", JLabel.CENTER) ;
                player2sixes = new JLabel("", JLabel.CENTER);
                player2lowersum = new JLabel("", JLabel.CENTER);
                player2bonus = new JLabel("", JLabel.CENTER);
                player2threeofkind = new JLabel("", JLabel.CENTER);
                player2fourofkind = new JLabel("", JLabel.CENTER);
                player2fullhouse = new JLabel("", JLabel.CENTER);
                player2SMStraight = new JLabel("", JLabel.CENTER);
                player2LGStraight = new JLabel("", JLabel.CENTER);
                player2chance = new JLabel("", JLabel.CENTER); 
                player2yahtzee = new JLabel("", JLabel.CENTER); 
                player2grandtotal = new JLabel("", JLabel.CENTER); 

                blanklabel.setBorder(BorderFactory.createLineBorder(Color.black));
                firstlabel.setBorder(BorderFactory.createLineBorder(Color.black));
                secondlabel.setBorder(BorderFactory.createLineBorder(Color.black));
                thirdlabel.setBorder(BorderFactory.createLineBorder(Color.black));
                fourthlabel.setBorder(BorderFactory.createLineBorder(Color.black));
                fifthlabel.setBorder(BorderFactory.createLineBorder(Color.black));
                sixthlabel.setBorder(BorderFactory.createLineBorder(Color.black));
                lowersumlabel.setBorder(BorderFactory.createLineBorder(Color.black));
                bonuslabel.setBorder(BorderFactory.createLineBorder(Color.black));     
                threeofkindlabel.setBorder(BorderFactory.createLineBorder(Color.black));
                fourofkindlabel.setBorder(BorderFactory.createLineBorder(Color.black));
                fullhouselabel.setBorder(BorderFactory.createLineBorder(Color.black));
                SMStraightlabel.setBorder(BorderFactory.createLineBorder(Color.black));
                LGStraightlabel.setBorder(BorderFactory.createLineBorder(Color.black));
                chancelabel.setBorder(BorderFactory.createLineBorder(Color.black));
                yahtzeelabel.setBorder(BorderFactory.createLineBorder(Color.black));     
                grandtotallabel.setBorder(BorderFactory.createLineBorder(Color.black));

                firstlabel2.setBorder(BorderFactory.createLineBorder(Color.black));
                secondlabel2.setBorder(BorderFactory.createLineBorder(Color.black));
                thirdlabel2.setBorder(BorderFactory.createLineBorder(Color.black));
                fourthlabel2.setBorder(BorderFactory.createLineBorder(Color.black));
                fifthlabel2.setBorder(BorderFactory.createLineBorder(Color.black));
                sixthlabel2.setBorder(BorderFactory.createLineBorder(Color.black));
                threeofkindlabel2.setBorder(BorderFactory.createLineBorder(Color.black));
                fourofkindlabel2.setBorder(BorderFactory.createLineBorder(Color.black));
                fullhouselabel2.setBorder(BorderFactory.createLineBorder(Color.black));
                SMStraightlabel2.setBorder(BorderFactory.createLineBorder(Color.black));
                LGStraightlabel2.setBorder(BorderFactory.createLineBorder(Color.black));
                chancelabel2.setBorder(BorderFactory.createLineBorder(Color.black));
                yahtzeelabel2.setBorder(BorderFactory.createLineBorder(Color.black));
            
                player1label.setBorder(BorderFactory.createLineBorder(Color.black));
                player1ones.setBorder(BorderFactory.createLineBorder(Color.black));
                player1twos.setBorder(BorderFactory.createLineBorder(Color.black));
                player1threes.setBorder(BorderFactory.createLineBorder(Color.black));
                player1fours.setBorder(BorderFactory.createLineBorder(Color.black));
                player1fives.setBorder(BorderFactory.createLineBorder(Color.black));
                player1sixes.setBorder(BorderFactory.createLineBorder(Color.black));
                player1lowersum.setBorder(BorderFactory.createLineBorder(Color.black));
                player1bonus.setBorder(BorderFactory.createLineBorder(Color.black));
                player1threeofkind.setBorder(BorderFactory.createLineBorder(Color.black));
                player1fourofkind.setBorder(BorderFactory.createLineBorder(Color.black));
                player1fullhouse.setBorder(BorderFactory.createLineBorder(Color.black));
                player1SMStraight.setBorder(BorderFactory.createLineBorder(Color.black));
                player1LGStraight.setBorder(BorderFactory.createLineBorder(Color.black));
                player1chance.setBorder(BorderFactory.createLineBorder(Color.black));
                player1yahtzee.setBorder(BorderFactory.createLineBorder(Color.black)); 
                player1grandtotal.setBorder(BorderFactory.createLineBorder(Color.black));

                player2label.setBorder(BorderFactory.createLineBorder(Color.black));
                player2ones.setBorder(BorderFactory.createLineBorder(Color.black));
                player2twos.setBorder(BorderFactory.createLineBorder(Color.black));
                player2threes.setBorder(BorderFactory.createLineBorder(Color.black));
                player2fours.setBorder(BorderFactory.createLineBorder(Color.black));
                player2fives.setBorder(BorderFactory.createLineBorder(Color.black)); 
                player2sixes.setBorder(BorderFactory.createLineBorder(Color.black));
                player2lowersum.setBorder(BorderFactory.createLineBorder(Color.black));
                player2bonus.setBorder(BorderFactory.createLineBorder(Color.black));
                player2threeofkind.setBorder(BorderFactory.createLineBorder(Color.black)); 
                player2fourofkind.setBorder(BorderFactory.createLineBorder(Color.black));
                player2fullhouse.setBorder(BorderFactory.createLineBorder(Color.black));
                player2SMStraight.setBorder(BorderFactory.createLineBorder(Color.black));
                player2LGStraight.setBorder(BorderFactory.createLineBorder(Color.black));
                player2chance.setBorder(BorderFactory.createLineBorder(Color.black));
                player2yahtzee.setBorder(BorderFactory.createLineBorder(Color.black));
		player2grandtotal.setBorder(BorderFactory.createLineBorder(Color.black));

		displayPanel = new JPanel();
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

		setSize(1800,1800);
		setResizable(false);
		getContentPane().setBackground(Color.GREEN);

		displayPanel.setLayout(new GridLayout(0,3,0,0));
		displayPanel.setBackground(Color.WHITE);
		displayPanel.setBorder(BorderFactory.createLineBorder(Color.black));

		blanklabel.setPreferredSize(new Dimension(90,55));
		displayPanel.add(blanklabel);
		displayPanel.add(player1label);
		displayPanel.add(player2label);
		displayPanel.add(firstlabel);
		displayPanel.add(player1ones);
		displayPanel.add(player2ones);
		displayPanel.add(secondlabel);
                displayPanel.add(player1twos);
                displayPanel.add(player2twos);
		displayPanel.add(thirdlabel);
                displayPanel.add(player1threes);
                displayPanel.add(player2threes);
		displayPanel.add(fourthlabel);
                displayPanel.add(player1fours);
                displayPanel.add(player2fours);
		displayPanel.add(fifthlabel);
                displayPanel.add(player1fives);
                displayPanel.add(player2fives);
		displayPanel.add(sixthlabel);
                displayPanel.add(player1sixes);
                displayPanel.add(player2sixes);
		displayPanel.add(lowersumlabel);
                displayPanel.add(player1lowersum);
                displayPanel.add(player2lowersum);
		displayPanel.add(bonuslabel);
                displayPanel.add(player1bonus);
                displayPanel.add(player2bonus);
                displayPanel.add(threeofkindlabel);
                displayPanel.add(player1threeofkind);
                displayPanel.add(player2threeofkind);
                displayPanel.add(fourofkindlabel);
                displayPanel.add(player1fourofkind);
                displayPanel.add(player2fourofkind);
                displayPanel.add(fullhouselabel);
                displayPanel.add(player1fullhouse);
                displayPanel.add(player2fullhouse);
                displayPanel.add(SMStraightlabel);
                displayPanel.add(player1SMStraight);
                displayPanel.add(player2SMStraight);
                displayPanel.add(LGStraightlabel);
                displayPanel.add(player1LGStraight);
                displayPanel.add(player2LGStraight);
		displayPanel.add(chancelabel);
                displayPanel.add(player1chance);
                displayPanel.add(player2chance);		
                displayPanel.add(yahtzeelabel);
                displayPanel.add(player1yahtzee);
                displayPanel.add(player2yahtzee);
		displayPanel.add(grandtotallabel);
                displayPanel.add(player1grandtotal);
                displayPanel.add(player2grandtotal);

		add(displayPanel);
	

		display2Panel = new JPanel();
                display2Panel.setLayout(new GridLayout(0,2,0,0));
                display2Panel.setBackground(Color.WHITE);
                display2Panel.setBorder(BorderFactory.createLineBorder(Color.black));

		onesJButton.setText("getonesnumber");
                onesJButton.setPreferredSize(new Dimension(90,55));
		display2Panel.add(firstlabel2);
		display2Panel.add(onesJButton);

		twosJButton.setText("getstwosnumber");
		display2Panel.add(secondlabel2);
                display2Panel.add(twosJButton);

		threesJButton.setText("getthreesnumber");
		display2Panel.add(thirdlabel2);
                display2Panel.add(threesJButton);

		foursJButton.setText("getfoursnumber");
		display2Panel.add(fourthlabel2);
                display2Panel.add(foursJButton);

                fivesJButton.setText("getonesnumber");
		display2Panel.add(fifthlabel2);
                display2Panel.add(fivesJButton);

                sixesJButton.setText("getstwosnumber");
		display2Panel.add(sixthlabel2);
		display2Panel.add(sixesJButton);

                threeofkindJButton.setText("getthreesnumber");
		display2Panel.add(threeofkindlabel2);
                display2Panel.add(threeofkindJButton);

                fourofkindJButton.setText("getfoursnumber");
		display2Panel.add(fourofkindlabel2);
                display2Panel.add(fourofkindJButton);

                fullhouseJButton.setText("getonesnumber");
		display2Panel.add(fullhouselabel2);
		display2Panel.add(fullhouseJButton);

                SMStraightJButton.setText("getstwosnumber");
		display2Panel.add(SMStraightlabel2);
		display2Panel.add(SMStraightJButton);

                LGStraightJButton.setText("getthreesnumber");
		display2Panel.add(LGStraightlabel2);
		display2Panel.add(LGStraightJButton);

		chanceJButton.setText("getchancenumber");
		display2Panel.add(chancelabel2);
		display2Panel.add(chanceJButton);

                yahtzeeJButton.setText("getfoursnumber");
		display2Panel.add(yahtzeelabel2);
		display2Panel.add(yahtzeeJButton);	
	
		ButtonClick handler = new ButtonClick();
		onesJButton.addActionListener(handler);
		twosJButton.addActionListener(handler);
		threesJButton.addActionListener(handler);
		foursJButton.addActionListener(handler);
		fivesJButton.addActionListener(handler);
		sixesJButton.addActionListener(handler);
		threeofkindJButton.addActionListener(handler);
		fourofkindJButton.addActionListener(handler);
		fullhouseJButton.addActionListener(handler);	
		SMStraightJButton.addActionListener(handler);
		LGStraightJButton.addActionListener(handler);
		chanceJButton.addActionListener(handler);
		yahtzeeJButton.addActionListener(handler);

		add(display2Panel);
	
		setVisible(true);
	}


	private class ButtonClick implements ActionListener //REPLACE THIS CODE TO ADD NUMBER 
	{						    //ON BUTTON CLICKED TO USER SCORE
        	@Override
        	public void actionPerformed(ActionEvent event)
        	{
                	JOptionPane.showMessageDialog(YahtzeeGameDisplay.this, String.format(
                	"You press: %s", event.getActionCommand()));
        	}
	}
	
	public void putinscores()
	{
		int a = 5;
		String as = a + "";
		player1label.setText(as);
	}


	public static void main(String args[])
	{
		new Yahtzee();
	}


}
