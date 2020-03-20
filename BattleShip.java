 import java.util.Scanner;


public class BattleShip{

	 Scanner input = new Scanner(System.in);



// #################MAIN#################

public static void main(String[] arg)
      {
         String[][] pBoard = new String[8][8];
		 String[][] eBoard = new String[8][8];
		titleCard();
		chooseGame(pBoard, eBoard);

		//testGame(pBoard,eBoard);

	}

//#################END#MAIN#################

/*
===================
   TITLE CARD
===================
*/

public static void titleCard(){

System.out.println("Welcome to\n\n");

System.out.println(":::====  :::====  :::==== :::==== :::     :::===== :::===  :::  === ::: :::====");
System.out.println(":::  === :::  === :::==== :::==== :::     :::      :::     :::  === ::: :::  ===");
System.out.println("=======  ========   ===     ===   ===     ======    =====  ======== === =======");
System.out.println("===  === ===  ===   ===     ===   ===     ===          === ===  === === ===     ");
System.out.println("=======  ===  ===   ===     ===   ======= ======== ======  ===  === === ===     ");

System.out.println("\nMade By: Connor Robinson");
}
/*
===================
  END TITLECARD
===================
*/

/*
===================
  	 CONTINUE
===================
*/

public static void cont()
{
	Scanner input = new Scanner(System.in);
	System.out.print("Press n to continue or q to quit ");
	String key = input.next();

	if(key.equals("n"))
		{
			System.out.println();
		}
	else if(key.equals("q"))
		{
			System.exit(1);
		}
	else
		{
			cont();
		}
}


/*
===================
   END CONTINUE
===================
*/

/*
==================
   PLAYERBOARD
==================
*/

 public static void makeBoard(String[][] board)
      {
         for(int r = 0; r < board.length; r++)
         {
            for(int c = 0; c < board[0].length; c++)
            {
               board[r][c] = "~";
            }
         }
      }

public static void newLine(){

	System.out.println("_____________________________________");
	System.out.println("");

}

public static void cordLineX(){

int[] cords = new int[8];

for(int i = 0; i<cords.length; i++)
	{
		cords[i] = i;
	}

System.out.print("    ");
for(int j = 0; j<cords.length; j++)
	{

		System.out.print(cords[j]);
		System.out.print("   ");
	}
}


public static void printBoard(String[][] board){
	newLine();
	cordLineX();

	System.out.println();

	for(int r = 0; r<board.length; r++){
		System.out.print(r);
		for(int c = 0; c<board[0].length; c++){

		System.out.print("   " + board[r][c]);

	}
	System.out.println();
}
newLine();


}

/*
==================
   ENEMYBOARD
==================
*/

 public static void makeBoard2(String[][] board)
      {
         for(int r = 0; r < board.length; r++)
         {
            for(int c = 0; c < board[0].length; c++)
            {
               board[r][c] = "~";
            }
         }
      }



public static void printBoard2(String[][] board){
	System.out.println("Enemy's board");
	newLine();
	cordLineX();
	System.out.println();


	for(int r = 0; r<board.length; r++){
		System.out.print(r);
		for(int c = 0; c<board[0].length; c++){

		System.out.print("   " + board[r][c]);

	}
	System.out.println();
}
newLine();


}


/*
==================
	END BOARD
==================
*/



/*
==================
	SHIPS
==================
*/




public static boolean wShip(String[][] board, int start, int ypos){

	int count = 0;
	boolean placed = true;

	if(start+3<=board.length){
		for(int i = start; i<start+3; i++){
			if(board[ypos][i] == "~")
				{
					count++;
				}
			}
		if(count==3)
			{
				for(int i = start; i<start+3; i++)
				{
					board[ypos][i] = "W";
				}
			}
		else
			{
				System.out.println("Theres already a ship there");
				placed = false;
			}
		}
		else
			{
				System.out.println("You can't do that");
				placed = false;
			}
		return placed;
	}

public static boolean yShip(String[][] board, int xpos, int start){

	int count = 0;
	boolean placed = true;

	if(start+4<=board.length){
		for(int i = start; i<start+4; i++){
			if(board[i][xpos] == "~")
				{
					count++;
				}
			}
		if(count==4)
			{
				for(int i = start; i<start+4; i++)
				{
					board[i][xpos] = "Y";
				}
			}
		else
			{
				System.out.println("Theres already a ship there");
				placed = false;
			}
		}
		else
			{
			System.out.println("You can't put that there");
			placed = false;
			}
		return placed;
	}


