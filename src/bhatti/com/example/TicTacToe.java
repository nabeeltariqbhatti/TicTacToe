/**
 * 
 */
package bhatti.com.example;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Nabeel Bhatti
 *
 */
public class TicTacToe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board= {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
		
		printBoard(board);
		takeInput(board);
		
		
		
		
System.out.print("Game Over");
	}

	private static void takeInput(char[][] board) {
		HashMap<Character,String> _checker = new HashMap<>();
		int count=0;
		Scanner scan=new Scanner(System.in);
		boolean user=true;
		while(true) {
			
				
			
		System.out.print("Enter the box number:");
		int userInputBox=scan.nextInt();
	    System.out.print("Selected Box is:"+ userInputBox);
	    
		System.out.print("Enter Your Symbol:");
		char userSymbol=scan.next().charAt(0);
		
		if(userInputBox==1) {
			board[0][0]=userSymbol;
		}else if(userInputBox==2) {
            board[0][1]=userSymbol;
			
			
		}else if(userInputBox==3) {
			 board[0][2]=userSymbol;
		}else if(userInputBox==4) {
			 board[1][0]=userSymbol;
		}else if(userInputBox==5) {
			 board[1][1]=userSymbol;
		}else if(userInputBox==6) {
			 board[1][2]=userSymbol;
		}else if(userInputBox==7) {
			board[2][0]=userSymbol;
		}else if(userInputBox==8) {
			board[2][1]=userSymbol;
		}else {
			board[2][2]=userSymbol;
		}
		printBoard(board);
		count++;
		if(count==8) {
			break;
		}
	
		  
	}
		
		
		
		}
		
		

	private static void printBoard(char[][] board) {
		System.out.println(board[0][0]+ "|" + board[0][1]+ "|"+ board[0][2] );
		System.out.println("------");
		System.out.println(board[1][0]+ "|" + board[1][1]+ "|"+ board[1][2] );
		System.out.println("------");
		System.out.println(board[2][0]+ "|" + board[2][1]+ "|"+ board[2][2] );
	}

}
