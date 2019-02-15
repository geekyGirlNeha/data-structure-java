//program to print first continuous sub array whose sum is equal to S

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SubArrayWithGivenSum {

    public static void subArray(int [] arr,int S){

        outerloop:
        for(int i=0;i<arr.length;i++){

            int sum=0;
            ArrayList<Integer> list=new ArrayList<>();

            for(int j=i;j< arr.length;j++){

                sum=sum+arr[j];
                list.add(arr[j]);
                //sub array sum is equal to S
                if(sum==S){
                    int start=++i;
                    int end = ++j;
                    System.out.println(i+" "+j);
                    break outerloop;

                }

                if(i==arr.length-1&& sum!=S){
                    System.out.println(-1);
                }

                if(sum>S){
                    break;
                }

            }
        }

    }




    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        int t=in.nextInt();

        for (int i=0;i<t;i++){

            int n=in.nextInt();
            int S=in.nextInt();
            int [] arr=new int[n];
            int j=0;

            while (j<n){
                arr[j]=in.nextInt();
                j++;
            }

            subArray(arr,S);

        }


    }
}
