import java.io.IOException;
import java.util.Scanner;

public class OptemisedSubArrayWithGivenSum {

    public static void subArray(int[] arr, int requiredSum) {

        int currentSum = 0;
        int startIndex = 0;
        int endIndex = 0;

        while (startIndex <= arr.length - 1) {

            if (currentSum > requiredSum) {
                currentSum -= arr[startIndex];
                startIndex++;
            } else if (currentSum == requiredSum) {
                break;
            } else if (endIndex == arr.length) {
                break;
            } else {
                currentSum += arr[endIndex];
                ++endIndex;
            }

        }
        if (currentSum == requiredSum) {
            System.out.println(startIndex + 1 + " " + endIndex);
        } else {
            System.out.println(-1);
        }

    }


    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {

            int n = in.nextInt();
            int S = in.nextInt();
            int[] arr = new int[n];
            int j = 0;

            while (j < n) {
                arr[j] = in.nextInt();
                j++;
            }

            subArray(arr, S);

        }

    }
}
