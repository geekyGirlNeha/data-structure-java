import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseWords {

    public static void main (String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(br.readLine());
        System.out.println(n);
        for (int i=0;i<n;i++){
            String line=br.readLine();
            String [] arr = line.split("\\.");
            System.out.println(arr.length);
            for(int j=arr.length-1;j!=-1;j--){
                System.out.print(arr[j]+" ");
            }

        }
    }
}
