import java.lang.Math;
import java.text.DecimalFormat;
public class aboveAverage{
	public static void main(String[] args){
		Kattio io = new Kattio(System.in);
		int cases = io.getInt();
		double []allTotal = new double[cases];

		while(cases-- >0){
			double noOfStudents = io.getDouble();
			int[] students = new int[(int)noOfStudents];
			double totalScore = 0;
			for(int i = 0;i < (int)noOfStudents;i++){
				students[i] = io.getInt();
				totalScore+=students[i];
			}

			 double average = totalScore / noOfStudents;

			 double above = 0;

			 for(int i = 0; i < (int)noOfStudents;i++){
			 	if(students[i] > average){
			 		above+=1.0;
			 	}
			 }

			 double total = (above/noOfStudents)*100.0;

			 DecimalFormat df = new DecimalFormat("#,###,##0.000");
			 //df.setRoundingMode(RoundingMode.CEILING);
			 String formated = df.format(total)+"%";
			 
			 
			 //String string = Double.toString(df.format(total)) + "%";

			 System.out.println(formated);

		}
	}
}