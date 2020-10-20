import java.util.*;
public class PermutedArithmeticSequence{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int cases = Integer.parseInt(sc.nextLine());

		while (cases-- > 0){

			
			int length = sc.nextInt();
			int[] seq = new int[length];
			

			for (int x = 0; x < length; x++){
                seq[x] = sc.nextInt();
			}

			

			if(Arithmetic(seq)){
				System.out.println("arithmetic");

			}
			else{
				Arrays.sort(seq);
				if(Arithmetic(seq)){
					System.out.println("permuted arithmetic");
				}
				else{
					System.out.println("non-arithmetic");
				}

			}

			

		}
		sc.close();
	}
	public static boolean Arithmetic(int[] x){
		boolean arithmetic = true;
		int diff = x[1]-x[0];
		for(int i = 1; i < x.length-1;i++){
			if(x[i+1]-x[i] != diff){
				arithmetic = false;
			}
		}
		return arithmetic;

	}
}