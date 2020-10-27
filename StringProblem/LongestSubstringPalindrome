public class LongestSubstringPalindrome{
    public static void main(String[] args){
        System.out.println(findLongestSubstringPalindrome("ebcddcbn"));
    }
    
    public static String findLongestSubstringPalindrome(String str){
        String currentLongest="";
        String palindrome="";
        for(int i=0;i<str.length();i++){
            String evenPalindrome=findPalindrome(str,i-1,i);
            String oddPalindrome=findPalindrome(str,i-1,i+1);
            currentLongest=oddPalindrome;
            if(evenPalindrome.length()>oddPalindrome.length()){
                currentLongest=evenPalindrome;
            }
            if(currentLongest.length()>palindrome.length()){
                palindrome=currentLongest;
            }
        }
        return palindrome;
    }
    
    public static String findPalindrome(String str, int leftIndex, int rightIndex){
        while(rightIndex<str.length() && leftIndex>=0){
            if(str.charAt(leftIndex)!=str.charAt(rightIndex))
                break;
            leftIndex--;
            rightIndex++;
        }
        return str.substring(leftIndex+1,rightIndex);
    }
}
