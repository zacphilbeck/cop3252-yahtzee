import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Dice extends JPanel{
	
	private int[] diceArray = new int[5];
	private JButton[] diceButton = new JButton[5];
	private boolean[] selectionArr = new boolean[5];
	
	
	public Dice() {
		for(int i = 0; i < 5; i++) {
			selectionArr[i] = false;
		}
	}
	
	public void RollDice() {
		
		Random r = new Random();
		for(int i = 0; i < 5; i++) 
			diceArray[i] = r.nextInt(1, 7);
		
		for(int i = 0; i < 5; i++) {
			
			if(selectionArr[i] == false) {
				diceButton[i].setText((Integer.toString(diceArray[i])));
			}
		}	
	}
	
	public void SelectDice(int i) {
		
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
	
	public void DicePanel() {
		
		Dice DicePanel = new Dice();
		JFrame DiceFrame = new JFrame();
		JButton roll = new JButton("Roll");
		
		for(int i = 0; i < 5; i++) {
			diceButton[i] = new JButton();
			diceButton[i].setBounds(i*60, 50, 60, 60);
		}
		
		roll.setBounds(0,115, 300, 40);
		
		for(int i = 0; i < 5; i++)
			DiceFrame.add(diceButton[i]);
		
		
		roll.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				RollDice();
			}
		});
		
		
		
		for(int i = 0; i < 5; i++) {
			final int a = i;
			diceButton[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					SelectDice(a);
				}
			});
		}
		
		DiceFrame.add(roll);
		DiceFrame.add(DicePanel);
		DiceFrame.setSize(300, 228);
		DiceFrame.setVisible(true);
		DiceFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
	
	

	public static void main(String[] args) {
	
		Dice d = new Dice();
		d.DicePanel();
		//d.RollDice();

	}

}
