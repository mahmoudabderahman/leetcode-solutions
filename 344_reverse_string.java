class Solution {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        char[] result = reverseString(s);
        System.out.println(result);
    }

    public static char[] reverseString(char[] s) {
        for(int i = s.length - 1, j = 0; i >= ((s.length - 1)  / 2) + 1 ; i--){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            j++;
        }
        return s;
        
    }
}