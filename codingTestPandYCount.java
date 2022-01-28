public class codingTestPandYCount {
    public static void main(String[] args) {
        String s = "pPoooyY";
        int pCount = 0;
        int yCount = 0;
        boolean answer = true;
        s = s.toLowerCase();
        
        for(int i=0;i<s.length(); i++) {
            if(s.charAt(i) == 'p') {
                pCount++;
            } else if(s.charAt(i) == 'y') {
                yCount++;
            }
        }

        if(pCount != yCount) answer = false;
        
    }
}
