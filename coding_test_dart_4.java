import java.util.ArrayList;
import java.util.Arrays;

public class coding_test_dart_4 {
    public static void main(String []args) {
        String dartResult = "1S2D*3T";
        int lastIndex = 0;
        int answer = 0;
        ArrayList arr = new ArrayList<>();
        ArrayList arr1 = new ArrayList<>();

        for(int i=0;i<dartResult.length(); i++) {
            if(dartResult.charAt(i) == '#' || dartResult.charAt(i) == '*') {
                arr.add(dartResult.substring(lastIndex, i+1));
                lastIndex= i+1;
            }
            else if(i == dartResult.length()-1) {
                arr.add(dartResult.substring(lastIndex, i+1));
            }
        }
        System.out.println(arr.toString());

        lastIndex = 0;
        for(int i= 0;i<arr.size(); i++) {
            String val = arr.get(i).toString();
            System.out.println(val);
            for(int j = 0; j<val.length(); j++) {
                if(String.valueOf(val.charAt(i)).matches("^[a-zA-Z]*$")) {
                    System.out.println(i);
                    if(val.charAt(i+1) == '#' || val.charAt(i+1) == '*') {
                        arr1.add(val.substring(lastIndex, i+2));
                        i++;
                        lastIndex= i+2;
                    } else {
                        arr.add(val.substring(lastIndex, i+1));
                        lastIndex= i+1;
                    }
                }
                else if(i == val.length()-1) {
                    arr1.add(val.substring(lastIndex, i+1));
                }
            }
        }

        System.out.println(arr1.toString());


    }
}