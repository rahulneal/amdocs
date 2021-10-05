import java.util.Arrays;

public class anagram {

    public static boolean isAnagram(String first, String second) {
        boolean status=true;
        char[] word1 = first.replaceAll("[\\s]", "").toCharArray();
        char[] word2 = second.replaceAll("[\\s]", "").toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        System.out.println("done herea");

        status=Arrays.equals(word1, word2);
        if(status){
            System.out.println("yes");
        }else{
            System.out.println("false");
        }
        return status;

    }

    public static void main(String arg[]) {

        String first = "keepa";
        String second = "peek";
        isAnagram(first, second);
        System.out.println("done here");

        



    }

}
