package uz.pdp;

public class TwoTwo {
    public static void main(String[] args) {
        int a[]={4, 2, 2, 2};
        System.out.println(twoTwo(a));
    }

    public static boolean twoTwo(int[] nums) {
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==2){
                count++;
            }else if(count==1){
                return false;
            }else{
                count=0;
            }
        }
        return count!=1;

    }

}
