
class Rules{
	
	private int[] diceArray = new int[5];
	private int diceValue;
	
	public Rules(){
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
		
		for(int i = 0; i < 5; i++) 
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
	
	
	public void clearDiceVal() {
		diceValue = 0;
	}
}
