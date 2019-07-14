public class RemoveDuplicatesFromString {

    static String removeUtil(String str, char last_removed) {
        if (str.length() == 0 || str.length() == 1) {
            return str;
        }

        if (str.charAt(0) == str.charAt(1)) {
            last_removed = str.charAt(0);
            while (str.length() > 1 && str.charAt(0) == str.charAt(1)) 
            str = str.substring(1, str.length());
            return removeUtil(str, last_removed);
        }

        String rem_str = removeUtil(str.substring(1, str.length()), last_removed);

        //check if first character of rem string mathces with first character of the original
        if (rem_str.length() != 0 && rem_str.charAt(0) == str.charAt(0)) {
            last_removed = str.charAt(0);
            //remove the first character
            return rem_str.substring(1, rem_str.length());
        }

        //if the remaining string becomes empty and last removed character is same as first of original.
        if (rem_str.length() == 0 && last_removed == str.charAt(0)) {
            return rem_str;
        }

        //If the first two characters of str and rem_str don't match append first characters of str before the first character of
        //rem_str 
        return (str.charAt(0) + rem_str);
    }


}