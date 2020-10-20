public class axians{
	public static void main(String args[]){
		Kattio io = new Kattio(System.in);

		String input = io.getWord();

		String fixed = duplicate(input);
		System.out.println(fixed);

	}
	public static String duplicate(String x){
		if(x.length()==1){
			return x;
		}
		if(x.charAt(0)==x.charAt(1)){
			return duplicate(x.substring(1));
		}
		else{
			return x.substring(0,1) + duplicate(x.substring(1));
		}
	}

}