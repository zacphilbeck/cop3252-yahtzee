

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
import javax.swing.JTextArea;
import java.util.Random;

@SuppressWarnings("serial")
public class YahtzeeGame extends JFrame
{
  //      private int[] diceArray;
        private int diceValue;

	private int twoplayerturns = 26;
	private int threeplayerturns = 39;
	private int fourplayerturns = 52;
	private int turnnumber = 0;

	private boolean p1turn = true;
	private boolean p2turn = false;
//	private boolean p2turn = false;
	private boolean p3turn = false;
	private boolean p4turn = false;

	private int playernumber;	
	private int ones;//Scores calculated from 6 dice chosen 
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
	private int chance;
	private int grandTotal;

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
	
	private JLabel pgoing;
	private JPanel displayplayerPanel;

	private JLabel blank3;
	private JPanel blankdisplaypanel3;

	private boolean[] selectionArr = new boolean[5];
	public JButton[] diceButton = new JButton[5];
	private int[] diceArray = new int[6];
	private JButton rollButton = new JButton("Roll");
	private int rolls = 0;
	
	public void MakeScoreCard()
	{
		
		AddDicePanel();//////////////////
		DiceFunctionality();///////////////////
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
                chancelabel2 = new JLabel("Yahtzee", JLabel.CENTER);
                yahtzeelabel2 = new JLabel("Chance", JLabel.CENTER);

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
//                pgoing.setBorder(BorderFactory.createLineBorder(Color.black));

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

		setSize(1920,1080);
		setResizable(false);
		getContentPane().setBackground(Color.lightGray);
		
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
                //displayPanel.add(chancelabel);	
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

                blankdisplaypanel3 = new JPanel();
                JLabel blank3 = new JLabel("");
                blankdisplaypanel3.setLayout(new GridLayout(0,1,0,0));
                blankdisplaypanel3.setBackground(Color.GREEN);
                blank3.setPreferredSize(new Dimension(20,20));
                blankdisplaypanel3.add(blank3);
                add(blankdisplaypanel3);

		  
	          setVisible(true);
		  PlayRound();
	}
	public void UpdatePlayerTurn()
	{
		if(p1turn == true)
		{
			p1turn = false;
			p2turn = true;
		}
	
		else if(p2turn == true)
		{
			p2turn = false;
			
			if(playernumber == 3 || playernumber == 4)
			{
				p3turn = true;
			}
		
			else
				p1turn = true;
		}	

		else if(p3turn == true)
		{
			p3turn = false;
		
			if(playernumber == 4)
				p4turn = true;
			else
				p1turn = true;

		}
		else 
		{
			p4turn = false;
			p1turn = true;
		}

		//turnnumber++;
		System.out.println("turn =" + turnnumber);

		if( playernumber == 2) {
			if(turnnumber == 26)
			{
				WinnerDisplay();
			}
		}
		else if(playernumber == 3) {
			if(turnnumber == 39)
				WinnerDisplay();
		}
		else {
			if(turnnumber == 52) {
				WinnerDisplay();
			}
		}
		
		rolls = 0;//////////////////////////
		PlayRound();

	}
	public void PlayRound()
	{
		if(playernumber == 2 && turnnumber <= twoplayerturns)
			DicePanel();
		else if(playernumber == 3 && turnnumber <= threeplayerturns)
			DicePanel();
		else if(playernumber == 4 && turnnumber <= fourplayerturns)
			DicePanel();
		else
			System.out.println("replace with total score stuff");
	}

