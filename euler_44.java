

class euler_44 {
    public static void main(String[] args) {
        long st = System.currentTimeMillis();
        Long arr[] = new Long[1000000];
        int check = 0;
        Long penta[] = new Long[1000000];
        for(int i=1;i<1000000;i++) {
            Long Pentagram = Long.valueOf(i*(3*i-1)/2);
            arr[i-1] = Pentagram;
            // System.out.println(arr[i-1]);
        }
        // System.out.println(arr[9999]);
        int count = 0;
        Long minCount = 999999999L;
        for(int i=0;i<100000;i++) {
            for(int j=0;j<100000;j++) {
                if(i<=j) break;
                int kk = 0;
                int jj=0;
                // System.out.println(arr[i]+ " : "+arr[j]);
                Long plus = arr[i]+arr[j];
                Long minus = arr[i]-arr[j];
                //plus찾기
                for(int k = i;k<i+j;k++) {
                    if(plus.equals(arr[k])){ check=1; kk=k; break;} 
                }
                if(check == 1) {
                    for(int k=i;k>=0;k--) {
                        if(minus.equals(arr[k])){check=1; System.out.println(minus); jj=k; break;}
                        else check=0;
                    }
                }
                if(check==1) {
                    break;
                //    penta[count] = minus;
                //    count++;
                // //    System.out.println("kk : "+kk+"jj + "+jj);
                //    if(minCount>kk-jj) {
                //        minCount = Long.valueOf(kk-jj);
                //    }
                }

                //minus 찾기
            }
        }
        System.out.println(minCount);
        long end = System.currentTimeMillis();
        System.out.println("실행시간 : "+(end-st)/1000.0);

    }
}