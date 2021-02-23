/*Welcome to Snake and ladder Program
This problem simulates a Snake and Ladder Game. The Player
starts from 0 rolls the die to get a number between 1 to 6, finds
a safe place, ladder or a snake keeps doing till the winning spot

100 is achieved.*/
public class SnakeAndLadderProgram {
//<<<<<<< UC6-SnakeAndLadder_DieCount
	public static final int END_POSITION=100;
	public static final int START_POSITION = 0;
//=======
//<<<<<<< UC3-AskUserChoice
	public static final int END_POSITION=100;

	public static final int LADDER=1;
	public static final int SNAKE=2;
	
	public static void main(String[] args)
	{
//<<<<<<< UC6-SnakeAndLadder_DieCount
		System.out.println("welcome to snake and ladder program");
		 int dieCount=0;
		 int startPosition=0;
		 int currentPosition=0;
		//using Random to die count b/w 1-6
		 
		 System.out.println("position of player is in ="+currentPosition);
		 int  diceRoll = (int)Math.floor(Math.random()*10)%6 +1;
		 System.out.println("die number="+diceRoll);
		 
	
		 while (currentPosition != END_POSITION)
		 {
			 int checkOption=(int)Math.floor(Math.random()*10)%3;
			 
			
			 switch(checkOption)
			 {
			 	case LADDER:
			 		System.out.println("climbed ladder,,,");
			 		if(END_POSITION-currentPosition < diceRoll)
					{
			 			currentPosition=currentPosition;
					}
					else
					{
			 		    currentPosition+=diceRoll;
					}
			 		
			 		break;
			 	case SNAKE: 
			 		System.out.println("got to Snake!!!");
			 		currentPosition =currentPosition - diceRoll;
			 		if(currentPosition < 0)
			 		{
			 			currentPosition=startPosition;
			 		}
			 		
			 		break;
			 	default:
			 		System.out.println("No Move");
			 		currentPosition+=0;
			 		
			 }
			 System.out.println("Current Position ="+currentPosition);
			 dieCount++;
		 }
			 
			 System.out.println("No of times the die was rolled ="+dieCount);
	}
	

		 int currentPosition=0;
		//using Random to die count b/w 1-6
		 int  diceRoll = (int)Math.floor(Math.random()*10 )%6 +1;
		 System.out.println("position of player is in ="+ currentPosition+ "and rolls die "+diceRoll);
		 currentPosition=currentPosition+diceRoll;
		 System.out.println("moves " +currentPosition+ "forward");
		 
		 
		 while (currentPosition != END_POSITION)
		 {
			 int checkOption=(int)(Math.random()*10)%3;
			 System.out.println("user selected option"+checkOption);
			 switch(checkOption)
			 {
			 	case LADDER: 
			 		currentPosition =currentPosition + diceRoll;
			 		break;
			 	case SNAKE: 
			 		currentPosition =currentPosition - diceRoll;
			 		break;
			 	default:
			 		currentPosition+=0; 
			 }
			 System.out.println("Current Position ="+currentPosition);
		 }
	}
	

//<<<<<<< UC2-RandomToRolldie
	
	public static void main(String[] args)
	{
		//using Random to die count b/w 1-6
	public static void main(String[] args)
	{

		 int  diceRoll = (int)(Math.random()*6 )+1;
		 int pos=0;
		 System.out.println("position of player is in ="+ pos+ "rolls die "+diceRoll);	    
	}

}

