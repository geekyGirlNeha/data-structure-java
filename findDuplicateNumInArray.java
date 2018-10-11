import java.util.HashMap;
import java.util.HashSet;

public class FindDuplicateNumInArray{

public static void printDuplicateNumbers(Integer[] arr){

HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

for(int i=0;i<arr.length;i++){
     if(map.get(arr[i])==null)
     {
         map.put(arr[i],1);
         
     }
     else{
         map.put(arr[i],map.get(arr[i])+1);
}
}

HashSet<Integer> set = new HashSet<Integer>();

for(int i=0;i<arr.length;i++){
   if(map.get(arr[i])!=1)
   {
       set.add(arr[i]);
       
   }
}

System.out.println("Duplicate numbers "+set);

}

public static void main(String args[]){

printDuplicateNumbers(new Integer[] {1,2,3,3,4,5,6,6,1});

}
}
