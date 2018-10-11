//Class to find the exactly one missing number in an Array of series of integers starting from 1

import java.util.ArrayList;
import java.util.Scanner;
public class FindMissingNumInArray{

//better run time then findBySum   
 public static void find(Integer arr[]){

        int n=1;
        for(int i=0;i<arr.length;i++)
            if(arr[i]==n){n++;}
            else { System.out.println("Missing number is :"+n);break;}

    }

public static void findBySum(Integer arr[],int size){
      int sum=(size*(size+1))/2;
      int arrSum=0;
      for(int i=0;i<arr.length;i++){
          arrSum=arrSum+arr[i];
}
System.out.println("Missing number is "+(sum-arrSum));
     
}

public static void findMoreThanOne(Integer[] arr,int size){
          int n=1;
          ArrayList<Integer> list= new ArrayList<Integer>();
          for(int i=0;i<arr.length;i++){
               if(arr[i]==n){n++;}
               else{list.add(n);n=n+2;}
}
          System.out.println("Missing numbers "+list);         
}
    public static void main(String args[]){

      find(new Integer[]{1,2,3,4,5,6,8});

//take the input of array

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(in.hasNext()){
list.add(in.nextInt());
}

        Integer [] arr = new Integer[list.size()];
        
        find(list.toArray(arr));
    }

}
