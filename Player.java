class Player
{
	private int totalscore;
	private int upscoreprebonus;
	private int upscorewithbonus;
	private int lowerscore;
	private int aces;
	private int twos;
	private int threes;
	private int fours;
	private int fives;
	private int sixes;	
	private int threeofakind;
	private int fourofakind;
	private int fullhouse;
	private int SMStraight;
	private int LGStraight;
	private int yahtzee;
	private int chance;
	private int yahtzeecounter;

	public Player()
	{
	        totalscore = 0;
  	        upscoreprebonus = 0;
       		upscorewithbonus = 0;
      	 	lowerscore = -1;
       		aces = -1;
       		twos = -1;
       		threes = -1;
       		fours = -1;
       		fives = -1;
       		sixes = -1;
        	threeofakind = -1;
       		fourofakind = -1;
		fullhouse = -1;
       		SMStraight = -1;
       		LGStraight = -1;
       		yahtzee = -1;
		yahtzeecounter = 0;
        	chance = -1; 
	}

	public void setTotalscore()
	{
		totalscore = upscorewithbonus + lowerscore;
	}

        public void setUpscoreprebonus()
	{
		/*if(aces != -1)
			upscoreprebonus = upscoreprebonus + aces;
		if(twos != -1)
			upscoreprebonus = upscoreprebonus + twos;
		if(threes != -1)
			upscoreprebonus = upscoreprebonus + threes;
		if(fours != -1)
			upscoreprebonus = upscoreprebonus + fours;
		if(fives != -1)
			upscoreprebonus = upscoreprebonus + fives;
		if(sixes != -1)
			upscoreprebonus = upscoreprebonus + fives;*/
		upscoreprebonus += a;
	}

        public void setUpscorewithbonus() // only call when all rounds are complete
	{
		if(upscoreprebonus >= 63)
			upscorewithbonus = upscoreprebonus + 35;
		else
			upscorewithbonus = upscoreprebonus;	
	}

	public void setLowerscore() //only call when all rounds are complete
	{
		if(threeofakind != -1)
                        lowerscore = upscoreprebonus + threeofakind;
                if(fourofakind != -1)
                        lowerscore = upscoreprebonus + fourofakind;
                if(SMStraight != -1)
                        lowerscore = upscoreprebonus + SMStraight;
                if(LGStraight != -1)
                        lowerscore = upscoreprebonus + LGStraight;
                if(yahtzee != -1)
                        lowerscore = upscoreprebonus + yahtzee;
                if(chance != -1)
                        lowerscore = upscoreprebonus + chance;
	}

        public void setAces(int a)
	{
		aces = a;
	}

        public void setTwos(int a)
	{
		twos = a;
	}
        public void setThrees(int a)
	{
		threes = a;
	}

        public void setFours(int a )
	{
		fours = a;
	}
	
        public void setFives(int a)
	{
		fives = a;
	}

        public void setSixes(int a)
	{
		sixes = a;
	}

        public void setThreeofakind(int a)
	{
		threeofakind = a;
	}
	
        public void setFourofakind(int a)
	{
		fourofakind = a;
	}

	public void setFullhouse(int a)
	{
		fullhouse = a;
	}
	
        public void setSMStraight(int a)
	{
		SMStraight = a;
	}

        public void setLGStraight(int a)
	{
		LGStraight = a;
	}

        public void setYahtzee()
	{
		if(yahtzeecounter == 0)
		{
			yahtzee = 50;
			yahtzeecounter++;
		}
		
		else
			yahtzee = yahtzee + 100;
	}

        public void setChance(int a)
	{
		chance = a;
	}
	
	public void setTotal(int a) {
    	  totalscore +=a;
      	}

        public int getTotalscore()
	{
		return totalscore;	
	}

        public int getUpscoreprebonus()
	{
		return upscoreprebonus;
	}

        public int getUpscorewithbonus()
	{
		return upscorewithbonus;
	}

        public int getLowerscore()
	{
		return lowerscore;
	}

        public int getAces()
	{
		return aces;
	}

        public int getTwos()
	{
		return twos;
	}

        public int getThrees()
	{
		return threes;
	}

        public int getFours()
	{
		return fours;
	}

        public int getFives()
	{
		return fives;
	}

        public int getSixes()
	{
		return sixes;
	}

        public int getThreeofakind()
	{
		return threeofakind;
	}

        public int getFourofakind()
	{
		return fourofakind;
	}

	public int getFullhouse()
	{
		return fullhouse;
	}

        public int getSMStraight()
	{
		return SMStraight;
	}

        public int getLGStraight()
     	{
		return LGStraight;
	}

	public int getYahtzee()
	{
		return yahtzee;
	}

        public int getChance()
	{
		return chance;
	}	
}
