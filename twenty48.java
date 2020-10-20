//
//
//import ;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class twenty48{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		String[][] input = new String[4][4];

		input[0] = sc.nextLine().split(" ");
		input[1] = sc.nextLine().split(" ");
		input[2] = sc.nextLine().split(" ");
		input[3] = sc.nextLine().split(" ");

		int[][] intboard = new int [4][4];

		for(int i = 0; i < 4;i++){			
			for(int j = 0; j < 4;j++){
				intboard[i][j] = Integer.parseInt(input[i][j]);
			}
		}

		int rotations = sc.nextInt();
		//rotates anticlockwise
		int[][] board = Rotate(intboard,rotations);

		int[][] newBoard = Play(board);
		//reset rotation
		int[][] finalBoard = Rotate(newBoard,4-rotations);


		Print(finalBoard);
	}

	public static int[][] Play(int[][] board){

		int[][] nextBoard =  new int[4][4];

		for(int i = 0; i < 4;i++){
			nextBoard[i] = Sort(board[i]);
		}

		int[] tempArray = new int[4];
		int[][] newBoard = new int[4][4];

		for(int i = 0; i < 4; i++){

			for(int j = 0; j < 4; j++){
				tempArray[j] = nextBoard[i][j];
			}

			

			for(int j = 0; j < tempArray.length-1; j++){
				if((tempArray[j]==tempArray[j+1])&& tempArray[j]>0){

					newBoard[i][j] = (2 * tempArray[j]);
					newBoard[i][j+1] = 0;
					tempArray[j+1] = 0;
					tempArray = Sort(tempArray);
					newBoard[i] = Sort(newBoard[i]);


				}
				else{
					newBoard[i][j] = tempArray[j];

				}
			}
			newBoard[i][3] = tempArray[3];
		

		}


		int[][] lastBoard = new int[4][4];

		for(int i = 0; i < 4;i++){
			lastBoard[i] = Sort(newBoard[i]);
		}

		return lastBoard;
	}


	public static int[][] Rotate(int[][]mat, int rotations){
		for(int i = 0; i < rotations; i++){
			// Consider all squares one by one 
		    for (int x = 0; x < 2; x++) { 
		        // Consider elements in group 
		        // of 4 in current square 
		        for (int y = x; y < 4 - x - 1; y++) { 
		            // Store current cell in 
		            // temp variable 
		            int temp = mat[x][y]; 

		            // Move values from right to top 
		            mat[x][y] = mat[y][4 - 1 - x]; 

		            // Move values from bottom to right 
		            mat[y][4 - 1 - x] 
		                = mat[4 - 1 - x][4 - 1 - y]; 

		            // Move values from left to bottom 
		            mat[4 - 1 - x][4 - 1 - y] = mat[4 - 1 - y][x]; 

		            // Assign temp to left 
		            mat[4 - 1 - y][x] = temp; 
		        } 
		    } 
		}
		return mat;
	}


	public static int[] Sort(int[]board){
		List <Integer> sort = new ArrayList<Integer>();
		int temp = 0;
		
			for(int j = 0; j < 4; j++){
				sort.add(board[j]);
			}
			sort.removeIf((k) -> k == 0);

			int[] tempArray = new int[4];

			for(int k = 0; k < sort.size();k++){
				tempArray[k] = sort.get(k);
			}

		return tempArray;


	}

	public static void Print(int[][] array){
		for (int[] x : array){
		   for (int y : x){
		        System.out.print(y + " ");
		   }
		   System.out.println();
		}
	}
}