import java.util.*;
import java.lang.Math;
public class pot{
	public static void main(String args[]){
		Kattio io = new Kattio(System.in);
		int num = io.getInt(),power =0;;
		long sum=0,base=0,add=0;
		String temp = "";
		char pow;

		for(int i = 0; i < num;i++){
			temp = io.getWord();
			pow =temp.charAt(temp.length()-1);
			power=Integer.parseInt(String.valueOf(pow));
			base = Integer.parseInt(temp.substring(0,temp.length()-1));
			add = (long)Math.pow(base,power);
			sum = sum + add;
		}
		System.out.println(sum);
	}
}