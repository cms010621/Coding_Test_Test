class euler_37 {
    public static void main (String[] args) throws java.lang.Exception {
        long st = System.currentTimeMillis();
        long start = 11;
        int check = 0;
        int total = 0;
        while(true) {
            String strNum = String.valueOf(start);
            String[] test = String.valueOf(strNum).split("");
            if(test[0].equals("1") || test[test.length-1].equals("1")) 
                    check = 1;
            if(check != 1) {
                //왼쪽부터
                for(int j = 0;j<strNum.length();j++) {
                    String left = strNum.substring(j);
                        if(Math.sqrt(Integer.parseInt(left))<2) 
                            break;
                        
                        for(int i = 2;i<=Math.sqrt(Integer.parseInt(left));i++) {
                            if(Integer.parseInt(left)%i==0.0) {
                                check = 1;
                                break;
                            }
                        }
                    if(check==1) break;
                }
                //오른쪽부터
                for(int j = strNum.length();j>0;j--) {
                    String right = strNum.substring(0,j);
                        if(Math.sqrt(Integer.parseInt(right))<2) 
                            break;
                        
                        for(int i = 2;i<=Math.sqrt(Integer.parseInt(right));i++) {
                            if(Integer.parseInt(right)%i==0.0) {
                                check = 1;
                                break;
                            }
                        }
                    if(check==1) break;
                    }    
                }        
            if(check!=1) {System.out.println(start); total+=start;}

            start++;
            check = 0;
            if(start==1000000) break;
        }
        System.out.println(total);
        long end = System.currentTimeMillis();
        System.out.println("실행시간 : "+(end-st)/1000.0);
    }
}