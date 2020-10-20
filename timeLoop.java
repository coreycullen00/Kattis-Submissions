//
//
//import ;
import java.util.Scanner;
public class timeLoop{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		for(int i = 0; i < loop;i++){
			System.out.println((i+1) + " Abracadabra");
		}
	}
}