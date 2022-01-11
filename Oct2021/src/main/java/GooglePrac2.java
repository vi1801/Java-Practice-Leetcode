public class GooglePrac2 {
        public static void main(String[] args) {
            System.out.println(beginAndEndWithSameLetter("performance"));
        }
        static String beginAndEndWithSameLetter(String input){
            int len = input.length();
            int [] last = new int[26];

            int index = 0;
            for(char ch : input.toCharArray()){
                last[ch - 'a'] = index;
                index++;
            }
            int maxLength = 0;
            int start = 0;

            for(index = 0; index < len; index++){
                char ch = input.charAt(index);
                if((last[ch - 'a'] - index + 1) > maxLength){
                    maxLength = last[ch - 'a'] - index + 1;
                    start = index;
                }
            }

            return input.substring(start, start + maxLength);
        }

}