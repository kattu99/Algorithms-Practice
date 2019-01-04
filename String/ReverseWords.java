public class ReverseWords {

    public static void main(String[] args) {
        String s[] = "I like this program";
        String ans = "";
        for (int i = s.length-1; i>=0; i--) {
            ans += s[i] + " "; 
        }
        System.out.println(ans.substring(0, ans.length()-1)); //to account for last space
    }
}