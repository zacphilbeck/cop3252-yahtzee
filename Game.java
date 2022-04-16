import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Scanner;

class GamePanel extends JPanel{
	
	private int screen_x = 600;
	private int screen_y = 400;
	private JPanel gamePanel;
	Scoring sc = new Scoring();
	Player[] players;
	private Random rand = new Random();
	
	public GamePanel() {	// constructor
		gamePanel = new JPanel();
		gamePanel.setBackground( Color.WHITE );
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent( g ); // call superclass's paintComponent

	      Graphics2D g2d = ( Graphics2D ) g; // cast g to Graphics2D
	}
	
	public void Turn(int player, int round) {
		System.out.println("Player " + (player+1) + ": \n");
		int dice[] = {0,0,0,0,0};
		for (int i = 0; i < 3; i++) {
			int tempDice[] = {0,0,0,0,0};
			for (int j = 0; j < 5; j++) {
				tempDice[j] = rand.nextInt(6) + 1;
				System.out.println("Dice #" + (j+1) + ": " + tempDice[j]);
			}
			
			System.out.println("What do you want to keep?");
			Scanner in = new Scanner(System.in);
			
			while (in.nextInt() != 0) {
				int keepDice = in.nextInt();
				dice[keepDice - 1] = tempDice[keepDice - 1];
				
			}
			in.close();
			
			if (i == 2) {
				for (int z = 0; z < 5; z++) {
					if (dice[z] == 0)
						dice[z] = tempDice[z];
					System.out.println("Dice #" + (z+1) + ": " + dice[z]);

				}
			}
		}
		
		sc.ScoreTurn(round, dice);
		int scoreArray[] = sc.GetScoring();
		
		System.out.println("Which score would you like to keep?");
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		
		switch (number) {
		case 1:
			players[player].setAces(scoreArray[number]);
		case 2:
			players[player].setTwos(scoreArray[number]);
		case 3:
			players[player].setThrees(scoreArray[number]);
		case 4:
			players[player].setFours(scoreArray[number]);
		case 5:
			players[player].setFives(scoreArray[number]);
		case 6:
			players[player].setSixes(scoreArray[number]);
		case 7:
			players[player].setChance(scoreArray[number]);
		case 8:
			players[player].setThreeofakind(scoreArray[number]);
		case 9:
			players[player].setFourofakind(scoreArray[number]);
		case 10:
			players[player].setFullhouse(scoreArray[number]);
		case 11:
			players[player].setSMStraight(scoreArray[number]);
		case 12:
			players[player].setLGStraight(scoreArray[number]);
		case 13:
			players[player].setYahtzee();
			
		}
		

		
	}
	
	public void EndGame() {
		
	}
	
	public int setPlayers() {
		int playerNum;
		
		System.out.println("How many players?");
		Scanner con = new Scanner(System.in);
		
		playerNum = con.nextInt();
		
		players = new Player[playerNum];
		
		for (int i = 0; i < playerNum; i++) {
			players[i] = new Player();
		}
		
		con.close();
		
		return playerNum;
	}
	
	}

public class Game {
	public static void main( String args[] ){
	      JFrame frame = new JFrame( "Yahtzee" );
	      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	      
	      GamePanel gamePanel = new GamePanel(); // create 

	      frame.add(gamePanel); // add snowman to frame
	      frame.setSize( new Dimension( 600, 400 )); // set frame size
	      frame.setResizable( false );	// allows resizing
	      frame.setVisible( true ); // display frame
	      
	      int playerNum = gamePanel.setPlayers();
	      
	      for (int i = 0; i < 13; i++) {
	    	  for (int j = 0; j < playerNum; j++) {
	    		  gamePanel.Turn(j, i);
	    	  }
	      }
	      
	      
	}
	
}