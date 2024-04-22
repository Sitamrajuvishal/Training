package Assignments;

public class StringOperations{

	public static String MiddleSubstring(String str1, String str2, int length) {
      
        String Joined = str1 + str2;
        String reversedStr = reverseString(Joined);


        int middleIndex = reversedStr.length() / 2;
        length = Math.min(length, reversedStr.length());
        int startIndex = middleIndex - length / 2;
        
        StringBuilder middleSubstring = new StringBuilder();
        for (int i = 0; i < length; i++) {
            middleSubstring.append(reversedStr.charAt(startIndex + i));
        }

        return middleSubstring.toString();
    }
	
// Method to reverse a string
    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int left = 0, right = str.length() - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(MiddleSubstring("hello", "world", 3)); 
        System.out.println(MiddleSubstring("abc", "def", 5)); 
        System.out.println(MiddleSubstring("", "", 2)); 

	}

}
