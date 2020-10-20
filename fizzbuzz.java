import java.util.*;
import java.lang.Math;
public class fizzbuzz{
	public static void main(String args[]){
		Kattio io = new Kattio(System.in);
		int x = io.getInt(),y = io.getInt(), n = io.getInt();
		for(int i = 1; i <= n; i++){
			if(i%x ==0 && i%y ==0){
				System.out.println("FizzBuzz");
			}
			else if(i%x ==0){
				System.out.println("Fizz");

			}
			else if(i%y ==0){
				System.out.println("Buzz");
			}
			else{
				System.out.println(i);
			}
		}



		
	}
}