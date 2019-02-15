//program to print all sub arrays whose sum is equal to S

import java.util.ArrayList;

public class SubArrayWithGivenSum {

    public static void subArray(int [] arr,int S){

        for(int i=0;i<arr.length;i++){

            int sum=0;
            ArrayList<Integer> list=new ArrayList<>();

            for(int j=i;j< arr.length;j++){

                sum=sum+arr[j];
                list.add(arr[j]);
                //sub array sum is equal to S
                if(sum==S){
                    System.out.println(list);
                }

                if(sum>S){
                    break;
                }

                if(i==arr.length-1&& sum!=S){
                    System.out.println("Not found");
                }


            }
        }

    }




    public static void main(String[] args) {

        int [] arr={1,4,2,7,9};
        subArray(arr,9);

    }
}
