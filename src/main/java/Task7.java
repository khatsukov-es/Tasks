import java.util.Map;
import java.util.HashMap;

/**
 * Created by ELDAR on 19.09.18.
 */
public class Task7 {
    public static void main(String[] args) {
        countLetters("aahhhjjkkaall");


    }
    public static String countLetters(String text){
        String s = text;
        Map<String, Integer> hashMap = new HashMap<String, Integer>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(String.valueOf(s.charAt(i)))) {
                int count = hashMap.get(String.valueOf(s.charAt(i))) + 1;
                hashMap.put((String.valueOf(s.charAt(i))), count);

            } else {
                hashMap.put(String.valueOf(s.charAt(i)), 1);
            }
        }
        for (String key : hashMap.keySet()) {
            result.append(hashMap.get(key)).append(key);

        }
        System.out.println(result.toString());
        return result.toString();
    }

}
