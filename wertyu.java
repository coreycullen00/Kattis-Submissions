import java.util.*;
public class wertyu{
	public static void main(String[] args){


		String keyboard = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";

		Scanner sc = new Scanner(System.in);

		String phrase,fixed;
		while(sc.hasNextLine()){
			phrase = sc.nextLine();
			fixed = "";

			for(int i = 0; i < phrase.length();i++){
				if(phrase.charAt(i) !=' '){
					char letter = phrase.charAt(i);
					int position = keyboard.indexOf(letter);

					fixed = fixed + keyboard.charAt(position-1);
				}
				else{
					fixed = fixed + " ";
				}
			}
			System.out.println(fixed);
		}

	}
}