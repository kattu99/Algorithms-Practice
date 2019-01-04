public class Rotation {


    public bool isRotated(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false; 
        }

        string clock_rot = "";
        string anticlock_rot = "";

        anticlock_rot = anticlock_rot + str2.substr(len-2, len) + str2.substr(0, len-2);
        clock_rot = clock_rot + str2.substr(0,2) + str2.substr(2);

        return (str1.compare(clock_rot) == 0 || str1.compare(anticlock_rot) == 0);
    }
}