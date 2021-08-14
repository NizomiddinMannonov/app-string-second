package uz.pdp;

public class Sum67 {
    public static void main(String[] args) {
        int a[]={1, 2, 2, 6, 99, 99, 7};
        Integer b=0;
        System.out.println(sum67(a));
        System.out.println(b);
    }

    public static int sum67(int[] nums) {
        int sum=0;
        boolean a=false;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==6){
                a=true;
            }else{
                if(nums[i]==7&&a){
                    a=false;
                    continue;
                }
                if(a){
                    continue;
                }
                sum+=nums[i];
            }

        }

        return sum;
    }

}
