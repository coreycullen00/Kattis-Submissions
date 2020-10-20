public class r2{
	public static void main(String args[]){
		Kattio io = new Kattio(System.in);

		int value1 = io.getInt();
		int equals = io.getInt();
		int value2 = (2*equals)-value1;
		System.out.println(value2);
	}
}