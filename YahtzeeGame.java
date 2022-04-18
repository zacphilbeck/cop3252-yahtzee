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
import javax.swing.BoxLayout;

public class YahtzeeGame extends JFrame
{
	private int playernumber;	
	private int oness;//Scores calculated from 6 dice chosen 
	private int twos;
	private int threes;
	private int fours;
	private int fives;
	private int sixes;
	private int threeofkind;
	private int fourofkind;
	private int fullhouse;
	private int smstraight;
	private int lgstraight;
	private int yahtzee;
	private int bonus;

	private JPanel introductionPanel;
	private JPanel displayPanel;
	private JPanel display2Panel;
	private JPanel display3Panel;
	private JPanel display4Panel;
	private JPanel display5Panel;
	private JPanel display6Panel;
	private JPanel displayblank1Panel;
	private JPanel displayblank2Panel;

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
	private JLabel numberofplayers;

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

        private JLabel player3label;
        private JLabel player3ones;
        private JLabel player3twos;
        private JLabel player3threes;
        private JLabel player3fours;
        private JLabel player3fives;
        private JLabel player3sixes;
        private JLabel player3lowersum;
        private JLabel player3bonus;
        private JLabel player3threeofkind;
        private JLabel player3fourofkind;
        private JLabel player3fullhouse;
        private JLabel player3SMStraight;
        private JLabel player3LGStraight;
        private JLabel player3chance;
        private JLabel player3yahtzee;
        private JLabel player3grandtotal;

        private JLabel player4label;
        private JLabel player4ones;
        private JLabel player4twos;
        private JLabel player4threes;
        private JLabel player4fours;
        private JLabel player4fives;
        private JLabel player4sixes;
        private JLabel player4lowersum;
        private JLabel player4bonus;
        private JLabel player4threeofkind;
        private JLabel player4fourofkind;
        private JLabel player4fullhouse;
        private JLabel player4SMStraight;
        private JLabel player4LGStraight;
        private JLabel player4chance;
        private JLabel player4yahtzee;
        private JLabel player4grandtotal;

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

	private JButton twoplayerJButton;
	private JButton threeplayerJButton;
	private JButton fourplayerJButton;

	private Player player1;
	private Player player2;
	private Player player3;
	private Player player4;

