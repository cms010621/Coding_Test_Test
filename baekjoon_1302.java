import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.io.IOException; 

public class baekjoon_1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        int n = Integer.parseInt(bf.readLine());
        ArrayList<String> arr = new ArrayList<>();

        for(int i=0; i<n; i++) {
            arr.add(bf.readLine());
        }

        Collections.sort(arr);
        ArrayList<String> arrayList = new ArrayList<>();

        int max = 0;
        int cnt = 1;
        if(n != 1) {
            for(int i=1; i<n; i++) {
                if(arr.get(i).equals(arr.get(i-1))) {
                    cnt++;
                } else {
                    if(cnt > max) {
                        max = cnt;
                        cnt = 1;
                        arrayList.clear();
                        arrayList.add(arr.get(i-1));
                    } else if(cnt == max) {
                        arrayList.add(arr.get(i-1));
                        cnt = 1;
                    } else {
                        cnt = 1;
                    }
                }
                if(i == n-1 && cnt > max) {
                    arrayList.clear();
                    arrayList.add(arr.get(i-1));
                } else if(i == n-1 && cnt == max) {
                    arrayList.add(arr.get(i-1));
                }
            }
        } else {
            arrayList.add(arr.get(0));
        }
        Collections.sort(arrayList);

        bw.write(arrayList.get(0)+"\n");
        bw.flush();  
        bw.close();  

    }
}