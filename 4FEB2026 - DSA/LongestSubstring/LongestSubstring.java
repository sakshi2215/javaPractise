import java.util.HashSet;

public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        
        //Using Sliding window Approach
        // If the character at right is already in the set, move 'left' pointer by one place  (Shrinking window by 1)

        int left = 0; 
        int maxLength = 0;
        
        // Travering using the right pointer
        for (int right = 0; right < s.length(); right++) {
            
            while (set.contains(s.charAt(right))) {
                //Removing the corresponding character from the set
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        LongestSubstring solution = new LongestSubstring();
        String input = "abcabcbb";
        int result = solution.lengthOfLongestSubstring(input);
        System.out.println("Length: " + result);
    }
}

