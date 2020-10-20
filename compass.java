import java.lang.Math;
public class compass{
	public static void main(String args[]){
		Kattio io = new Kattio(System.in);
		int point1 = io.getInt();
		int point2 = io.getInt();

		int ans =0;

		if(point1 > point2){
			ans = 360 - Math.abs(point1-point2);
			if(ans >180){
				ans = 360-ans;
				ans = ans*(-1);
			}
		}


		else{
			ans = Math.abs(point1-point2);
			if(ans>180){
				ans = 360 - ans;
				ans = ans*(-1);
				
			}
		}

		if(ans == -180){
			ans = 180;
		}

		System.out.println(ans);


	}
}