	public void NumberChoosing()
	{
		//player1grandtotal.setText(Integer.toString(Total()));
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

                onesJButton.setPreferredSize(new Dimension(90,55));

                twosJButton.setPreferredSize(new Dimension(90,55));

                threesJButton.setPreferredSize(new Dimension(90,55));

                foursJButton.setPreferredSize(new Dimension(90,55));

                fivesJButton.setPreferredSize(new Dimension(90,55));

                sixesJButton.setPreferredSize(new Dimension(90,55));

                threeofkindJButton.setPreferredSize(new Dimension(90,55));

                fourofkindJButton.setPreferredSize(new Dimension(90,55));

                fullhouseJButton.setPreferredSize(new Dimension(90,55));

                SMStraightJButton.setPreferredSize(new Dimension(90,55));

                LGStraightJButton.setPreferredSize(new Dimension(90,55));

                chanceJButton.setPreferredSize(new Dimension(90,55));

                yahtzeeJButton.setPreferredSize(new Dimension(90,55));

	
		//setPreferredSize(new Dimension(90,55));
		display2Panel = new JPanel();
                display2Panel.setLayout(new GridLayout(0,2,0,0));
                display2Panel.setBackground(Color.WHITE);
                display2Panel.setBorder(BorderFactory.createLineBorder(Color.black));

		if((p1turn == true && player1.getAces() == -1) || (p2turn == true && player2.getAces() == -1) || (p3turn == true && player3.getAces() == -1) || (p4turn == true && player4.getAces() == -1))
		{
			onesJButton.setText("getonesnumber");
			display2Panel.add(firstlabel2);
			display2Panel.add(onesJButton);
		}

                if((p1turn == true && player1.getTwos() == -1) || (p2turn == true && player2.getTwos() == -1) || (p3turn == true && player3.getTwos() == -1) || (p4turn == true && player4.getTwos() == -1))
		{		
			twosJButton.setText("getstwosnumber");
			display2Panel.add(secondlabel2);
                	display2Panel.add(twosJButton);
		}

                if((p1turn == true && player1.getThrees() == -1) || (p2turn == true && player2.getThrees() == -1) || (p3turn == true && player3.getThrees() == -1) || (p4turn == true && player4.getThrees() == -1))
		{
			threesJButton.setText("getthreesnumber");
			display2Panel.add(thirdlabel2);
               		display2Panel.add(threesJButton);
		}
                if((p1turn == true && player1.getFours() == -1) || (p2turn == true && player2.getFours() == -1) || (p3turn == true && player3.getFours() == -1) || (p4turn == true && player4.getFours() == -1))
		{
			foursJButton.setText("getfoursnumber");
			display2Panel.add(fourthlabel2);
                	display2Panel.add(foursJButton);
		}
                if((p1turn == true && player1.getFives() == -1) || (p2turn == true && player2.getFives() == -1) || (p3turn == true && player3.getFives() == -1) || (p4turn == true && player4.getFives() == -1))
		{
                	fivesJButton.setText("getonesnumber");
			display2Panel.add(fifthlabel2);
                	display2Panel.add(fivesJButton);	
		}
                if((p1turn == true && player1.getSixes() == -1) || (p2turn == true && player2.getSixes() == -1) || (p3turn == true && player3.getSixes() == -1) || (p4turn == true && player4.getSixes() == -1))
		{
        	        sixesJButton.setText("getstwosnumber");
			display2Panel.add(sixthlabel2);
			display2Panel.add(sixesJButton);
		}
                if((p1turn == true && player1.getThreeofakind() == -1) || (p2turn == true && player2.getThreeofakind() == -1) || (p3turn == true && player3.getThreeofakind() == -1) || (p4turn == true && player4.getThreeofakind() == -1))
		{
                	threeofkindJButton.setText("getthreesnumber");
			display2Panel.add(threeofkindlabel2);
               		 display2Panel.add(threeofkindJButton);
		}
                if((p1turn == true && player1.getFourofakind() == -1) || (p2turn == true && player2.getFourofakind() == -1) || (p3turn == true && player3.getFourofakind() == -1) || (p4turn == true && player4.getFourofakind() == -1))
		{
                	fourofkindJButton.setText("getfoursnumber");
			display2Panel.add(fourofkindlabel2);
                	display2Panel.add(fourofkindJButton);
		}
                if((p1turn == true && player1.getFullhouse() == -1) || (p2turn == true && player2.getFullhouse() == -1) || (p3turn == true && player3.getFullhouse() == -1) || (p4turn == true && player4.getFullhouse() == -1))
		{
                	fullhouseJButton.setText("getonesnumber");
			display2Panel.add(fullhouselabel2);
			display2Panel.add(fullhouseJButton);
		}
                if((p1turn == true && player1.getSMStraight() == -1) || (p2turn == true && player2.getSMStraight() == -1) || (p3turn == true && player3.getSMStraight() == -1) || (p4turn == true && player4.getSMStraight() == -1))
		{
        	       	 SMStraightJButton.setText("getstwosnumber");
			display2Panel.add(SMStraightlabel2);
			display2Panel.add(SMStraightJButton);
		}

                if((p1turn == true && player1.getLGStraight() == -1) || (p2turn == true && player2.getLGStraight() == -1) || (p3turn == true && player3.getLGStraight() == -1) || (p4turn == true && player4.getLGStraight() == -1))
		{
               		 LGStraightJButton.setText("getthreesnumber");
			display2Panel.add(LGStraightlabel2);
			display2Panel.add(LGStraightJButton);
		}
                if((p1turn == true && player1.getChance() == -1) || (p2turn == true && player2.getChance() == -1) || (p3turn == true && player3.getChance() == -1) || (p4turn == true && player4.getChance() == -1))
		{
			chanceJButton.setText("getchancenumber");
			display2Panel.add(chancelabel2);
			display2Panel.add(chanceJButton);
		}
                if((p1turn == true && player1.getYahtzee() == -1) || (p2turn == true && player2.getYahtzee() == -1) || (p3turn == true && player3.getYahtzee() == -1) || (p4turn == true && player4.getYahtzee() == -1))		
		{
                	yahtzeeJButton.setText("getfoursnumber");
			display2Panel.add(yahtzeelabel2);
			display2Panel.add(yahtzeeJButton);	
			add(display2Panel);
		}

                ones = UpperRulesReturns(1);
                twos = UpperRulesReturns(2);
                threes = UpperRulesReturns(3);
                fours = UpperRulesReturns(4);
                fives = UpperRulesReturns(5);
                sixes = UpperRulesReturns(6);
                threeofkind = ThreeOfAKind();
                fourofkind = FourOfAKind();
                fullhouse = FullHouse();
                smstraight = SmallStraight();
                lgstraight = LargeStraight();
                yahtzee = Yahtzee();
                chance = Chance();
	
                ScoreOptions(ones,twos,threes,fours,fives,sixes,threeofkind,fourofkind,fullhouse,smstraight,lgstraight,yahtzee,chance);
		System.out.println("This is running");	

		onesJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = e.getActionCommand();
				int number1 = Integer.parseInt(number);
				System.out.println("Button has been clicked");		
				if(p1turn == true)
				{	
					player1ones.setText("" + number1);
					player1.setAces(number1);
					player1.setTotal(number1);
				}	
				else if(p2turn == true)
				{
					player2ones.setText("" + number1);	
                                        player2.setAces(number1);
                                        player2.setTotal(number1);

				}

				else if(p3turn == true)
				{
					player3ones.setText("" + number1);
                                        player3.setAces(number1);
                                        player3.setTotal(number1);

				}
				else if(p4turn == true)
				{
					player4ones.setText("" + number1);
                                        player4.setAces(number1);
                                        player4.setTotal(number1);

				}

				remove(display2Panel);
				remove(displayblank2Panel);
                                remove(displayplayerPanel);
				turnnumber++;
				 //ScoreOptions(ones,twos,threes,fours,fives,sixes,threeofkind,fourofkind,fullhouse,smstraight,lgstraight,yahtzee,chance);
				UpdatePlayerTurn();
			}
		});
               twosJButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                String number = e.getActionCommand();
                                int number1 = Integer.parseInt(number);

                                if(p1turn == true)
				{
                                        player1twos.setText("" + number1);
                                        player1.setTwos(number1);
                                        player1.setTotal(number1);

				}
                                else if(p2turn == true)
				{
                                        player2twos.setText("" + number1);
                                        player2.setTwos(number1);
                                        player2.setTotal(number1);

				}
                                else if(p3turn == true)
				{
                                        player3twos.setText("" + number1);
                                        player3.setTwos(number1);
                                        player3.setTotal(number1);

				}
                                else if(p4turn == true)
				{
                                        player4twos.setText("" + number1);
                                        player4.setTwos(number1);
                                        player4.setTotal(number1);

				}
                                remove(display2Panel);
                                remove(displayblank2Panel);
                                remove(displayplayerPanel);
				turnnumber++;
                                UpdatePlayerTurn();
                        }
                });

               threesJButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                String number = e.getActionCommand();
                                int number1 = Integer.parseInt(number);

                                if(p1turn == true)
				{
                                        player1threes.setText("" + number1);
                                        player1.setThrees(number1);
                                        player1.setTotal(number1);

				}
                                else if(p2turn == true)
				{
                                        player2threes.setText("" + number1);
                                        player2.setThrees(number1);
                                        player2.setTotal(number1);

				}
                                else if(p3turn == true)
				{
                                        player3threes.setText("" + number1);
                                        player3.setThrees(number1);
                                        player3.setTotal(number1);

				}
                                else if(p4turn == true)
				{
                                        player4threes.setText("" + number1);
                                        player4.setThrees(number1);
                                        player4.setTotal(number1);

				}
                                remove(display2Panel);
                                remove(displayblank2Panel);
                                remove(displayplayerPanel);
				turnnumber++;
                                UpdatePlayerTurn();

                        }
                });

               foursJButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                String number = e.getActionCommand();
                                int number1 = Integer.parseInt(number);

                                if(p1turn == true)
				{
                                        player1fours.setText("" + number1);
//                                        UpdatePlayerTurn();              
                                  //      PlayRound();
                                        player1.setFours(number1);
                                        player1.setTotal(number1);
     
                                }
				else if(p2turn == true)
                                {
				        player2fours.setText("" + number1);
 //                                       UpdatePlayerTurn();              
                                 //       PlayRound(); 
                                        player2.setFours(number1);   
                                        player2.setTotal(number1);
                                }
				else if(p3turn == true)
                        	{        
				        player3fours.setText("" + number1);
   //                                     UpdatePlayerTurn();              
                                //        PlayRound(); 
                                        player3.setFours(number1);
                                        player3.setTotal(number1);
                                }
				else if(p4turn == true)
				{
                                        player4fours.setText("" + number1);
     //                                   UpdatePlayerTurn();              
                                      //  PlayRound(); 
                                        player4.setFours(number1); 
                                        player4.setTotal(number1);
				}

                                remove(display2Panel);
                                remove(displayblank2Panel);
                                remove(displayplayerPanel);
				turnnumber++;
                                UpdatePlayerTurn();

                        }
                });

               fivesJButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                String number = e.getActionCommand();
                                int number1 = Integer.parseInt(number);

                                if(p1turn == true)
				{
                                        player1fives.setText("" + number1);
//                                        UpdatePlayerTurn();              
                                    //    PlayRound();     
                                        player1.setFives(number1);
                                        player1.setTotal(number1);
				}
                                else if(p2turn == true)
				{
                                        player2fives.setText("" + number1);
  //                                      UpdatePlayerTurn();              
                                  //      PlayRound();  
                                        player2.setFives(number1); 
                                        player2.setTotal(number1);
   
				}
                                else if(p3turn == true)
				{
                                        player3fives.setText("" + number1);
    //                                    UpdatePlayerTurn();              
                                 //       PlayRound();
                                        player3.setFives(number1); 
                                        player3.setTotal(number1);
     
				}
                                else if(p4turn == true)
				{
                                        player4fives.setText("" + number1);
      //                                  UpdatePlayerTurn();              
                                //        PlayRound();
                                        player4.setFives(number1); 
     
                                        player4.setTotal(number1);
				}
	//			display2Panel.setVisible(false);
        //                	PlayRound();
                                remove(display2Panel);
                                remove(displayblank2Panel);
                                remove(displayplayerPanel);
				turnnumber++;
                                UpdatePlayerTurn();

			}
                });

               sixesJButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                String number = e.getActionCommand();
                                int number1 = Integer.parseInt(number);

                                if(p1turn == true)
				{
                                        player1sixes.setText("" + number1);
 //                                       UpdatePlayerTurn();              
                                     //   PlayRound();
                                        player1.setSixes(number1); 
                                        player1.setTotal(number1);
     
				}
                                else if(p2turn == true)
                               	{
				         player2sixes.setText("" + number1);
   //                                     UpdatePlayerTurn();              
                                     //   PlayRound();  
                                        player2.setSixes(number1);
                                        player2.setTotal(number1);
   
                                }
				else if(p3turn == true)
                		{                
				        player3sixes.setText("" + number1);
     //                                   UpdatePlayerTurn();              
                                   //     PlayRound();
                                        player3.setSixes(number1);
                                        player3.setTotal(number1);
     
                                }
				else if(p4turn == true)
				{
                                        player4sixes.setText("" + number1);
       //                                 UpdatePlayerTurn();              
                                 //       PlayRound(); 
                                        player4.setSixes(number1);
                                        player4.setTotal(number1);
    
				}

	//			display2Panel.setVisible(false);
	//			PlayRound();
                                remove(display2Panel);
                                remove(displayblank2Panel);
                                remove(displayplayerPanel);
				turnnumber++;
                                UpdatePlayerTurn();

	                 }
                });
               threeofkindJButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                String number = e.getActionCommand();
                                int number1 = Integer.parseInt(number);

                                if(p1turn == true)
				{                               
        			 player1threeofkind.setText("" + number1);
        //                                UpdatePlayerTurn();              
                                //        PlayRound();
                                        player1.setThreeofakind(number1);
                                        player1.setTotal(number1);
     
                               	}
				else if(p2turn == true)
				{                                
       				 player2threeofkind.setText("" + number1);
      //                                  UpdatePlayerTurn();           
                                        player2.setThreeofakind(number1);
                                        player2.setTotal(number1);
   
                                }
				else if(p3turn == true)
                                {
				        player3threeofkind.setText("" + number1);
    //                                    UpdatePlayerTurn();
                                        player3.setThreeofakind(number1);
                                        player3.setTotal(number1);
              
				}                               	
				else if(p4turn == true)
				{                                
	        			player4threeofkind.setText("" + number1);
  //                                      UpdatePlayerTurn();
                                        player4.setThreeofakind(number1);
                                        player4.setTotal(number1);
                  			
				}
