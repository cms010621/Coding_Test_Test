import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.io.IOException; 

public class baekjoon_1969 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        String[] st = bf.readLine().split(" ");
        String val = "";
        int n = Integer.parseInt(st[0]);
        int m = Integer.parseInt(st[1]);
        int tot=0;

        ArrayList<String> arr = new ArrayList<>();
        String[] ser = new String[m];

        for(int i=0; i<m; i++) {
            ser[i] = "";
        }
        for(int i=0; i<n; i++) {
            String str = bf.readLine();
            arr.add(str);
            for(int j=0; j<m; j++) {
                ser[j] += str.charAt(j)+"";
            }
        }
        
        for(int i=0; i<m; i++) {
            int aCnt = n-ser[i].replaceAll("A", "").length();
            int cCnt = n-ser[i].replaceAll("C", "").length();
            int gCnt = n-ser[i].replaceAll("G", "").length();
            int tCnt = n-ser[i].replaceAll("T", "").length();

            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(aCnt);
            arrayList.add(cCnt);
            arrayList.add(gCnt);
            arrayList.add(tCnt);
            Collections.sort(arrayList, Collections.reverseOrder());

            if(aCnt == arrayList.get(0)) {
                val += "A";
            } else if(cCnt == arrayList.get(0)) {
                val += "C";
            } else if(gCnt ==  arrayList.get(0)) {
                val += "G";
            } else {
                val += "T";
            }
        }

        for(String s : arr) {
            for(int i=0; i<m; i++) {
                if(s.charAt(i) != val.charAt(i)) {
                    tot++;
                }
            }
        }

        bw.write(val+"\n");
        bw.write(tot+"\n");
        bw.flush();  
        bw.close();  

    }
}