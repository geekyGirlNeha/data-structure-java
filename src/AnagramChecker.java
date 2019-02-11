import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class AnagramChecker {


    public static void isAnagram(String word1,String word2){
       boolean flag=true;

        HashMap<Character,Integer> map1 = new  HashMap<>();
        HashMap<Character,Integer> map2 = new  HashMap<>();

       if (word1.length()!=word2.length()){
           System.out.println("NO");
           return;
       }

        for(int i=0;i<word1.length();i++){
           if(map1.containsKey(word1.charAt(i))){
               map1.put(word1.charAt(i),map1.get(word1.charAt(i))+1);
           }else {
               map1.put(word1.charAt(i),1);
           }
       }

        for(int i=0;i<word2.length();i++){
            if(map2.containsKey(word2.charAt(i))){
                map2.put(word2.charAt(i),map2.get(word2.charAt(i))+1);
            }else {
                map2.put(word2.charAt(i),1);
            }
        }

        for (Map.Entry<Character,Integer> entry:map1.entrySet()
             ) {

            if(map2.get(entry.getKey())!= entry.getValue()){
                flag=false;
                break;
            }
        }


        if (flag){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

        }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            String line=br.readLine();
            String [] arr = line.split("\\s");
            isAnagram(arr[0],arr[1]);
        }


    }
}
