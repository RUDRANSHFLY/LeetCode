package Array;

public class Solution{
/**
 * * Problem id = 1920 
 * ! Problem Title = Build Array From Permutation
 * Todo : Array , Simulation
 */
// Leet Code Problem oF Array     
    
public int[] buildArray(int[] nums) {
            int l = nums.length ;
            int[] r = new int[l] ;
            for(int i = 0 ; i < l ; i++){
                r[i] = nums[nums[i]];
            } 
            return r ;
            
        }
    
}

