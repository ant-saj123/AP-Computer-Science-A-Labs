import java.util.Arrays;

public class TokenPass {
    private int[] board;
    private int currentPlayer;

    public TokenPass(int playerCount){
        board = new int[playerCount];
        for(int i = 0; i<playerCount;i++)
        {
            board[i] = (int)(Math.random()*10)+1;
        }
        currentPlayer = (int)(Math.random()*playerCount);

    }

    public void distributeCurrentPlayerTokens(){

        int num = board[currentPlayer];

            for(int i = currentPlayer+1; i<board.length; i++)
            {
                if(num>0)
                {
                    board[i]++;
                    num--;
                }

            }

            while(num>0)
            {
                for(int i = 0; i < board.length; i++)
                {
                    board[i]++;
                    num--;
                }
            }



    }

    public void printBoard(){
        System.out.println(Arrays.toString(board));
        System.out.println("Current player: " + currentPlayer);
    }
}

class TokenPassTester {
    public static void main(String[] args) {
        TokenPass game = new TokenPass(4);
        System.out.println("Starting board: ");
        game.printBoard();
        game.distributeCurrentPlayerTokens();
        System.out.println("\nAfter turn 1: ");
        game.printBoard();

    }
}
