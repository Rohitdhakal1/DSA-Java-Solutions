import java.util.HashMap;

public class contains_duplicate {
    
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> mapy = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (mapy.containsKey(nums[i])) {
                return true;
            }
            mapy.put(nums[i], i);
        }
        return false;
    }

    /* its better to use this in this we dont need to store index or say indices  
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {   // if already in set, duplicate found
                return true;
            }
            set.add(num);  // otherwise add it
        }
        return false;
    } */

    
    public static void main(String[] args) {
        contains_duplicate obj = new contains_duplicate();

        int[] nums1 = {1, 2, 3, 4};      // no duplicates
        int[] nums2 = {1, 2, 3, 1};      // has duplicates

        System.out.println("nums1 contains duplicate? " + obj.containsDuplicate(nums1));
        System.out.println("nums2 contains duplicate? " + obj.containsDuplicate(nums2));
    }
}
