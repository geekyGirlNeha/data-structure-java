import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class StringPermutations {


    public static void printPermutaions(String word) {
        //storing char and count
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < word.length(); i++) {
            if (map.get(word.charAt(i)) != null) {
                map.put(word.charAt(i), map.get(word.charAt(i)) + 1);
            } else {
                map.put(word.charAt(i), 1);
            }
        }

        int[] count = new int[map.size()];
        char[] chars = new char[map.size()];

        int index = 0;
        for (Map.Entry entry : map.entrySet()) {
            chars[index] = (char) entry.getKey();
            count[index] = (int) entry.getValue();
            index++;
        }

        char[] result = new char[word.length()];
        ArrayList<String> resultList = new ArrayList<String>();
        permuteUtil(chars, count, result, resultList, 0);
        for (String perm : resultList) {
            System.out.print(perm+" ");
        }
    }

    public static void permuteUtil(char[] chars, int[] count, char[] result, List<String> resultList, int level) {

        //terminating condition
        if (level == result.length) {
            resultList.add(new String(result));
            return;
        }

        for (int i = 0; i < chars.length; i++) {

            //if character count is 0 then skip
            if (count[i] == 0) {
                continue;
            }
            result[level] = chars[i];
            count[i]--;
            permuteUtil(chars, count, result, resultList, level + 1);
            count[i]++;
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        System.out.println(t);
        for (int i=0;i<t;i++){
            String word = br.readLine();
            printPermutaions(word);
            System.out.println();
        }
    }
}
