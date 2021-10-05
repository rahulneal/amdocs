public class swap {


    public static void swapValues(int first,int second) {
       
       
        int temp;
        temp=first;
        first=second;
        second=temp;
        System.out.println(first);
        System.out.println(second);

        
    }
    public static void main(String[] args) {
        int first = 100;
        int second= 200;
        System.out.println(first);
        System.out.println(second);
        swapValues(first,second);
        
        
    }

    
    
}
