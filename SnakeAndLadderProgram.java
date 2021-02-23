/*Welcome to Snake and ladder Program
This problem simulates a Snake and Ladder Game. The Player
starts from 0 rolls the die to get a number between 1 to 6, finds
a safe place, ladder or a snake keeps doing till the winning spot

100 is achieved.*/
public class SnakeAndLadderProgram {
	public static final int END_POSITION=100;
	public static final int START_POSITION = 0;
	public static final int LADDER=1;
	public static final int SNAKE=2;
	
	public static void main(String[] args)
	{
		System.out.println("welcome to snake and ladder program");
		 int dieCount=0;
		 int startPosition=0;
		 int currentPosition=0;
		 int [] player_Position=new int[2];
		//using Random to die count b/w 1-6
		 System.out.println("Player1 and Player are in Postion:"+START_POSITION);
	
		 while ( player_Position[currentPosition]!= END_POSITION)
		 {
			 int checkOption=(int)Math.floor(Math.random()*10)%3;
			 System.out.println("Option Choosed was : "+checkOption);
			 int diceRoll = (int) Math.floor(Math.random() * 10) % 6 + 1;
			
			 switch(checkOption)
			 {
			 	case LADDER:
			 		System.out.println("climbed ladder,,,");
			 		if(END_POSITION-player_Position[currentPosition] < diceRoll)
					{
			 			player_Position[currentPosition]=player_Position[currentPosition];
					}
					else
					{
						player_Position[currentPosition]+=diceRoll;
					}
			 		System.out.println("Position of player "+(currentPosition+1)+" is :" +player_Position[currentPosition]);
			 		currentPosition=(currentPosition+1)%2;
			 		break;
			 	case SNAKE: 
			 		System.out.println("got to Snake!!!");
			 		player_Position[currentPosition] =player_Position[currentPosition] - diceRoll;
			 		if(player_Position[currentPosition] <START_POSITION )
			 		{
			 			player_Position[currentPosition]=START_POSITION;
			 		}
			 		System.out.println("Position of player "+(currentPosition+1)+" is :" +player_Position[currentPosition]);
			 		currentPosition=(currentPosition+1)%2;
			 		break;
			 	default:
			 		System.out.println("No Play");
			 		System.out.println("Position of player "+(currentPosition+1)+" is :" +player_Position[currentPosition]);	
			 }
	
			 dieCount++;
			 currentPosition=(currentPosition+1)%2;
		 }
		     System.out.println("Congrats player "+(currentPosition+1)+" won the game");
			 System.out.println("No of times the die was rolled ="+dieCount);
	}
	
}

