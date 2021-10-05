public class pailendrom {

    public static void main(String args[]) {

        String original="dog",reverse="";
        int length=original.length();
        for(int i=length-1;i>=0;i--){
            reverse=reverse+original.charAt(i);
                    
        }
        if(original.equals(reverse)){
            System.out.println("Pailendrom");
        }else{
            System.out.print("no");
        }
        

        
    }
    
}
