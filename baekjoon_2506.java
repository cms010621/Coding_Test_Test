import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException; 

public class baekjoon_2506 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        int n = Integer.parseInt(bf.readLine());
        String[] st = bf.readLine().split(" ");
        int tot = 0;
        int cnt = 1;
        if(st[0].equals("1")) {
            tot++;
        }
        // bw.write("tot : " + tot + " cnt : "+cnt+"\n");
        for(int i=1; i<n; i++) {
            // bw.write("st[i-1] : " + st[i-1] + " st[i] : "+st[i]+"\n");
            if(Integer.parseInt(st[i]) == 1) {
                if(Integer.parseInt(st[i-1]) == 1) {
                    tot += ++cnt;
                } else {
                    tot += cnt;
                }
            } else {
                cnt = 1;
            }
        }

        bw.write(tot+" ");
        bw.flush();  
        bw.close();  

    }
}