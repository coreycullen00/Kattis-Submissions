public class sanic{
	public static void main(String args[]){
		Kattio io = new Kattio(System.in);

		double  radius = io.getDouble();

		System.out.println(radius-1);
	}
}