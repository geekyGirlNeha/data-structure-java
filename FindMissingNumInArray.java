//Class to find the missing number in an Array of integers from 1-100


public class FindMissingNumInArray{

public static void find(int arr[]){

int n=1;
int num=0;

for(int i=0;i<arr.length;i++)
 if(arr[i]==n){n++;}
 else { System.out.println("Missing number is :"+n);break;}

} 

public static void main(String args[]){
    find(new int[]{ 1,2,3,4,5,6,7,8,9,10 });
}

}
