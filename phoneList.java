import java.util.*;
public class phoneList{
	public static void main(String[] args){
		Kattio io = new Kattio(System.in);

		int cases = io.getInt();
		int amount =0;
		boolean consistant = true;
		String prefix,number;


		for(int k = 0; k < cases; k++){
			consistant = true;
			amount = io.getInt();
			String[] numbers = new String[amount];
			for(int i = 0; i < numbers.length;i++){
				numbers[i] = io.getWord();
			}

			Arrays.sort(numbers);

			for (int i = 1; i < numbers.length; i++){
		    	if (numbers[i].startsWith(numbers[i-1])){
		    		consistant = false;
		    		break;
				}
			}
			


			System.out.println(consistant ? "YES" : "NO");
		}
		io.close();
	}
}