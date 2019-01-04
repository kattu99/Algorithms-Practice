public class RomanToDecimal {

    public int RomanToDecimal (String str) {

        int res = 0;

        for (int i=0; i<str.length(); i++){

            int s1 = value(str.charAt(i));

            if (i+1 < str.length()) {
                int s2 = value(str.charAt(i+1));
                if (s1 >= s2) {
                    res = res+s1;
                }
                else {
                    res = res+s2-s1;//add next - first and increment i
                    i++; 
                }
            }
        }
        return res; 
    }

    public int value(char r) {
        return 1; 
    }
}