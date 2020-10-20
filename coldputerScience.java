public class coldputerScience{
	public static void main(String args[]){
		Kattio io = new Kattio(System.in);

		int cases = io.getInt();
		int count = 0;
		while(cases-- >0){
			int temperature = io.getInt();
			if(temperature < 0){
				count++;
			}
		}
		System.out.println(count);
	}
}