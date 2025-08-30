import java.util.*;
public class Product_subarray {

    //we have to take min or max for -ve value becuase it may become big value like -2 is min but multiply my -2 again become (4 max ans) in input [-2,-2,3];
    public static int productsub(int arr[]){
        int max_now=arr[0];
        int min_now=arr[0];
        int ans=arr[0];


        for(int i=1 ; i<arr.length ; i++){
            int tempmax = max_now;
            int tempmin = min_now;

            max_now = Math.max(arr[i], (Math.max(tempmax*arr[i], tempmin*arr[i])));
            min_now = Math.min(arr[i], (Math.min(tempmax*arr[i], tempmin*arr[i])));

            ans=Math.max(ans,max_now);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] ={-2,-2,3};
        Product_subarray ps=new Product_subarray();

        int ans=ps.productsub(arr);
        System.out.println(ans);

    }
}
