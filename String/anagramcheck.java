import java.util.*;

public class anagramcheck {

    // public static boolean checking(String s , String t){

    //     if(s.length()!= t.length()){
    //         return false;
    //     }

    //     HashMap<Character,Integer> mapy = new HashMap<>();

    //     for(char c : s.toCharArray()){  // store value with frequency 
    //         mapy.put(c,mapy.getOrDefault(c,0)+1);
    //     }

    //     for(char c : t.toCharArray()){

    //         if(!mapy.containsKey(c)){
    //             return false;
    //         }

    //         mapy.put(c , mapy.get(c)-1);

    //         if(mapy.get(c)==0){
    //             mapy.remove(c);
    //         }
    //     }

    //      return mapy.isEmpty();

    // }

    // Alternative -short formm is make it into sorted string both and compare if both same return true otherwise false


    //other alternative most interesting 

    public static boolean checking(String s , String t){
        int count[] = new int[26];  // because of 26 alphabet 

        for(char c : s.toCharArray()){
            count[c -'a']++;  // in this suppose input is b = 'a' is 97 ascii value and b is 99 value so then substract b-a ascii value get is 3 so index is 3 but we use ++ to assign value with index 
    
        }


        for(char c: t.toCharArray()){
            count[c-'a']--;  // this helps to get the value to 0 again but use same index and get 0 or -ve as per required  
        }

        //check if any value not equal 0 then false

        for(int c : count){
            if(c!=0){
                return false;
            }

        }

        return true;


    }







    public static void main(String[] args) {
        String s="rat";
        String t="car";

        anagramcheck ac = new anagramcheck();
        boolean ans = ac.checking(s, t);
        System.out.println(ans);

    }
}
