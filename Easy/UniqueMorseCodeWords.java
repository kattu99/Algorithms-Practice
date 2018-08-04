import java.util.ArrayList;

class Solution {
    
    String[] morseArray = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    
    public int uniqueMorseRepresentations(String[] words) {
        int count = 0;
        ArrayList<String> array = new ArrayList<String>();
        for (String word: words) {
            char[] characterArray = word.toCharArray();
            String str = "";
            for (char character:characterArray) {
                int index = Character.getNumericValue(character)-10;
                str += morseArray[index];
            }
            if (!array.contains(str)) {
                count++;
                array.add(str);
            }
        }
        return count; 
    }
}