import java.math.BigInteger;
public class anotherCandies{
	public static void main(String args[]){
		Kattio io = new Kattio(System.in);

		int cases = Integer.parseInt(io.getWord());
		while(cases-- > 0){
			int students = Integer.parseInt(io.getWord());
			BigInteger candy = BigInteger.ZERO;

			for(int i = 0; i < students;i++){
				BigInteger sweet = new BigInteger(io.getWord());
				//System.out.println(sweet.toString());

				candy = candy.add(sweet);
			}

			BigInteger modulus = candy.mod(BigInteger.valueOf(students));
			//System.out.println(candy.toString());
			//System.out.println(modulus.toString());

			System.out.println((modulus.toString()).equals("0")?"YES":"No");
		}

	}
}