import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException; 
import java.util.*;

public class baekjoon_11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
        ArrayList<String> arr = new ArrayList<>();
        int cnt = Integer.parseInt(bf.readLine());
        int max = 0;
        for(int i=0; i<cnt; i++) {
            String s = bf.readLine();
            arr.add(s);
            if(max < s.length()) {
                max = s.length();
            }
        }
        String[] s = new String[max+1];
        for(int i=0; i<max+1; i++) {
            s[i] = "";
        }
        for(int i=0; i<cnt; i++) {
            s[arr.get(i).length()] += arr.get(i)+" ";
        }
        arr = new ArrayList<>();
        for(int i=1; i<max+1; i++) {
            arr = new ArrayList<>(Arrays.asList(s[i].split(" ")));
            if(s[i].replaceAll(" ", "").length() > 0) {
                Collections.sort(arr);
                for(String d :arr) {
                    bw.write(d+"\n");
                }
            }
        }

        bw.flush();  
        bw.close();  

    }
}