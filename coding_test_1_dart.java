import java.util.Arrays;

public class coding_test_1_dart {
    public static void main(String []args) {
        String dartResult = "1D2S3T*";
        int answer = 0;

        String[] dartSplit = dartResult.split("(?<=S)|(?<=D)|(?<=T|(?<=\\*)|(?<=#))");
        System.out.println(Arrays.toString(dartSplit));
        int[] arrValue = new int[3];

        String lastStr = "";
        int lastVal = 0;

        for(int i=0;i<dartSplit.length; i++) {
            String strValue = dartSplit[i].replaceAll("[0-9]", "");
            int intValue = strValue.equals("*") || strValue.equals("#") ? 0 : Integer.parseInt(dartSplit[i].replaceAll("[A-Z]", ""));
            int value = 0;
            Boolean hasNumSign = i != dartSplit.length -1 && dartSplit[i+1].equals("#") ? true : false;
            Boolean hasCoraise = i != dartSplit.length -1 && dartSplit[i+1].equals("*") ? true : false;
            System.out.println(hasNumSign);
            switch(strValue) {
                case "D" :
                    value = (int) Math.pow(intValue, 2);
                    if(hasNumSign) value *= -1;
                    if(hasCoraise) value *= 2;
                    answer += value;
                    System.out.println(value);
                    break;
                case "S" :
                    // System.out.println(i + ": "+intValue);
                    value = intValue;
                    if(hasNumSign) intValue *= -1;
                    if(hasCoraise) value *= 2;
                    answer += intValue;
                    System.out.println(value);
                    break;
                case "T" :
                    // System.out.println(i + ": "+(int)Math.pow(intValue, 3));
                    value = (int) Math.pow(intValue, 3);
                    if(hasNumSign) intValue *= -1;
                    if(hasCoraise) value *= 2;
                    answer += value;
                    System.out.println(value);
                    break;
                // case "*" :
                //     answer *= 2;
                //     System.out.println(answer);
                //     break;
                // case "#" :
                //     System.out.println(i + ": "+ (answer-lastVal));
                //     answer *= (lastVal*-1);
                //     break;
                default :
                    break;
    
            }
            lastVal = intValue == 0 ? lastVal : intValue;
            lastStr = strValue.equals("*") || strValue.equals("#") ? lastStr : strValue;
        }
        System.out.println(answer);

    }
}