class euler_41 {
    public static void main(String args[]) {
        long st = System.currentTimeMillis();
        String num[] = {"1","2","3","4","5","6","7","8","9"};
        int check = 0;
        int tot = 0;
        int finish = 0;
        int numlen = 6;
        for(int a = numlen;a>=0;a--) { //987654321 순서
            for(int b= numlen;b>=0;b--) {
                if(a!=b) {
                for(int c = numlen;c>=0;c--) {
                    if(a!=c && b!=c) {
                    for(int d = numlen;d>=0;d--) {
                        if(a!=d &&b!=d && c!=d) {
                        for(int e = numlen;e>=0;e--) {
                            if(a!=e && b!=e && c!=e && d!=e) {
                            for(int f = numlen;f>=0;f--) {
                                if(a!=f && b!=f && c!=f && d!=f&& e!=f) {
                                for(int g = numlen;g>=0;g--) {
                                    if(a!=g && b!=g && c!=g&& d!=g && e!=g&& f!=g) {
                                    // for(int h = numlen;h>=0;h--) {
                                    //     if(a!=h&&b!=h&&c!=h&&d!=h&&e!=h&&f!=h&&g!=h){
                                        // for(int i = numlen;i>=0;i--) {
                                        //     if(a!=i&&b!=i&&c!=i&&d!=i&&e!=i&&f!=i&&g!=i&&h!=i) {
                                            tot = Integer.parseInt(num[a]+num[b]+num[c]+num[d]+num[e]+num[f]+num[g]);//+num[h]);//+num[i]);
                                            // System.out.println(tot);
                                            for(int j = 2;j<=(int) Math.floor(Math.sqrt(tot));j++) {
                                                if(tot%j==0) {check = 1;  break;}//System.out.println("tot : "+tot+" j : "+j);
                                            }
                                            // System.out.println(tot);
                                            if(check!=1) {finish = tot; //System.out.println("tot : "+tot); break;
                                            }
                                            check=0;
                                        //     }
                                        // }
                                    //     }
                                    //     if(finish !=0) break;
                                    // }
                                    }
                                    if(finish !=0 ) break;
                                }
                                }
                                if(finish !=0 ) break;
                            }
                            }
                            if(finish !=0 ) break;
                        }
                        }
                        if(finish !=0 ) break;
                    }
                    }
                    if(finish !=0 ) break;
                }
                }
                if(finish !=0 ) break;
            }
            if(finish !=0 ) break;
        }
        
        System.out.println(finish);
        long end = System.currentTimeMillis();
        System.out.println("실행시간 : "+(end-st)/1000.0);
        
    }
}