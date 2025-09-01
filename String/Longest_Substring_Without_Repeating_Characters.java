package Strings;

import java.util.HashMap;

class Longest_Substring_Without_Repeating_Characters {

    public int lengthOfLongestSubstring(String s){

        int start = 0;
        
        HashMap<Character ,Integer> store = new HashMap<>();

        int maxcount_substring=0;
        
        for(int end=0 ; end<s.length(); end++){

            char ch = s.charAt(end);

            if(store.containsKey(ch)){
                start = Math.max(start , store.get(ch)+1); // say suppose IF elemnt is PRESENT but not in window then we dont need to do start +1 but if element its in window its +1 

            }

            store.put(ch, end);

            maxcount_substring = Math.max(end-start+1, maxcount_substring);

        }

        return maxcount_substring;   //Time is 0(n) space is 0(n)if all element store is diff and n String

    }
       
    public static void main(String[] args) {
        String s = "abcabcbb";
        Longest_Substring_Without_Repeating_Characters ls = new Longest_Substring_Without_Repeating_Characters();
        int ans = ls.lengthOfLongestSubstring(s);
        System.out.println(ans);
    }
}
