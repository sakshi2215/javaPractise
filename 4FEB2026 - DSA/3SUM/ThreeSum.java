import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> solution(int[]nums){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length -2 ; i++){
            //Skip the duplicates 
            if( i> 0 && nums[i]==nums[i-1]) continue;

            int left = i+1;
            int right = nums.length-1;
            while(left < right){ 
                int sum = nums[i] + nums[left] + nums[right];
                if(sum== 0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    //skipping the duplicates if any
                while(left < right  && nums[left] == nums[left+1]){
                    left++;
                }
                while(left < right && nums[right]== nums[right-1]){
                    right--;
                }
                left++;
                right--;
                }
                else if(sum < 0){
                    left++;
                }
                else{
                    right--;
                }
                
            }
        }
        return result;
    }
    public static void main(String[] args) {
        ThreeSum t = new ThreeSum();

        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> triplets = t.solution(nums);
        System.out.println("Triplets:");
        for (List<Integer> triplet : triplets) {
            System.out.println(triplet);
        }
    }
}
