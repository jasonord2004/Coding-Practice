import java.util.*;
import java.io.*;

public class test{
    public static void main(String[] args){

        String colors = "wwbwwbw";
        String game = colors;

        System.out.println(game);
        game.copy



    }

    import com.google.gson.Gson;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class BoardGame {
// FREEZE CODE BEGINS
  public static void main(String[] args) {
    
    Gson gson = new Gson();
    HashMap<String, ArrayList<ArrayList<Double>>> map = gson.fromJson(new Scanner(System.in).nextLine(), HashMap.class);
    char[][] board = createGameState(map);
    for(int i=0; i < board.length; i++) {
      for(int j=0; j < board[0].length; j++) {
        System.out.print(board[i][j]);
      }
      System.out.println();
    }

  }
// FREEZE CODE ENDS

  public static char[][] createGameState(HashMap<String, ArrayList<ArrayList<Double>>> pieces) {
// WRITE YOUR CODE HERE
  }
  ArrayList<ArrayList<Double>> black = pieces.get("Black");
  char arr[][] = new char[10][10];
  for(int i = 0; i < 10; i++){
    for(int j = 0; j < 10; j++){
      arr[i][j] = '_';
    }
  }

}
}
