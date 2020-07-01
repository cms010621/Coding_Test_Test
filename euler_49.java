import java.util.Arrays;

public class euler_49 {
    public static void main(String[] args) {
        for(int firstNum = 1000; firstNum<10000; firstNum++) {
            int primeCheck = 0;
            for(int i=2;i<=Math.sqrt(firstNum);i++) {
                if(firstNum%i==0) {
                    primeCheck = 1;
                    break;
                }
            }

            if(primeCheck == 0) {
                for(int Aberration=1;firstNum+Aberration*2<10000;Aberration++) {
                    primeCheck = 0;
                    int secondNum = firstNum+Aberration;
                    int thirdNum = secondNum+Aberration;

                    String []Permutation = String.valueOf(firstNum).split("");
                    String []sPermutation = String.valueOf(secondNum).split("");
                    String []tPermutation = String.valueOf(thirdNum).split("");

                    int []Per = Arrays.stream(Permutation).mapToInt(Integer::parseInt).toArray();
                    int []sPer = Arrays.stream(sPermutation).mapToInt(Integer::parseInt).toArray();
                    int []tPer = Arrays.stream(tPermutation).mapToInt(Integer::parseInt).toArray();

                    Arrays.sort(Per);
                    Arrays.sort(sPer);
                    Arrays.sort(tPer);
                    
                    for(int i=0;i<4; i++) {
                        if(Per[i] != sPer[i] || sPer[i] != tPer[i]) {
                            primeCheck = 1;
                            break;
                        }
                    }
                    if(primeCheck ==0) 
                        for(int i=2;i<=Math.sqrt(secondNum); i++) {
                            if(secondNum%i==0) {
                                primeCheck = 1;
                                break;
                            }
                        }
                    
                    if(primeCheck ==0) 
                        for(int i=2;i<=Math.sqrt(thirdNum);i++) {
                            if(thirdNum%i==0) {
                                primeCheck = 1;
                                break;
                            }
                        }
                    if(primeCheck != 1 && firstNum != 1487) {
                        System.out.println(firstNum+""+secondNum+""+thirdNum);
                        break;
                    }
                    
                }
            } 
            if(primeCheck == 0) break;
        }
    }
}