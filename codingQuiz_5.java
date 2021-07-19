import java.util.ArrayList;
import java.util.Arrays;

public class codingQuiz_5 {
    
    public static void main(String[] args) {
        String arr[];
        String str = "0, 0, 1, 8, 2, 2, 8, 9, 0, 3, 4, 0, 0";
        str = str.replaceAll(" ", "");
        arr = str.split(",");

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(arr));

        String val1 = "";
        String val2 = "";
        int minVal = 0;//최솟값.
        int minIndex = 0;
        int JminVal = 0;

        for(int i=0;i<arrayList.size(); i++) {
            //최솟값 구하기. val1의 값이 ""이면 0은 올 수 없게 .
            minVal = Integer.valueOf(arrayList.get(i));
            minIndex = 0;
            for(int j=0;j<arrayList.size(); j++) {
                JminVal = Integer.valueOf(arrayList.get(j));
                if(minVal>JminVal) {
                    if(val1!="") {
                        minVal = JminVal;
                        minIndex = j;
                    }
                }
            }
            if(val1.equals("") && minVal==0) {

            }
            else {
                val1 = val1+minVal;
                arrayList.remove(minIndex);
                System.out.println(String.valueOf(arrayList));
                break;
            }



        }

        
    }
}
