import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException; 

public class baekjoon_1371 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        String input = "";
        int[] arr = new int[26];
        int max = 0;
        String val = "";

        for(int i=0; i<26; i++) {
            arr[i] = 0;
        }
        while((input = bf.readLine()) != null) {
            // 이후 로직 전개.
            max = 0;
            val = "";
            input = input.replaceAll(" ", "");
            for(int i=0; i<input.length(); i++) {
                char s = input.charAt(i);
                arr[s-97] = arr[s-97]+1;
            }
            for(int i=0; i<26; i++) {
                char s = (char) (97+i);
                if(max < arr[i]) {
                    max = arr[i];
                    val = s+"";
                } else if(max == arr[i]) {
                    val += s;
                }
            }
        }

        bw.write(val+"\n");
        bw.flush();  
        bw.close();  

    }
}