
public class Scoring {
	private int[] scoring;

	public Scoring() {
		scoring = new int [13];
	}
	
	public void ScoreTurn(int round, int [] diceArray) {
		Rules r = new Rules();

		r.SetDice(diceArray);
				
		for (int i = 0; i < 6; i++)
			scoring[i]  = r.UpperRulesReturns(i + 1);
		
		scoring[6] = r.Chance();
		scoring[7] = r.ThreeOfAKind();
		scoring[8] = r.FourOfAKind();
		scoring[9] = r.FullHouse();
		scoring[10] = r.SmallStraight();
		scoring[11] = r.LargeStraight();
		scoring[12] = r.Yahtzee();

	}
	
	public int[] GetScoring() {
		
		for (int j = 0; j < 13; j++) 
			System.out.println("[" + (j+1) + "]:\t" + scoring[j]);
		
		return scoring;
	}
	
	
	
}
