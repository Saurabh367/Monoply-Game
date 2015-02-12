public class Dice {
    
    private static int diceOne = 0;
    private static int diceTwo = 0;
    private static int total = 0;
    
    
    
    public static int roll (){ 
    diceOne = (int)(Math.random()*6) + 1;
	diceTwo = (int)(Math.random()*6) + 1;
	
	
	total = diceOne + diceTwo;
	return total;
    }
    
    public boolean isDouble (){ 
	
	if (diceOne==diceTwo)
	    return true;
	else 
	    return false;
    }   
}
