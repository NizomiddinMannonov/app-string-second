package uz.pdp;

public class RepeatEnd {
    public static void main(String[] args) {
        int [] s={10, 3, 5, 6};
        System.out.println(bigDiff(s));
    }

    public static int bigDiff(int[] nums) {
        int ka=0;
        int ki=nums[0];
        for(int i=0; i<nums.length;i++){
            ka=Math.max(ka,nums[i]);
            ki=Math.min(ki,nums[i]);
        }

        return ka-ki;
    }

}
