import java.util.HashSet;

public class LongestSubstringWithTwoDistinctBruteForce {
    public static void main(String[] args) {
        String s = "ninninja";
        System.out.println(lengthOfLongestSubstringBruteForce(s,2));
    }
// bruteforce approach
    public static int lengthOfLongestSubstringBruteForce(String s, int k) {
        int LongestS =0;
        // generating all the substrings
        // then add currentCharacter to the hashset then check if hashset size>2 then break
        // then currentLength = end-star+1;
        // return maxLength
        for(int start =0; start<s.length(); start++) {
            HashSet<Character> distinct = new HashSet<>();
            for(int end = start; end<s.length(); end++){
                // current element
                char currentElement = s.charAt(end);
                distinct.add(currentElement);
                if(distinct.size()>k) {
                    break;
                }
                LongestS = Math.max(LongestS,end-start+1);

            }

        }
        return LongestS;
    }
}