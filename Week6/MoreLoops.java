package Week6;

public class MoreLoops {
    // given a string print out the char at each Nth variable
    // Ex. 
    // Happy Birthday, 2
    // 0123456789
    // aprha
    // everyNth("Happy Birthday", 2) --Parameters

    public static String everyNth(String str, int n){
        String result = "";

        for(int i = 0; i<str.length(); i = i + n){
            System.out.println(i + "     " + str.charAt(i));
            result = result + str.charAt(i);
            // EX. Greg Walsh -> str
            // everyNth(str,n)
            // everyNth("Greg Walsh",1)
            // Greg Walsh
            // 0123456789 -> index
            // i=0
            // n=1
            // index 10 total
            // 0<10
            // 0 = 0 + 1 -> 1
            // 1<10
            // 1 = 1 + 1 -> 2
            // 2<10
            // 2 = 2 + 1 -> 3
            // 3<10 
            // 9<10
            // 9 = 9 + 1 -> 10
            // 10<10 NO
        }
        System.out.println("hi");
        return result;
    }

    // count the number of times xx is in a given string
    // int
    // countXX("Happy Birthday")
    public static int countXX(String str){
        int count = 0;
        String compare = "";
        
        for(int i = 0; i < str.length()-1; i++){
            if(str.substring(i, i+2).equals("xx")){
                count ++;
            }
        }
        return count;
    }
    // given a string create a new string that will move the first char to the end of the following 2 chars
    // EX.
    //oneTwo("abc") → "bca"
    //oneTwo("tca") → "cat"
    //oneTwo("tcagdo") → "catdog"
    public static String oneTwo(String str){
        String result = "";
        System.out.println(str);
        for(int i = 0; i < str.length()-2; i +=3){
            System.err.println("i = "+ i);
            System.out.println(i+1);
            System.out.println(i+3);
            result = result + str.substring(i+1, i+3) + str.charAt(i);
        }
        return result;
    }
    //Create a Palindrome checker 
    //EX.
    //tacocat -> True
    //test -> False

    public static boolean isPalindrome(String str){
        // Pointers at the beginning and the end of the string 
        int i = 0;
        int j = str.length()-1;
        // While there are charaters to compare
        while(i<j){
            // check if there is a match
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            System.out.println("i = "+str.charAt(i)+ " index = "+i);
            System.out.println("j = "+str.charAt(j)+ " index = "+j);
            i++;
            j--;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(everyNth("Greg Walsh", 1));
        //System.out.println(countXX("HxxxappyBirthday"));
        // System.out.println(oneTwo("catdog"));
        //System.out.println(isPalindrome("camac"));
    }
    
}
