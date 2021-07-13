public class euler_60 {
    public static void main(String args[]) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        int totNum = 0;
        int check = 0;//소수
        for(num1=1;num1<1000; num1++) {
            for(num2=2;num2<1000; num2++) {
                for(num3=3;num3<1000; num3++) {
                    for(num4=4;num4<1000; num4++) {
                        for(num5=5;num5<1000; num5++) {
                            check = 0;
                            totNum = num1+num2+num3+num4+num5;
                            /*여기서 그냥 더하는게 아니라
                            각 수가 소수인지도 판별해야 하고
                            10개의 경우의 수가 소수인지도 판별해야함.
            */
                            for(int j=2;j<=Math.sqrt(totNum); j++) {
                                if(totNum/j==0) {
                                    check = 1;
                                    break;
                                }
                            }
                            if(check ==0)
                                //소수
                                break;
                            
                        }
                        if(check ==0)
                            break;
                    }
                    if(check ==0)
                        break;
                }
                if(check ==0)
                    break;
            }
            if(check ==0)
                break;
        }
        System.out.println(totNum);
    }
}
