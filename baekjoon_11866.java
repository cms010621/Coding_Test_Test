import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class baekjoon_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        String[] arr = bf.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();

        for(int i=0; i<n; i++) {
            arrayList.add(i+1);
        }

        int cnt = -1;
        for(int i=0; i<n-1; i++) {
            cnt += k;
            if(cnt == arrayList.size()) {
                cnt = 0;
            } else if(cnt > arrayList.size()) {
                cnt = (cnt-arrayList.size())%cnt;
            }
            if(cnt >= arrayList.size()) { 
                cnt = cnt%arrayList.size();
            }
            arr1.add(arrayList.get(cnt));
            arrayList.remove(cnt);
            cnt--;
        }

        bw.write("<");
        for(int i : arr1) {
            bw.write(i+", ");
        }
        bw.write(arrayList.get(0) + ">");
        bw.flush();
        bf.close();
    }
}