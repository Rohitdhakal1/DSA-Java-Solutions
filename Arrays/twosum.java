package arrays;
import java.util.Arrays;
import java.util.HashMap;

public class twosum {

    public static int[] ts(int arr[] , int target){
        HashMap<Integer , Integer> mapy = new HashMap<>();
        int answer[]= new int[2];
        
        for(int i =0 ; i<arr.length ; i++){
            
            int remain = target - arr[i];

            
            if(mapy.containsKey(remain)){
                answer[0]=mapy.get(remain);
                answer[1]=i;
                return answer;
            }
       
            mapy.put(arr[i], i);

        }

        return new int[]{}; // not found

    }

  



    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        twosum s = new twosum();
        int[] ans = s.ts(arr, 9);
        System.out.println(Arrays.toString(ans));

    }
}
