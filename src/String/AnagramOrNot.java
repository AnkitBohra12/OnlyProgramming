// WJP to check wheather a String is Anagram or not
package String;

public class AnagramOrNot {
	
	    public static void main(String[] args) {
	        String str1 = "naman";
	        String str2 = "aman";

	        if (isAnagram(str1, str2)) {
	            System.out.println(str1 + " and " + str2 + " are anagrams.");
	        } else {
	            System.out.println(str1 + " and " + str2 + " are NOT anagrams.");
	        }
	    }

	    static boolean isAnagram(String str1, String str2) {
	        str1 = str1.replaceAll("\\s", "").toLowerCase();
	        str2 = str2.replaceAll("\\s", "").toLowerCase();

	        if (str1.length() != str2.length()) {
	            return false;
	        }

	        char[] arr1 = str1.toCharArray();
	        char[] arr2 = str2.toCharArray();

	        java.util.Arrays.sort(arr1);
	        java.util.Arrays.sort(arr2);

	        return java.util.Arrays.equals(arr1, arr2);
	    }
	}

// WJP to find unqiue char from a String
