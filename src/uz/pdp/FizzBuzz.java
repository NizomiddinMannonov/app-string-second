package uz.pdp;

public class FizzBuzz {
    public static void main(String[] args) {

    }

    public static String[] fizzBuzz(int start, int end) {
        String[] a = new String[end - start];
        for (int i = 0; i < a.length; i++) {
             if(start%3==0&&start%5==0){
               a[i]="FizzBuzz";
             }else if(start%5==0){
               a[i]="Buzz";
             }else if(start%3==0){
               a[i]="Fizz";
             }else{
               a[i]=String.valueOf(start);
             }
             start++;
        }

        return a;
    }

}
