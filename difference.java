import java.lang.Math;
public class difference{
	public static void main(String args[]){

		Kattio io = new Kattio(System.in);
		long x = 0;
		long y = 0;
		do{
			x = io.getLong();
			y = io.getLong();

			System.out.println(Math.abs(x-y));
		}while(io.hasMoreTokens());
	}
}