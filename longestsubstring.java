import java.util.*;
public class longestsubstring {
    public static void main(String[] args) {
        longestsubstring solution = new longestsubstring();
        String s = "abcabcbb";
        
        int result = solution.lengthOfLongestSubstring(s);
        System.out.println("Output: " + result);
    }
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int start = 0;
        int max = 0;
        
        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            while (set.contains(c)) {
                set.remove(s.charAt(start));
                start++;
            }
            set.add(c);
            max = Math.max(max, end - start + 1);
        }
        
        return max;
        
    }
}
