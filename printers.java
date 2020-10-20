import java.util.*;
public class printers{
	public static void main(String args[]){
		Kattio io = new Kattio(System.in);

		int statues = io.getInt();
		int printers = 1;
		boolean cont = true;
		int count = 0;
		int days = 0;


		while(printers*2 <statues){
			printers = printers*2;
			days++;

		}
		count = statues /printers;
		if(statues%printers!=0){
			days++;
		}
		System.out.println(count+days);

	}
}