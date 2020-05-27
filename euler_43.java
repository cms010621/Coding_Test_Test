class euler_43 {
    public static void main(String args[]) {
        long start = System.currentTimeMillis();
        String num[] = {"0","1","2","3","4","5","6","7","8","9"};
        long tot = 0;
        int numlen = 9;
        long count = 0;
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
                                    for(int h = numlen;h>=0;h--) {
                                        if(a!=h&&b!=h&&c!=h&&d!=h&&e!=h&&f!=h&&g!=h){
                                        for(int i = numlen;i>=0;i--) {
                                            if(a!=i&&b!=i&&c!=i&&d!=i&&e!=i&&f!=i&&g!=i&&h!=i) {
                                                for(int k = numlen;k>=0;k--) {
                                                    if(a!=k&&b!=k&&c!=k&&d!=k&&e!=k&&f!=k&&g!=k&&h!=k&&i!=k) {
                                                        tot = Long.parseLong(num[a]+num[b]+num[c]+num[d]+num[e]+num[f]+num[g]+num[h]+num[i]+num[k]);
                                                        int two = Integer.parseInt(num[b]+num[c]+num[d]);
                                                        int three = Integer.parseInt(num[c]+num[d]+num[e]);
                                                        int five = Integer.parseInt(num[d]+num[e]+num[f]);
                                                        int seven = Integer.parseInt(num[e]+num[f]+num[g]);
                                                        int eleven = Integer.parseInt(num[f]+num[g]+num[h]);
                                                        int thirteen = Integer.parseInt(num[g]+num[h]+num[i]);
                                                        int seventeen = Integer.parseInt(num[h]+num[i]+num[k]);
                                                        if(two%2==0 && three%3==0 && five%5==0 && seven%7==0 && eleven%11==0 && thirteen%13==0 && seventeen%17==0) {
                                                            // System.out.println(tot);
                                                            count+=tot;
                                                        }
                                                    }//k if 
                                                }//k

                                            }//i if
                                        }//i

                                        }//h if
                                    }//h

                                    }//g if
                                }//g

                                }//f if
                            }//f

                            }//e if
                        }//e

                        }//d if
                    }//d

                    }//c if
                }//c

                }//b if
            }//b
           
        }//a
        System.out.println(count);
        long end = System.currentTimeMillis();
        System.out.println("실행시간 : "+(end-start)/1000.0);
    }
}