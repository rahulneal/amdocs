import java.util.*;
public class leap {
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the year:");
        int leap= sc.nextInt();
        if(((leap%4==0) && (leap%100!=0))|| (leap%400 ==0)){
            System.out.print(leap+"is a Leap year");
        }else{
            System.out.print(leap+"is not Leap year");
        }
        sc.close();
        
    }
}
