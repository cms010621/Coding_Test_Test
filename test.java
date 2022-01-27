class Solution {
    public String solution(String new_id) {
        String answer = "";
        String resValue = "";
        
        String[] str = new_id.split("");
        for(int i=0;i<str.length; i++) {
            if(str[i].matches("^[a-zA-Z0-9]*$") || str[i].equals(".") || str[i].equals("-") || str[i].equals("_")) {
                if((i == 0 || i == str.length-1) && str[i].equals(".")) {}
                else if(i != 0 && str[i].equals(".") && str[i-1].equals(".")) {}
                else resValue+= str[i];
            }
        }

        // if((!new_id.equals(resValue)) || new_id.length() > 15 || new_id.length() < 3) {
            resValue = new_id.toLowerCase();
            str = resValue.split("");
            resValue = resVal(str);
            str = resValue.split("");
            resValue = resVal(str);
            str = resValue.split("");
            resValue = resVal(str);
            str = resValue.split("");
            resValue = resVal(str);
            if(resValue.equals("")) resValue = "a";

            if(resValue.length() > 15) {
                resValue = resValue.substring(0, 15);
                str = resValue.split("");
                resValue = resVal(str);
            }
            if(resValue.length() < 3) {
                for(int i = (3 - resValue.length()); i > 0; i--) {
                    resValue += resValue.charAt(resValue.length()-1);
                }
            }
            
            return resValue;
        // } else {
            // return new_id;
        // } //이 조건 때문에 안된거.
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