import java.lang.reflect.Array;
import java.util.*;



public class copyarray {
    
    public static void main(String args[]) {

        //Array a1[]=[1,2,3,4,5];
        int arr1[]=new int[]{1,2,3,4,5};

        int arr2[]= new int[arr1.length];
       //copying all the element in array two
       for(int i=0;i<arr1.length;i++){
       arr2[i]= arr1[i]; }
       System.out.println("display array1");
       for(int i=0;i<arr1.length;i++){
           System.out.print(arr1[i]+" ");
       }
       System.out.println();

       System.out.println("elements of the new array: " );
       for(int i=0; i< arr2.length;i++){
           System.out.println(arr2[i]+ " ");
       }
    }
    
    
}
