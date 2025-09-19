import javax.annotation.processing.SupportedSourceVersion;

public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            if (isPalindrome(s)) {
                System.out.println(s + " -  палиндром");
            } else {
                System.out.println(s + " -  не палиндром");
            }
        }
    }

    public static String reverseString(String str) {
       StringBuilder rev_str = new StringBuilder();
       for (int i = str.length() - 1; i >= 0; i--) {
           rev_str.append(str.charAt(i));
       }
       return rev_str.toString();
    }

    public static boolean isPalindrome(String s) {
    String rev = reverseString(s);
    return s.equals(rev);
    }
}
