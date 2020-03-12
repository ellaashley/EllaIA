import java.util.*;
public class Board {
    int[][] board = new int[6][7];

    public Board(){
    }

    public void printBoard(){
        for(int row=5; row>-1; row--){
            for(int col = 0; col<7; col++){
                System.out.print(board[row][col] + " ");
            }
        System.out.print("\n");
        }
    }

    public void move(int token, int column){
        int row = 0;
        Scanner sc = new Scanner(System.in);
        while(true){
            if(row>5){
                System.out.println("This column is full! Enter a new one:");
                column = sc.nextInt();
                row = 0;
            }else{
                if (board[row][column] == 0) {
                    board[row][column] = token;
                    break;
                } else {
                    row++;
                }
            }
        }
        this.printBoard();
    }

    public boolean checkWin(int row, int column){
        int x=0;
        for(int i=0; i<6; i++){
            if(board[i])
        }
    }
}
