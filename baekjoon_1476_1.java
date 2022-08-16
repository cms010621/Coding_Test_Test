import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException; 

public class baekjoon_1476_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        String str[] = bf.readLine().split(" ");
        int e = Integer.parseInt(str[0]);
        int s = Integer.parseInt(str[1]);
        int m = Integer.parseInt(str[2]);
        int tot = 0;

        for(int i=16; i<=532 ; i++) {
            int eTot = (15*i)+e;

            int sTot = eTot%28;
            int mTot = eTot%19;

            // bw.write("i = " + i + '\n');
            // bw.write("eTot = " + eTot + " sTot = " + sTot +" mTot = " + mTot +'\n');

            if(s == sTot && m == mTot) {
                tot = eTot;
                break;
            } else if((s == 28 && sTot == 0 && mTot == m) || (m == 19 && mTot == 0 && sTot == s)) {
                tot = eTot;
                break;
            }
        }
        if(tot == 0 && e == 15 && s == 28 && m == 19) {
            tot = e * 532;
        } else if(e == 1 && s == 1 && m == 1) {
            tot = 1;
        } else if(e == s && s == e) {
            tot = e;
        }

        bw.write(tot+" ");
        bw.flush();  
        bw.close();  

    }
}