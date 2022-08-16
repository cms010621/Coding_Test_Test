import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.io.IOException; 

public class baekjoon_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
        ArrayList<Integer> arr = new ArrayList<>();
        int cnt = Integer.parseInt(bf.readLine());

        for(int i=0; i<cnt; i++) {
            int num = Integer.parseInt(bf.readLine());
            if(num != 0) {
                arr.add(num);
            } else {
                arr.remove(arr.size()-1);
            }
        }

        BigInteger b = new BigInteger("0");
        for(int s : arr) {
            b=b.add(new BigInteger(String.valueOf(s)));
        }
        

        bw.write(b + "");
        bw.flush();
        bf.close();
    }
}