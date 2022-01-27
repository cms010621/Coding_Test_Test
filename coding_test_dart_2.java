import java.util.Arrays;

public class coding_test_dart_2 {
    public static void main(String []args) {
        String dartResult = "1S2D*3T";
        int answer = 0;

        String[] dartSplit = dartResult.split("(?<=S)|(?<=D)|(?<=T)|(?<=\\*)|(?<=#)");
        System.out.println(Arrays.toString(dartSplit));
        int[] arrValue = new int[3];

        String lastStr = "";
        int lastVal = 0;

        for(int i=0;i<dartSplit.length; i++) {
            String strValue = dartSplit[i].replaceAll("[0-9]", "");
            int intValue = strValue.equals("*") || strValue.equals("#") ? 0 : Integer.parseInt(dartSplit[i].replaceAll("[A-Z]", ""));
            Boolean hasNumSign = dartSplit[i].contains("#") ? true : false;
            Boolean hasCoraise = dartSplit[i].contains("#") ? true : false;
            int value = 0;

            switch(strValue) {
                case "D" :
                    value = (int) Math.pow(intValue, 2);
                    if(hasNumSign) value *= -1;
                    if(hasCoraise) {
                        value *= 2;
                    }
                    answer += value;
                    System.out.println(value);
                    break;
                case "S" :
                    value = intValue;
                    if(hasNumSign) intValue *= -1;
                    if(hasCoraise) value *= 2;
                    answer += value;
                    System.out.println(value);
                    break;
                case "T" :
                    value = (int) Math.pow(intValue, 3);
                    if(hasNumSign) intValue *= -1;
                    if(hasCoraise) value *= 2;
                    answer += value;
                    System.out.println(value);
                    break;
    
            }
        }
        System.out.println(answer);

    }
}