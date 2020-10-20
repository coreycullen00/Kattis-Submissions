import java.util.*;
public class simplicity{
    public static void main(String args[])throws Exception{
        Kattio io = new Kattio(System.in);
        String input = io.getWord();
        String unique = UniqueString(input);

        String[] uniqueValue = unique.split("");

        int [] values = count(input,unique);

        for(int i = 0; i < values.length;i++){
            uniqueValue[i] = uniqueValue[i] + " " +Integer.toString(values[i]);
        } 

        Arrays.sort(uniqueValue,(a,b) -> Integer.parseInt(a.substring(2))-Integer.parseInt(b.substring(2)));

        int count = 0;

        for(int i = 0; i < uniqueValue.length-2;i++){
            count += Integer.parseInt(uniqueValue[i].substring(2));
            //System.out.println(uniqueValue[i]);
        }
        System.out.println(count);
        
    }
    
    public static String UniqueString(String input){


        if(input.length()==1)
        {
            return input;
        }
        else
        {
            char first = input.charAt(0);

            if (UniqueChar(input.substring(1),first) == true)
            {
                return first + UniqueString(input.substring(1));
            }
            else
            {
                return UniqueString(input.substring(1));
            }
        }
    }

    public static boolean UniqueChar(String input, char first){


        if(input.charAt(0) == first)
        {
            return false;
        }
        else if(input.length() ==1)
        {
            return true;
        }
        else
        {
            return UniqueChar(input.substring(1),first);
        }
        
    }
    public static int[] count(String input, String unique){
        int[] values = new int[unique.length()];

        for(int i = 0; i < unique.length();i++){
            for(int j = 0; j < input.length();j++){
                if(unique.charAt(i)==input.charAt(j)){
                    values[i]++;
                }

            }
        }
        return values;

    }
}