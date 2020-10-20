import java.util.*;
public class plantingTrees{
	public static void main(String args[]){
		Kattio io = new Kattio(System.in);

		int trees = io.getInt();

		
		Integer[] time = new Integer[trees];

		for(int i = 0; i < trees;i++){
			time[i] = io.getInt();
		}
		

		Arrays.sort(time);
		reverse(time);
		int days=0;
		int longDay=0;

		for(int i = 0;i < trees;i++){
			days = time[i]+i;
			if(days > longDay){
				longDay = days;
			}
		}
		System.out.println(longDay+2);
		
	}
	public static void reverse(Integer[] a){
		Collections.reverse(Arrays.asList(a));
	}
}