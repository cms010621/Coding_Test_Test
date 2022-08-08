import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException; 

public class coding_test_price {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
        String arr[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String str = bf.readLine();
        String rem = "";
        int cnt = 0;
        int chk = 0;

        for(int i=0; i<str.length(); i++) {
            rem = "";
            chk = 0;
            for(int j=0; j<arr.length; j++) {
                if(i+arr[j].length() <= str.length()) {
                    rem = str.substring(i, i+arr[j].length());
                    if(rem.equals(arr[j])) {
                        cnt++;
                        chk = 1;
                        i = i+arr[j].length()-1;
                        break;
                    }
                }
            }
            if(chk == 0) cnt++;
        }
        bw.write(cnt + "");
        bw.flush();
        bf.close();
    }
}