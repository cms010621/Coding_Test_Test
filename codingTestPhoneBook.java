public class codingTestPhoneBook {
    public static void main(String[] args) {
        String[] phone_book = {"12","123","1235","567","88"};
        boolean answer = true;

        for(int i=0;i<phone_book.length-1; i++) {
            String prev = phone_book[i];
            for(int j=i+1; j<phone_book.length; j++) {
                String comp = phone_book[j].substring(0, prev.length());
                if(comp.equals(prev)) {
                    answer = false;
                    break;
                }
            }
            if(answer == false) break;
        }

        System.out.println(answer);
    }
}
