
public class UpperRules extends Game{
	private int[] diceArray = new int[5];
	public int[] scoreArray = new int[6];
	public int upperScore;
	
	public UpperRules() {
		// would pull the dice data from the game class
		upperScore = 0;
		for (int i : scoreArray)
			i = 0;
	}
	public void createScoreArray() {
		for (int i : diceArray) {
			if (i == 1) 
				scoreArray[i] += 1;
			else if (i == 2)
				scoreArray[i] += 2;
			else if (i == 3)
				scoreArray[i] += 3;
			else if (i == 4)
				scoreArray[i] += 4;
			else if (i == 5)
				scoreArray[i] += 5;
			else if (i == 6)
				scoreArray[i] += 6;
		}
	}
	
	public int TotalUpperScore () {
		for (int i : scoreArray)
			upperScore += i;
		if (upperScore >= 63)
			return (upperScore + 35);
		else
			return upperScore;
	}
}
