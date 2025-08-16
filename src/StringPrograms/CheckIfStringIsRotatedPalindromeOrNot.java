package StringPrograms;

public class CheckIfStringIsRotatedPalindromeOrNot {

	public static void main(String[] args) 
	{
		String str = "aab";  // change input here

        boolean isRotatedPalindrome = false;
        int n = str.length();

        for (int i = 0; i < n; i++) {
            String rotated = str.substring(i) + str.substring(0, i);
            if (isPalindrome(rotated)) {
                isRotatedPalindrome = true;
                break;
            }
        }

        if (isRotatedPalindrome) {
            System.out.println(str + " is a rotated palindrome.");
        } else {
            System.out.println(str + " is NOT a rotated palindrome.");
        }
    }

    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;	
	}
}
