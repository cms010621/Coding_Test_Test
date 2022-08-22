import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.IOException; 

public class baekjoon_1343_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        String s = bf.readLine();
        int xCheck = 0;
        String val = "";
        ArrayList<String> arrayList = new ArrayList<>(); 
        String ss = s.replaceAll("\\.", "").replaceAll("X", "");

        if(ss.length() == 0) {
            if(s.contains(".")) {
                arrayList = new ArrayList<>(Arrays.asList(s.split("\\.")));
            } else {
                arrayList.add(s);
            }
            
            for(int i=0; i<arrayList.size(); i++) {
                if(arrayList.get(i).equals("")) {
                    val += ".";
                } else {
                    if(arrayList.get(i).length()%2 != 0) {
                        xCheck = 1;
                        break;
                    } else {
                        int aCnt = arrayList.get(i).length() / 4;
                        int bCnt = (arrayList.get(i).length() - (4*aCnt))/2;
                        for(int j=0; j<aCnt; j++) {
                            val += "AAAA";
                        }
                        for(int j=0; j<bCnt; j++) {
                            val += "BB";
                        }
                    }
                    if(i != arrayList.size()-1) {
                        val += ".";
                    }
                }
            }
        }

        if(xCheck == 1 || ss.length() > 0) {//X가 4 / 2 로 나누어지지 않을 때
            bw.write("-1\n");
        } else if(arrayList.size() == 0) { // .만 입력됬을 때
            bw.write(s+"\n");
        } else {
            if(val.length() != s.length()) {
                val += s.substring(val.length());
            }
            bw.write(val+"\n");
        }
        bw.flush();  
        bw.close();  

    }
}