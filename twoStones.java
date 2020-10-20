
public class twoStones{
	public static void main(String args[])throws Exception{
		Kattio io = new Kattio(System.in);
		
		int num = io.getInt();
		if(num%2==0){
			System.out.println("Bob");
		}
		else{
			System.out.println("Alice");
		}
	}
}