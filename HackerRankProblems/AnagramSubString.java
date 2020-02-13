
import java.util.*;

public class AnagramSubString{

 public static int anagram(String s) {

         HashMap<String,Integer> map = new HashMap<String,Integer>();

        int pairs = 0;

        for (int i = 0; i < s.length(); i++) {

            for (int j = i + 1; j < s.length(); j++) {

                 String currentSubString = s.substring(i, j);

                char[] currentSubArray = currentSubString.toCharArray();

                Arrays.sort(currentSubArray);

                currentSubString = String.valueOf(currentSubArray);

                if (map.containsKey(currentSubString)) {

                    int value = (int)map.get(currentSubString);

                    pairs = pairs + value;

                    map.put(currentSubString, ++value);
                } else {
                    map.put(currentSubString, 1);
                }
            }
        }

        return pairs;
    }

    public static void main(final String args[]) {

        Scanner sc = new Scanner(System.in);

        final String str = sc.nextLine();

    System.out.println(" The number of AnagramSubString "+anagram(str));

    
}}