	public static boolean zShip(String[][] board, int start, int ypos){

		int count = 0;
		boolean placed = true;

		if(start+2<=board.length){
			for(int i = start; i<start+2; i++){
				if(board[ypos][i] == "~")
					{
						count++;
					}
				}
			if(count==2)
				{
					for(int i = start; i<start+2; i++)
					{
						board[ypos][i] = "Z";
					}
				}
			else
				{
					System.out.println("Theres already a ship there");
					placed = false;
				}
			}
			else
				{
				System.out.println("You can't put that there");
				placed = false;
				}
				return placed;
	}

public static boolean tShip(String[][] board, int xpos, int start){

	int count = 0;
	boolean placed = true;

	if(start+5<=board.length){
		for(int i = start; i<start+5; i++){
			if(board[i][xpos] == "~")
				{
					count++;
				}
			}
		if(count==5)
			{
				for(int i = start; i<start+5; i++)
				{
					board[i][xpos] = "T";
				}
			}
		else
			{
				System.out.println("Theres already a ship there");
				placed = false;
			}
		}
		else
			{
			System.out.println("You can't put that there");
			placed = false;
			}
		return placed;
	}

/*
=======================
	END SHIPS
=======================
*/

/*
=======================
	    ESHIPS
=======================
*/


public static boolean ewShip(String[][] board, int start, int ypos){

	int count = 0;
	boolean placed = true;

	if(start+3<=board.length){
		for(int i = start; i<start+3; i++){
			if(board[ypos][i] == "~")
				{
					count++;
				}
			}
		if(count==3)
			{
				for(int i = start; i<start+3; i++)
				{
					board[ypos][i] = "W";
				}
			}
		else
			{
				placed = false;
			}
		}
		else
			{
				placed = false;
			}
		return placed;
	}

public static boolean eyShip(String[][] board, int xpos, int start){

	int count = 0;
	boolean placed = true;

	if(start+4<=board.length){
		for(int i = start; i<start+4; i++){
			if(board[i][xpos] == "~")
				{
					count++;
				}
			}
		if(count==4)
			{
				for(int i = start; i<start+4; i++)
				{
					board[i][xpos] = "Y";
				}
			}
		else
			{
				placed = false;
			}
		}
		else
			{
			placed = false;
			}
		return placed;
	}


