public class StringManipulation {

    public static void main(String[] args) {
        isPalindrome("racecar");
    }

    public static boolean isPalindrome(String word) {
        boolean pallindrome = false;
        char[] wordArr = word.toCharArray();
        int length = wordArr.length;
        int halfLength = length / 2;
        for(int i = 0; i < halfLength; i++) {
            length -= 1;
            if (wordArr[i] != wordArr[length]) {
                pallindrome = false;
                break;
            }
            else pallindrome = true;
        }
       
        System.out.println(pallindrome);
        return pallindrome;
    }

    public static String reverseString(String word) {
        char[] wordArr = word.toCharArray();
        String newWord = "";
        int length = wordArr.length;

        for(int i = length - 1; i + 1 > 0; i--) {
            char letter = wordArr[i];
            newWord += String.valueOf(wordArr[i]);
        }
        System.out.println(newWord);
        return newWord;
    }

}