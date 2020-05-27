import java.math.BigInteger;

class euler_45 {
    public static void main(String[] args) {
        
        long st = System.currentTimeMillis();
        long startTrian = 285;
        long startPenta = 165;
        long startHexa = 143;
        while(true) { //육각수를 기준으로 반복됨.
            BigInteger Pentagram = BigInteger.valueOf(startPenta*(3*startPenta-1)/2);
            BigInteger Hexagon = BigInteger.valueOf(startHexa*(2*startHexa-1));
            BigInteger Triangular = BigInteger.valueOf(startTrian*(startTrian+1)/2);

            while(true) {
                startTrian++;
                Triangular = BigInteger.valueOf(startTrian*(startTrian+1)/2);   
                if(Triangular.compareTo(Hexagon)==1 || Triangular.compareTo(Hexagon)==0) break;   //같을때, 클 때     
            }

            if(Triangular.compareTo(Hexagon)==0) {
                while(true) {
                    startPenta++;
                    Pentagram = BigInteger.valueOf(startPenta*(3*startPenta-1)/2);
                    if(Pentagram.compareTo(Hexagon)==1 || Pentagram.compareTo(Hexagon)==0) break;
                }
            }

            if(Triangular.compareTo(Pentagram)==0& Pentagram.compareTo(Hexagon)==0){
                System.out.println(Hexagon);
                if(Hexagon.compareTo(BigInteger.valueOf(40755))==1) break;
            }

            startHexa++;            
            long end = System.currentTimeMillis();
            
            if(end-st>1000) {
                System.out.println("Hexagon : "+Hexagon+"startHexa : "+startHexa);
                break;
            }
        }
        
        long end = System.currentTimeMillis();
        System.out.println("실행시간 : "+(end-st)/1000.0);
    }
}