/*
 * Activity 3.3.1
 */
public class InitList2D
{
  public static void main(String[] args)
  {
    String[][] board = { {"close", "quarter"},
                        {"moon", "rock"},
                        {"band", "stand"},
                        {"out", "shine"}  }; 

    System.out.println(board[0]);

    if (board[0][0] !=null)
    {
      board[0][0] = "fourth";
    }
    /* 
    for (int r = 0; r < board.length; r++)
    {
      for (int c = 0; c < board[0].length; c++)
      {
        System.out.println(board[r][c]);
      }
    }*/

    for (int c = 0; c < board[0].length; c++)
    {
      for (int r = 0; r < board.length; r++)
      {
        System.out.println(board[r][c]);
      }
    }
  }
}
