import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class RemoveDuplicatesInString {

    public static void remove(String str) {

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), 1);
        }

        for (Character ch : map.keySet()
        ) {
            System.out.print(ch);
        }
        System.out.println();


    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            remove(br.readLine());
        }
    }
}