//				display2Panel.setVisible(false);
//				PlayRound();
                                remove(display2Panel);
                                remove(displayblank2Panel);
                                remove(displayplayerPanel);
				turnnumber++;
                                UpdatePlayerTurn();

                        }
                });

               fourofkindJButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                String number = e.getActionCommand();
                                int number1 = Integer.parseInt(number);

                                if(p1turn == true)
				{
                                        player1fourofkind.setText("" + number1);
//                                        UpdatePlayerTurn();
                                        player1.setFourofakind(number1);
                                        player1.setTotal(number1);
              
				}
                                else if(p2turn == true)
				{
                                        player2fourofkind.setText("" + number1);
  //                                      UpdatePlayerTurn();              
                                        player2.setFourofakind(number1); 
                                        player2.setTotal(number1);

				}
                                else if(p3turn == true)
				{
                                        player3fourofkind.setText("" + number1);
    //                                    UpdatePlayerTurn();
                                        player3.setFourofakind(number1); 
                                        player3.setTotal(number1);
             
				}
                                else if(p4turn == true)
				{
                                        player4fourofkind.setText("" + number1);
      //                                  UpdatePlayerTurn(); 
                                        player4.setFourofakind(number1); 
                                        player4.setTotal(number1);
                  
				}
	//			display2Panel.setVisible(false);
	//			PlayRound();
                                remove(display2Panel);
                                remove(displayblank2Panel);
                                remove(displayplayerPanel);
				turnnumber++;
                                UpdatePlayerTurn();

                        }
                });

               fullhouseJButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                String number = e.getActionCommand();
                                int number1 = Integer.parseInt(number);

                                if(p1turn == true)
				{
                                        player1fullhouse.setText("" + number1);
        //                                UpdatePlayerTurn();
                                        player1.setFullhouse(number1); 
                                        player1.setTotal(number1);
              
				}
                                else if(p2turn == true)
				{
                                        player2fullhouse.setText("" + number1);
          //                              UpdatePlayerTurn();          
                                        player2.setFullhouse(number1); 
                                        player2.setTotal(number1);
				}
                                else if(p3turn == true)
				{
                                        player3fullhouse.setText("" + number1);
            //                            UpdatePlayerTurn();
                                        player3.setFullhouse(number1);
                                        player3.setTotal(number1);
				}
                                else if(p4turn == true)
				{
                                        player4fullhouse.setText("" + number1);
              //                          UpdatePlayerTurn();
                                        player4.setFullhouse(number1);   
                                        player4.setTotal(number1);
				}

		//		display2Panel.setVisible(false);
		//		PlayRound();
                                remove(display2Panel);
                                remove(displayblank2Panel);
                                remove(displayplayerPanel);
				turnnumber++;
                                UpdatePlayerTurn();

                        }
                });
               SMStraightJButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                String number = e.getActionCommand();
                                int number1 = Integer.parseInt(number);

                                if(p1turn == true)
				{
                                        player1SMStraight.setText("" + number1);
//                                        UpdatePlayerTurn();
                                        player1.setSMStraight(number1);
                                        player1.setTotal(number1);
				}
                                else if(p2turn == true)
				{
                                        player2SMStraight.setText("" + number1);
  //                                      UpdatePlayerTurn();
                                        player2.setSMStraight(number1);
                                        player2.setTotal(number1);
              
				}
                                else if(p3turn == true)
				{
                                        player3SMStraight.setText("" + number1);
    //                                    UpdatePlayerTurn();
                                        player3.setSMStraight(number1); 
                                        player3.setTotal(number1);
             
				}
                                else if(p4turn == true)
				{
                                        player4SMStraight.setText("" + number1);
      //                                  UpdatePlayerTurn(); 
                                        player4.setSMStraight(number1); 
                                        player4.setTotal(number1);
                 
				}
	//			display2Panel.setVisible(false);
	//			PlayRound();
                                remove(display2Panel);
                                remove(displayblank2Panel);
                                remove(displayplayerPanel);
				turnnumber++;
                                UpdatePlayerTurn();

                        }
                });

               LGStraightJButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                String number = e.getActionCommand();
                                int number1 = Integer.parseInt(number);

                                if(p1turn == true)
				{
                                        player1LGStraight.setText("" + number1);
//                                        UpdatePlayerTurn(); 
                                        player1.setLGStraight(number1); 
                                        player1.setTotal(number1);
             
				}
                                else if(p2turn == true)
				{
                                        player2LGStraight.setText("" + number1);
  //                                      UpdatePlayerTurn(); 
                                        player2.setLGStraight(number1);
                                        player2.setTotal(number1);
             
				}
                                else if(p3turn == true)
				{
                                        player3LGStraight.setText("" + number1);
    //                                    UpdatePlayerTurn(); 
                                        player3.setLGStraight(number1);
                                        player3.setTotal(number1);

				}
                                else if(p4turn == true)
				{
                                        player4LGStraight.setText("" + number1);
      //                                  UpdatePlayerTurn();
                                        player4.setLGStraight(number1);
                                        player4.setTotal(number1);
              
				}
	//			display2Panel.setVisible(false);
	//			PlayRound();
                                remove(display2Panel);
                                remove(displayblank2Panel);
                                remove(displayplayerPanel);
				turnnumber++;
                                UpdatePlayerTurn();

                        }
                });

               chanceJButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                String number = e.getActionCommand();
                                int number1 = Integer.parseInt(number);

                                if(p1turn == true)
				{
                                        player1chance.setText("" + number1);
//                                        UpdatePlayerTurn();
                                        player1.setChance(number1);
                                        player1.setTotal(number1);

				}
                                else if(p2turn == true)
				{
                                        player2chance.setText("" + number1);
  //                                      UpdatePlayerTurn();
                                        player2.setChance(number1); 
                                        player2.setTotal(number1);

				}
                                else if(p3turn == true)
				{
                                        player3chance.setText("" + number1);
    //                                    UpdatePlayerTurn();
                                        player3.setChance(number1); 
                                        player3.setTotal(number1);
				}
                                else if(p4turn == true)
				{
                                        player4chance.setText("" + number1);
      //                                  UpdatePlayerTurn();
                                        player4.setChance(number1);
                                        player4.setTotal(number1);
                                        
				}
	//			display2Panel.setVisible(false);
	//			PlayRound();
                                remove(display2Panel);
                                remove(displayblank2Panel);
                                remove(displayplayerPanel);
				turnnumber++;
                                UpdatePlayerTurn();

                        }
                });

               yahtzeeJButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                String number = e.getActionCommand();
                                int number1 = Integer.parseInt(number);

                                if(p1turn == true)
				{
                                        player1yahtzee.setText("" + number1);
//                                        UpdatePlayerTurn();
                                        player1.setYahtzee(); 
                                        player1.setTotal(number1);
				}
                                else if(p2turn == true)
				{
                                        player2yahtzee.setText("" + number1);
  //                                      UpdatePlayerTurn();
                                        player2.setYahtzee();
                                        player2.setTotal(number1);

				}
                                else if(p3turn == true)
				{
                                        player3yahtzee.setText("" + number1);
    //                                    UpdatePlayerTurn();
                                        player3.setYahtzee();
                                        player3.setTotal(number1);

				}
                                else if(p4turn == true)
				{
                                        player4yahtzee.setText("" + number1);
      //                                  UpdatePlayerTurn();
                                        player4.setYahtzee();
                                        player4.setTotal(number1);

				}

	//			display2Panel.setVisible(false);
	//			PlayRound();
                                remove(display2Panel);
                                remove(displayblank2Panel);
				remove(displayplayerPanel);
				turnnumber++;   
                                UpdatePlayerTurn();

                        }
                });
               
              
               for(int i = 0; i < 5; i++) {
          			
      				if(selectionArr[i] == false) 
      					diceButton[i].setText("0");
      				
          		}

		display2Panel.setVisible(true);
		



	}
	
	
	public void RollDice() {
		final int turnCount = turnnumber;
		Random r = new Random();
		if(rolls < 3) {
			for(int i = 0; i < 5; i++) 
				diceArray[i] = r.nextInt(1, 7);
		
			for(int i = 0; i < 5; i++) {
			
				if(selectionArr[i] == false) {
					diceButton[i].setText((Integer.toString(diceArray[i])));
					
				}
			}
			rolls++;
		}
	
		 ones = UpperRulesReturns(1);
         twos = UpperRulesReturns(2);
         threes = UpperRulesReturns(3);
         fours = UpperRulesReturns(4);
         fives = UpperRulesReturns(5);
         sixes = UpperRulesReturns(6);
         threeofkind = ThreeOfAKind();
         fourofkind = FourOfAKind();
         fullhouse = FullHouse();
         smstraight = SmallStraight();
         lgstraight = LargeStraight();
         yahtzee = Yahtzee();
         chance = Chance();
         grandTotal = Total();
        ScoreOptions(ones,twos,threes,fours,fives,sixes,threeofkind,fourofkind,fullhouse,smstraight,lgstraight,chance,yahtzee);
        
	}
	
	public void SelectDice(int i) {
		//selects and deselects dice.
		if(diceButton[i].isSelected()) {
			selectionArr[i] = false;
			diceButton[i].setSelected(false);
		}
		else{
			selectionArr[i] = true;
			diceButton[i].setSelected(true);
		}
			
		if(diceButton[i].isSelected()) {
			diceButton[i].setBackground(Color.YELLOW);
			diceButton[i].setOpaque(true);
		}
		else
			diceButton[i].setBackground(null);
	}
	
	public void AddDicePanel() {
		JPanel dicePanel = new JPanel(); //code doesn't stop rolling after 4 tries
		dicePanel.setLayout(new GridLayout(0,5,1,0));
		dicePanel.setBackground(Color.lightGray);
		
		for(int i = 0; i < 5; i++) {
			diceButton[i] = new JButton();
			diceButton[i].setPreferredSize(new Dimension(60, 60));
			dicePanel.add(diceButton[i]);
		}
		
		dicePanel.add(rollButton);
		add(dicePanel);
	}
	
	
	public void DiceFunctionality() {
		System.out.println("here");
		rollButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.out.println("here2");
				RollDice();
			}
		});
		
		for(int i = 0; i < 5; i++) {
			final int a = i;
			diceButton[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("roll button");
					SelectDice(a);
				}
			});
		}
	}
	
	
	public void DicePanel() {

//specifying player turn
                displayplayerPanel = new JPanel();
            
//               pgoing.setBorder(BorderFactory.createLineBorder(Color.black));
  
              displayplayerPanel.setLayout(new GridLayout(0,1,0,0));
                displayplayerPanel.setBackground(Color.WHITE);
                displayplayerPanel.setPreferredSize(new Dimension(150,50));
	
		if(p1turn == true)
                	pgoing = new JLabel("Player 1 Turn", JLabel.CENTER);
		else if(p2turn == true)
                        pgoing = new JLabel("Player 2 Turn", JLabel.CENTER);    
		else if(p3turn == true)
                        pgoing = new JLabel("Player 3 Turn", JLabel.CENTER);    
		else
                        pgoing = new JLabel("Player 1 Turn", JLabel.CENTER);    	
               pgoing.setBorder(BorderFactory.createLineBorder(Color.black));

                displayplayerPanel.add(pgoing);
                add(displayplayerPanel);

		

		NumberChoosing();             
	}	
	
	public void WinnerDisplay() {
		JFrame frame = new JFrame();
		frame.setSize(400,400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel winnerPanel = new JPanel();
		JLabel winnerLabel = new JLabel();
		frame.add(winnerPanel);
		int[] arr = new int[4];
		arr[0] = player1.getTotalscore();
		arr[1] = player2.getTotalscore();
		if(playernumber == 3 || playernumber == 4) {
			arr[2] = player3.getTotalscore();
		}
		else {
			arr[2] = -1;
			arr[3] = -1;
		}
		if(playernumber == 4) {
			arr[3] = player4.getTotalscore();
		}
		int temp = 0;
		if(arr[0] > arr[1] && arr[0] > arr[2] && arr[0] > arr[3]) {
			winnerLabel.setText("Player1 wins");
		}
		if(arr[1] > arr[0] && arr[1] > arr[2] && arr[1] > arr[3]) {
			winnerLabel.setText("Player2 wins");
		}
		if(arr[2] > arr[1] && arr[2] > arr[0] && arr[2] > arr[3]) {
			winnerLabel.setText("Player3 wins");
		}
		if(arr[3] > arr[1] && arr[3] > arr[2] && arr[3] > arr[0]) {
			winnerLabel.setText("Player4 wins");
		}
		JButton exit = new JButton("exit");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
		remove(displayPanel);
		winnerLabel.setBorder(BorderFactory.createLineBorder(Color.black));
		winnerLabel.setPreferredSize(new Dimension(90, 50));
		//winnerPanel.add(winnerLabel);
		frame.add(winnerLabel);
		//add(winnerLabel);
		
	}
	
    public void StartDisplay()
    {                		
                numberofplayers = new JLabel("Select amount of players", JLabel.CENTER);
                twoplayerJButton = new JButton("2");
                threeplayerJButton = new JButton("3");
                fourplayerJButton = new JButton("4");
                JButton rulesButton = new JButton("Yahtzee Rules");

                introductionPanel = new JPanel();
                setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
                setSize(1800,1800);
                setResizable(false);                 
                introductionPanel.setBorder(BorderFactory.createLineBorder(Color.black)); 
                getContentPane().setBackground(Color.GREEN);

                introductionPanel.setLayout(new GridLayout(5,0,0,0));
                numberofplayers.setPreferredSize(new Dimension(300,55));
		introductionPanel.add(numberofplayers);
                introductionPanel.add(twoplayerJButton);            
                introductionPanel.add(threeplayerJButton);
                introductionPanel.add(fourplayerJButton);
		introductionPanel.add(rulesButton);


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
		
		rulesButton.addActionListener(
                	new ActionListener()
                	{
                		public void actionPerformed(ActionEvent e)
                		{
                			OpenRulesPanel();
                		}
                	});

		add(introductionPanel);
                setVisible(true);
	}
	
	private void OpenRulesPanel() {
    		JTextArea rulesText = new JTextArea(6,20);
    		String rules = "Our game implements standard Yahtzee rules\n"
    			+ "without the Joker options. The special feature of our game\n"
    			+ "is the ability to  have a fourth roll but with a penalty of\n"
    			+ "15 points.";

    		rulesText.setText(rules);
    		JOptionPane.showMessageDialog(null, rules);
    	
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
		chanceJButton.setText("" + chance);
		yahtzeeJButton.setText("" + yahtzee);
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

	public void Rules(){
		diceValue = 0;	//used in full house, three and four of a kind
	}

	public void SetDice(int[] dice){
		for (int i = 0; i < 5; i++) {
			diceArray[i] = dice[i];
		}
	}
	
	public int UpperRulesReturns(int x) {
		int upperRules = 0;
		for (int i : diceArray) {
			if (i == x) 
				upperRules += i;	
		}
		
		return upperRules;
	}

	private void Sort(int[] arr) { //used for large and small straight
		int min = 0, temp = 0;
		
		for(int i = 0; i < 4; i++) {
			min = i;
			for(int x = i+1; x < 5; x++) {
				if(arr[x] < arr[min])
					min = x;
			}	
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
	
	public int Chance() {
		int sum = 0;
		
		for(int i = 0; i < 6; i++) 
			sum = sum + diceArray[i];
		return sum;
	}
	
	public int ThreeOfAKind() {
		int count = 0;
		
		for(int i = 0; i < 6; i++) {
			diceValue = i+1;
		
			for(int x = 0; x < 5; x++) {
				
				if(diceArray[x] == diceValue)
					count++;
				if(count == 3)
					return Chance();
			}
			count = 0;
		}
		return 0;
	}
	
	public int FourOfAKind() {
		int count = 0;
		
		if(ThreeOfAKind() != 0) {
			for(int i = 0; i < 5; i ++) {
				
				if(diceArray[i] == diceValue)
					count++;
				if(count == 4)
					return Chance();
			}
		}
		return 0;	
	}
	
	public int FullHouse() {
		int num1 = -1, num2 = 0;
		if(ThreeOfAKind() != 0) {
			
			for(int i = 0; i < 5; i++) {
				//looks for equality among dice that are
				//not part of the three of a kind
				if(diceArray[i] != diceValue && num1 == -1) 
					num1 = diceArray[i];
				else if(num1 != 0 && diceArray[i] != diceValue) 
					num2 = diceArray[i];
				
				if(num1 == num2)
					return 25;
			}
		}
		return 0;
	}
	
	public int SmallStraight() {
		
		int[] arr = diceArray.clone();
		int count = 0;
		
		Sort(arr);
		for(int i = 0; i < 4; i++) {
			
			if(arr[i+1] - arr[i] == 1)
				count++;
			if(count > 0 && arr[i+1] - arr[i] != 1)
				return 0;
		}
		if(count >= 3) 
			return 30;
		return 0;
	}
	
	public int LargeStraight() {
		
		int[] arr = diceArray.clone();
		int count = 0;
		
		Sort(arr);
		for(int i = 0; i < 4; i++) {
			
			if(arr[i+1] - arr[i] == 1) 
				count++;
			if(count > 0 && arr[i+1] - arr[i] != 1)
				return 0;
		}
		if(count == 4) 
			return 40;
		return 0;
	}
	
	public int Yahtzee() {
		
		int num = diceArray[0], count = 0;
		for(int i = 0; i < 5; i++) {
			
			if(diceArray[i] == num)
				count++;
		}
		if(count == 5) {
			return 50;
		}
		return 0;
	}
	
	public int Total() {
		int total = ones + twos + threes + fours + fives + sixes + threeofkind + fourofkind
				+ fullhouse + smstraight + lgstraight + yahtzee + chance;
		return total;
	}
	
	
	public void clearDiceVal() {
		diceValue = 0;
	}


        public YahtzeeGame()
        {
               StartDisplay();
//		DicePanel();
//		NumberChoosing();
        }

	public static void main(String args[])
	{
		
		new YahtzeeGame();
	}


}