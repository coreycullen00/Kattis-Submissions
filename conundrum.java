import java.util.*;
public class conundrum{
	public static void main(String args[]){
		Kattio io = new Kattio(System.in);
		String text = io.getWord();
		int count = 0;

		for(int i = 0; i < text.length();i++){
			if((i+1)%3==1){
				if(text.charAt(i)!='P'){
					count++;
				}
			}
			else if((i+1)%3 ==2){
				if(text.charAt(i)!='E'){
					count++;
				}
			}
			else if ((i+1)%3 ==0){
				if(text.charAt(i)!='R'){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}