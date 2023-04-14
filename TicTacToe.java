public class TicTacToe
{

// Creation of the members, using private instead of public 
// so it stays within the class

int [][] Board = new int [3][3];

private int turn = 1; 
private int numberofturns =1; 

// Creation of the parameter
// Initalizing the board using a nested for loop

   public TicTacToe()
   {
      turn = 1;
      numberofturns = 1;
      
      String toReturn = ""; 
      for (int i=0; i<Board.length;i++)
      {
         for (int j=0; j<Board.length; j++)
         {
           toReturn += " " + Board[i][j] + " ";

         }
      } 
             
   } 
    
// Creating the parameter

      public TicTacToe(int Startturn, int Startnumberofturns)
      { 
      turn = Startturn;
      numberofturns = Startnumberofturns;
      }  
 
// Creation of the methods

// hasFourMovesHaveBeenplayed()
// returns whether 4 moves have been played
// using it as a boolean

   public boolean hasFourMovesHaveBeenplayed() 
   {
      String toReturn = ""; 
            if (numberofturns>=5)
            { 
            return true;    
            }
            else
            {
            return false;
            }
    }
      

//play()
// makes a move at a spot, takes x and y of the move and places the move on the board
// returns a boolean is not valid/valid 
   
   public boolean play(int x, int y)
   {
   
   if ((x>=0&&y<=2&&x<=2&&y>=0 ) && Board[x][y]==0 && (numberofturns ==1 || numberofturns==3) )
   {
      turn++;
      numberofturns++; 
      Board[x][y] = 1;
      return true;

    
   }
   if ((x>=0&&y<=2&&x<=2&&y>=0 ) && Board[x][y]==0  && (numberofturns == 2 || numberofturns == 4) )
   {
      Board[x][y] = 2;
      numberofturns++; 
      turn++;  
      return true; 
   }
   else 
   {
      return false; 
   }
   
 }
// getCurrentPlayer()
// returns whose turn it is 0 
    boolean hi;
    public int getCurrentPlayer()
    {
      int Startturn = turn; 
      if (numberofturns == 1 || numberofturns ==3)
      {   
         turn = 1;
         return turn; 
      }
      if (numberofturns ==2 || numberofturns ==4)
      {
         turn = 2;
        return turn;
      }
      else
      {
      hi = false;
      }
        return turn;

    }
      
//getBoard() represents game board 

   public String getBoard()
   {
      String toReturn ="";
      int count =0;
 
      for (int j=0; j < 3; j++)
      {
         for ( int i=0; i <3; i++)
         {
         toReturn += Board[i][j] ;     
         }
      toReturn += "\n";     
      }
      return toReturn;
    }  
 
}
   

