package Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,3,3,4,4,5,5,6};
        int result =check(arr);
        System.out.println(result);
    }
        static int check(int[] nums){
            int k=0;
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]!=nums[i+1]){
                    nums[k++]=nums[i];

                }
            }
            nums[++k]=nums[nums.length-1];
            return k;
        }
    }

