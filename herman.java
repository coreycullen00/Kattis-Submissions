import java.util.*;
import java.lang.Math;
public class herman{
	public static void main(String args[]){
		Kattio io = new Kattio(System.in);
		double rad = io.getDouble();

		//euchlidian
		double euchlid = Math.PI * Math.pow(rad,2);
		System.out.println(euchlid);

		//taxicab - area of 4 triangles
		double cab = ((rad/2)*rad)*4;
		System.out.println(cab);
	}
}