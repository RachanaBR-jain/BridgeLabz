/*Welcome to Snake and ladder Program
This problem simulates a Snake and Ladder Game. The Player
starts from 0 rolls the die to get a number between 1 to 6, finds
a safe place, ladder or a snake keeps doing till the winning spot

100 is achieved.*/
public class SnakeAndLadderProgram {
	public static final int END_POSITION=100;
	public static final int LADDER=1;
	public static final int SNAKE=2;
	
	public static void main(String[] args)
	{
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
	
}

