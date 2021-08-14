package uz.pdp;

public class Test {
    public static void main(String[] args) {
        System.out.println(getGenerate(50, 7, "2ad6dd11-ccd8-4c07-98aa-73e5d68bd540"));
    }

    public static String getGenerate(int count, int row, String pId) {
        String res = "";
        for (int i = 1; i <= count; i++) {
            res += "update chair set name='" + row + "/" + i + "' where chair.row=" + row + " and chair.id in(select chairs_id from place_capacity_chairs where place_capacity_id='" + pId + "');\n";

        }
        return res;
    }
}
