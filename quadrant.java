public class quadrant{
	public static void main(String args[]){
		Kattio io = new Kattio(System.in);
		int x = io.getInt();
		int y = io.getInt();

		System.out.println((x>0)?((y>0)?"1":"4"):(y>0)?"2":"3");
	}
}