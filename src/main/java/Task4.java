import java.lang.Math;
import java.util.Map;
import java.util.HashMap;// headers MUST be above the first class

public class Task4 {
    public static void main(String[] args) {
        removeAllDuplicates(new String("babbs"));

    }

    public static String removeDuplicateOneIteration(String input)
    {
        StringBuilder result= new StringBuilder();
        for( int i=0; i<input.length(); i++ ) {
            if(((i+1)<input.length())&&(input.charAt(i) == input.charAt(i+1))) {
                i++;
            }
            else{
                result.append(String.valueOf(input.charAt(i)));
            }
        }
        return result.toString();

    }
    public static String removeAllDuplicates(String input) {

        while (input.length()>removeDuplicateOneIteration(input).length())
        {
            input=new String(removeDuplicateOneIteration(input));
        }
        System.out.println(input);
        return input;
    }
}


