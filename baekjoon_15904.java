import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException; 

public class baekjoon_15904 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        String str = bf.readLine();
        str = str.replaceAll("[^U|C|P]", "");
        str = str.replaceAll(" ", "");
        if(str.equals("UCPC") || str.contains("UCPC")) {
            bw.write("I love UCPC");
        } else {
            int check = 0;
            String[] uCheck = checkUCPC("U", str);
            if(uCheck[0].equals("-1")) {
                check = 1;
            } else {
                String[] cCheck = checkUCPC("C", uCheck[1]);
                if(cCheck[0].equals("-1")) {
                    check = 1;
                } else {
                    String[] pCheck = checkUCPC("P", cCheck[1]);
                    if(pCheck[0].equals("-1")) {
                        check = 1;
                    } else {
                        String[] c2Check = checkUCPC("C", pCheck[1]);
                        if(c2Check[0].equals("-1")) {
                            check = 1;
                        } else {
                            bw.write("I love UCPC");
                        }
                    }
                }
            }
            if(check == 1) {
                bw.write("I hate UCPC");
            }
        }
        bw.flush();  
        bw.close();  

    }

    public static String[] checkUCPC(String alp, String str) {
        int index = str.indexOf(alp);
        String[] arr = new String[2];
        arr[0] = String.valueOf(index);
        arr[1] = str.substring(index+1);
        return arr;
    }
}