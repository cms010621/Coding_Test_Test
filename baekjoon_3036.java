import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException; 

public class baekjoon_3036 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        int n = Integer.parseInt(bf.readLine());
        String []st = bf.readLine().split(" ");
        int stan = Integer.parseInt(st[0]);

        for(int i=1; i<n; i++) { 
            int num = Integer.parseInt(st[i]);
            for(int j = num; j>0; j--) {
                if(num%j == 0 && stan%j == 0) {
                    bw.write(stan/j + "/" + num/j+"\n");
                    break;
                }
            }
        }

        bw.flush();  
        bw.close();  

    }
}
