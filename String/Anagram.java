public class Anagram {

    public static boolean isAnagram(String str1, String str2) {

        int count1[] = new int[26];
        int count2[] = new int[26];

        Arrays.fill(count1, 0);
        Arrays.fill(count2, 0);

        for (int i=0; i<str1.length && i<str2.length; i++) {
            count1[str1.charAt(i)-'a'] += 1;
            count2[str2.charAt(i)-'a'] += 1;
        }

        if (str1.length != str2.length) {
            return false; 
        }

        for (int i=0; i<NO_OF_CHARS;i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }
        return true;
    }

}