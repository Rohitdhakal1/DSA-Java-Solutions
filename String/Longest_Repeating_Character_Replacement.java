package Strings;

import java.util.HashMap;

class Longest_Repeating_Character_Replacement {
    

    public int characterReplacement(String s, int k){

        int maxlen=0;
        int maxfreq=0;
        HashMap<Character,Integer> store = new HashMap<>();
        int start=0;
        int replacement=0;
        
        for(int end =0 ; end<s.length() ; end++){
             
            char ch  = s.charAt(end);

            store.put(ch,store.getOrDefault(ch,0)+1); //imp get default or freq
            maxfreq = Math.max(maxfreq, store.get(ch));

            int Current_windowsize = end-start+1;
            replacement=Current_windowsize - maxfreq;

            if(replacement>k){

                char left = s.charAt(start);
                store.put(left,store.getOrDefault(left,0)-1);
                start++;

            }

            maxlen=Math.max(end-start+1,maxlen);
            
        }
        return maxlen;   // time is 0(n)  but space is 0(1) because in space we use alphabet from 0 to 25 so its easy to store any max 26 countable not like ascii(128unique chac)  or   unicode chacter
                        //    we can use while for correct freq even  its work perfectly but inside its wrong somewhere so keep in mind use while in interview rather then if in removing




                        


    }


// its an alternative to use array instead of hashmap for better 

//     class Solution {
//     public int characterReplacement(String s, int k) {
//           int[] freq = new int[26]; // frequency of each char
//         int left = 0, maxCount = 0, maxLen = 0;

//         for (int right = 0; right < s.length(); right++) {
//             char ch = s.charAt(right);
//             freq[ch - 'A']++;
            
//             // Track the count of the most frequent char in the window
//             maxCount = Math.max(maxCount, freq[ch - 'A']);
            
//             // If more than k replacements needed, shrink window
//             while ((right - left + 1) - maxCount > k) {
//                 freq[s.charAt(left) - 'A']--;
//                 left++;
//             }
            
//             // Update result
//             maxLen = Math.max(maxLen, right - left + 1);
//         }

//         return maxLen;
//     }
// }


    public static void main(String[] args) {

        String s = "AABABBA";
        Longest_Repeating_Character_Replacement cr = new Longest_Repeating_Character_Replacement();
        int ans =cr.characterReplacement(s, 1);
        System.out.println(ans);
        
    }
}
