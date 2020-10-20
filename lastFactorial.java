import java.util.*;
public class lastFactorial{
	public static void main(String args[]){
		Kattio io = new Kattio(System.in);

		int cases = io.getInt();
		while(cases-- >0){
			int number = io.getInt();

			int fact = Factorial(number);
			String factString = Integer.toString(fact);
			char last = factString.charAt(factString.length()-1);
			System.out.println(last);
		}
	}
	public static int Factorial(int x){
		if(x==1){
			return 1;
		}
		else{
			return x*Factorial(x-1);
		}
	}
}