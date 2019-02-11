//KPM approach of searching pattern

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PatternSearch {

    //preparing longest prefix suffix (lps)
    public static int[] preProcessing(String pat) {
        int[] lps = new int[pat.length()];
        //value at index 0 is always 0
        lps[0] = 0;
        //j to keep track matching char
        int j = 0;
//i to compare char with j
        for (int i = 1; i < pat.length(); i++) {
            if (pat.charAt(j) == pat.charAt(i)) {
                //if matches, incrementing value at index j by 1
                lps[i] = lps[j] + 1;
                j++;
            } else {

                lps[i] = 0;
            }
        }

        return lps;

    }

    public static void patternSearch(String text, String pat) {
        int[] lps = preProcessing(pat);

        for (int v : lps) {
            System.out.println(v);
        }

        //for pattern char match
        int j = 0;
        int length = pat.length() - 1;

        //iterating text
        for (int i = 0; i < text.length(); i++) {
            //if match
            if (isMatch(text.charAt(i), pat.charAt(j))) {
                // last char of pattern is matched
                if (j == length) {
                    System.out.println("Found at index " + (i - length));


                } else {
                    j++;
                }

            } else {

                int len = lps.length - 1;
                while (j != 0 & len >= 0) {
                    j = lps[len];
                    len--;
                    if (isMatch(text.charAt(i), pat.charAt(j))) {
                        j++;
                        break;
                    }

                }

            }
        }
    }

    //character matching
    public static boolean isMatch(char text, char pat) {
        if (text == pat) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        String pat = br.readLine();
        patternSearch(text, pat);
    }
}
