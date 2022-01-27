import java.math.BigInteger;

public class coding_test_220110 {
    public static void main(String args[]) {
        String new_id = "22eU2FzNp9bF2BsBVJUg";
        String resValue = "";
        // new_id = new_id.replaceAll("\\p{Punct}", "");
        String[] str = new_id.split("");
        for(int i=0;i<str.length; i++) {
            if(str[i].matches("^[a-zA-Z0-9]*$") || str[i].equals(".") || str[i].equals("-") || str[i].equals("_")) {
                if((i == 0 || i == str.length-1) && str[i].equals(".")) {}
                else if(i != 0 && str[i].equals(".") && str[i-1].equals(".")) {}
                else resValue+= str[i];
            }
        }

        // if(!new_id.equals(resValue) || new_id.length() > 15 || new_id.length() < 3) {
            //1 대소문자 치환
            resValue = new_id.toLowerCase();
            System.out.println("1 " + resValue);
            
            //2. 소문자 숫자 - _ . 이외 제거
            // str = resValue.split("");
            // resValue = resVal(str);
            str = resValue.split("");
            resValue = "";
            for(int i=0;i<str.length; i++) {
                if(str[i].matches("^[a-zA-Z0-9]*$") || str[i].equals(".") || str[i].equals("-") || str[i].equals("_")) {
                    resValue+= str[i];
                }
            }
            System.out.println("2 " + resValue);

            //3. . 연속 제거
            // str = resValue.split("");
            // resValue = resVal(str);
            if(resValue.length() >1) {
                str = resValue.split("");
                resValue = "";
                for(int i=0;i<str.length; i++) {
                    if((i == 0 || i == str.length-1) && str[i].equals(".")) {}
                    else if(i != 0 && str[i].equals(".") && str[i-1].equals(".")) {}
                    else resValue+= str[i];
                }
            }
            System.out.println("3 " + resValue);

            //4. . 처음 / 끝 제거
            // str = resValue.split("");
            // resValue = resVal(str);
                if(resValue.charAt(0) == '.') {
                    resValue = resValue.length() == 1 ? "" : resValue.substring(1);
                }
                if(resValue.length() > 1) {
                    if(resValue.charAt(resValue.length() - 1) == '.') {
                        resValue = resValue.substring(0, resValue.length()-1);
                    }
                }
            System.out.println("4 " + resValue);
            
            //5. 빈문자열이면 a 대입
            if(resValue.equals("")) resValue = "a";

            System.out.println("5 " + resValue);
            //6. 길이 16이상이면 15이후 제거 및 맨 마지막이 .이면 제거
            if(resValue.length() > 15) {
                resValue = resValue.substring(0, 15);
                // str = resValue.split("");
                // resValue = resVal(str);
            }
            if(resValue.charAt(resValue.length() - 1) == '.') {
                resValue = resValue.substring(0, resValue.length()-1);
            }
            System.out.println("6 " + resValue);

            //길이가 2 이하면 마지막 문자를 길이 3될때까지 반복.
            if(resValue.length() < 3) {
                for(int i = (3 - resValue.length()); i > 0; i--) {
                    resValue += resValue.charAt(resValue.length()-1);
                }
            }

            System.out.println("7 " + resValue);
        // } else {
            // System.out.println(new_id);
        // }
        System.out.println(!resValue.equals(new_id) ? resValue : new_id);
    }

    public static String resVal(String[] str) {
        String resValue = "";

        for(int i=0;i<str.length; i++) {
            if(str[i].matches("^[a-zA-Z0-9]*$") || str[i].equals(".") || str[i].equals("-") || str[i].equals("_")) {
                if((i == 0 || i == str.length-1) && str[i].equals(".")) {}
                else if(i != 0 && str[i].equals(".") && str[i-1].equals(".")) {}
                else resValue+= str[i];
            }
        }
        return resValue;
    }
}