	public static boolean ezShip(String[][] board, int start, int ypos){

		int count = 0;
		boolean placed = true;

		if(start+2<=board.length){
			for(int i = start; i<start+2; i++){
				if(board[ypos][i] == "~")
					{
						count++;
					}
				}
			if(count==2)
				{
					for(int i = start; i<start+2; i++)
					{
						board[ypos][i] = "Z";
					}
				}
			else
				{
					placed = false;
				}
			}
			else
				{
				placed = false;
				}
				return placed;
	}

public static boolean etShip(String[][] board, int xpos, int start){

	int count = 0;
	boolean placed = true;

	if(start+5<=board.length){
		for(int i = start; i<start+5; i++){
			if(board[i][xpos] == "~")
				{
					count++;
				}
			}
		if(count==5)
			{
				for(int i = start; i<start+5; i++)
				{
					board[i][xpos] = "T";
				}
			}
		else
			{
				placed = false;
			}
		}
		else
			{
			placed = false;
			}
		return placed;
	}

/*
=======================
   	END ESHIPS
=======================
*/

/*
===================
	PLACE SHIPS
===================
*/

public static void placeWShip(String[][] board){

Scanner input = new Scanner(System.in);
int row, col;

System.out.println("Place your W ship, it is 3 "
+"spaces long horizontally");
System.out.print("row: ");

row = input.nextInt();


System.out.print("column: ");

col = input.nextInt();

while(wShip(board,col,row)==false)
	{
		System.out.print("row: ");

		row = input.nextInt();

		System.out.println();
		System.out.print("column: ");

		col = input.nextInt();
	}

printBoard(board);





}

public static void placeYShip(String[][] board){

Scanner input = new Scanner(System.in);
int row, col;

System.out.println("Place your Y ship, it is 4 "
+"spaces long vertically");
System.out.print("row: ");

row = input.nextInt();


System.out.print("column: ");

col = input.nextInt();

while(yShip(board,col,row)==false)
	{
		System.out.print("row: ");

		row = input.nextInt();

		System.out.println();
		System.out.print("column: ");

		col = input.nextInt();
	}

printBoard(board);

}


public static void placeZShip(String[][] board){

Scanner input = new Scanner(System.in);
int row, col;

System.out.println("Place your Z ship, it is 2 "
+"spaces long horizontally");
System.out.print("row: ");

row = input.nextInt();


System.out.print("column: ");

col = input.nextInt();

while(zShip(board,col,row)==false)
	{
		System.out.print("row: ");

		row = input.nextInt();

		System.out.println();
		System.out.print("column: ");

		col = input.nextInt();
	}

printBoard(board);

}

public static void placeTShip(String[][] board){

Scanner input = new Scanner(System.in);
int row, col;

System.out.println("Place your T ship, it is 5 "
+"spaces long vertically");
System.out.print("row: ");

row = input.nextInt();


System.out.print("column: ");

col = input.nextInt();

while(tShip(board,col,row)==false)
	{
		System.out.print("row: ");

		row = input.nextInt();

		System.out.println();
		System.out.print("column: ");

		col = input.nextInt();
	}

printBoard(board);

}



public static void placeShips(String[][] board)
{
	System.out.println("Start by placing your ships"+
	"\nMake sure you don't put them in spots that are easy to guess\n\n(Only accepts integer values)\n\n");
	placeWShip(board);
	placeYShip(board);
	placeZShip(board);
	placeTShip(board);

}


/*
===================
  END PLACE SHIPS
===================
*/

/*
===================
	PLACE ESHIPS
===================
*/

public static void placeEWShip(String[][] board){

int row, col;


row = (int)(Math.random()*8);


col = (int)(Math.random()*8);

while(ewShip(board,col,row)==false)
	{


		row = (int)(Math.random()*8);

		col = (int)(Math.random()*8);
	}







}

public static void placeEYShip(String[][] board){


int row, col;



row = (int)(Math.random()*8);


col = (int)(Math.random()*8);

while(eyShip(board,col,row)==false)
	{


		row = (int)(Math.random()*8);


		col = (int)(Math.random()*8);
	}



}


public static void placeEZShip(String[][] board){


int row, col;


row = (int)(Math.random()*8);


col = (int)(Math.random()*8);

while(ezShip(board,col,row)==false)
	{

		row =(int)(Math.random()*8);

		col = (int)(Math.random()*8);
	}


}

public static void placeETShip(String[][] board){

int row, col;



row = (int)(Math.random()*8);


col = (int)(Math.random()*8);

while(etShip(board,col,row)==false)
	{

		row = (int)(Math.random()*8);

		col = (int)(Math.random()*8);
	}



}


public static void placeEShips(String[][] board)
{

	placeEWShip(board);
	placeEYShip(board);
	placeEZShip(board);
	placeETShip(board);

}
/*
===================
  END PLACE ESHIPS
===================
*/


/*
===================
  	   FIRE
===================
*/

public static void fireAt(String[][] board)
{
	Scanner input = new Scanner(System.in);
	System.out.println("Where will you fire?");
	System.out.print("\nrow: ");
	int col = input.nextInt();
	System.out.print("col: ");
	int row = input.nextInt();
	String hit = "You Hit Their ";
	String miss = "You missed";

	if(board[col][row].equals("~") || board[col][row].equals("X"))
	{
		board[col][row] = "X";
		System.out.println(miss);

	}

	if(board[col][row].equals("W"))
	{
		board[col][row] = "X";
		System.out.println(hit+"W Ship!");
		if(checkSink(board, "W") == true)
		{
			System.out.println("You Sunk Their W Ship!");
		}
	}
	if(board[col][row].equals("Y"))
		{
			board[col][row] = "X";
			System.out.println(hit+"Y Ship!");
			if(checkSink(board, "Y") == true)
			{
				System.out.println("You Sunk Their Y Ship!");
			}
	}
	if(board[col][row].equals("Z"))
		{
			board[col][row] = "X";
			System.out.println(hit+"Z Ship!");
			if(checkSink(board, "Z") == true)
			{
				System.out.println("You Sunk Their Z Ship!");
			}
	}
	if(board[col][row].equals("T"))
		{
			board[col][row] = "X";
			System.out.println(hit+"T Ship!");
			if(checkSink(board, "T") == true)
			{
				System.out.println("You Sunk Their T Ship!");
			}
	}
}

public static boolean checkSink(String [][] board, String ship)
{
	int count = 0;

	for(int r = 0; r<board.length; r++)
	{
		for(int c = 0; c<board[0].length;c++)
		{
			if(board[r][c] != ship)
			{
				count++;
			}
		}
	}
	if(count == 64)
	{
		return true;
	}
	else
	{
		return false;
	}
}

/*
===================
  	 END FIRE
===================
*/

/*
===================
   FIRE AGAINST
===================
*/

public static void fireAgainst(String[][] board)
{
		int col = (int)(Math.random()*8);
		int row = (int)(Math.random()*8);
		String hit = "They hit your ";
		String miss = "They missed";

		if(board[col][row].equals("~") || board[col][row].equals("X"))
		{
			board[col][row] = "X";
			System.out.println(miss);

		}

		if(board[col][row].equals("W"))
		{
			board[col][row] = "X";
			System.out.println(hit+"W Ship!");
		}
		if(board[col][row].equals("Y"))
			{
				board[col][row] = "X";
				System.out.println(hit+"Y Ship!");
		}
		if(board[col][row].equals("Z"))
			{
				board[col][row] = "X";
				System.out.println(hit+"Z Ship!");
		}
		if(board[col][row].equals("T"))
			{
				board[col][row] = "X";
				System.out.println(hit+"T Ship!");
	}
	printBoard(board);
}



/*
===================
  END FIRE AGAINST
===================
*/


/*
===================
  	   WIN
===================
*/

public static boolean win(String[][] board)
{
	int count = 0;
	boolean win = false;

	for(int r = 0; r<board.length; r++)
	{
		for(int c = 0; c<board[0].length; c++)
		{
			if(board[r][c] == "~" || board[r][c] == "X")
			{
				count++;
			}
		}
	}
	if(count==64)
		{
			System.out.println(" ::: === :::====  :::  ===      :::  ===  === ::: :::= ===");
			System.out.println(" ::: === :::  === :::  ===      :::  ===  === ::: :::=====");
			System.out.println("  =====  ===  === ===  ===      ===  ===  === === ========");
			System.out.println("   ===   ===  === ===  ===       ===========  === === ====");
			System.out.println("   ===    ======   ======         ==== ====   === ===  ===");
			win = true;
		}
	return win;
}


/*
===================
  	 END  WIN
===================
*/

/*
===================
  	   LOSE
===================
*/
public static boolean lose(String[][] board)
{
	int count = 0;
	boolean lose = false;

		for(int r = 0; r<board.length; r++)
		{
			for(int c = 0; c<board[0].length; c++)
			{
				if(board[r][c] == "~" || board[r][c] == "X")
				{
					count++;
				}
			}
		}
		if(count==64)
			{
				System.out.println(" ::: === :::====  :::  ===      :::      :::====  :::===  :::=====");
				System.out.println(" ::: === :::  === :::  ===      :::      :::  === :::     :::     ");
				System.out.println("  =====  ===  === ===  ===      ===      ===  ===  =====  ======  ");
				System.out.println("   ===   ===  === ===  ===      ===      ===  ===     === ===     ");
				System.out.println("   ===    ======   ======       ========  ======  ======  ========");
				lose = true;
			}
	return lose;
}



/*
===================
  	   LOSE
===================
*/

/*
===================
  	  CONTINUE
===================
*/

public static void playAnother(String[][] pboard, String[][] eboard)
{
	Scanner input = new Scanner(System.in);
	System.out.println("\nWould you like to play again? (Y/N)");
	String ans = input.next();
		if(ans.equals("Y"))
		{
			playGame(pboard,eboard);
		}
		else
		{
			System.exit(1);
		}

}


/*
===================
  	  CONTINUE
===================
*/

public static void destroyAllShips(String[][] board)
{
	for(int r = 0; r<board.length; r++)
	{
		for(int c = 0; c<board[0].length; c++)
		{
			if(board[r][c] != "~")
			{
				board[r][c] = "X";
			}
		}
	}

}


/*
===================
  	   PLAY
===================
*/

public static void playGame(String[][] pboard, String[][] eboard)
{

	cont();
	makeBoard(pboard);
	makeBoard2(eboard);
	placeEShips(eboard);
	printBoard(pboard);
	placeShips(pboard);
	cont();
	while(win(eboard)==false)
	{
	fireAt(eboard);
	cont();
	fireAgainst(pboard);
	cont();
	if(lose(pboard) == true)
		{
		playAnother(pboard,eboard);
		}
	}
 playAnother(pboard,eboard);
}

public static void testGame(String[][] pboard, String[][] eboard)
{
	cont();
	makeBoard(pboard);
	placeShips(pboard);
	printBoard(pboard);
	cont();
	destroyAllShips(pboard);
	printBoard(pboard);
	cont();
	if(lose(pboard)==true)
		{
			playAnother(pboard,eboard);
			System.out.println("WORKED");
		}
}

public static void playGame2(String[][] pboard, String[][] eboard)
{
	cont();
	makeBoard(pboard);
	makeBoard2(eboard);
	printBoard(pboard);
	System.out.println("Player One Place Your Ships");
	placeShips(pboard);
	cont();
	System.out.println("\n\n\n\n\n\n\n\n\n");
	printBoard(eboard);
	System.out.println("Player Two Place Your Ships");
	placeShips(eboard);
	cont();
	while(win(eboard)==false && win(pboard)==false)
	{
		System.out.println("Player 1:");
		fireAt(eboard);
		cont();
		System.out.println("Player 2:");
		fireAt(pboard);
		cont();
		if(win(eboard)==true)
		{
			System.out.println("Player 1!");
			playAnother(pboard,eboard);
		}

		if(win(pboard)==true)
		{
			System.out.println("Player 2!");
			playAnother(pboard,eboard);
		}
	}
}

public static void chooseGame(String[][] pboard, String[][] eboard)
{
Scanner input = new Scanner(System.in);
System.out.println("Which game would you like to play");
System.out.println("\n\n Option 1: Play against the computer");
System.out.println("\n Option 2: Play against another human");

int ans = input.nextInt();

if(ans == 1)
{
	playGame(pboard,eboard);
}
if(ans == 2)
{
	playGame2(pboard,eboard);
}


}

/*
===================
    END PLAY
===================
*/

}
