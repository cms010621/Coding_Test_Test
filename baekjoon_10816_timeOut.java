import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class baekjoon_10816_timeOut {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        int n = Integer.parseInt(bf.readLine());
        String[] s = bf.readLine().split(" ");

        int m = Integer.parseInt(bf.readLine());
        String[] mList = bf.readLine().split(" ");
        
        ArrayList<Integer> arr = new ArrayList<>();
        for(String d : s) {
            arr.add(Integer.parseInt(d));
        }
        Collections.sort(arr);
        for(int i=0; i<m; i++) {
            int num = Integer.parseInt(mList[i]);
            int index = arr.indexOf(num);
            Collections.sort(arr, Collections.reverseOrder());
            int index2 = arr.indexOf(num);
            // bw.write("num = " + num + " index : "+index + " index2 = "+index2+"\n");
            Collections.sort(arr);
            if(!(index == -1 && index == -1)) {
                bw.write((10-index2) - (index)+" ");
            } else {
                bw.write("0 ");
            }
        }
        bw.flush();
        bw.close();
    }
}