/*
https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string/0
* Input:
2
i.like.this.program.very.much
pqr.mno

Output:
much.very.program.this.like.i
mno.pqr
*
*
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseWords {

    public static void main (String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(br.readLine());
        for (int i=0;i<n;i++){
            String line=br.readLine();
            String [] arr = line.split("\\.");
            for(int j=arr.length-1;j!=-1;j--){
                System.out.print(arr[j]);
                if(j!=0){System.out.print(".");}
            }

        }
    }
}
