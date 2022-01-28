import java.util.ArrayList;
import java.util.Collections;

public class codingTestMostBiggestNumber {
    public static void main(String[] args) {
        int[] numbers = {3, 30, 34, 5, 9};
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> sortList = new ArrayList<>();
        String answer = "";

        // for(int i=0;i<numbers.length; i++) {
        //     String str = String.valueOf(numbers[i]);
        //     // System.out.println(str.length());
        //     int count = str.length();
        //     for(int j=0;j<6-count; j++) {
        //         str+="a";
        //     }
        //     arrayList.add(str);
        // }

        for(int i=0;i<numbers.length; i++) {
            arrayList.add(String.valueOf(numbers[i]));
        }

        sortList = (ArrayList<String>) arrayList.clone();

        for(int i=0;i<arrayList.size(); i++) {
            String str = arrayList.get(i);
            int count = str.length();
            for(int j=0;j<3-count; j++) {
                str+= sortList.get(i).charAt(sortList.get(i).length()-1);
            }
            sortList.set(i, str);
            System.out.println(sortList.get(i));
        }

        Collections.sort(arrayList, Collections.reverseOrder());
        // System.out.println(arrayList);

        for(int i=0;i<arrayList.size(); i++) {
            answer += arrayList.get(i).replaceAll("a", "");
        }
        // System.out.println(answer);

        for(int i=0;i<arrayList.size(); i++) {

        }

        boolean s = true;
        String a = "9**********";
        String b = "34*********";
        if(a.compareTo(b) >= 0) s = false;

    }
}
