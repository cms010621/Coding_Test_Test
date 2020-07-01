public class euler_112 {
    public static void main(String[] args) {
        int num = 100;
        int check;
        int count = 1;
        while(true) {
            check = 3;
            String number = String.valueOf(num);
            String cut[] = number.split(""); 

            for(int i=0;i<cut.length-1;i++) {
                //감소수
                if(Integer.parseInt(cut[i])>Integer.parseInt(cut[i+1])) { //감소
                    if(check == 2) { //이미 한번 증가했던 수
                        check = 0;
                        break;
                    }
                    else
                        check = 1;
                }
                //증가수
                else if(Integer.parseInt(cut[i])<Integer.parseInt(cut[i+1])) { //증가
                    if(check == 1) { //한번 감소했던 수
                        check = 0;
                        break;
                    }
                    else
                        check = 2;
                }
            }
            //오락가락수
            if(check == 0) 
                count++;
            num++;
            if(count*100/num == 99) 
                break;
        }
        System.out.println("99% : "+num);
    }
}