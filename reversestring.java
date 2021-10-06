public class reversestring {
     public static void main(String[] args) {
    String str ="lol";
    String rev ="";
    int length = str.length();
    for(int i =0;i<length;i++){
        rev =str.charAt(i)+rev;
    }        
    if(str.equals(rev)){
        System.out.println("yes it is pailendrom");

    }else{
        System.out.println("not pailendrom");
    }

    System.out.println(rev);
     }
    
}
