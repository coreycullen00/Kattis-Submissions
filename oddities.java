import java.lang.Math;
public class oddities{
	public static void main(String args[]){
		Kattio io = new Kattio(System.in);
		int cases = io.getInt();
		while(cases-- >0){
			int number = io.getInt();

			System.out.println(number + ((Math.abs(number)%2==0)? " is even": " is odd"));
		}
	}
}