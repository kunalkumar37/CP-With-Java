import java.util.*;
public class Sudoku_Solver {
    public static void main(String[] args) {
         char[][] board= {
                    {'9', '5', '7', '.', '1', '3', '.', '8', '4'},
                    {'4', '8', '3', '.', '5', '7', '1', '.', '6'},
                    {'.', '1', '2', '.', '4', '9', '5', '3', '7'},
                    {'1', '7', '.', '3', '.', '4', '9', '.', '2'},
                    {'5', '.', '4', '9', '7', '.', '3', '6', '.'},
                    {'3', '.', '9', '5', '.', '8', '7', '.', '1'},
                    {'8', '4', '5', '7', '9', '.', '6', '1', '3'},
                    {'.', '9', '1', '.', '3', '6', '.', '7', '5'},
                    {'7', '.', '6', '1', '8', '5', '4', '.', '9'}
                    };
    solveSudoku(board);

    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++)
        System.out.print(board[i][j] + " ");
      System.out.println();
    }
    }

    public static boolean solveSudoku(char arr[][]){

        int row=arr.length;
        int col=arr[0].length;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               if(arr[i][j]=='.'){

               for(char c='1';c<='9';c++){
                    if(isvalid(arr,i,j,c )){
                        arr[i][j]=c;

                    }
                    if(solveSudoku(arr)){
                        return true;
                    }
                    else{
                        arr[i][j]='.';
                    }
                }


               }
               return true;
            }
        }


       return false;
    }

    public static boolean isvalid(int arr[][], int row, int col, char c){
        for(int i=0;i<9;i++){
            if(arr[row][i]==c){
                return false;
            }
            if(arr[i][col]==c){
                return false;
            }
            if(arr[3*(row/3)+i/3][3*(col/3)+i%3]==c){
                return false;
            }
        }
        return true;
    }
}
