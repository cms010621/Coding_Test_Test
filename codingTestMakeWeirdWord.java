public class codingTestMakeWeirdWord {
    public static void main(String[] args) {
        String s = "TRY";
        String[] word = s.split(" ");
        String answer = "";

        for(int i=0;i<word.length; i++) {
            StringBuilder ss = new StringBuilder(word[i]);
            for(int j = 0; j<ss.length(); j++) {
                String character = String.valueOf(ss.charAt(j));
                if(j%2==0) {
                    character=character.toUpperCase();
                } else {
                    character=character.toLowerCase();
                }
                answer+=character;
            }
            if(i != word.length-1) {
                answer += " ";
            }
        }
        System.out.println(answer);
        //why not correct?
    }
}