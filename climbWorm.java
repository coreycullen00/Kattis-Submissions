import java.util.*;

public class climbWorm{
	public static void main(String args[]){
		Kattio io = new Kattio(System.in);

		int up = io.getInt(), down = io.getInt(), place = io.getInt(),point=0;
		int score = 0;
		boolean reach = false;

		while(reach == false){
			point +=up;
			score++;
			if(point >= place){
				reach = true;			}
			else{
				point -= down;

			}
		}
		System.out.println(score);

	}
}