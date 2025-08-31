package Strings;

public class Valid_parenthesis {
    
      public boolean isValid(String s){
        int previous_length;

        do{
            previous_length = s.length();
             s = s.replace("()", "").replace("[]", "").replace("{}", "");

        } while(previous_length!=s.length());
        
        
        return s.isEmpty();

      }     //   it take atleast my worst time is n^2 becuase replace take 0(n) and loop also take same so 
           //    n*n =n^2
          //    space is 0(n) because every time replace make copy of an string
          //   all three rplace work together first before check whikke cond means all three check 
     
 
    
    public static void main(String[] args) {

        String s = "([]())";
        Valid_parenthesis iv = new Valid_parenthesis();
        Boolean ans = iv.isValid(s);
        System.out.println(ans);

    }
}   
