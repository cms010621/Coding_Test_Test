import java.math.BigInteger;
import java.util.Arrays;

public class euler_113 {
    public static void main(String[] args) {
        BigInteger num = new BigInteger("1");
        int check;
        int count = 0;
        while(true) {
            check = 3;
            String number = String.valueOf(num);
            String cut[] = number.split(""); 
            if(num.equals(new BigInteger("10000000000")))
                break;
            int whenChange = 0;

            for(int i=0;i<cut.length-1;i++) {
                //감소수
                if(Integer.parseInt(cut[i])>Integer.parseInt(cut[i+1])) { 
                    if(check == 2) { //이미 한번 증가했던 수
                        check = 0;
                        String changedValue = "";
                        for(int s = whenChange; s<cut.length;s++) {
                            cut[s] = cut[whenChange-1];
                        }
                        for(int s = 0;s<cut.length;s++) {
                            changedValue += String.valueOf(cut[s]);
                        }
                        num = new BigInteger(changedValue);
                        break;
                    }
                    else {
                        check = 1;
                        //감소하기 시작한 위치를 저장해야한다.
                        whenChange = i+1;
                    }
                }
                //증가수
                else if(Integer.parseInt(cut[i])<Integer.parseInt(cut[i+1])) { 
                    String changedValue = "";
                    if(check == 1) { //한번 감소했던 수
                        check = 0;
                        if(whenChange<cut.length) 
                            for(int k=whenChange+1; k<cut.length; k++) {
                                cut[k] = "0";
                            }
                        
                        else
                            cut[whenChange] = "0";
                        cut[whenChange] = String.valueOf(Integer.parseInt(cut[whenChange])+1);
                        for(int s = 0;s<cut.length;s++) {
                            changedValue += String.valueOf(cut[s]);
                        }
                        num = new BigInteger(changedValue);
                        break;
                    }
                    else {
                        check = 2;
                        whenChange = i+2;
                    }
                }
            }
            //오락가락수가 아닐때
            if(check != 0) {
                count++;
                num=num.add(BigInteger.valueOf(1));
            }
        }
        System.out.println(count);
    }
}