	public void MakeScoreCard()
	{
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

		player3label = new JLabel("Player 3", JLabel.CENTER);
                player3ones = new JLabel("", JLabel.CENTER);
                player3twos = new JLabel("", JLabel.CENTER);
                player3threes = new JLabel("", JLabel.CENTER);
                player3fours = new JLabel("", JLabel.CENTER);
                player3fives = new JLabel("", JLabel.CENTER) ;
                player3sixes = new JLabel("", JLabel.CENTER);
                player3lowersum = new JLabel("", JLabel.CENTER);
                player3bonus = new JLabel("", JLabel.CENTER);
                player3threeofkind = new JLabel("", JLabel.CENTER);
                player3fourofkind = new JLabel("", JLabel.CENTER);
                player3fullhouse = new JLabel("", JLabel.CENTER);
                player3SMStraight = new JLabel("", JLabel.CENTER);
                player3LGStraight = new JLabel("", JLabel.CENTER);
                player3chance = new JLabel("", JLabel.CENTER);
                player3yahtzee = new JLabel("", JLabel.CENTER);
                player3grandtotal = new JLabel("", JLabel.CENTER);

                player4label = new JLabel("Player 4", JLabel.CENTER);
                player4ones = new JLabel("", JLabel.CENTER);
                player4twos = new JLabel("", JLabel.CENTER);
                player4threes = new JLabel("", JLabel.CENTER);
                player4fours = new JLabel("", JLabel.CENTER);
                player4fives = new JLabel("", JLabel.CENTER) ;
                player4sixes = new JLabel("", JLabel.CENTER);
                player4lowersum = new JLabel("", JLabel.CENTER);
                player4bonus = new JLabel("", JLabel.CENTER);
                player4threeofkind = new JLabel("", JLabel.CENTER);
                player4fourofkind = new JLabel("", JLabel.CENTER);
                player4fullhouse = new JLabel("", JLabel.CENTER);
                player4SMStraight = new JLabel("", JLabel.CENTER);
                player4LGStraight = new JLabel("", JLabel.CENTER);
                player4chance = new JLabel("", JLabel.CENTER);
                player4yahtzee = new JLabel("", JLabel.CENTER);
                player4grandtotal = new JLabel("", JLabel.CENTER);

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

                player3label.setBorder(BorderFactory.createLineBorder(Color.black));
                player3ones.setBorder(BorderFactory.createLineBorder(Color.black));
                player3twos.setBorder(BorderFactory.createLineBorder(Color.black));
                player3threes.setBorder(BorderFactory.createLineBorder(Color.black));
                player3fours.setBorder(BorderFactory.createLineBorder(Color.black));
                player3fives.setBorder(BorderFactory.createLineBorder(Color.black));
                player3sixes.setBorder(BorderFactory.createLineBorder(Color.black));
                player3lowersum.setBorder(BorderFactory.createLineBorder(Color.black));
                player3bonus.setBorder(BorderFactory.createLineBorder(Color.black));
                player3threeofkind.setBorder(BorderFactory.createLineBorder(Color.black));
                player3fourofkind.setBorder(BorderFactory.createLineBorder(Color.black));
                player3fullhouse.setBorder(BorderFactory.createLineBorder(Color.black));
                player3SMStraight.setBorder(BorderFactory.createLineBorder(Color.black));
                player3LGStraight.setBorder(BorderFactory.createLineBorder(Color.black));
                player3chance.setBorder(BorderFactory.createLineBorder(Color.black));
                player3yahtzee.setBorder(BorderFactory.createLineBorder(Color.black));
                player3grandtotal.setBorder(BorderFactory.createLineBorder(Color.black));

                player4label.setBorder(BorderFactory.createLineBorder(Color.black));
                player4ones.setBorder(BorderFactory.createLineBorder(Color.black));
                player4twos.setBorder(BorderFactory.createLineBorder(Color.black));
                player4threes.setBorder(BorderFactory.createLineBorder(Color.black));
                player4fours.setBorder(BorderFactory.createLineBorder(Color.black));
                player4fives.setBorder(BorderFactory.createLineBorder(Color.black));
                player4sixes.setBorder(BorderFactory.createLineBorder(Color.black));
                player4lowersum.setBorder(BorderFactory.createLineBorder(Color.black));
                player4bonus.setBorder(BorderFactory.createLineBorder(Color.black));
                player4threeofkind.setBorder(BorderFactory.createLineBorder(Color.black));
                player4fourofkind.setBorder(BorderFactory.createLineBorder(Color.black));
                player4fullhouse.setBorder(BorderFactory.createLineBorder(Color.black));
                player4SMStraight.setBorder(BorderFactory.createLineBorder(Color.black));
                player4LGStraight.setBorder(BorderFactory.createLineBorder(Color.black));
                player4chance.setBorder(BorderFactory.createLineBorder(Color.black));
                player4yahtzee.setBorder(BorderFactory.createLineBorder(Color.black));
                player4grandtotal.setBorder(BorderFactory.createLineBorder(Color.black));

		displayPanel = new JPanel();
		display3Panel = new JPanel();
		display4Panel = new JPanel();
		display5Panel = new JPanel();
		display6Panel = new JPanel();
		displayblank1Panel = new JPanel();
//		displayblank2Panel = new JPanel();
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 10));

		setSize(1800,1800);
		setResizable(false);
		getContentPane().setBackground(Color.GREEN);
		
		JLabel hello = new JLabel("");
		displayblank1Panel.setLayout(new GridLayout(0,1,0,0));
		displayblank1Panel.setBackground(Color.GREEN);
		hello.setPreferredSize(new Dimension(20,20));
		displayblank1Panel.add(hello);
		add(displayblank1Panel);

		displayPanel.setLayout(new GridLayout(0,1,0,0));
		displayPanel.setBackground(Color.WHITE);
		displayPanel.setBorder(BorderFactory.createLineBorder(Color.black));	

		blanklabel.setPreferredSize(new Dimension(90,55));
		displayPanel.add(blanklabel);
		displayPanel.add(firstlabel);
		displayPanel.add(secondlabel);
		displayPanel.add(thirdlabel);
		displayPanel.add(fourthlabel);
		displayPanel.add(fifthlabel);
		displayPanel.add(sixthlabel);
		displayPanel.add(lowersumlabel);
		displayPanel.add(bonuslabel);
                displayPanel.add(threeofkindlabel);
                displayPanel.add(fourofkindlabel);
                displayPanel.add(fullhouselabel);
                displayPanel.add(SMStraightlabel);
                displayPanel.add(LGStraightlabel);
		displayPanel.add(chancelabel);		
                displayPanel.add(yahtzeelabel);
		displayPanel.add(grandtotallabel);
		add(displayPanel);
	
	        display3Panel.setLayout(new GridLayout(0,1,0,0));
                display3Panel.setBackground(Color.WHITE);
                display3Panel.setBorder(BorderFactory.createLineBorder(Color.black));
                player1label.setPreferredSize(new Dimension(90,55));
		display3Panel.add(player1label);	
		display3Panel.add(player1ones);
		display3Panel.add(player1twos);
		display3Panel.add(player1threes);
		display3Panel.add(player1fours);
		display3Panel.add(player1fives);
		display3Panel.add(player1sixes);
		display3Panel.add(player1lowersum);
		display3Panel.add(player1bonus);
		display3Panel.add(player1threeofkind);
		display3Panel.add(player1fourofkind);
		display3Panel.add(player1fullhouse);
		display3Panel.add(player1SMStraight);
		display3Panel.add(player1LGStraight);
		display3Panel.add(player1chance);
		display3Panel.add(player1yahtzee);
		display3Panel.add(player1grandtotal);
		add(display3Panel);

                display4Panel.setLayout(new GridLayout(0,1,0,0));
                display4Panel.setBackground(Color.WHITE);
                display4Panel.setBorder(BorderFactory.createLineBorder(Color.black));
                player2label.setPreferredSize(new Dimension(90,55));
                display4Panel.add(player2label);
                display4Panel.add(player2ones);
                display4Panel.add(player2twos);
                display4Panel.add(player2threes);
                display4Panel.add(player2fours);
                display4Panel.add(player2fives);
                display4Panel.add(player2sixes);
                display4Panel.add(player2lowersum);
                display4Panel.add(player2bonus);
                display4Panel.add(player2threeofkind);
                display4Panel.add(player2fourofkind);
                display4Panel.add(player2fullhouse);
                display4Panel.add(player2SMStraight);
                display4Panel.add(player2LGStraight);
                display4Panel.add(player2chance);
                display4Panel.add(player2yahtzee);
                display4Panel.add(player2grandtotal);
                add(display4Panel);

		player1 = new Player();
		player2 = new Player();

		if(playernumber == 3 || playernumber == 4)
		{
                	display5Panel.setLayout(new GridLayout(0,1,0,0));
                	display5Panel.setBackground(Color.WHITE);
                	display5Panel.setBorder(BorderFactory.createLineBorder(Color.black));
               		player3label.setPreferredSize(new Dimension(90,55));
                	display5Panel.add(player3label);
                	display5Panel.add(player3ones);
                	display5Panel.add(player3twos);
                	display5Panel.add(player3threes);
                	display5Panel.add(player3fours);
                	display5Panel.add(player3fives);
                	display5Panel.add(player3sixes);
                	display5Panel.add(player3lowersum);
                	display5Panel.add(player3bonus);
                	display5Panel.add(player3threeofkind);
                	display5Panel.add(player3fourofkind);
                	display5Panel.add(player3fullhouse);
                	display5Panel.add(player3SMStraight);
                	display5Panel.add(player3LGStraight);
                	display5Panel.add(player3chance);
                	display5Panel.add(player3yahtzee);
                	display5Panel.add(player3grandtotal);
                	add(display5Panel);
			player3 = new Player();
		}

		if(playernumber == 4)
		{
                	display6Panel.setLayout(new GridLayout(0,1,0,0));
               		display6Panel.setBackground(Color.WHITE);
                	display6Panel.setBorder(BorderFactory.createLineBorder(Color.black));
                	player4label.setPreferredSize(new Dimension(90,55));
                	display6Panel.add(player4label);
                	display6Panel.add(player4ones);
                	display6Panel.add(player4twos);
                	display6Panel.add(player4threes);
                	display6Panel.add(player4fours);
                	display6Panel.add(player4fives);
                	display6Panel.add(player4sixes);
                	display6Panel.add(player4lowersum);
                	display6Panel.add(player4bonus);
                	display6Panel.add(player4threeofkind);
                	display6Panel.add(player4fourofkind);
                	display6Panel.add(player4fullhouse);
                	display6Panel.add(player4SMStraight);
                	display6Panel.add(player4LGStraight);
                	display6Panel.add(player4chance);
                	display6Panel.add(player4yahtzee);
                	display6Panel.add(player4grandtotal);
                	add(display6Panel);
			player4 = new Player();
		}
		NumberChoosing();
          setVisible(true);
	}

	public void NumberChoosing()
	{
		displayblank2Panel = new JPanel();
                JLabel hello2 = new JLabel("");
                displayblank2Panel.setLayout(new GridLayout(0,1,0,0));
                displayblank2Panel.setBackground(Color.GREEN);
                hello2.setPreferredSize(new Dimension(20,20));
                displayblank2Panel.add(hello2);
                add(displayblank2Panel);
//		displayblank2Panel.setVisible(true);	

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


        public void StartDisplay()
        {                		
                numberofplayers = new JLabel("Select amount of players", JLabel.CENTER);
                twoplayerJButton = new JButton("2");
                threeplayerJButton = new JButton("3");
                fourplayerJButton = new JButton("4");

                introductionPanel = new JPanel();
                setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
                setSize(1800,1800);
                setResizable(false);                 
                introductionPanel.setBorder(BorderFactory.createLineBorder(Color.black)); 
                getContentPane().setBackground(Color.GREEN);

                introductionPanel.setLayout(new GridLayout(4,0,0,0));
                numberofplayers.setPreferredSize(new Dimension(300,55));
		introductionPanel.add(numberofplayers);
                introductionPanel.add(twoplayerJButton);            
                introductionPanel.add(threeplayerJButton);
                introductionPanel.add(fourplayerJButton);

                twoplayerJButton.addActionListener( 
                   new ActionListener()
                   {
                        public void actionPerformed(ActionEvent evt)
                        {
                                NumberofPlayersActionPerformed(evt);
                        }
                   }
                );

                threeplayerJButton.addActionListener(
                   new ActionListener()
                   {
                        public void actionPerformed(ActionEvent evt)
                        {
                                NumberofPlayersActionPerformed(evt);       
                        }                  
                   }
                );

                fourplayerJButton.addActionListener(
                   new ActionListener()
                   {
                        public void actionPerformed(ActionEvent evt)
                        {
                                NumberofPlayersActionPerformed(evt);
                        }
                   }
                );

		add(introductionPanel);
                setVisible(true);
	}

	private class ButtonClick implements ActionListener //REPLACE THIS CODE TO ADD NUMBER 
	{						    //ON BUTTON CLICKED TO USER SCORE
        	@Override
        	public void actionPerformed(ActionEvent event)
        	{
                	JOptionPane.showMessageDialog(YahtzeeGame.this, String.format(
                	"You press: %s", event.getActionCommand()));
        	}
	}

	private void NumberofPlayersActionPerformed(ActionEvent evt)
	{
		String players = evt.getActionCommand();
		playernumber = Integer.parseInt(players);		
		System.out.println(playernumber);
		introductionPanel.setVisible(false);
		MakeScoreCard();
	}
	
	public void ScoreOptions(int one, int two, int three, int four, int five, int six, int threekind, int fourkind, int full, int sm, int lg, int yahtzee, int chance) //Need to call rules file to calculate
	{																				  //these numbers
		onesJButton.setText("" + one);
		twosJButton.setText("" + two);
		threesJButton.setText("" + three);
		foursJButton.setText("" + four);
		fivesJButton.setText("" + five);
		sixesJButton.setText("" + six);
		threeofkindJButton.setText("" + threekind);
		fourofkindJButton.setText("" + fourkind);
		fullhouseJButton.setText("" + fullhouse);
		SMStraightJButton.setText("" + sm);
		LGStraightJButton.setText("" + lg);
		chanceJButton.setText("" + yahtzee);
		yahtzeeJButton.setText("" + chance);
	}

	public void UpdateScoreCard(int playernumber, int scoresequence, int score) //scoresequence specificies which score number to updated. For example,  ones = 1, twos = 2,...,six = 6, 3ofkind = 7, 4ofkind = 8
	{									    //score is the number user clicked in scoreoptions		
		if(scoresequence == 1)
		{
			if(playernumber == 1)
				player1ones.setText("" + score);
			if(playernumber == 2)
				player2ones.setText("" + score);
			if(playernumber == 3)
				player3ones.setText("" + score);
			if(playernumber == 4)
				player4ones.setText("" + score);
		}
                if(scoresequence == 2)
                {
                        if(playernumber == 1)
                                player1twos.setText("" + score);
                        if(playernumber == 2)
                                player2twos.setText("" + score);
                        if(playernumber == 3)
                                player3twos.setText("" + score);
                        if(playernumber == 4)
                                player4twos.setText("" + score);
                }
                if(scoresequence == 3)
                {
                        if(playernumber == 1)
                                player1threes.setText("" + score);
                        if(playernumber == 2) 
                                player2threes.setText("" + score);
                        if(playernumber == 3)     
                                player3threes.setText("" + score);
                        if(playernumber == 4)   
                                player4threes.setText("" + score);
		}
                if(scoresequence == 4)
                {
                        if(playernumber == 1)
                                player1fours.setText("" + score);
                        if(playernumber == 2)
                                player2fours.setText("" + score);
                        if(playernumber == 3)
                                player3fours.setText("" + score);
                        if(playernumber == 4)
                                player4fours.setText("" + score);
                }
                if(scoresequence == 5)
                {
                        if(playernumber == 1)
                                player1fives.setText("" + score);
                        if(playernumber == 2) 
                                player2fives.setText("" + score);
                        if(playernumber == 3)     
                                player3fives.setText("" + score);
                        if(playernumber == 4)   
                                player4fives.setText("" + score);
		}
                if(scoresequence == 6)
                {
                        if(playernumber == 1)
                                player1lowersum.setText("" + score);
                        if(playernumber == 2)
                                player2lowersum.setText("" + score);
                        if(playernumber == 3)
                                player3lowersum.setText("" + score);
                        if(playernumber == 4)
                                player4lowersum.setText("" + score);
                }
 
                if(scoresequence == 7)
                {
                        if(playernumber == 1)
                                player1bonus.setText("" + score);
                        if(playernumber == 2) 
                                player2bonus.setText("" + score);
                        if(playernumber == 3)     
                                player3bonus.setText("" + score);
                        if(playernumber == 4)   
                                player4bonus.setText("" + score);
		}
                if(scoresequence == 8)
                {
                        if(playernumber == 1)
                                player1threeofkind.setText("" + score);
                        if(playernumber == 2)
                                player2threeofkind.setText("" + score);
                        if(playernumber == 3)
                                player3threeofkind.setText("" + score);
                        if(playernumber == 4)
                                player4threeofkind.setText("" + score);
                }
                if(scoresequence == 9)
                {
                        if(playernumber == 1)
                                player1fourofkind.setText("" + score);
                        if(playernumber == 2) 
                                player2fourofkind.setText("" + score);
                        if(playernumber == 3)     
                                player3fourofkind.setText("" + score);
                        if(playernumber == 4)   
                                player4fourofkind.setText("" + score);
		}
                if(scoresequence == 10)
                {
                        if(playernumber == 1)
                                player1fullhouse.setText("" + score);
                        if(playernumber == 2)
                                player2fullhouse.setText("" + score);
                        if(playernumber == 3)
                                player3fullhouse.setText("" + score);
                        if(playernumber == 4)
                                player4fullhouse.setText("" + score);
                }
                if(scoresequence == 11)
                {
                        if(playernumber == 1)
                                player1SMStraight.setText("" + score);
                        if(playernumber == 2) 
                                player2SMStraight.setText("" + score);
                        if(playernumber == 3)     
                                player3SMStraight.setText("" + score);
                        if(playernumber == 4)   
                                player4SMStraight.setText("" + score);
		}
                if(scoresequence == 12)
                {
                        if(playernumber == 1)
                                player1LGStraight.setText("" + score);
                        if(playernumber == 2)
                                player2LGStraight.setText("" + score);
                        if(playernumber == 3)
                                player3LGStraight.setText("" + score);
                        if(playernumber == 4)
                                player4LGStraight.setText("" + score);
                }
                if(scoresequence == 13)
                {
                        if(playernumber == 1)
                                player1chance.setText("" + score);
                        if(playernumber == 2) 
                                player2chance.setText("" + score);
                        if(playernumber == 3)     
                                player3chance.setText("" + score);
                        if(playernumber == 4)   
                                player4chance.setText("" + score);
		}
                if(scoresequence == 14)
                {
                        if(playernumber == 1)
                                player1yahtzee.setText("" + score);
                        if(playernumber == 2)
                                player2yahtzee.setText("" + score);
                        if(playernumber == 3)
                                player3yahtzee.setText("" + score);
                        if(playernumber == 4)
                                player4yahtzee.setText("" + score);
                }
                if(scoresequence == 15)
                {
                        if(playernumber == 1)
                                player1grandtotal.setText("" + score);
                        if(playernumber == 2) 
                                player2grandtotal.setText("" + score);
                        if(playernumber == 3)     
                                player3grandtotal.setText("" + score);
                        if(playernumber == 4)   
                                player4grandtotal.setText("" + score);
		}
	}

        public YahtzeeGame()
        {
                StartDisplay();
        }

	public static void main(String args[])
	{
		new YahtzeeGame();
	}


}
