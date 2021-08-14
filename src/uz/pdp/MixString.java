package uz.pdp;

public class MixString {
    public static void main(String[] args) {
        System.out.println(mixString("djskdskjd","s568989"));
    }

    public static String mixString(String a,String b){
        int uzunlik=0;
        String aralashma="";
        String qoldiq="";
        if (a.length()>b.length()){
            uzunlik=b.length();
            qoldiq=a.substring(uzunlik);
        }else {
            uzunlik=a.length();
            qoldiq=b.substring(uzunlik);
        }

        for (int i = 0; i < uzunlik; i++) {
            aralashma+=+a.charAt(i)+b.charAt(i);
        }
        return aralashma+qoldiq;

    }

}
