import java.util.*;  
public class cmp {

    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in); 
        System.out.print("Enter a:");
        int a =sc.nextInt();
        System.out.print("Enter b:");
        int b =sc.nextInt();
        if(a>b){
            System.out.print("a is greater than b");

        }
        else{
            System.out.print("b is greater than a");
        }
        sc.close();
    }
    
}
