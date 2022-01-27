public class codingTestWhereKim {
    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        String keyWord = "Kim";
        String answer = "";

        for(int i=0;i<seoul.length; i++) {
            if(seoul[i].equals(keyWord)) {
                answer = "김서방은 " + i + "에 있다";
            }
        }

        System.out.println(answer);

    }
    
}
