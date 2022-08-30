import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class baekjoon_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        int n = Integer.parseInt(bf.readLine());
        String[] s = bf.readLine().split(" ");
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(String d : s) {
            arr.add(Integer.parseInt(d));
        }

        Collections.sort(arr);
        int m = Integer.parseInt(bf.readLine());
        s = bf.readLine().split(" ");
        for(int i=0; i<m; i++) {
            int index = 0;
            int check = 0;
            if(arr.contains(Integer.parseInt(s[i]))) {
                index = arr.indexOf(Integer.parseInt(s[i]));
                for(int j=index+1; j<n; j++) {
                    if(arr.get(j) != arr.get(j-1)) {
                        arrayList.add(j-index);
                        check = 1;
                        break;
                    } else if(j == n-1) {
                        arrayList.add((j+1)-index);
                        check = 1;
                        break;
                    }
                }
                if(index == n-1 && check == 0) {
                    check = 1;
                    arrayList.add(1);
                }
            }
            if(check == 0) {
                arrayList.add(0);
            }
        }

        for(int i : arrayList) {
            bw.write(i + " ");
        }
        bw.flush();
        bf.close();
    }
}